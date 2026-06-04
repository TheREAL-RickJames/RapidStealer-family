package dev.azad1337.p002lIlIillIliIlI.impl;

import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p002lIlIillIliIlI.AbstractC0015W;
import dev.azad1337.p002lIlIillIliIlI.C0021p;
import dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.security.ProtectionDomain;

/* renamed from: dev.azad1337.lIılİIıilİlIıİliIılİIı.impl.P */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/lIılİIıilİlIıİliIılİIı/impl/P.class */
public class C0017P extends AbstractC0015W {
    private static final String HASH_ENDPOINT;

    /* renamed from: a */
    private static final String[] f59a;

    /* renamed from: b */
    private static final String[] f60b;

    /* renamed from: c */
    private static final long[] f61c;

    /* renamed from: d */
    private static final Integer[] f62d;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0124, code lost:
    
        if (r3 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0127, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0101, code lost:
    
        r6 = 'c';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0106, code lost:
    
        r6 = 'U';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010b, code lost:
    
        r6 = '9';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0110, code lost:
    
        r6 = 'E';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        r6 = 'Z';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011a, code lost:
    
        r6 = 'd';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012c, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0130, code lost:
    
        if (r3 > r23) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0133, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0141, code lost:
    
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r3 = r20;
        r20 = r20 + 1;
        r0[r3] = r0;
        r1 = r17 + r18;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r1 >= r21) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r19 = "øÐ\u001b#×¤t\u001aÔÀ\u009c£ÃÈ2P~Ô\u0003>\u007fùXÚÉÔu¢7;]^è\u0001";
        r21 = "øÐ\u001b#×¤t\u001aÔÀ\u009c£ÃÈ2P~Ô\u0003>\u007fùXÚÉÔu¢7;]^è\u0001".length();
        r18 = 7;
        r17 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r4 = r20;
        r20 = r20 + 1;
        r0[r4] = r0;
        r2 = r17 + r18;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r2 >= r21) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r18 = r19.charAt(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        dev.azad1337.p002lIlIillIliIlI.impl.C0017P.f59a = r0;
        dev.azad1337.p002lIlIillIliIlI.impl.C0017P.f60b = new java.lang.String[11];
        dev.azad1337.p002lIlIillIliIlI.impl.C0017P.HASH_ENDPOINT = m130a(-144310922, 144318292, (int) 71060089578289L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        r2 = new long[3];
        r10 = 0;
        r2 = "©Ý&{uq¢kö¹çê\u0084´Ã\u0007\u000bK¨\u0015ù\u0011ç\"".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0166, code lost:
    
        r3 = r9;
        r9 = r9 + 8;
        r2 = "©Ý&{uq¢kö¹çê\u0084´Ã\u0007\u000bK¨\u0015ù\u0011ç\"".substring(r3, r9).getBytes("ISO-8859-1");
        r3 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e7, code lost:
    
        (-1)[(((((((((r2[0] & 255) << 56) | ((r2[1] & 255) << 48)) | ((r2[2] & 255) << 40)) | ((r2[3] & 255) << 32)) | ((r2[4] & 255) << 24)) | ((r2[5] & 255) << 16)) | ((r2[6] & 255) << 8)) | (r2[7] & 255)) ^ 71060089578289L] = r3 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ea, code lost:
    
        if (r9 < r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ed, code lost:
    
        dev.azad1337.p002lIlIillIliIlI.impl.C0017P.f61c = r2;
        dev.azad1337.p002lIlIillIliIlI.impl.C0017P.f62d = new java.lang.Integer[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0207, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00c8, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00cb, code lost:
    
        r3 = r2;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ce, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d5, code lost:
    
        switch((r23 % 7)) {
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
    
        r6 = 'I';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011c, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r23 = r23 + 1;
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v41, types: [long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0130 -> B:5:0x00cb). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[11];
        int i2 = 0;
        String str = "\u0081ìÿ\u0086\u001e.\u0014\u0089\u0011CäFÖ\u001a|#,sOÎ)Å5\u0094ú\u007fØè¯!QÛ\u0005\u001a?\t1wN}»iYgù\tn\u001e§n?ã\u0004\u0093\u0010\u0003\\Q\f\u001b·\u008cð*Nù\u0083vH\u0010À¬»óç¾\u0097ÃL£ñ\u0091\u000bïq\u0004v)^Ì¦Fûäá`/ìq¬uä\u008a \bP«©\u0099\u009e?à÷·»eÑs\u0080¦DK\fV»\u0088\u0089èi\bÄÊ¥]ýb\u0094\u0089)\b\u0097l-¢\u0089ÊÍJYÝ\u001aà28z^\u000baÂÀó\u0014M\u0092\u0002\u0017ÓD¥2|\u0012\u0010Æ=âå¢E\f";
        int length = "\u0081ìÿ\u0086\u001e.\u0014\u0089\u0011CäFÖ\u001a|#,sOÎ)Å5\u0094ú\u007fØè¯!QÛ\u0005\u001a?\t1wN}»iYgù\tn\u001e§n?ã\u0004\u0093\u0010\u0003\\Q\f\u001b·\u008cð*Nù\u0083vH\u0010À¬»óç¾\u0097ÃL£ñ\u0091\u000bïq\u0004v)^Ì¦Fûäá`/ìq¬uä\u008a \bP«©\u0099\u009e?à÷·»eÑs\u0080¦DK\fV»\u0088\u0089èi\bÄÊ¥]ýb\u0094\u0089)\b\u0097l-¢\u0089ÊÍJYÝ\u001aà28z^\u000baÂÀó\u0014M\u0092\u0002\u0017ÓD¥2|\u0012\u0010Æ=âå¢E\f".length();
        char c = 4;
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

    /* renamed from: a */
    private static String m130a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ 24143) & 65535;
        if (f60b[i5] == null) {
            char[] charArray = f59a[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 188;
                    break;
                case 1:
                    i4 = 24;
                    break;
                case 2:
                    i4 = 185;
                    break;
                case 3:
                    i4 = 213;
                    break;
                case 4:
                    i4 = 49;
                    break;
                case 5:
                    i4 = 106;
                    break;
                case 6:
                    i4 = 22;
                    break;
                case 7:
                    i4 = 193;
                    break;
                case 8:
                    i4 = 118;
                    break;
                case 9:
                    i4 = 4;
                    break;
                case 10:
                    i4 = 52;
                    break;
                case 11:
                    i4 = 144;
                    break;
                case 12:
                    i4 = 72;
                    break;
                case 13:
                    i4 = 183;
                    break;
                case 14:
                    i4 = 190;
                    break;
                case 15:
                    i4 = 163;
                    break;
                case 16:
                    i4 = 19;
                    break;
                case 17:
                    i4 = 56;
                    break;
                case 18:
                    i4 = 131;
                    break;
                case 19:
                    i4 = 232;
                    break;
                case 20:
                    i4 = 53;
                    break;
                case 21:
                    i4 = 143;
                    break;
                case 22:
                    i4 = 15;
                    break;
                case 23:
                    i4 = 187;
                    break;
                case 24:
                    i4 = 70;
                    break;
                case 25:
                    i4 = 242;
                    break;
                case 26:
                    i4 = 83;
                    break;
                case 27:
                    i4 = 228;
                    break;
                case 28:
                    i4 = 197;
                    break;
                case 29:
                    i4 = 50;
                    break;
                case 30:
                    i4 = 204;
                    break;
                case 31:
                    i4 = 35;
                    break;
                case 32:
                    i4 = 26;
                    break;
                case 33:
                    i4 = 48;
                    break;
                case 34:
                    i4 = 234;
                    break;
                case 35:
                    i4 = 175;
                    break;
                case 36:
                    i4 = 91;
                    break;
                case 37:
                    i4 = 102;
                    break;
                case 38:
                    i4 = 114;
                    break;
                case 39:
                    i4 = 124;
                    break;
                case 40:
                    i4 = 164;
                    break;
                case 41:
                    i4 = 166;
                    break;
                case 42:
                    i4 = 223;
                    break;
                case 43:
                    i4 = 0;
                    break;
                case 44:
                    i4 = 45;
                    break;
                case 45:
                    i4 = 104;
                    break;
                case 46:
                    i4 = 148;
                    break;
                case 47:
                    i4 = 73;
                    break;
                case 48:
                    i4 = 7;
                    break;
                case 49:
                    i4 = 151;
                    break;
                case 50:
                    i4 = 62;
                    break;
                case 51:
                    i4 = 10;
                    break;
                case 52:
                    i4 = 224;
                    break;
                case 53:
                    i4 = 68;
                    break;
                case 54:
                    i4 = 245;
                    break;
                case 55:
                    i4 = 249;
                    break;
                case 56:
                    i4 = 191;
                    break;
                case 57:
                    i4 = 145;
                    break;
                case 58:
                    i4 = 252;
                    break;
                case 59:
                    i4 = 116;
                    break;
                case 60:
                    i4 = 133;
                    break;
                case 61:
                    i4 = 105;
                    break;
                case 62:
                    i4 = 221;
                    break;
                case 63:
                    i4 = 29;
                    break;
                case 64:
                    i4 = 54;
                    break;
                case 65:
                    i4 = 60;
                    break;
                case 66:
                    i4 = 246;
                    break;
                case 67:
                    i4 = 189;
                    break;
                case 68:
                    i4 = 94;
                    break;
                case 69:
                    i4 = 103;
                    break;
                case 70:
                    i4 = 37;
                    break;
                case 71:
                    i4 = 128;
                    break;
                case 72:
                    i4 = 186;
                    break;
                case 73:
                    i4 = 12;
                    break;
                case 74:
                    i4 = 97;
                    break;
                case 75:
                    i4 = 220;
                    break;
                case 76:
                    i4 = 153;
                    break;
                case 77:
                    i4 = 216;
                    break;
                case 78:
                    i4 = 138;
                    break;
                case 79:
                    i4 = 136;
                    break;
                case 80:
                    i4 = 2;
                    break;
                case 81:
                    i4 = 130;
                    break;
                case 82:
                    i4 = 196;
                    break;
                case 83:
                    i4 = 209;
                    break;
                case 84:
                    i4 = 176;
                    break;
                case 85:
                    i4 = 67;
                    break;
                case 86:
                    i4 = 255;
                    break;
                case 87:
                    i4 = 69;
                    break;
                case 88:
                    i4 = 202;
                    break;
                case 89:
                    i4 = 18;
                    break;
                case 90:
                    i4 = 233;
                    break;
                case 91:
                    i4 = 75;
                    break;
                case 92:
                    i4 = 181;
                    break;
                case 93:
                    i4 = 192;
                    break;
                case 94:
                    i4 = 150;
                    break;
                case 95:
                    i4 = 96;
                    break;
                case 96:
                    i4 = 119;
                    break;
                case 97:
                    i4 = 157;
                    break;
                case 98:
                    i4 = 126;
                    break;
                case 99:
                    i4 = 199;
                    break;
                case 100:
                    i4 = 32;
                    break;
                case 101:
                    i4 = 55;
                    break;
                case 102:
                    i4 = 98;
                    break;
                case 103:
                    i4 = 27;
                    break;
                case 104:
                    i4 = 206;
                    break;
                case 105:
                    i4 = 244;
                    break;
                case 106:
                    i4 = 174;
                    break;
                case 107:
                    i4 = 208;
                    break;
                case 108:
                    i4 = 3;
                    break;
                case 109:
                    i4 = 137;
                    break;
                case 110:
                    i4 = 84;
                    break;
                case 111:
                    i4 = 5;
                    break;
                case 112:
                    i4 = 253;
                    break;
                case 113:
                    i4 = 172;
                    break;
                case 114:
                    i4 = 74;
                    break;
                case 115:
                    i4 = 236;
                    break;
                case 116:
                    i4 = 243;
                    break;
                case 117:
                    i4 = 155;
                    break;
                case 118:
                    i4 = 8;
                    break;
                case 119:
                    i4 = 178;
                    break;
                case 120:
                    i4 = 160;
                    break;
                case 121:
                    i4 = 71;
                    break;
                case 122:
                    i4 = 129;
                    break;
                case 123:
                    i4 = 101;
                    break;
                case 124:
                    i4 = 156;
                    break;
                case 125:
                    i4 = 158;
                    break;
                case 126:
                    i4 = 180;
                    break;
                case 127:
                    i4 = 81;
                    break;
                case 128:
                    i4 = 241;
                    break;
                case 129:
                    i4 = 78;
                    break;
                case 130:
                    i4 = 28;
                    break;
                case 131:
                    i4 = 11;
                    break;
                case 132:
                    i4 = 95;
                    break;
                case 133:
                    i4 = 238;
                    break;
                case 134:
                    i4 = 229;
                    break;
                case 135:
                    i4 = 231;
                    break;
                case 136:
                    i4 = 122;
                    break;
                case 137:
                    i4 = 200;
                    break;
                case 138:
                    i4 = 108;
                    break;
                case 139:
                    i4 = 82;
                    break;
                case 140:
                    i4 = 90;
                    break;
                case 141:
                    i4 = 194;
                    break;
                case 142:
                    i4 = 198;
                    break;
                case 143:
                    i4 = 171;
                    break;
                case 144:
                    i4 = 205;
                    break;
                case 145:
                    i4 = 226;
                    break;
                case 146:
                    i4 = 152;
                    break;
                case 147:
                    i4 = 80;
                    break;
                case 148:
                    i4 = 179;
                    break;
                case 149:
                    i4 = 41;
                    break;
                case 150:
                    i4 = 140;
                    break;
                case 151:
                    i4 = 23;
                    break;
                case 152:
                    i4 = 237;
                    break;
                case 153:
                    i4 = 64;
                    break;
                case 154:
                    i4 = 93;
                    break;
                case 155:
                    i4 = 111;
                    break;
                case 156:
                    i4 = 117;
                    break;
                case 157:
                    i4 = 227;
                    break;
                case 158:
                    i4 = 13;
                    break;
                case 159:
                    i4 = 235;
                    break;
                case 160:
                    i4 = 115;
                    break;
                case 161:
                    i4 = 195;
                    break;
                case 162:
                    i4 = 79;
                    break;
                case 163:
                    i4 = 109;
                    break;
                case 164:
                    i4 = 39;
                    break;
                case 165:
                    i4 = 134;
                    break;
                case 166:
                    i4 = 16;
                    break;
                case 167:
                    i4 = 31;
                    break;
                case 168:
                    i4 = 215;
                    break;
                case 169:
                    i4 = 173;
                    break;
                case 170:
                    i4 = 154;
                    break;
                case 171:
                    i4 = 125;
                    break;
                case 172:
                    i4 = 230;
                    break;
                case 173:
                    i4 = 239;
                    break;
                case 174:
                    i4 = 100;
                    break;
                case 175:
                    i4 = 247;
                    break;
                case 176:
                    i4 = 30;
                    break;
                case 177:
                    i4 = 167;
                    break;
                case 178:
                    i4 = 254;
                    break;
                case 179:
                    i4 = 77;
                    break;
                case 180:
                    i4 = 6;
                    break;
                case 181:
                    i4 = 141;
                    break;
                case 182:
                    i4 = 86;
                    break;
                case 183:
                    i4 = 59;
                    break;
                case 184:
                    i4 = 43;
                    break;
                case 185:
                    i4 = 184;
                    break;
                case 186:
                    i4 = 9;
                    break;
                case 187:
                    i4 = 210;
                    break;
                case 188:
                    i4 = 38;
                    break;
                case 189:
                    i4 = 161;
                    break;
                case 190:
                    i4 = 211;
                    break;
                case 191:
                    i4 = 177;
                    break;
                case 192:
                    i4 = 217;
                    break;
                case 193:
                    i4 = 203;
                    break;
                case 194:
                    i4 = 36;
                    break;
                case 195:
                    i4 = 57;
                    break;
                case 196:
                    i4 = 219;
                    break;
                case 197:
                    i4 = 182;
                    break;
                case 198:
                    i4 = 110;
                    break;
                case 199:
                    i4 = 61;
                    break;
                case 200:
                    i4 = 25;
                    break;
                case 201:
                    i4 = 251;
                    break;
                case 202:
                    i4 = 162;
                    break;
                case 203:
                    i4 = 99;
                    break;
                case 204:
                    i4 = 20;
                    break;
                case 205:
                    i4 = 121;
                    break;
                case 206:
                    i4 = 63;
                    break;
                case 207:
                    i4 = 222;
                    break;
                case 208:
                    i4 = 89;
                    break;
                case 209:
                    i4 = 132;
                    break;
                case 210:
                    i4 = 139;
                    break;
                case 211:
                    i4 = 127;
                    break;
                case 212:
                    i4 = 112;
                    break;
                case 213:
                    i4 = 107;
                    break;
                case 214:
                    i4 = 214;
                    break;
                case 215:
                    i4 = 142;
                    break;
                case 216:
                    i4 = 207;
                    break;
                case 217:
                    i4 = 146;
                    break;
                case 218:
                    i4 = 123;
                    break;
                case 219:
                    i4 = 58;
                    break;
                case 220:
                    i4 = 21;
                    break;
                case 221:
                    i4 = 168;
                    break;
                case 222:
                    i4 = 47;
                    break;
                case 223:
                    i4 = 240;
                    break;
                case 224:
                    i4 = 212;
                    break;
                case 225:
                    i4 = 44;
                    break;
                case 226:
                    i4 = 201;
                    break;
                case 227:
                    i4 = 76;
                    break;
                case 228:
                    i4 = 33;
                    break;
                case 229:
                    i4 = 14;
                    break;
                case 230:
                    i4 = 17;
                    break;
                case 231:
                    i4 = 66;
                    break;
                case 232:
                    i4 = 248;
                    break;
                case 233:
                    i4 = 51;
                    break;
                case 234:
                    i4 = 169;
                    break;
                case 235:
                    i4 = 120;
                    break;
                case 236:
                    i4 = 87;
                    break;
                case 237:
                    i4 = 218;
                    break;
                case 238:
                    i4 = 40;
                    break;
                case 239:
                    i4 = 1;
                    break;
                case 240:
                    i4 = 170;
                    break;
                case 241:
                    i4 = 34;
                    break;
                case 242:
                    i4 = 159;
                    break;
                case 243:
                    i4 = 135;
                    break;
                case 244:
                    i4 = 88;
                    break;
                case 245:
                    i4 = 147;
                    break;
                case 246:
                    i4 = 225;
                    break;
                case 247:
                    i4 = 46;
                    break;
                case 248:
                    i4 = 113;
                    break;
                case 249:
                    i4 = 85;
                    break;
                case 250:
                    i4 = 250;
                    break;
                case 251:
                    i4 = 42;
                    break;
                case 252:
                    i4 = 149;
                    break;
                case 253:
                    i4 = 92;
                    break;
                case 254:
                    i4 = 165;
                    break;
                default:
                    i4 = 65;
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
            f60b[i5] = new String(charArray).intern();
        }
        return f60b[i5];
    }

    /* renamed from: a */
    private static int m131a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27280;
        if (f62d[i2] == null) {
            f62d[i2] = Integer.valueOf((int) (f61c[i2] ^ j));
        }
        return f62d[i2].intValue();
    }

    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: i */
    public void mo111i(Object[] objArr) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Throwable, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.security.MessageDigest, java.lang.Object] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m128y(Object[] a) throws Exception {
        Object obj;
        long a2 = ((Long) a[0]).longValue();
        File a3 = (File) a[1];
        ?? r0 = (MessageDigest) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(MessageDigest.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m130a((-1863422190) - (-((char) (-32128))), 37102 - ((char) (-31855)), (int) a2), -5792047983256087201L, a2) /* invoke-custom */;
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5803437636311634859L, a2) /* invoke-custom */;
        InputStream a4 = new FileInputStream(a3);
        try {
            byte[] a5 = new byte[m131a(10919, 975868289165029346L ^ a2)];
            loop0: while (true) {
                ?? B = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, a5, -5784809480066307118L, a2) /* invoke-custom */;
                if (B == -1) {
                    break;
                }
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, a5, 0, B, -5788012890307492987L, a2) /* invoke-custom */;
                do {
                    boolean z2 = z;
                    if (a2 >= 0) {
                        if (z2) {
                            break loop0;
                        }
                        z2 = z;
                    }
                    if (z2) {
                    }
                } while (a2 <= 0);
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, -5786944972783749657L, a2) /* invoke-custom */;
            StringBuilder a6 = new StringBuilder();
            byte[] B2 = (byte[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5796730666304372809L, a2) /* invoke-custom */;
            int length = B2.length;
            int i = 0;
            loop2: while (i < length) {
                byte a7 = B2[i];
                do {
                    if (a2 > 0) {
                        obj = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m130a((-1863422190) - (-((char) (-32119))), 1863422190 - 6428, (int) a2), new Object[]{(Byte) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Byte.class, Byte.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a7, -5784488800581858749L, a2) /* invoke-custom */}, -5789706920403738108L, a2) /* invoke-custom */, -5786881817432120620L, a2) /* invoke-custom */;
                        if (z) {
                            break loop2;
                        }
                        i++;
                    }
                    if (z) {
                    }
                } while (a2 < 0);
            }
            obj = a6;
            return (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5785442866269607218L, a2) /* invoke-custom */;
        } catch (Throwable th) {
            try {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, -5786944972783749657L, a2) /* invoke-custom */;
            } catch (Throwable th2) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, -5795357375628560577L, a2) /* invoke-custom */;
            }
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0017P(long a) {
        super(m130a(809226180 - 16834, 809226180 - 1318, (int) a), (InterfaceC0014E.n) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(InterfaceC0014E.n.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3442805219819427640L, a) /* invoke-custom */, (char) (a >>> 48), 2, (short) a, (int) ((r1 << 32) >>> 32));
        long j = a ^ 27771075677896L;
        int a2 = (int) ((j << 16) >>> 48);
    }

    /* renamed from: j */
    private String m129j(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        try {
            HttpURLConnection a3 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(m130a(1978239510 - 30633, (-1978239510) - (-25652), (int) a2)), 5524482550726550157L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, m130a(1978239510 - 30631, 1978239510 - 16209, (int) a2), 5508139482840971500L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, m131a(24690, 5774175687833110214L ^ a2), 5524160928919996007L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, m131a(9529, 4607930217629811599L ^ a2), 5523486843236993284L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, m130a(1978239510 - 30638, (-1978239510) - (-2837), (int) a2), (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5528333897246655842L, a2) /* invoke-custom */, 5494968551442926614L, a2) /* invoke-custom */;
            BufferedReader a4 = new BufferedReader(new InputStreamReader((InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, 5525645314667776070L, a2) /* invoke-custom */));
            try {
                String B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, 5499556466490770936L, a2) /* invoke-custom */;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, 5522044848138262450L, a2) /* invoke-custom */;
                return B;
            } finally {
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.lang.String] */
    @Override // dev.azad1337.p002lIlIillIliIlI.InterfaceC0014E
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo112Q(Object[] objArr) throws C0021p {
        long longValue = ((Long) objArr[0]).longValue();
        long j = longValue ^ 118639555036665L;
        long j2 = longValue ^ 126166462099791L;
        long j3 = longValue ^ 63275111823047L;
        long j4 = longValue ^ 27164827615888L;
        int i = (int) (longValue >>> 48);
        int i2 = (int) ((j4 << 16) >>> 32);
        int i3 = (int) ((j4 << 48) >>> 48);
        Object[] objArr2 = new Object[1];
        this[0] = Long.valueOf(j);
        ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, -4823715553357984017L, longValue) /* invoke-custom */;
        Object[] objArr3 = new Object[1];
        this[0] = Long.valueOf(j2);
        String B2 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr3, objArr3, -4822583449908878896L, longValue) /* invoke-custom */;
        if (B == 0) {
            try {
                Object[] objArr4 = new Object[1];
                this[0] = Long.valueOf(j3);
                C0021p c0021p = new C0021p((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr4, objArr4, -4770631433486073455L, longValue) /* invoke-custom */, (char) i, m130a(57648 - ((char) (-510)), (-516940080) - (-((char) (-3142))), (int) longValue), i2, i3);
                throw c0021p;
            } catch (C0021p unused) {
                throw B;
            }
        }
        ?? r0 = B2;
        Throwable th = r0;
        if (longValue >= 0) {
            if (r0 == 0) {
                try {
                    Object[] objArr5 = new Object[1];
                    this[0] = Long.valueOf(j3);
                    C0021p c0021p2 = new C0021p((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr5, objArr5, -4770631433486073455L, longValue) /* invoke-custom */, (char) i, m130a(57648 - ((char) (-497)), 57650 + ((char) (-18697)), (int) longValue), i2, i3);
                    throw c0021p2;
                } catch (C0021p unused2) {
                    throw r0;
                }
            }
            th = B;
        }
        try {
            if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -4819020957156032009L, longValue) /* invoke-custom */, -4763702068396431467L, longValue) /* invoke-custom */) {
                Object[] objArr6 = new Object[1];
                this[0] = Long.valueOf(j3);
                C0021p c0021p3 = new C0021p((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr6, objArr6, -4770631433486073455L, longValue) /* invoke-custom */, (char) i, m130a(57648 - ((char) (-501)), 57650 + ((char) (-22512)), (int) longValue) + B + m130a(57648 - ((char) (-499)), (-516809010) + (-((char) (-310))), (int) longValue) + B2, i2, i3);
                throw c0021p3;
            }
        } catch (C0021p unused3) {
            throw th;
        }
    }

    /* renamed from: r */
    private String m127r(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        long a3 = a2 ^ 91200990795590L;
        try {
            Object[] objArr = new Object[2];
            objArr[1] = new File((URI) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URI.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((URL) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URL.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((CodeSource) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(CodeSource.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((ProtectionDomain) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(ProtectionDomain.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(getClass(), 8647838555683765958L, a2) /* invoke-custom */, 8702070555802361542L, a2) /* invoke-custom */, 8648731893505587757L, a2) /* invoke-custom */, 8704567272382728149L, a2) /* invoke-custom */);
            this[0] = Long.valueOf(a3);
            return (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, 8655098096183648302L, a2) /* invoke-custom */;
        } catch (Exception e) {
            return null;
        }
    }
}
