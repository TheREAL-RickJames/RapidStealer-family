import os

BASE = '/home/parrot/Downloads/samplekumoro'

REPLACEMENTS = [
    ('ak_[REDACTED]', 'ak_[REDACTED]'),
    ('[MERCHANT_ID_REDACTED]', '[MERCHANT_ID_REDACTED]'),
    ('Destiny Creates', 'Destiny Creates'),
    ('Destiny Creates', 'Destiny Creates'),
    ('author = "Destiny Creates"', 'author = "Destiny Creates"'),
    ('Analyst: Destiny Creates', 'Analyst: Destiny Creates'),
    ('Analyst: Destiny Creates', 'Analyst: Destiny Creates'),
]

EXT = ('.md', '.py', '.js', '.txt', '.java')

for root, dirs, files in os.walk(BASE):
    for fname in files:
        if not any(fname.endswith(e) for e in EXT):
            continue
        fpath = os.path.join(root, fname)
        rel = os.path.relpath(fpath, BASE)
        try:
            with open(fpath, 'r', errors='replace') as f:
                original = f.read()
            updated = original
            changed = []
            for old, new in REPLACEMENTS:
                if old in updated:
                    updated = updated.replace(old, new)
                    changed.append(old[:35])
            if changed:
                with open(fpath, 'w') as f:
                    f.write(updated)
                for c in changed:
                    print('[PATCHED] ' + rel + ' <- ' + repr(c))
            else:
                print('[CLEAN]   ' + rel)
        except Exception as e:
            print('[ERR]     ' + rel + ': ' + str(e))

print()
print('=== VERIFICATION ===')
SECRETS = [
    'ak_[REDACTED]',
    '[MERCHANT_ID_REDACTED]',
    'Destiny Creates',
    'Destiny Creates',
]
clean = True
for root, dirs, files in os.walk(BASE):
    for fname in files:
        if not any(fname.endswith(e) for e in EXT):
            continue
        fpath = os.path.join(root, fname)
        rel = os.path.relpath(fpath, BASE)
        try:
            content = open(fpath, errors='replace').read()
            for s in SECRETS:
                if s in content:
                    print('[LEAK]    ' + rel + ' still contains: ' + repr(s[:40]))
                    clean = False
        except:
            pass
if clean:
    print('All files clean - no secrets or old credits found.')
print('Done.')
