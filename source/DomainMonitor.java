package dev.azad1337.p002lIlIillIliIlI.impl;

import android.app.Fragment;
import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p002lIlIillIliIlI.AbstractC0015W;
import dev.azad1337.p002lIlIillIliIlI.C0021p;
import dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

/* renamed from: dev.azad1337.lIılİIıilİlIıİliIılİIı.impl.i */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/lIılİIıilİlIıİliIılİIı/impl/i.class */
public class C0019i extends AbstractC0015W {
    private static final List<String> MONITORED_DOMAINS;

    /* renamed from: a */
    private static final String[] f67a;

    /* renamed from: b */
    private static final String[] f68b;

    /* renamed from: a */
    private static String m137a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ 6241) & 65535;
        if (f68b[i5] == null) {
            char[] charArray = f67a[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 71;
                    break;
                case 1:
                    i4 = 211;
                    break;
                case 2:
                    i4 = 30;
                    break;
                case 3:
                    i4 = 114;
                    break;
                case 4:
                    i4 = 235;
                    break;
                case 5:
                    i4 = 177;
                    break;
                case 6:
                    i4 = 93;
                    break;
                case 7:
                    i4 = 186;
                    break;
                case 8:
                    i4 = 7;
                    break;
                case 9:
                    i4 = 221;
                    break;
                case 10:
                    i4 = 3;
                    break;
                case 11:
                    i4 = 80;
                    break;
                case 12:
                    i4 = 158;
                    break;
                case 13:
                    i4 = 147;
                    break;
                case 14:
                    i4 = 195;
                    break;
                case 15:
                    i4 = 181;
                    break;
                case 16:
                    i4 = 39;
                    break;
                case 17:
                    i4 = 138;
                    break;
                case 18:
                    i4 = 200;
                    break;
                case 19:
                    i4 = 250;
                    break;
                case 20:
                    i4 = 124;
                    break;
                case 21:
                    i4 = 59;
                    break;
                case 22:
                    i4 = 82;
                    break;
                case 23:
                    i4 = 131;
                    break;
                case 24:
                    i4 = 142;
                    break;
                case 25:
                    i4 = 174;
                    break;
                case 26:
                    i4 = 167;
                    break;
                case 27:
                    i4 = 247;
                    break;
                case 28:
                    i4 = 234;
                    break;
                case 29:
                    i4 = 34;
                    break;
                case 30:
                    i4 = 31;
                    break;
                case 31:
                    i4 = 160;
                    break;
                case 32:
                    i4 = 190;
                    break;
                case 33:
                    i4 = 213;
                    break;
                case 34:
                    i4 = 255;
                    break;
                case 35:
                    i4 = 144;
                    break;
                case 36:
                    i4 = 92;
                    break;
                case 37:
                    i4 = 205;
                    break;
                case 38:
                    i4 = 47;
                    break;
                case 39:
                    i4 = 198;
                    break;
                case 40:
                    i4 = 42;
                    break;
                case 41:
                    i4 = 102;
                    break;
                case 42:
                    i4 = 122;
                    break;
                case 43:
                    i4 = 204;
                    break;
                case 44:
                    i4 = 37;
                    break;
                case 45:
                    i4 = 49;
                    break;
                case 46:
                    i4 = 182;
                    break;
                case 47:
                    i4 = 233;
                    break;
                case 48:
                    i4 = 241;
                    break;
                case 49:
                    i4 = 140;
                    break;
                case 50:
                    i4 = 112;
                    break;
                case 51:
                    i4 = 129;
                    break;
                case 52:
                    i4 = 28;
                    break;
                case 53:
                    i4 = 32;
                    break;
                case 54:
                    i4 = 54;
                    break;
                case 55:
                    i4 = 192;
                    break;
                case 56:
                    i4 = 33;
                    break;
                case 57:
                    i4 = 202;
                    break;
                case 58:
                    i4 = 178;
                    break;
                case 59:
                    i4 = 128;
                    break;
                case 60:
                    i4 = 225;
                    break;
                case 61:
                    i4 = 189;
                    break;
                case 62:
                    i4 = 73;
                    break;
                case 63:
                    i4 = 43;
                    break;
                case 64:
                    i4 = 175;
                    break;
                case 65:
                    i4 = 50;
                    break;
                case 66:
                    i4 = 86;
                    break;
                case 67:
                    i4 = 254;
                    break;
                case 68:
                    i4 = 51;
                    break;
                case 69:
                    i4 = 65;
                    break;
                case 70:
                    i4 = 169;
                    break;
                case 71:
                    i4 = 0;
                    break;
                case 72:
                    i4 = 113;
                    break;
                case 73:
                    i4 = 48;
                    break;
                case 74:
                    i4 = 170;
                    break;
                case 75:
                    i4 = 70;
                    break;
                case 76:
                    i4 = 232;
                    break;
                case 77:
                    i4 = 69;
                    break;
                case 78:
                    i4 = 242;
                    break;
                case 79:
                    i4 = 99;
                    break;
                case 80:
                    i4 = 14;
                    break;
                case 81:
                    i4 = 77;
                    break;
                case 82:
                    i4 = 248;
                    break;
                case 83:
                    i4 = 168;
                    break;
                case 84:
                    i4 = 137;
                    break;
                case 85:
                    i4 = 88;
                    break;
                case 86:
                    i4 = 76;
                    break;
                case 87:
                    i4 = 139;
                    break;
                case 88:
                    i4 = 253;
                    break;
                case 89:
                    i4 = 173;
                    break;
                case 90:
                    i4 = 53;
                    break;
                case 91:
                    i4 = 201;
                    break;
                case 92:
                    i4 = 165;
                    break;
                case 93:
                    i4 = 89;
                    break;
                case 94:
                    i4 = 96;
                    break;
                case 95:
                    i4 = 130;
                    break;
                case 96:
                    i4 = 56;
                    break;
                case 97:
                    i4 = 36;
                    break;
                case 98:
                    i4 = 8;
                    break;
                case 99:
                    i4 = 2;
                    break;
                case 100:
                    i4 = 120;
                    break;
                case 101:
                    i4 = 61;
                    break;
                case 102:
                    i4 = 141;
                    break;
                case 103:
                    i4 = 188;
                    break;
                case 104:
                    i4 = 105;
                    break;
                case 105:
                    i4 = 166;
                    break;
                case 106:
                    i4 = 118;
                    break;
                case 107:
                    i4 = 153;
                    break;
                case 108:
                    i4 = 9;
                    break;
                case 109:
                    i4 = 12;
                    break;
                case 110:
                    i4 = 157;
                    break;
                case 111:
                    i4 = 116;
                    break;
                case 112:
                    i4 = 127;
                    break;
                case 113:
                    i4 = 206;
                    break;
                case 114:
                    i4 = 164;
                    break;
                case 115:
                    i4 = 193;
                    break;
                case 116:
                    i4 = 209;
                    break;
                case 117:
                    i4 = 74;
                    break;
                case 118:
                    i4 = 246;
                    break;
                case 119:
                    i4 = 155;
                    break;
                case 120:
                    i4 = 103;
                    break;
                case 121:
                    i4 = 6;
                    break;
                case 122:
                    i4 = 187;
                    break;
                case 123:
                    i4 = 81;
                    break;
                case 124:
                    i4 = 150;
                    break;
                case 125:
                    i4 = 126;
                    break;
                case 126:
                    i4 = 183;
                    break;
                case 127:
                    i4 = 40;
                    break;
                case 128:
                    i4 = 117;
                    break;
                case 129:
                    i4 = 180;
                    break;
                case 130:
                    i4 = 134;
                    break;
                case 131:
                    i4 = 95;
                    break;
                case 132:
                    i4 = 228;
                    break;
                case 133:
                    i4 = 66;
                    break;
                case 134:
                    i4 = 212;
                    break;
                case 135:
                    i4 = 161;
                    break;
                case 136:
                    i4 = 87;
                    break;
                case 137:
                    i4 = 44;
                    break;
                case 138:
                    i4 = 224;
                    break;
                case 139:
                    i4 = 84;
                    break;
                case 140:
                    i4 = 20;
                    break;
                case 141:
                    i4 = 151;
                    break;
                case 142:
                    i4 = 24;
                    break;
                case 143:
                    i4 = 79;
                    break;
                case 144:
                    i4 = 135;
                    break;
                case 145:
                    i4 = 159;
                    break;
                case 146:
                    i4 = 179;
                    break;
                case 147:
                    i4 = 26;
                    break;
                case 148:
                    i4 = 18;
                    break;
                case 149:
                    i4 = 197;
                    break;
                case 150:
                    i4 = 83;
                    break;
                case 151:
                    i4 = 19;
                    break;
                case 152:
                    i4 = 68;
                    break;
                case 153:
                    i4 = 240;
                    break;
                case 154:
                    i4 = 22;
                    break;
                case 155:
                    i4 = 218;
                    break;
                case 156:
                    i4 = 107;
                    break;
                case 157:
                    i4 = 236;
                    break;
                case 158:
                    i4 = 223;
                    break;
                case 159:
                    i4 = 4;
                    break;
                case 160:
                    i4 = 27;
                    break;
                case 161:
                    i4 = 100;
                    break;
                case 162:
                    i4 = 237;
                    break;
                case 163:
                    i4 = 238;
                    break;
                case 164:
                    i4 = 11;
                    break;
                case 165:
                    i4 = 41;
                    break;
                case 166:
                    i4 = 97;
                    break;
                case 167:
                    i4 = 15;
                    break;
                case 168:
                    i4 = 125;
                    break;
                case 169:
                    i4 = 58;
                    break;
                case 170:
                    i4 = 162;
                    break;
                case 171:
                    i4 = 108;
                    break;
                case 172:
                    i4 = 214;
                    break;
                case 173:
                    i4 = 29;
                    break;
                case 174:
                    i4 = 57;
                    break;
                case 175:
                    i4 = 101;
                    break;
                case 176:
                    i4 = 109;
                    break;
                case 177:
                    i4 = 185;
                    break;
                case 178:
                    i4 = 21;
                    break;
                case 179:
                    i4 = 222;
                    break;
                case 180:
                    i4 = 249;
                    break;
                case 181:
                    i4 = 55;
                    break;
                case 182:
                    i4 = 207;
                    break;
                case 183:
                    i4 = 194;
                    break;
                case 184:
                    i4 = 94;
                    break;
                case 185:
                    i4 = 90;
                    break;
                case 186:
                    i4 = 60;
                    break;
                case 187:
                    i4 = 123;
                    break;
                case 188:
                    i4 = 46;
                    break;
                case 189:
                    i4 = 149;
                    break;
                case 190:
                    i4 = 244;
                    break;
                case 191:
                    i4 = 208;
                    break;
                case 192:
                    i4 = 72;
                    break;
                case 193:
                    i4 = 13;
                    break;
                case 194:
                    i4 = 121;
                    break;
                case 195:
                    i4 = 145;
                    break;
                case 196:
                    i4 = 226;
                    break;
                case 197:
                    i4 = 231;
                    break;
                case 198:
                    i4 = 216;
                    break;
                case 199:
                    i4 = 146;
                    break;
                case 200:
                    i4 = 230;
                    break;
                case 201:
                    i4 = 176;
                    break;
                case 202:
                    i4 = 229;
                    break;
                case 203:
                    i4 = 38;
                    break;
                case 204:
                    i4 = 45;
                    break;
                case 205:
                    i4 = 78;
                    break;
                case 206:
                    i4 = 133;
                    break;
                case 207:
                    i4 = 136;
                    break;
                case 208:
                    i4 = 252;
                    break;
                case 209:
                    i4 = 35;
                    break;
                case 210:
                    i4 = 119;
                    break;
                case 211:
                    i4 = 111;
                    break;
                case 212:
                    i4 = 196;
                    break;
                case 213:
                    i4 = 62;
                    break;
                case 214:
                    i4 = 67;
                    break;
                case 215:
                    i4 = 110;
                    break;
                case 216:
                    i4 = 25;
                    break;
                case 217:
                    i4 = 217;
                    break;
                case 218:
                    i4 = 52;
                    break;
                case 219:
                    i4 = 16;
                    break;
                case 220:
                    i4 = 245;
                    break;
                case 221:
                    i4 = 191;
                    break;
                case 222:
                    i4 = 23;
                    break;
                case 223:
                    i4 = 10;
                    break;
                case 224:
                    i4 = 203;
                    break;
                case 225:
                    i4 = 91;
                    break;
                case 226:
                    i4 = 64;
                    break;
                case 227:
                    i4 = 163;
                    break;
                case 228:
                    i4 = 239;
                    break;
                case 229:
                    i4 = 199;
                    break;
                case 230:
                    i4 = 75;
                    break;
                case 231:
                    i4 = 152;
                    break;
                case 232:
                    i4 = 243;
                    break;
                case 233:
                    i4 = 210;
                    break;
                case 234:
                    i4 = 5;
                    break;
                case 235:
                    i4 = 148;
                    break;
                case 236:
                    i4 = 219;
                    break;
                case 237:
                    i4 = 17;
                    break;
                case 238:
                    i4 = 104;
                    break;
                case 239:
                    i4 = 98;
                    break;
                case 240:
                    i4 = 85;
                    break;
                case 241:
                    i4 = 156;
                    break;
                case 242:
                    i4 = 1;
                    break;
                case 243:
                    i4 = 106;
                    break;
                case 244:
                    i4 = 215;
                    break;
                case 245:
                    i4 = 227;
                    break;
                case 246:
                    i4 = 63;
                    break;
                case 247:
                    i4 = 132;
                    break;
                case 248:
                    i4 = 154;
                    break;
                case 249:
                    i4 = 251;
                    break;
                case 250:
                    i4 = 171;
                    break;
                case 251:
                    i4 = 184;
                    break;
                case 252:
                    i4 = 220;
                    break;
                case 253:
                    i4 = 143;
                    break;
                case 254:
                    i4 = 172;
                    break;
                default:
                    i4 = 115;
                    break;
            }
            int i6 = i4;
            int i7 = i2 ^ i3;
            int i8 = (i7 & 255) - i6;
            if (i8 < 0) {
                i8 += 256;
            }
            int i9 = ((i7 & 65535) >>> 8) - i6;
            if (i9 < 0) {
                i9 += 256;
            }
            for (int i10 = 0; i10 < charArray.length; i10++) {
                int i11 = i10 % 2;
                int i12 = i10;
                char c = charArray[i12];
                if (i11 == 0) {
                    charArray[i12] = (char) (c ^ i8);
                    i8 = (((i8 >>> 3) | (i8 << 5)) ^ charArray[i10]) & 255;
                } else {
                    charArray[i12] = (char) (c ^ i9);
                    i9 = (((i9 >>> 3) | (i9 << 5)) ^ charArray[i10]) & 255;
                }
            }
            f68b[i5] = new String(charArray).intern();
        }
        return f68b[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m136w(Object[] a) {
        boolean z;
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        ?? B = (String[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String[].class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, m137a(166327830 - 6115, (-166327830) - (-13878), (int) a3), -4117798225791736269L, a3) /* invoke-custom */;
        try {
            ?? length = B.length;
            if (length < 2) {
                return false;
            }
            Fragment.InstantiationException instantiationException = B[0];
            try {
                try {
                    try {
                        if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(instantiationException, m137a(166327830 - 6105, 166327830 - 27534, (int) a3), -4124456178044959144L, a3) /* invoke-custom */) {
                            ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(instantiationException, m137a(166327830 - 6117, 166327830 - 4927, (int) a3), -4175592842296026671L, a3) /* invoke-custom */;
                            if (B2 == 0 && !(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(instantiationException, m137a(166327830 - 6110, 166327830 - 18598, (int) a3), -4175592842296026671L, a3) /* invoke-custom */) {
                                z = false;
                                boolean a4 = z;
                                return a4;
                            }
                        }
                        z = true;
                        boolean a42 = z;
                        if (a42) {
                        }
                    } catch (RuntimeException unused) {
                        throw instantiationException;
                    }
                } catch (RuntimeException unused2) {
                    throw instantiationException;
                }
            } catch (RuntimeException unused3) {
                throw instantiationException;
            }
        } catch (RuntimeException unused4) {
            throw B;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0019i(long a) {
        super(m137a(59658 + ((char) (-7023)), 59658 + ((char) (-603)), (int) a), (InterfaceC0014E.n) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(InterfaceC0014E.n.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3058581560547578499L, a) /* invoke-custom */, (char) (a >>> 48), 2, (short) a, (int) ((r1 << 32) >>> 32));
        long j = a ^ 26267278953341L;
        int a2 = (int) ((j << 16) >>> 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x020a, code lost:
    
        r4 = new java.lang.Object[1];
        r9[0] = java.lang.Long.valueOf(r1);
        r0 = new dev.azad1337.p002lIlIillIliIlI.C0021p(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/String;}
        ).invoke(r4, r4, -4770631433486073455L, r1), (char) r2, m137a(57650 + ((char) (-15399)), (-516809010) + (-((char) (-15089))), (int) r1) + r0, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x024e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01df -> B:21:0x016c). Please report as a decompilation issue!!! */
    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo112Q(Object[] objArr) throws C0021p {
        ?? r0;
        Object obj;
        ?? B;
        ?? r02;
        long longValue = ((Long) objArr[0]).longValue();
        long j = longValue ^ 42127971308951L;
        long j2 = longValue ^ 119954530073393L;
        long j3 = longValue ^ 63275111823047L;
        long j4 = longValue ^ 27164827615888L;
        int i = (int) (longValue >>> 48);
        int i2 = (int) ((j4 << 16) >>> 32);
        int i3 = (int) ((j4 << 48) >>> 48);
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4771223904882311446L, longValue) /* invoke-custom */;
        Object[] objArr2 = new Object[1];
        this[0] = Long.valueOf(j);
        try {
            Iterator B2 = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Path.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, -4817449610459409718L, longValue) /* invoke-custom */, new String[0], -4760221284064440515L, longValue) /* invoke-custom */, -4757172884674660675L, longValue) /* invoke-custom */, -4816653562589811741L, longValue) /* invoke-custom */;
            while (true) {
                boolean B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -4763932458516328262L, longValue) /* invoke-custom */;
                ?? r03 = B3;
                if (B3) {
                    ?? B4 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -4810223118335984361L, longValue) /* invoke-custom */, -4819020957156032009L, longValue) /* invoke-custom */;
                    try {
                        r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B4, -4758771961011091410L, longValue) /* invoke-custom */;
                        if (longValue < 0) {
                            break;
                        }
                        if (!z) {
                            if (r0 == 0) {
                                r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B4, "#", -4759299937314767511L, longValue) /* invoke-custom */;
                            } else {
                                continue;
                            }
                        }
                        if (r0 != 0) {
                            continue;
                        } else {
                            Iterator B5 = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(List.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4819882900067467565L, longValue) /* invoke-custom */, -4816653562589811741L, longValue) /* invoke-custom */;
                            while (true) {
                                try {
                                    try {
                                        if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B5, -4763932458516328262L, longValue) /* invoke-custom */) {
                                            obj = (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B5, -4810223118335984361L, longValue) /* invoke-custom */;
                                            r02 = (String) obj;
                                            B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B4, r02, -4763850549188731746L, longValue) /* invoke-custom */;
                                            if (longValue >= 0 || z) {
                                                break;
                                                break;
                                            } else if (B == 0) {
                                                if (!z) {
                                                }
                                            } else {
                                                Object[] objArr3 = new Object[1];
                                                this[0] = Long.valueOf(j3);
                                                throw new C0021p((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr3, objArr3, -4770631433486073455L, longValue) /* invoke-custom */, (char) i, m137a(57650 + ((char) (-15402)), (-516809010) + (-((char) (-22808))), (int) longValue) + B4, i2, i3);
                                            }
                                        }
                                        obj = this;
                                        if (longValue >= 0) {
                                            ?? r3 = new Object[2];
                                            B4[1] = Long.valueOf(j2);
                                            r3[0] = r3;
                                            B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, r3, -4771544720891908489L, longValue) /* invoke-custom */;
                                            break;
                                        }
                                        B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B4, r02, -4763850549188731746L, longValue) /* invoke-custom */;
                                        if (longValue >= 0) {
                                            break;
                                        } else if (B == 0) {
                                        }
                                    } catch (IOException unused) {
                                        throw r02;
                                    }
                                } catch (IOException unused2) {
                                    throw r02;
                                }
                                r02 = (String) obj;
                            }
                            r0 = B;
                            if (longValue >= 0) {
                                if (B != 0) {
                                    try {
                                        break;
                                    } catch (IOException unused3) {
                                        throw B;
                                    }
                                }
                                r0 = z;
                            }
                            r03 = r0;
                            if (longValue <= 0) {
                                break;
                            } else if (r0 == 0) {
                            }
                        }
                    } catch (IOException unused4) {
                        throw B4;
                    }
                }
                try {
                    try {
                        r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4824476173730150551L, longValue) /* invoke-custom */;
                        break;
                    } catch (IOException unused5) {
                        throw r03;
                    }
                } catch (IOException unused6) {
                    throw r03;
                }
            }
            boolean z2 = r0;
            if (longValue >= 0) {
                if (r0 == 0) {
                    return;
                } else {
                    z2 = z;
                }
            }
            C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z2, -4771223904882311446L, longValue) /* invoke-custom */;
        } catch (IOException e) {
            Object[] objArr4 = new Object[1];
            this[0] = Long.valueOf(j3);
            throw new C0021p((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr4, objArr4, -4770631433486073455L, longValue) /* invoke-custom */, (char) i, m137a(57650 + ((char) (-15404)), (-516940080) - (-((char) (-2602))), (int) longValue) + (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(e, -4823971177022662068L, longValue) /* invoke-custom */, i2, i3);
        }
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: i */
    public void mo111i(Object[] objArr) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m135a(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m137a((-1341239310) + (-((char) (-8350))), (-1341370380) - (-((char) (-19736))), (int) a2), 7546444172393901676L, a2) /* invoke-custom */, 7523438531201645373L, a2) /* invoke-custom */;
        try {
            if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m137a((-1341239310) + (-((char) (-8358))), 45068 - ((char) (-19900)), (int) a2), 7526712873549924617L, a2) /* invoke-custom */) {
                return m137a((-1341239310) + (-((char) (-8359))), (-1341239310) + (-((char) (-10315))), (int) a2);
            }
            ?? m137a = m137a((-1341239310) + (-((char) (-8356))), 45070 + ((char) (-4145)), (int) a2);
            return m137a;
        } catch (RuntimeException unused) {
            throw B;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f8, code lost:
    
        if (r3 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fb, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d5, code lost:
    
        r6 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00da, code lost:
    
        r6 = 'k';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00df, code lost:
    
        r6 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e4, code lost:
    
        r6 = '8';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        r6 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        r6 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
    
        if (r3 > r15) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0107, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0115, code lost:
    
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r3 = r12;
        r12 = r12 + 1;
        r0[r3] = r0;
        r1 = r9 + r10;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r1 >= r13) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r11 = "æ¸\u000e¾ú\u008a\u0010àºùÉÀõV¬\u000b\u0090¸\fG\u0017\u008cÝ[_\u007f1v\u00adx\u0007DËàUÃãd";
        r13 = "æ¸\u000e¾ú\u008a\u0010àºùÉÀõV¬\u000b\u0090¸\fG\u0017\u008cÝ[_\u007f1v\u00adx\u0007DËàUÃãd".length();
        r10 = 30;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r4 = r12;
        r12 = r12 + 1;
        r0[r4] = r0;
        r2 = r9 + r10;
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 >= r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r10 = r11.charAt(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        dev.azad1337.p002lIlIillIliIlI.impl.C0019i.f67a = r0;
        dev.azad1337.p002lIlIillIliIlI.impl.C0019i.f68b = new java.lang.String[14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        dev.azad1337.p002lIlIillIliIlI.impl.C0019i.MONITORED_DOMAINS = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "î"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/util/List;}
        ).invoke(m137a((-554032890) - (-27496), (-554032890) - (-30059), (int) 33242492867592L), m137a((-554032890) - (-27482), (-554032890) - (-((char) (-16546))), (int) 33242492867592L), -7761089608300235391L, 33242492867592L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x009c, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x009f, code lost:
    
        r3 = r2;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a9, code lost:
    
        switch((r15 % 7)) {
            case 0: goto L18;
            case 1: goto L19;
            case 2: goto L20;
            case 3: goto L21;
            case 4: goto L22;
            case 5: goto L23;
            default: goto L24;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d0, code lost:
    
        r6 = '}';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f0, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r15 = r15 + 1;
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0104 -> B:5:0x009f). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[14];
        int i2 = 0;
        String str = "\u008càgµ×!!R\u008e¾ðM\u00075¯\u0093QRæhÖ\u001dÄ\u0084\u0087ª\u0015*À³\u0006¿ëZ<_ÝG&+\u007fÛ\u0085Ï2Uú±y\u001bü}\u009dxæR|Ä\u009bGç\u008e£J\u0096vË\u0013\u0004V ^\u001aZ\u0081Ù\u0094\u0084\u0080\u0003¶\u008fÃ\u0003&\u0080L\nÁ\u009fB\u0006È \u0088î\u0099w\u0003ÍY\u008a\u0004D¨l\u0010\u000eÉ'az§î}\u0007\u0002\u0001\u000e0\u0098\u0012\u0003µË\u008e\u0010 ßÇî\u0088\u0096\r²\u007fT\u0091\u0010\u0014²hÞ\u0007ãs¾ô\u0084Ü¢%-Ë\u0016\f)Õ1\u008aÇdb\u0097e\u008cr\u0097\u001dW\u0004d¤Õk4\u0013\u0019_wo3\u0083\u009fBÌj\u0093]";
        int length = "\u008càgµ×!!R\u008e¾ðM\u00075¯\u0093QRæhÖ\u001dÄ\u0084\u0087ª\u0015*À³\u0006¿ëZ<_ÝG&+\u007fÛ\u0085Ï2Uú±y\u001bü}\u009dxæR|Ä\u009bGç\u008e£J\u0096vË\u0013\u0004V ^\u001aZ\u0081Ù\u0094\u0084\u0080\u0003¶\u008fÃ\u0003&\u0080L\nÁ\u009fB\u0006È \u0088î\u0099w\u0003ÍY\u008a\u0004D¨l\u0010\u000eÉ'az§î}\u0007\u0002\u0001\u000e0\u0098\u0012\u0003µË\u008e\u0010 ßÇî\u0088\u0096\r²\u007fT\u0091\u0010\u0014²hÞ\u0007ãs¾ô\u0084Ü¢%-Ë\u0016\f)Õ1\u008aÇdb\u0097e\u008cr\u0097\u001dW\u0004d¤Õk4\u0013\u0019_wo3\u0083\u009fBÌj\u0093]".length();
        char c = 5;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            String substring = str.substring(i4, i4 + c);
            ?? r1 = -1;
            while (true) {
                String str2 = substring;
                String str3 = r1;
                char[] charArray = str2.toCharArray();
                int length2 = charArray.length;
                int i5 = 0;
                char[] cArr = charArray;
                int i6 = length2;
                i4 = i + 1;
                r1 = str.substring(i4, i4 + c);
            }
            c = str.charAt(i3);
        }
    }
}
