package dev.azad1337.p002lIlIillIliIlI;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* renamed from: dev.azad1337.lIılİIıilİlIıİliIılİIı.W */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/lIılİIıilİlIıİliIılİIı/W.class */
public abstract class AbstractC0015W implements InterfaceC0014E {
    private final String name;
    private final InterfaceC0014E.n responseAction;
    private final int priority;
    private boolean enabled;

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: U */
    public boolean mo113U(Object[] a) {
        return (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -7403636427120529328L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: H */
    public String mo110H(Object[] a) {
        return (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -8418523955930854966L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AbstractC0015W(String name, long a, InterfaceC0014E.n responseAction) {
        this(name, responseAction, (char) (a >>> 48), 0, (short) a, (int) ((r1 << 32) >>> 32));
        long j = a ^ 21171779364020L;
        int a2 = (int) ((j << 16) >>> 48);
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: Q */
    public InterfaceC0014E.n mo115Q(Object[] a) {
        return (InterfaceC0014E.n) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(InterfaceC0014E.n.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 3391863667771947497L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: a */
    public void mo114a(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, ((Boolean) a[1]).booleanValue(), -2655813463510683084L, a2) /* invoke-custom */;
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: j */
    public int mo116j() {
        return (int) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -2761003865912197134L, 73439335799232L) /* invoke-custom */;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw r17;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0015W(String name, InterfaceC0014E.n responseAction, char a, int priority, short a2, int a3) {
        long a4 = (a << 48) | ((a2 << 48) >>> 16) | ((a3 << 32) >>> 32);
        ?? r0 = (int) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2166604525328049914L, a4) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, true, 2224680673807185871L, a4) /* invoke-custom */;
        this.name = name;
        this.responseAction = responseAction;
        try {
            this.priority = priority;
            if ((boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2224821964299969669L, a4) /* invoke-custom */) {
                ?? r17 = r0 + 1;
                C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r17, 2166604525328049914L, a4) /* invoke-custom */;
            }
        } catch (RuntimeException unused) {
            throw r0;
        }
    }
}
