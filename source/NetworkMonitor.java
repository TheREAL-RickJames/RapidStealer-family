package dev.azad1337.p002lIlIillIliIlI;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* renamed from: dev.azad1337.lIılİIıilİlIıİliIılİIı.p */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/lIılİIıilİlIıİliIılİIı/p.class */
public class C0021p extends Exception {
    private final String protectionName;

    /* renamed from: a */
    private static final String f74a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        r6 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r6 = 'H';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        r6 = 'c';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r6 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r6 = '}';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r6 = 'x';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r3 > r9) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r2 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0006, code lost:
    
        dev.azad1337.p002lIlIillIliIlI.C0021p.f74a = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r2 <= 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        r3 = r2;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        switch((r9 % 7)) {
            case 0: goto L9;
            case 1: goto L10;
            case 2: goto L11;
            case 3: goto L12;
            case 4: goto L13;
            case 5: goto L14;
            default: goto L15;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r6 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r9 = r9 + 1;
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (r3 != 0) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007b -> B:4:0x001b). Please report as a decompilation issue!!! */
    static {
        char[] charArray = "C6".toCharArray();
        int length = charArray.length;
        int i = 0;
        char[] cArr = charArray;
        int i2 = length;
    }

    /* renamed from: w */
    public String m141w(Object[] a) {
        return (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -2687199693834392792L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021p(String protectionName, char a, String message, int a2, int a3) {
        super("[" + protectionName + f74a + message);
        long j = (a << 48) | ((a2 << 32) >>> 16) | ((a3 << 48) >>> 48);
        this.protectionName = protectionName;
    }
}
