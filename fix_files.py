import os
import re

BASE = '/home/parrot/Downloads/samplekumoro'

SECRETS = [
    ('ak_[REDACTED_CDN_API_KEY]', 'ak_[REDACTED_CDN_API_KEY]'),
    ('[REDACTED_MERCHANT_ID]', '[REDACTED_MERCHANT_ID]'),
    ('[REDACTED_BASE64_REQUEST]', '[REDACTED_BASE64_REQUEST]'),
]

CREDITS = [
    ('Destiny Creates', 'Destiny Creates'),
    ('Destiny Creates', 'Destiny Creates'),
]

all_files = []
for root, dirs, files in os.walk(BASE):
    for f in files:
        ext = f.split('.')[-1] if '.' in f else ''
        if ext in ('md','py','js','java','txt') or f == 'Makefile':
            all_files.append(os.path.join(root, f))

print(f'Scanning {len(all_files)} files...')

for fpath in sorted(all_files):
    try:
        with open(fpath, 'r', errors='replace') as fh:
            content = fh.read()
        changed = False
        for secret, redacted in SECRETS:
            if secret in content:
                content = content.replace(secret, redacted)
                print(f'  REDACTED in {os.path.basename(fpath)}: {secret[:25]}...')
                changed = True
        for old, new in CREDITS:
            if old in content:
                content = content.replace(old, new)
                print(f'  CREDITED in {os.path.basename(fpath)}: {old} -> {new}')
                changed = True
        if changed:
            with open(fpath, 'w') as fh:
                fh.write(content)
            print(f'  SAVED: {fpath}')
    except Exception as e:
        print(f'  ERROR {fpath}: {e}')

print()
print('=== Verification ===')
for fpath in sorted(all_files):
    try:
        with open(fpath, 'r', errors='replace') as fh:
            content = fh.read()
        for secret, _ in SECRETS:
            if secret in content:
                print(f'  STILL PRESENT in {os.path.basename(fpath)}: {secret[:30]}')
        if 'Independent' in content:
            lines = [l.strip() for l in content.splitlines() if 'Independent' in l]
            for l in lines:
                print(f'  CREDIT NOT UPDATED in {os.path.basename(fpath)}: {l[:80]}')
    except:
        pass
print('Verification complete.')