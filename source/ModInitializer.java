package dev.azad1337;

import dev.azad1337.p001IlIillIliIlIi.C0012j;
import dev.azad1337.p002lIlIillIliIlI.C0016i;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

/* renamed from: dev.azad1337.C */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/C.class */
public class C0000C implements ModInitializer {
    public static final String MOD_ID;
    public static final Logger LOGGER;
    private static C0012j FeatureManager;
    private static C0016i ProtectionManager;

    /* renamed from: a */
    public static boolean f0a;

    /* renamed from: b */
    private static final String[] f1b;

    /* renamed from: c */
    private static final String[] f2c;

    /*  JADX ERROR: Failed to decode insn: 0x0178: MOVE_MULTI, method: dev.azad1337.C.onInitialize():void
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[8]
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
    public void onInitialize() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.C0000C.onInitialize():void");
    }

    /* renamed from: a */
    private static String m0a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ 24837) & 65535;
        if (f2c[i5] == null) {
            char[] charArray = f1b[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 81;
                    break;
                case 1:
                    i4 = 203;
                    break;
                case 2:
                    i4 = 0;
                    break;
                case 3:
                    i4 = 120;
                    break;
                case 4:
                    i4 = 79;
                    break;
                case 5:
                    i4 = 47;
                    break;
                case 6:
                    i4 = 176;
                    break;
                case 7:
                    i4 = 142;
                    break;
                case 8:
                    i4 = 55;
                    break;
                case 9:
                    i4 = 194;
                    break;
                case 10:
                    i4 = 42;
                    break;
                case 11:
                    i4 = 85;
                    break;
                case 12:
                    i4 = 44;
                    break;
                case 13:
                    i4 = 232;
                    break;
                case 14:
                    i4 = 124;
                    break;
                case 15:
                    i4 = 206;
                    break;
                case 16:
                    i4 = 23;
                    break;
                case 17:
                    i4 = 15;
                    break;
                case 18:
                    i4 = 136;
                    break;
                case 19:
                    i4 = 50;
                    break;
                case 20:
                    i4 = 223;
                    break;
                case 21:
                    i4 = 110;
                    break;
                case 22:
                    i4 = 246;
                    break;
                case 23:
                    i4 = 71;
                    break;
                case 24:
                    i4 = 61;
                    break;
                case 25:
                    i4 = 159;
                    break;
                case 26:
                    i4 = 210;
                    break;
                case 27:
                    i4 = 179;
                    break;
                case 28:
                    i4 = 92;
                    break;
                case 29:
                    i4 = 83;
                    break;
                case 30:
                    i4 = 231;
                    break;
                case 31:
                    i4 = 163;
                    break;
                case 32:
                    i4 = 88;
                    break;
                case 33:
                    i4 = 121;
                    break;
                case 34:
                    i4 = 118;
                    break;
                case 35:
                    i4 = 191;
                    break;
                case 36:
                    i4 = 178;
                    break;
                case 37:
                    i4 = 2;
                    break;
                case 38:
                    i4 = 16;
                    break;
                case 39:
                    i4 = 243;
                    break;
                case 40:
                    i4 = 185;
                    break;
                case 41:
                    i4 = 31;
                    break;
                case 42:
                    i4 = 212;
                    break;
                case 43:
                    i4 = 225;
                    break;
                case 44:
                    i4 = 40;
                    break;
                case 45:
                    i4 = 54;
                    break;
                case 46:
                    i4 = 112;
                    break;
                case 47:
                    i4 = 167;
                    break;
                case 48:
                    i4 = 190;
                    break;
                case 49:
                    i4 = 14;
                    break;
                case 50:
                    i4 = 143;
                    break;
                case 51:
                    i4 = 221;
                    break;
                case 52:
                    i4 = 180;
                    break;
                case 53:
                    i4 = 39;
                    break;
                case 54:
                    i4 = 46;
                    break;
                case 55:
                    i4 = 200;
                    break;
                case 56:
                    i4 = 8;
                    break;
                case 57:
                    i4 = 202;
                    break;
                case 58:
                    i4 = 249;
                    break;
                case 59:
                    i4 = 253;
                    break;
                case 60:
                    i4 = 161;
                    break;
                case 61:
                    i4 = 156;
                    break;
                case 62:
                    i4 = 229;
                    break;
                case 63:
                    i4 = 237;
                    break;
                case 64:
                    i4 = 29;
                    break;
                case 65:
                    i4 = 116;
                    break;
                case 66:
                    i4 = 219;
                    break;
                case 67:
                    i4 = 32;
                    break;
                case 68:
                    i4 = 4;
                    break;
                case 69:
                    i4 = 234;
                    break;
                case 70:
                    i4 = 155;
                    break;
                case 71:
                    i4 = 195;
                    break;
                case 72:
                    i4 = 119;
                    break;
                case 73:
                    i4 = 148;
                    break;
                case 74:
                    i4 = 63;
                    break;
                case 75:
                    i4 = 53;
                    break;
                case 76:
                    i4 = 184;
                    break;
                case 77:
                    i4 = 95;
                    break;
                case 78:
                    i4 = 45;
                    break;
                case 79:
                    i4 = 99;
                    break;
                case 80:
                    i4 = 132;
                    break;
                case 81:
                    i4 = 189;
                    break;
                case 82:
                    i4 = 150;
                    break;
                case 83:
                    i4 = 34;
                    break;
                case 84:
                    i4 = 171;
                    break;
                case 85:
                    i4 = 20;
                    break;
                case 86:
                    i4 = 186;
                    break;
                case 87:
                    i4 = 113;
                    break;
                case 88:
                    i4 = 205;
                    break;
                case 89:
                    i4 = 139;
                    break;
                case 90:
                    i4 = 251;
                    break;
                case 91:
                    i4 = 157;
                    break;
                case 92:
                    i4 = 216;
                    break;
                case 93:
                    i4 = 201;
                    break;
                case 94:
                    i4 = 30;
                    break;
                case 95:
                    i4 = 131;
                    break;
                case 96:
                    i4 = 76;
                    break;
                case 97:
                    i4 = 78;
                    break;
                case 98:
                    i4 = 65;
                    break;
                case 99:
                    i4 = 175;
                    break;
                case 100:
                    i4 = 128;
                    break;
                case 101:
                    i4 = 197;
                    break;
                case 102:
                    i4 = 18;
                    break;
                case 103:
                    i4 = 153;
                    break;
                case 104:
                    i4 = 103;
                    break;
                case 105:
                    i4 = 242;
                    break;
                case 106:
                    i4 = 123;
                    break;
                case 107:
                    i4 = 199;
                    break;
                case 108:
                    i4 = 73;
                    break;
                case 109:
                    i4 = 59;
                    break;
                case 110:
                    i4 = 115;
                    break;
                case 111:
                    i4 = 226;
                    break;
                case 112:
                    i4 = 183;
                    break;
                case 113:
                    i4 = 27;
                    break;
                case 114:
                    i4 = 74;
                    break;
                case 115:
                    i4 = 239;
                    break;
                case 116:
                    i4 = 164;
                    break;
                case 117:
                    i4 = 33;
                    break;
                case 118:
                    i4 = 250;
                    break;
                case 119:
                    i4 = 67;
                    break;
                case 120:
                    i4 = 182;
                    break;
                case 121:
                    i4 = 255;
                    break;
                case 122:
                    i4 = 134;
                    break;
                case 123:
                    i4 = 192;
                    break;
                case 124:
                    i4 = 165;
                    break;
                case 125:
                    i4 = 169;
                    break;
                case 126:
                    i4 = 162;
                    break;
                case 127:
                    i4 = 70;
                    break;
                case 128:
                    i4 = 25;
                    break;
                case 129:
                    i4 = 117;
                    break;
                case 130:
                    i4 = 38;
                    break;
                case 131:
                    i4 = 93;
                    break;
                case 132:
                    i4 = 209;
                    break;
                case 133:
                    i4 = 19;
                    break;
                case 134:
                    i4 = 13;
                    break;
                case 135:
                    i4 = 60;
                    break;
                case 136:
                    i4 = 222;
                    break;
                case 137:
                    i4 = 66;
                    break;
                case 138:
                    i4 = 174;
                    break;
                case 139:
                    i4 = 100;
                    break;
                case 140:
                    i4 = 84;
                    break;
                case 141:
                    i4 = 166;
                    break;
                case 142:
                    i4 = 228;
                    break;
                case 143:
                    i4 = 122;
                    break;
                case 144:
                    i4 = 204;
                    break;
                case 145:
                    i4 = 21;
                    break;
                case 146:
                    i4 = 151;
                    break;
                case 147:
                    i4 = 43;
                    break;
                case 148:
                    i4 = 57;
                    break;
                case 149:
                    i4 = 160;
                    break;
                case 150:
                    i4 = 107;
                    break;
                case 151:
                    i4 = 37;
                    break;
                case 152:
                    i4 = 26;
                    break;
                case 153:
                    i4 = 211;
                    break;
                case 154:
                    i4 = 144;
                    break;
                case 155:
                    i4 = 130;
                    break;
                case 156:
                    i4 = 114;
                    break;
                case 157:
                    i4 = 105;
                    break;
                case 158:
                    i4 = 97;
                    break;
                case 159:
                    i4 = 3;
                    break;
                case 160:
                    i4 = 146;
                    break;
                case 161:
                    i4 = 135;
                    break;
                case 162:
                    i4 = 213;
                    break;
                case 163:
                    i4 = 149;
                    break;
                case 164:
                    i4 = 22;
                    break;
                case 165:
                    i4 = 214;
                    break;
                case 166:
                    i4 = 218;
                    break;
                case 167:
                    i4 = 17;
                    break;
                case 168:
                    i4 = 56;
                    break;
                case 169:
                    i4 = 168;
                    break;
                case 170:
                    i4 = 82;
                    break;
                case 171:
                    i4 = 254;
                    break;
                case 172:
                    i4 = 198;
                    break;
                case 173:
                    i4 = 140;
                    break;
                case 174:
                    i4 = 49;
                    break;
                case 175:
                    i4 = 36;
                    break;
                case 176:
                    i4 = 141;
                    break;
                case 177:
                    i4 = 233;
                    break;
                case 178:
                    i4 = 77;
                    break;
                case 179:
                    i4 = 90;
                    break;
                case 180:
                    i4 = 72;
                    break;
                case 181:
                    i4 = 89;
                    break;
                case 182:
                    i4 = 11;
                    break;
                case 183:
                    i4 = 173;
                    break;
                case 184:
                    i4 = 24;
                    break;
                case 185:
                    i4 = 137;
                    break;
                case 186:
                    i4 = 152;
                    break;
                case 187:
                    i4 = 248;
                    break;
                case 188:
                    i4 = 147;
                    break;
                case 189:
                    i4 = 75;
                    break;
                case 190:
                    i4 = 106;
                    break;
                case 191:
                    i4 = 80;
                    break;
                case 192:
                    i4 = 1;
                    break;
                case 193:
                    i4 = 94;
                    break;
                case 194:
                    i4 = 138;
                    break;
                case 195:
                    i4 = 187;
                    break;
                case 196:
                    i4 = 35;
                    break;
                case 197:
                    i4 = 41;
                    break;
                case 198:
                    i4 = 48;
                    break;
                case 199:
                    i4 = 7;
                    break;
                case 200:
                    i4 = 9;
                    break;
                case 201:
                    i4 = 252;
                    break;
                case 202:
                    i4 = 193;
                    break;
                case 203:
                    i4 = 87;
                    break;
                case 204:
                    i4 = 154;
                    break;
                case 205:
                    i4 = 177;
                    break;
                case 206:
                    i4 = 196;
                    break;
                case 207:
                    i4 = 227;
                    break;
                case 208:
                    i4 = 111;
                    break;
                case 209:
                    i4 = 207;
                    break;
                case 210:
                    i4 = 62;
                    break;
                case 211:
                    i4 = 188;
                    break;
                case 212:
                    i4 = 6;
                    break;
                case 213:
                    i4 = 104;
                    break;
                case 214:
                    i4 = 86;
                    break;
                case 215:
                    i4 = 58;
                    break;
                case 216:
                    i4 = 12;
                    break;
                case 217:
                    i4 = 28;
                    break;
                case 218:
                    i4 = 51;
                    break;
                case 219:
                    i4 = 98;
                    break;
                case 220:
                    i4 = 241;
                    break;
                case 221:
                    i4 = 220;
                    break;
                case 222:
                    i4 = 170;
                    break;
                case 223:
                    i4 = 68;
                    break;
                case 224:
                    i4 = 109;
                    break;
                case 225:
                    i4 = 247;
                    break;
                case 226:
                    i4 = 236;
                    break;
                case 227:
                    i4 = 127;
                    break;
                case 228:
                    i4 = 217;
                    break;
                case 229:
                    i4 = 235;
                    break;
                case 230:
                    i4 = 108;
                    break;
                case 231:
                    i4 = 5;
                    break;
                case 232:
                    i4 = 52;
                    break;
                case 233:
                    i4 = 158;
                    break;
                case 234:
                    i4 = 91;
                    break;
                case 235:
                    i4 = 181;
                    break;
                case 236:
                    i4 = 133;
                    break;
                case 237:
                    i4 = 172;
                    break;
                case 238:
                    i4 = 145;
                    break;
                case 239:
                    i4 = 224;
                    break;
                case 240:
                    i4 = 208;
                    break;
                case 241:
                    i4 = 238;
                    break;
                case 242:
                    i4 = 64;
                    break;
                case 243:
                    i4 = 244;
                    break;
                case 244:
                    i4 = 101;
                    break;
                case 245:
                    i4 = 10;
                    break;
                case 246:
                    i4 = 230;
                    break;
                case 247:
                    i4 = 125;
                    break;
                case 248:
                    i4 = 96;
                    break;
                case 249:
                    i4 = 215;
                    break;
                case 250:
                    i4 = 126;
                    break;
                case 251:
                    i4 = 245;
                    break;
                case 252:
                    i4 = 240;
                    break;
                case 253:
                    i4 = 129;
                    break;
                case 254:
                    i4 = 69;
                    break;
                default:
                    i4 = 102;
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
            f2c[i5] = new String(charArray).intern();
        }
        return f2c[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0108, code lost:
    
        if (r3 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x010b, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e5, code lost:
    
        r6 = '9';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ea, code lost:
    
        r6 = 'E';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        r6 = 'q';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f4, code lost:
    
        r6 = 'e';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f9, code lost:
    
        r6 = 'm';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fe, code lost:
    
        r6 = 't';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0110, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0114, code lost:
    
        if (r3 > r15) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0117, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0125, code lost:
    
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        r3 = r12;
        r12 = r12 + 1;
        r0[r3] = r0;
        r1 = r9 + r10;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r1 >= r13) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r11 = "g¯\u0098-1]U\u007f9\u0016F\u0093ó1C¹\u0018Ð\u008a\u000eÓ]\f\u0002ÞZµ\b\u0006\u0092¸%\\\u0089µÃj<Jm\u0083½<EêbïýÈÇhG3Ö£õª¸\u0088Ú\u001e%ïù\u0092i\u0088Ðë\u00ad0^\u001b]\u0097ËdØ\u001e\u001f\u0001\u0016Õ\u0019U]\u0007,\u009f\u0097Á\u001b\u008b\u0012±d\u008b¼Òe\u0010\t\u007f_\u009aìCñf£}æ©Ñ)Ü\u0084äíéæjø\u0010\u009e";
        r13 = "g¯\u0098-1]U\u007f9\u0016F\u0093ó1C¹\u0018Ð\u008a\u000eÓ]\f\u0002ÞZµ\b\u0006\u0092¸%\\\u0089µÃj<Jm\u0083½<EêbïýÈÇhG3Ö£õª¸\u0088Ú\u001e%ïù\u0092i\u0088Ðë\u00ad0^\u001b]\u0097ËdØ\u001e\u001f\u0001\u0016Õ\u0019U]\u0007,\u009f\u0097Á\u001b\u008b\u0012±d\u008b¼Òe\u0010\t\u007f_\u009aìCñf£}æ©Ñ)Ü\u0084äíéæjø\u0010\u009e".length();
        r10 = ' ';
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        r4 = r12;
        r12 = r12 + 1;
        r0[r4] = r0;
        r2 = r9 + r10;
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r2 >= r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r10 = r11.charAt(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        dev.azad1337.C0000C.f1b = r0;
        dev.azad1337.C0000C.f2c = new java.lang.String[14];
        dev.azad1337.C0000C.MOD_ID = m0a(-519613056, 519617778, (int) 14671088661633L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
    
        dev.azad1337.C0000C.LOGGER = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "î"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lorg/slf4j/Logger;}
        ).invoke(m0a((-519561480) + (-((char) (-13964))), (-519561480) + (-((char) (-19236))), (int) 14671088661633L), 3805354039617400148L, 14671088661633L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00ae, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b1, code lost:
    
        r3 = r2;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b4, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bb, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e0, code lost:
    
        r6 = '5';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0100, code lost:
    
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0114 -> B:5:0x00b1). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[14];
        int i2 = 0;
        String str = "ú6\u000e\u0006!\u0016Á\\\u0099\u0095Án|Êe\u0093¼>eªfç}É×HE7\u0096#ýº¹\u008aú^!çy\u0093y¨Òïí°V\u000b\\\u0095ë$Ü\u0016\u009f��\u0006õ\u001bQ\u001d\u0087$\u008f\u0096Ã;Ë\u0016¹ä\u008a¬òg\u0014IÿW\u008aíAÑ&§uf¨Á\tÞ\u0080¤máökú0Þ\u0012(\tÓ?P=oYÏâ\rW´\u0089]ÈðS\u000bó\u000b\u001d\u0095ã§\u001f?\u001a¼\t\u0007~\u001e\u009e\u00033¶\u0083\u0011Ö\u0017(ü/E\u0080V2\u0003¿zT\u001f\u0012\t\f0(XÚGÌ\u0013+\u0086hH3\u0002\u0092��\u0001Ë\u008c)\u0016HÜÕ\u00913úB\u009dÚO;Aë\u0007|5ß._ÌB¥Æ=0£,\u0003»\u000eRÄbs¹¥Q= ¤ÚYE^\u001b$\u000bñ¡Þâ>\u001eKk\u009b\u0002±Ò\u0083:¾\u008a26\u0005sL®R½Ì\u0015uì\b/\u0006k)\f(*w\u001d\u0087Ù§Ç\u0097H\u0017ÆÒ\u0018Ã\u009f\r3A°ÍT5\"T+H÷¼\u009eY\u001eÎ¤\u009a-µ®#\u0010¿ÈÉð`ñ\bñyÍÊihõ¾Ú\u008b\u0001¼\u0017´þ9\u00adðÁZØg]\u0092õ \"";
        int length = "ú6\u000e\u0006!\u0016Á\\\u0099\u0095Án|Êe\u0093¼>eªfç}É×HE7\u0096#ýº¹\u008aú^!çy\u0093y¨Òïí°V\u000b\\\u0095ë$Ü\u0016\u009f��\u0006õ\u001bQ\u001d\u0087$\u008f\u0096Ã;Ë\u0016¹ä\u008a¬òg\u0014IÿW\u008aíAÑ&§uf¨Á\tÞ\u0080¤máökú0Þ\u0012(\tÓ?P=oYÏâ\rW´\u0089]ÈðS\u000bó\u000b\u001d\u0095ã§\u001f?\u001a¼\t\u0007~\u001e\u009e\u00033¶\u0083\u0011Ö\u0017(ü/E\u0080V2\u0003¿zT\u001f\u0012\t\f0(XÚGÌ\u0013+\u0086hH3\u0002\u0092��\u0001Ë\u008c)\u0016HÜÕ\u00913úB\u009dÚO;Aë\u0007|5ß._ÌB¥Æ=0£,\u0003»\u000eRÄbs¹¥Q= ¤ÚYE^\u001b$\u000bñ¡Þâ>\u001eKk\u009b\u0002±Ò\u0083:¾\u008a26\u0005sL®R½Ì\u0015uì\b/\u0006k)\f(*w\u001d\u0087Ù§Ç\u0097H\u0017ÆÒ\u0018Ã\u009f\r3A°ÍT5\"T+H÷¼\u009eY\u001eÎ¤\u009a-µ®#\u0010¿ÈÉð`ñ\bñyÍÊihõ¾Ú\u008b\u0001¼\u0017´þ9\u00adðÁZØg]\u0092õ \"".length();
        char c = 7;
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
