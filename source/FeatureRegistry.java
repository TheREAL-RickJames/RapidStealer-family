package dev.azad1337.p001IlIillIliIlIi;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p001IlIillIliIlIi.impl.C0006G;
import dev.azad1337.p001IlIillIliIlIi.impl.C0007S;
import dev.azad1337.p001IlIillIliIlIi.impl.C0008Z;
import dev.azad1337.p001IlIillIliIlIi.impl.C0009j;
import dev.azad1337.p001IlIillIliIlIi.impl.C0010k;
import dev.azad1337.p001IlIillIliIlIi.impl.C0011p;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: dev.azad1337.IılİIıilİlIıİliIılİIıi.j */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IılİIıilİlIıİliIılİIıi/j.class */
public class C0012j {
    private final List<InterfaceC0005T> features;
    private final ExecutorService executor;

    /* renamed from: a */
    public static boolean f52a;

    /* renamed from: b */
    private static final long f53b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, Ljava/lang/Object;, J, J)Z}
        ).invoke(r0, dev.azad1337.p001IlIillIliIlIi.C0012j.f53b, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/concurrent/TimeUnit;}
        ).invoke(7701428100122686845L, r1), 7695755186571780944L, r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc A[EDGE_INSN: B:30:0x00dc->B:21:0x00dc BREAK  A[LOOP:0: B:2:0x0035->B:19:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [dev.azad1337.IılİIıilİlIıİliIılİIıi.T] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c3 -> B:5:0x004e). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m109h(Object[] a) {
        Object T;
        ?? r0;
        long a2 = ((Long) a[0]).longValue();
        long a3 = a2 ^ 115401390565237L;
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7640833130690382566L, a2) /* invoke-custom */;
        Iterator B = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 7707255651498013513L, a2) /* invoke-custom */, 7699657694151982110L, a2) /* invoke-custom */;
        while (true) {
            try {
                if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 7646688104879785799L, a2) /* invoke-custom */) {
                    T = (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 7693209695427291882L, a2) /* invoke-custom */;
                    ?? r02 = (InterfaceC0005T) T;
                    r0 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
                    if (r0 > 0) {
                        break;
                    }
                    try {
                        Object[] objArr = new Object[1];
                        r02[0] = Long.valueOf(a3);
                        ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, 7696732254951529159L, a2) /* invoke-custom */;
                        if (z) {
                            break;
                        }
                        if (B2 != 0) {
                            try {
                                (Future) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Future.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((ExecutorService) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(ExecutorService.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 7704372409590956373L, a2) /* invoke-custom */, () -> {
                                    long a4 = 99456848443133L ^ 109405617161165L;
                                    try {
                                        Object[] objArr2 = new Object[1];
                                        r02[0] = Long.valueOf(a4);
                                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, 3938242327639236281L, 99456848443133L) /* invoke-custom */;
                                    } catch (Exception e) {
                                    }
                                }, 7707749071338225497L, a2) /* invoke-custom */;
                            } catch (InterruptedException unused) {
                                throw r0;
                            }
                        }
                        if (!z) {
                        }
                    } catch (InterruptedException unused2) {
                        throw r0;
                    }
                }
                T = (ExecutorService) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(ExecutorService.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 7704372409590956373L, a2) /* invoke-custom */;
                if (a2 >= 0) {
                    break;
                }
                InterfaceC0005T r022 = (InterfaceC0005T) T;
                r0 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
                if (r0 > 0) {
                }
            } catch (InterruptedException a4) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, 7694287736910375041L, a2) /* invoke-custom */;
                return;
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((ExecutorService) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(ExecutorService.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 7704372409590956373L, a2) /* invoke-custom */, 7706320153905935339L, a2) /* invoke-custom */;
        }
    }

    /* renamed from: P */
    public void m108P(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(515314366864648137L, a2) /* invoke-custom */;
        Iterator B = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 566009611935571558L, a2) /* invoke-custom */, 573610202880889137L, a2) /* invoke-custom */;
        while ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 518209455760468584L, a2) /* invoke-custom */) {
            try {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((InterfaceC0005T) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 571033448031029189L, a2) /* invoke-custom */, new Object[0], 518109095244216176L, a2) /* invoke-custom */;
                if (z) {
                    return;
                }
            } catch (Exception e) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0012j(long a) {
        long j = a ^ 121011046783641L;
        int a2 = (int) (a >>> 48);
        int a3 = (int) ((j << 16) >>> 32);
        int a4 = (int) ((j << 48) >>> 48);
        long a5 = a ^ 122106620332308L;
        long a6 = a ^ 3989640724253L;
        long j2 = a ^ 96737145432922L;
        int a7 = (int) (a >>> 48);
        int a8 = (int) ((j2 << 16) >>> 48);
        int a9 = (int) ((j2 << 32) >>> 32);
        long a10 = a ^ 13501162821385L;
        ?? r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(96241983786672570L, a) /* invoke-custom */;
        this.features = new ArrayList();
        this.executor = (ExecutorService) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(ExecutorService.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2, 94715055477964021L, a) /* invoke-custom */;
        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0011p(a ^ 121223449944739L), 119627188219301679L, a) /* invoke-custom */;
        try {
            try {
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0009j((short) a7, (short) a8, a9), 119627188219301679L, a) /* invoke-custom */;
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0006G(a5), 119627188219301679L, a) /* invoke-custom */;
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0010k(a10), 119627188219301679L, a) /* invoke-custom */;
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0007S(a6), 119627188219301679L, a) /* invoke-custom */;
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 119897907375265813L, a) /* invoke-custom */, new C0008Z((char) a2, a3, (char) a4), 119627188219301679L, a) /* invoke-custom */;
                if (r0 != 0) {
                    ?? r02 = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(120818932738636744L, a) /* invoke-custom */;
                    C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02 == 0, 120818932738636744L, a) /* invoke-custom */;
                }
            } catch (RuntimeException unused) {
                throw r0;
            }
        } catch (RuntimeException unused2) {
            throw r0;
        }
    }
}
