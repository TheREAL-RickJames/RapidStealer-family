package dev.azad1337.p001IlIillIliIlIi.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.azad1337.p000IliIllIilIilIl.C0003v;
import dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;

/* renamed from: dev.azad1337.IılİIıilİlIıİliIılİIıi.impl.Z */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IılİIıilİlIıİliIılİIıi/impl/Z.class */
public class C0008Z implements InterfaceC0005T {
    private boolean enabled;
    private static final String API_BASE;
    private String webhookUrl;

    /* renamed from: a */
    private static final String[] f33a;

    /* renamed from: b */
    private static final String[] f34b;

    /* renamed from: c */
    private static final long[] f35c;

    /* renamed from: d */
    private static final Integer[] f36d;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0124, code lost:
    
        if (r3 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0127, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0101, code lost:
    
        r6 = 'p';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0106, code lost:
    
        r6 = '8';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010b, code lost:
    
        r6 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0110, code lost:
    
        r6 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        r6 = 'u';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011a, code lost:
    
        r6 = 'T';
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
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r3 = r20;
        r20 = r20 + 1;
        r0[r3] = r0;
        r1 = r17 + r18;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1 >= r21) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r19 = "\u0092\u0082×JÛ'C6.ä\nT\u0089ÓµÍº\u0083Í\u001d¢";
        r21 = "\u0092\u0082×JÛ'C6.ä\nT\u0089ÓµÍº\u0083Í\u001d¢".length();
        r18 = '\n';
        r17 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r4 = r20;
        r20 = r20 + 1;
        r0[r4] = r0;
        r2 = r17 + r18;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r2 >= r21) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        r18 = r19.charAt(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.f33a = r0;
        dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.f34b = new java.lang.String[31];
        dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.API_BASE = m79a(-10187102, -10186416, (int) 126263458752591L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        r2 = new long[6];
        r10 = 0;
        r11 = "¤»Ò\u0084ìæ\nK\f\u0004L\u0012 \t7_\u0085Ë\u0002\u008a0Æ\u00183üWDØ!1\u0003\u0089";
        r12 = "¤»Ò\u0084ìæ\nK\f\u0004L\u0012 \t7_\u0085Ë\u0002\u008a0Æ\u00183üWDØ!1\u0003\u0089".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0167, code lost:
    
        r3 = r9;
        r9 = r9 + 8;
        r2 = r11.substring(r3, r9).getBytes("ISO-8859-1");
        r3 = r10;
        r5 = -1;
        r4 = ((((((((r2[0] & 255) << 56) | ((r2[1] & 255) << 48)) | ((r2[2] & 255) << 40)) | ((r2[3] & 255) << 32)) | ((r2[4] & 255) << 24)) | ((r2[5] & 255) << 16)) | ((r2[6] & 255) << 8)) | (r2[7] & 255);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0290, code lost:
    
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r5 = r5 ^ 126263458752591L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0297, code lost:
    
        switch(r4) {
            case 0: goto L38;
            default: goto L34;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e8, code lost:
    
        r6[r5] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01eb, code lost:
    
        if (r9 < r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ee, code lost:
    
        r11 = "ï\u009a¹~\u008f\u0097 âó^¦ì´°\u0098µ";
        r12 = "ï\u009a¹~\u008f\u0097 âó^¦ì´°\u0098µ".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
    
        r4 = r9;
        r9 = r9 + 8;
        r3 = r11.substring(r4, r9).getBytes("ISO-8859-1");
        r3 = r2;
        r4 = r10 == true ? 1 : 0;
        r5 = ((((((((r3[0] & 255) << 56) | ((r3[1] & 255) << 48)) | ((r3[2] & 255) << 40)) | ((r3[3] & 255) << 32)) | ((r3[4] & 255) << 24)) | ((r3[5] & 255) << 16)) | ((r3[6] & 255) << 8)) | (r3[7] & 255);
        r10 = (r10 == true ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x027a, code lost:
    
        r5[r4] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027d, code lost:
    
        if (r9 < r12) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0280, code lost:
    
        dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.f35c = r2;
        dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.f36d = new java.lang.Integer[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00c9, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00cc, code lost:
    
        r3 = r2;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00cf, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d6, code lost:
    
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
    
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011c, code lost:
    
        r3[r4] = (char) (r5 ^ r6);
        r23 = r23 + 1;
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
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42, types: [long] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0130 -> B:5:0x00cc). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[31];
        int i2 = 0;
        String str = "Ý\f\u001fWéÑcJî\u0097CjeàV5ÐWÖ\b½ì=��uG\u00840þêî-]Äâí4£©dÿÀ\f¶¢ù\u001c\u009añ2F;£_¨Ì\u000f\u00189ã\f·µJl}¶äQx\u000bª\u001a\u0007á'xa6C¢\u0011 ò\u0091D\u0013æZ~\u0010¿5bñ/æ\u008aÌ\u0015\u0096æsÆO¶Ñ\u000bL\u008a/ \u009f£ÇSß\u008cÕeu\u00075õ#¤Eú\u0090\u0006h÷=©\u008b\u009b\u0007\" \u0085\u0098¢\nc\nr717³5\u0015~Íß\u0007Äñ\u0006ô\u00173®\u0010æ¯ÛÚ?Ê\u001c\u009c]<¼yMH_\u0080\tF\u00136 0BÖ\u001b£\u0004Â\u0001_N\nþG\u007fºX9:\u0095X5\u0012Y\u001e®ÙôU¦l£\rå&\t\u008bp\u0090\u009a\u0092ss\u007fÊ9S\u001c4ó\u0004 \u001e\u008cÎ<#®~$\u0003f\u0007!j¹\u009fpÙÖU6\u009b¶ó·7\u0083\u008enþÝ\u0015÷QP\t%i\u0001_A\u0093U\u0019\u0092ÿuå/d\u0005ªkä¶\u0010à\u00ad\u0087Cë\u009b\rhºÐ\u0005\b¼\u009b\u0082ìLÂ\u000eìj@\u009f«\u001b\u009búLgk:þf$ï\u009d\u0094\u0001Ä¡\n\u0016_ìÉwC+p\u0082\b±q,ÕFN\u000bï\u0007\u0089\u0089ð\u00ad\f¬¶\u0007Ú\u0093\u001f÷Ú\u0091?&öÌõ.-\u0087)°#°\u0098\u009b&\u0010\\+\u0094I\u0084än\u008b×\u0005ã\u0091\u0015\\¦U¿·\u0007~\u0019\u0003¤¼\u0003EGi\u001aØ~0x\u0095M>éÁ\u009bÄþ\u00ad¼-¾ºûA²ÖAÀ\\\u0001º\n¾rw\u001cYí\u001a\u000f\\f\u0003¤\u008bë\re_)ñ\u0004P¸Ëd\u0006\u009dB\u0094\u0014'ùE%\u0089Ê\t\u0084W{L\u009eódJ«n\u0093ã\u0086\u0006¨é%j\u0088ã\u0003J \u0088(/ÓÎÍJûÅ?¾A+¥P×\u0092ÓMV¿\u0007\t÷;\u008a~`¦tÅ\u008f#\u008d=KÉîÜZÙì";
        int length = "Ý\f\u001fWéÑcJî\u0097CjeàV5ÐWÖ\b½ì=��uG\u00840þêî-]Äâí4£©dÿÀ\f¶¢ù\u001c\u009añ2F;£_¨Ì\u000f\u00189ã\f·µJl}¶äQx\u000bª\u001a\u0007á'xa6C¢\u0011 ò\u0091D\u0013æZ~\u0010¿5bñ/æ\u008aÌ\u0015\u0096æsÆO¶Ñ\u000bL\u008a/ \u009f£ÇSß\u008cÕeu\u00075õ#¤Eú\u0090\u0006h÷=©\u008b\u009b\u0007\" \u0085\u0098¢\nc\nr717³5\u0015~Íß\u0007Äñ\u0006ô\u00173®\u0010æ¯ÛÚ?Ê\u001c\u009c]<¼yMH_\u0080\tF\u00136 0BÖ\u001b£\u0004Â\u0001_N\nþG\u007fºX9:\u0095X5\u0012Y\u001e®ÙôU¦l£\rå&\t\u008bp\u0090\u009a\u0092ss\u007fÊ9S\u001c4ó\u0004 \u001e\u008cÎ<#®~$\u0003f\u0007!j¹\u009fpÙÖU6\u009b¶ó·7\u0083\u008enþÝ\u0015÷QP\t%i\u0001_A\u0093U\u0019\u0092ÿuå/d\u0005ªkä¶\u0010à\u00ad\u0087Cë\u009b\rhºÐ\u0005\b¼\u009b\u0082ìLÂ\u000eìj@\u009f«\u001b\u009búLgk:þf$ï\u009d\u0094\u0001Ä¡\n\u0016_ìÉwC+p\u0082\b±q,ÕFN\u000bï\u0007\u0089\u0089ð\u00ad\f¬¶\u0007Ú\u0093\u001f÷Ú\u0091?&öÌõ.-\u0087)°#°\u0098\u009b&\u0010\\+\u0094I\u0084än\u008b×\u0005ã\u0091\u0015\\¦U¿·\u0007~\u0019\u0003¤¼\u0003EGi\u001aØ~0x\u0095M>éÁ\u009bÄþ\u00ad¼-¾ºûA²ÖAÀ\\\u0001º\n¾rw\u001cYí\u001a\u000f\\f\u0003¤\u008bë\re_)ñ\u0004P¸Ëd\u0006\u009dB\u0094\u0014'ùE%\u0089Ê\t\u0084W{L\u009eódJ«n\u0093ã\u0086\u0006¨é%j\u0088ã\u0003J \u0088(/ÓÎÍJûÅ?¾A+¥P×\u0092ÓMV¿\u0007\t÷;\u008a~`¦tÅ\u008f#\u008d=KÉîÜZÙì".length();
        char c = '<';
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
    private static String m79a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ (-6408)) & 65535;
        if (f34b[i5] == null) {
            char[] charArray = f33a[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 123;
                    break;
                case 1:
                    i4 = 250;
                    break;
                case 2:
                    i4 = 75;
                    break;
                case 3:
                    i4 = 107;
                    break;
                case 4:
                    i4 = 51;
                    break;
                case 5:
                    i4 = 87;
                    break;
                case 6:
                    i4 = 10;
                    break;
                case 7:
                    i4 = 115;
                    break;
                case 8:
                    i4 = 211;
                    break;
                case 9:
                    i4 = 221;
                    break;
                case 10:
                    i4 = 251;
                    break;
                case 11:
                    i4 = 111;
                    break;
                case 12:
                    i4 = 174;
                    break;
                case 13:
                    i4 = 90;
                    break;
                case 14:
                    i4 = 80;
                    break;
                case 15:
                    i4 = 36;
                    break;
                case 16:
                    i4 = 196;
                    break;
                case 17:
                    i4 = 33;
                    break;
                case 18:
                    i4 = 92;
                    break;
                case 19:
                    i4 = 232;
                    break;
                case 20:
                    i4 = 18;
                    break;
                case 21:
                    i4 = 83;
                    break;
                case 22:
                    i4 = 187;
                    break;
                case 23:
                    i4 = 126;
                    break;
                case 24:
                    i4 = 203;
                    break;
                case 25:
                    i4 = 34;
                    break;
                case 26:
                    i4 = 247;
                    break;
                case 27:
                    i4 = 136;
                    break;
                case 28:
                    i4 = 91;
                    break;
                case 29:
                    i4 = 209;
                    break;
                case 30:
                    i4 = 242;
                    break;
                case 31:
                    i4 = 170;
                    break;
                case 32:
                    i4 = 195;
                    break;
                case 33:
                    i4 = 185;
                    break;
                case 34:
                    i4 = 161;
                    break;
                case 35:
                    i4 = 225;
                    break;
                case 36:
                    i4 = 177;
                    break;
                case 37:
                    i4 = 41;
                    break;
                case 38:
                    i4 = 42;
                    break;
                case 39:
                    i4 = 145;
                    break;
                case 40:
                    i4 = 175;
                    break;
                case 41:
                    i4 = 149;
                    break;
                case 42:
                    i4 = 12;
                    break;
                case 43:
                    i4 = 164;
                    break;
                case 44:
                    i4 = 217;
                    break;
                case 45:
                    i4 = 1;
                    break;
                case 46:
                    i4 = 101;
                    break;
                case 47:
                    i4 = 48;
                    break;
                case 48:
                    i4 = 227;
                    break;
                case 49:
                    i4 = 210;
                    break;
                case 50:
                    i4 = 86;
                    break;
                case 51:
                    i4 = 152;
                    break;
                case 52:
                    i4 = 222;
                    break;
                case 53:
                    i4 = 243;
                    break;
                case 54:
                    i4 = 71;
                    break;
                case 55:
                    i4 = 89;
                    break;
                case 56:
                    i4 = 183;
                    break;
                case 57:
                    i4 = 172;
                    break;
                case 58:
                    i4 = 160;
                    break;
                case 59:
                    i4 = 4;
                    break;
                case 60:
                    i4 = 78;
                    break;
                case 61:
                    i4 = 6;
                    break;
                case 62:
                    i4 = 45;
                    break;
                case 63:
                    i4 = 178;
                    break;
                case 64:
                    i4 = 30;
                    break;
                case 65:
                    i4 = 199;
                    break;
                case 66:
                    i4 = 94;
                    break;
                case 67:
                    i4 = 43;
                    break;
                case 68:
                    i4 = 26;
                    break;
                case 69:
                    i4 = 252;
                    break;
                case 70:
                    i4 = 0;
                    break;
                case 71:
                    i4 = 180;
                    break;
                case 72:
                    i4 = 79;
                    break;
                case 73:
                    i4 = 88;
                    break;
                case 74:
                    i4 = 55;
                    break;
                case 75:
                    i4 = 116;
                    break;
                case 76:
                    i4 = 35;
                    break;
                case 77:
                    i4 = 32;
                    break;
                case 78:
                    i4 = 179;
                    break;
                case 79:
                    i4 = 60;
                    break;
                case 80:
                    i4 = 106;
                    break;
                case 81:
                    i4 = 131;
                    break;
                case 82:
                    i4 = 69;
                    break;
                case 83:
                    i4 = 24;
                    break;
                case 84:
                    i4 = 214;
                    break;
                case 85:
                    i4 = 159;
                    break;
                case 86:
                    i4 = 237;
                    break;
                case 87:
                    i4 = 138;
                    break;
                case 88:
                    i4 = 154;
                    break;
                case 89:
                    i4 = 120;
                    break;
                case 90:
                    i4 = 253;
                    break;
                case 91:
                    i4 = 49;
                    break;
                case 92:
                    i4 = 54;
                    break;
                case 93:
                    i4 = 137;
                    break;
                case 94:
                    i4 = 244;
                    break;
                case 95:
                    i4 = 2;
                    break;
                case 96:
                    i4 = 135;
                    break;
                case 97:
                    i4 = 171;
                    break;
                case 98:
                    i4 = 207;
                    break;
                case 99:
                    i4 = 25;
                    break;
                case 100:
                    i4 = 239;
                    break;
                case 101:
                    i4 = 114;
                    break;
                case 102:
                    i4 = 166;
                    break;
                case 103:
                    i4 = 194;
                    break;
                case 104:
                    i4 = 61;
                    break;
                case 105:
                    i4 = 249;
                    break;
                case 106:
                    i4 = 197;
                    break;
                case 107:
                    i4 = 27;
                    break;
                case 108:
                    i4 = 182;
                    break;
                case 109:
                    i4 = 108;
                    break;
                case 110:
                    i4 = 50;
                    break;
                case 111:
                    i4 = 73;
                    break;
                case 112:
                    i4 = 38;
                    break;
                case 113:
                    i4 = 240;
                    break;
                case 114:
                    i4 = 125;
                    break;
                case 115:
                    i4 = 150;
                    break;
                case 116:
                    i4 = 17;
                    break;
                case 117:
                    i4 = 77;
                    break;
                case 118:
                    i4 = 5;
                    break;
                case 119:
                    i4 = 208;
                    break;
                case 120:
                    i4 = 245;
                    break;
                case 121:
                    i4 = 165;
                    break;
                case 122:
                    i4 = 72;
                    break;
                case 123:
                    i4 = 40;
                    break;
                case 124:
                    i4 = 255;
                    break;
                case 125:
                    i4 = 226;
                    break;
                case 126:
                    i4 = 200;
                    break;
                case 127:
                    i4 = 65;
                    break;
                case 128:
                    i4 = 190;
                    break;
                case 129:
                    i4 = 144;
                    break;
                case 130:
                    i4 = 230;
                    break;
                case 131:
                    i4 = 9;
                    break;
                case 132:
                    i4 = 128;
                    break;
                case 133:
                    i4 = 157;
                    break;
                case 134:
                    i4 = 233;
                    break;
                case 135:
                    i4 = 14;
                    break;
                case 136:
                    i4 = 52;
                    break;
                case 137:
                    i4 = 16;
                    break;
                case 138:
                    i4 = 176;
                    break;
                case 139:
                    i4 = 162;
                    break;
                case 140:
                    i4 = 110;
                    break;
                case 141:
                    i4 = 204;
                    break;
                case 142:
                    i4 = 109;
                    break;
                case 143:
                    i4 = 31;
                    break;
                case 144:
                    i4 = 134;
                    break;
                case 145:
                    i4 = 220;
                    break;
                case 146:
                    i4 = 22;
                    break;
                case 147:
                    i4 = 158;
                    break;
                case 148:
                    i4 = 132;
                    break;
                case 149:
                    i4 = 147;
                    break;
                case 150:
                    i4 = 117;
                    break;
                case 151:
                    i4 = 66;
                    break;
                case 152:
                    i4 = 74;
                    break;
                case 153:
                    i4 = 15;
                    break;
                case 154:
                    i4 = 219;
                    break;
                case 155:
                    i4 = 19;
                    break;
                case 156:
                    i4 = 156;
                    break;
                case 157:
                    i4 = 192;
                    break;
                case 158:
                    i4 = 23;
                    break;
                case 159:
                    i4 = 231;
                    break;
                case 160:
                    i4 = 248;
                    break;
                case 161:
                    i4 = 102;
                    break;
                case 162:
                    i4 = 148;
                    break;
                case 163:
                    i4 = 121;
                    break;
                case 164:
                    i4 = 238;
                    break;
                case 165:
                    i4 = 99;
                    break;
                case 166:
                    i4 = 184;
                    break;
                case 167:
                    i4 = 140;
                    break;
                case 168:
                    i4 = 76;
                    break;
                case 169:
                    i4 = 193;
                    break;
                case 170:
                    i4 = 254;
                    break;
                case 171:
                    i4 = 39;
                    break;
                case 172:
                    i4 = 93;
                    break;
                case 173:
                    i4 = 139;
                    break;
                case 174:
                    i4 = 133;
                    break;
                case 175:
                    i4 = 57;
                    break;
                case 176:
                    i4 = 29;
                    break;
                case 177:
                    i4 = 122;
                    break;
                case 178:
                    i4 = 96;
                    break;
                case 179:
                    i4 = 146;
                    break;
                case 180:
                    i4 = 82;
                    break;
                case 181:
                    i4 = 20;
                    break;
                case 182:
                    i4 = 3;
                    break;
                case 183:
                    i4 = 37;
                    break;
                case 184:
                    i4 = 81;
                    break;
                case 185:
                    i4 = 213;
                    break;
                case 186:
                    i4 = 84;
                    break;
                case 187:
                    i4 = 167;
                    break;
                case 188:
                    i4 = 58;
                    break;
                case 189:
                    i4 = 98;
                    break;
                case 190:
                    i4 = 62;
                    break;
                case 191:
                    i4 = 168;
                    break;
                case 192:
                    i4 = 8;
                    break;
                case 193:
                    i4 = 63;
                    break;
                case 194:
                    i4 = 215;
                    break;
                case 195:
                    i4 = 11;
                    break;
                case 196:
                    i4 = 113;
                    break;
                case 197:
                    i4 = 224;
                    break;
                case 198:
                    i4 = 151;
                    break;
                case 199:
                    i4 = 205;
                    break;
                case 200:
                    i4 = 127;
                    break;
                case 201:
                    i4 = 234;
                    break;
                case 202:
                    i4 = 181;
                    break;
                case 203:
                    i4 = 173;
                    break;
                case 204:
                    i4 = 46;
                    break;
                case 205:
                    i4 = 21;
                    break;
                case 206:
                    i4 = 189;
                    break;
                case 207:
                    i4 = 212;
                    break;
                case 208:
                    i4 = 201;
                    break;
                case 209:
                    i4 = 95;
                    break;
                case 210:
                    i4 = 246;
                    break;
                case 211:
                    i4 = 119;
                    break;
                case 212:
                    i4 = 124;
                    break;
                case 213:
                    i4 = 236;
                    break;
                case 214:
                    i4 = 13;
                    break;
                case 215:
                    i4 = 70;
                    break;
                case 216:
                    i4 = 28;
                    break;
                case 217:
                    i4 = 129;
                    break;
                case 218:
                    i4 = 103;
                    break;
                case 219:
                    i4 = 100;
                    break;
                case 220:
                    i4 = 188;
                    break;
                case 221:
                    i4 = 56;
                    break;
                case 222:
                    i4 = 241;
                    break;
                case 223:
                    i4 = 97;
                    break;
                case 224:
                    i4 = 59;
                    break;
                case 225:
                    i4 = 218;
                    break;
                case 226:
                    i4 = 7;
                    break;
                case 227:
                    i4 = 206;
                    break;
                case 228:
                    i4 = 85;
                    break;
                case 229:
                    i4 = 186;
                    break;
                case 230:
                    i4 = 198;
                    break;
                case 231:
                    i4 = 229;
                    break;
                case 232:
                    i4 = 130;
                    break;
                case 233:
                    i4 = 141;
                    break;
                case 234:
                    i4 = 68;
                    break;
                case 235:
                    i4 = 64;
                    break;
                case 236:
                    i4 = 216;
                    break;
                case 237:
                    i4 = 118;
                    break;
                case 238:
                    i4 = 169;
                    break;
                case 239:
                    i4 = 142;
                    break;
                case 240:
                    i4 = 155;
                    break;
                case 241:
                    i4 = 228;
                    break;
                case 242:
                    i4 = 143;
                    break;
                case 243:
                    i4 = 223;
                    break;
                case 244:
                    i4 = 105;
                    break;
                case 245:
                    i4 = 47;
                    break;
                case 246:
                    i4 = 104;
                    break;
                case 247:
                    i4 = 53;
                    break;
                case 248:
                    i4 = 191;
                    break;
                case 249:
                    i4 = 202;
                    break;
                case 250:
                    i4 = 44;
                    break;
                case 251:
                    i4 = 153;
                    break;
                case 252:
                    i4 = 112;
                    break;
                case 253:
                    i4 = 235;
                    break;
                case 254:
                    i4 = 163;
                    break;
                default:
                    i4 = 67;
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
            f34b[i5] = new String(charArray).intern();
        }
        return f34b[i5];
    }

    /* renamed from: a */
    private static int m80a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27031;
        if (f36d[i2] == null) {
            f36d[i2] = Integer.valueOf((int) (f35c[i2] ^ j));
        }
        return f36d[i2].intValue();
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: J */
    public boolean mo53J(Object[] a) {
        return (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5576504067778804543L, ((Long) a[0]).longValue()) /* invoke-custom */;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:325)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* renamed from: s */
    private java.lang.String m77s(java.lang.Object[] r9) {
        /*
            r8 = this;
            r0 = r9
            r1 = r0
            r2 = 0
            r1 = r1[r2]
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r10 = r1
            r1 = r0
            r2 = 1
            r1 = r1[r2]
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r0
            r2 = 2
            r1 = r1[r2]
            java.lang.String r1 = (java.lang.String) r1
            r13 = r1
            r0 = r12
            if (r0 == 0) goto L2a
            r0 = r13
            if (r0 != 0) goto L2d
            goto L2a
        L29:
            throw r0     // Catch: java.lang.RuntimeException -> L2c
        L2a:
            r0 = 0
            return r0
        L2c:
            throw r0     // Catch: java.lang.RuntimeException -> L2c
        L2d:
            r0 = r12
            r1 = -925354200(0xffffffffc8d83728, float:-442809.25)
            r2 = -19950(0xffffffffffffb212, float:NaN)
            char r2 = (char) r2
            int r2 = -r2
            int r1 = r1 - r2
            r2 = 925354200(0x3727c8d8, float:1.0000738E-5)
            r3 = -26065(0xffffffffffff9a2f, float:NaN)
            char r3 = (char) r3
            int r2 = r2 - r3
            r3 = r10
            int r3 = (int) r3
            java.lang.String r1 = m79a(r1, r2, r3)
            r2 = r13
            r3 = 1117092600349386129(0xf80b5cd290ae591, double:5.25549989176997E-234)
            r4 = r10
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "B"}
                {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/String;}
            ).invoke(r0, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p001IlIillIliIlIi.impl.C0008Z.m77s(java.lang.Object[]):java.lang.String");
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: I */
    public String mo50I(Object[] a) {
        return m79a(746312580 - 326, (-746312580) - (-4184), (int) ((Long) a[0]).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0360, code lost:
    
        return call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/String;}
        ).invoke(r0, -9148123448405271776L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0369 A[EDGE_INSN: B:127:0x0369->B:52:0x0369 BREAK  A[LOOP:2: B:12:0x00ce->B:187:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[LOOP:4: B:118:0x0286->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m75A(Object[] objArr) {
        ?? r0;
        ?? r02;
        ?? r03;
        long longValue = ((Long) objArr[0]).longValue();
        boolean z = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-9139713957490780857L, longValue) /* invoke-custom */;
        String str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m79a((-1411361760) + (-((char) (-5011))), 44000 + ((char) (-5283)), (int) longValue), -9149384437534947632L, longValue) /* invoke-custom */;
        if (str == null) {
            return null;
        }
        String[] strArr = {m79a((-1411361760) + (-((char) (-5015))), 44000 + ((char) (-5920)), (int) longValue), m79a((-1411361760) + (-((char) (-5002))), (-1411492830) - (-((char) (-16878))), (int) longValue), m79a((-1411361760) + (-((char) (-5007))), (-1411492830) - (-((char) (-21308))), (int) longValue), m79a((-1411361760) + (-((char) (-5020))), 43998 - ((char) (-12881)), (int) longValue)};
        int length = strArr.length;
        int i = 0;
        loop0: do {
            ?? r04 = i;
            while (r04 < length) {
                File file = new File(str, strArr[i]);
                r04 = z;
                while (true) {
                    boolean z2 = r04;
                    if (longValue >= 0) {
                        if (r04 != 0) {
                            break;
                        }
                        try {
                            try {
                                ?? B = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -9145631258240330239L, longValue) /* invoke-custom */;
                                z2 = B;
                            } catch (RuntimeException unused) {
                                throw r04;
                            }
                        } catch (RuntimeException unused2) {
                            throw r04;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                    ?? r05 = file;
                    File file2 = r05;
                    if (!z) {
                        try {
                            try {
                                if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r05, -9088883712452578667L, longValue) /* invoke-custom */) {
                                    break;
                                }
                                file2 = file;
                            } catch (RuntimeException unused3) {
                                throw r04;
                            }
                        } catch (RuntimeException unused4) {
                            throw r04;
                        }
                    }
                    File[] B2 = (File[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file2, -9147021717979544753L, longValue) /* invoke-custom */;
                    if (B2 != null) {
                        ArrayList arrayList = new ArrayList();
                        int length2 = B2.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            File file3 = B2[i2];
                            ?? r06 = z;
                            if (longValue > 0) {
                                if (r06 == 0) {
                                    try {
                                        try {
                                            r03 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file3, -9088883712452578667L, longValue) /* invoke-custom */;
                                            if (z) {
                                                break;
                                            }
                                            if (r03 != 0) {
                                                try {
                                                    try {
                                                        ?? B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file3, -9147336563081194929L, longValue) /* invoke-custom */, m79a((-1411361760) + (-((char) (-5022))), (-1411361760) + (-((char) (-8899))), (int) longValue), -9091948090419691192L, longValue) /* invoke-custom */;
                                                        if (!z && B3 != 0) {
                                                            try {
                                                                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(arrayList, file3, -9139702965498949713L, longValue) /* invoke-custom */;
                                                            } catch (RuntimeException unused5) {
                                                                throw r03;
                                                            }
                                                        }
                                                    } catch (RuntimeException unused6) {
                                                        throw r03;
                                                    }
                                                } catch (RuntimeException unused7) {
                                                    throw r03;
                                                }
                                            }
                                            i2++;
                                        } catch (RuntimeException unused8) {
                                            throw r06;
                                        }
                                    } catch (RuntimeException unused9) {
                                        throw r06;
                                    }
                                }
                                r06 = z;
                            }
                            if (r06 != 0) {
                                break;
                            }
                        }
                        if (longValue > 0) {
                            ?? r07 = arrayList;
                            ArrayList arrayList2 = r07;
                            if (longValue > 0) {
                                arrayList2 = r07;
                                if (!z) {
                                    try {
                                        r03 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r07, -9147533235811716660L, longValue) /* invoke-custom */;
                                        if (r03 != 0) {
                                            break;
                                        }
                                        arrayList2 = arrayList;
                                    } catch (RuntimeException unused10) {
                                        throw r07;
                                    }
                                }
                            }
                            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(arrayList2, (a, a2) -> {
                                return (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, -4483009403127852408L, 80883653460365L) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a, -4483009403127852408L, 80883653460365L) /* invoke-custom */, -4483564268215402591L, 80883653460365L) /* invoke-custom */;
                            }, -9141208222924663268L, longValue) /* invoke-custom */;
                        }
                        File file4 = new File((File) (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(arrayList, 0, -9137666494308315396L, longValue) /* invoke-custom */, m79a((-1411361760) + (-((char) (-5019))), 43998 - ((char) (-16289)), (int) longValue));
                        r0 = z;
                        if (longValue >= 0) {
                            if (r0 != 0) {
                                break;
                            }
                            try {
                                try {
                                    ?? B4 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file4, -9145631258240330239L, longValue) /* invoke-custom */;
                                    if (B4 == 0) {
                                        break;
                                    }
                                    ?? r08 = file4;
                                    File file5 = r08;
                                    if (!z) {
                                        try {
                                            try {
                                                if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r08, -9088883712452578667L, longValue) /* invoke-custom */) {
                                                    break;
                                                }
                                                file5 = file4;
                                            } catch (RuntimeException unused11) {
                                                throw r08;
                                            }
                                        } catch (RuntimeException unused12) {
                                            throw r08;
                                        }
                                    }
                                    File[] B5 = (File[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file5, -9147021717979544753L, longValue) /* invoke-custom */;
                                    File[] fileArr = B5;
                                    if (!z) {
                                        if (fileArr == null && longValue >= 0) {
                                            break;
                                        }
                                        fileArr = B5;
                                    }
                                    File[] fileArr2 = fileArr;
                                    int length3 = fileArr2.length;
                                    int i3 = 0;
                                    while (i3 < length3) {
                                        File file6 = fileArr2[i3];
                                        ?? r09 = z;
                                        r04 = r09;
                                        if (longValue > 0) {
                                            if (r09 == 0) {
                                                try {
                                                    ?? B6 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file6, -9088883712452578667L, longValue) /* invoke-custom */;
                                                    r04 = B6;
                                                } catch (RuntimeException unused13) {
                                                    throw r09;
                                                }
                                            }
                                            r02 = z;
                                            if (r02 == 0) {
                                                break;
                                            }
                                        }
                                        if (!z) {
                                            if (longValue >= 0) {
                                                if (r04 != 0) {
                                                    ?? r010 = file6;
                                                    File file7 = r010;
                                                    if (!z) {
                                                        try {
                                                            try {
                                                                if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r010, -9147336563081194929L, longValue) /* invoke-custom */, m79a((-1411361760) + (-((char) (-5014))), (-1411361760) + (-((char) (-5473))), (int) longValue), -9091948090419691192L, longValue) /* invoke-custom */) {
                                                                    file7 = new File(file6, m79a((-1411361760) + (-((char) (-5003))), 43998 - ((char) (-3336)), (int) longValue));
                                                                }
                                                            } catch (RuntimeException unused14) {
                                                                throw r010;
                                                            }
                                                        } catch (RuntimeException unused15) {
                                                            throw r010;
                                                        }
                                                    }
                                                    File file8 = file7;
                                                    r02 = z;
                                                    if (longValue > 0) {
                                                        if (r02 == 0) {
                                                            try {
                                                                try {
                                                                    ?? B7 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file8, -9145631258240330239L, longValue) /* invoke-custom */;
                                                                    if (B7 != 0) {
                                                                        ?? r011 = file8;
                                                                        if (z) {
                                                                            break loop0;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r011, -9088883712452578667L, longValue) /* invoke-custom */) {
                                                                                    r011 = file8;
                                                                                    break loop0;
                                                                                }
                                                                            } catch (RuntimeException unused16) {
                                                                                throw r011;
                                                                            }
                                                                        } catch (RuntimeException unused17) {
                                                                            throw r02;
                                                                        }
                                                                    }
                                                                } catch (RuntimeException unused18) {
                                                                    throw r02;
                                                                }
                                                            } catch (RuntimeException unused19) {
                                                                throw r02;
                                                            }
                                                        }
                                                        r02 = z;
                                                        if (r02 == 0) {
                                                        }
                                                    } else if (r02 == 0) {
                                                    }
                                                }
                                                i3++;
                                                r02 = z;
                                                if (r02 == 0) {
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } catch (RuntimeException unused20) {
                                    throw r0;
                                }
                            } catch (RuntimeException unused21) {
                                throw r0;
                            }
                        }
                        break;
                    }
                    break;
                }
                if (longValue < 0) {
                    return null;
                }
                i++;
                r0 = z;
            }
            return null;
        } while (r0 == 0);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
        ).invoke(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
        ).invoke(r0, r0, -8392235969768093972L, r1), "\n", -8392235969768093972L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.net.HttpURLConnection, java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable, java.lang.StringBuilder] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m76l(Object[] a) {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        try {
            ?? r0 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(a2), -8402951322414045883L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m79a((-1418963820) - (-6267), (-1418963820) - 15006, (int) a3), -8378797049131237596L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m79a((-1418963820) - (-6254), (-1418963820) - (-10456), (int) a3), m79a((-1418963820) - (-6279), 1418963820 + 18239, (int) a3), -8391803560596599842L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m79a((-1418963820) - (-6270), (-1418963820) - 466, (int) a3), m79a((-1418963820) - (-6255), 1418963820 + 432, (int) a3), -8391803560596599842L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m79a((-1418963820) - (-6280), (-1418963820) - (-10120), (int) a3), m79a((-1418963820) - (-6262), (-1418963820) - 5871, (int) a3), -8391803560596599842L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m80a(30886, 5521372796032228060L ^ a3), -8403263014221610577L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m80a(28446, 6646214925035212129L ^ a3), -8399492770819633460L, a3) /* invoke-custom */;
            if ((int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8391408979611875504L, a3) /* invoke-custom */ != m80a(6560, 5672357036650167262L ^ a3)) {
                if (r0 != 0) {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8399286796212170932L, a3) /* invoke-custom */;
                    return null;
                }
                return null;
            }
            StringBuilder a4 = new StringBuilder();
            BufferedReader a5 = new BufferedReader(new InputStreamReader((InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8401650973479940210L, a3) /* invoke-custom */));
            while (true) {
                try {
                    ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8387384068436114896L, a3) /* invoke-custom */;
                    if (B == 0) {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8400795092537552774L, a3) /* invoke-custom */;
                    } catch (Throwable th2) {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, -8382653213546573049L, a3) /* invoke-custom */;
                    }
                    throw th;
                }
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -8400795092537552774L, a3) /* invoke-custom */;
            String B2 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, -8390788703679443210L, a3) /* invoke-custom */;
            if (r0 != 0) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8399286796212170932L, a3) /* invoke-custom */;
            }
            return B2;
        } catch (Exception e) {
            if (0 == 0) {
                return null;
            }
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -8399286796212170932L, a3) /* invoke-custom */;
            return null;
        } catch (Throwable th3) {
            if (0 != 0) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -8399286796212170932L, a3) /* invoke-custom */;
            }
            throw th3;
        }
    }

    public C0008Z(char c, int a, char c2) {
        long a2 = (c << 48) | ((a << 32) >>> 16) | ((c2 << 48) >>> 48);
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, true, 2005197704886201743L, a2) /* invoke-custom */;
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, null, 1951719212796305245L, a2) /* invoke-custom */;
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: t */
    public void mo54t(Object[] a) {
        C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, ((Boolean) a[0]).booleanValue(), 8593061256018247964L, ((Long) a[1]).longValue()) /* invoke-custom */;
    }

    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: k */
    public void mo51k(Object[] objArr) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, boolean] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m78V(Object[] a) {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        String a4 = (String) a[2];
        ?? file = new File(a2, m79a((-1391832330) - (-((char) (-19686))), (-1391832330) - (-((char) (-7456))), (int) a3));
        try {
            try {
                ?? B = (File) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(File.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -2275042699007280048L, a3) /* invoke-custom */;
                if (B != 0) {
                    try {
                        ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -2259043033310545997L, a3) /* invoke-custom */;
                        if (B2 == 0) {
                            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -2260130122205159971L, a3) /* invoke-custom */;
                        }
                    } catch (Exception unused) {
                        throw B;
                    }
                }
                (Path) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Path.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Path) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Path.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, -2271475257729786699L, a3) /* invoke-custom */, (byte[]) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(byte[].class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, -2267425136466163224L, a3) /* invoke-custom */, new OpenOption[0], -2263361142252604618L, a3) /* invoke-custom */;
            } catch (Exception unused2) {
                throw file;
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String] */
    @Override // dev.azad1337.p001IlIillIliIlIi.InterfaceC0005T
    /* renamed from: a */
    public void mo52a(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        long a3 = a2 ^ 34683333819129L;
        long a4 = a2 ^ 127420840515802L;
        long a5 = a2 ^ 130890014209146L;
        long a6 = a2 ^ 3900670825928L;
        long a7 = a2 ^ 38402183282396L;
        try {
            Object[] objArr = new Object[1];
            this[0] = Long.valueOf(a4);
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, -5376405618963217026L, a2) /* invoke-custom */, -5370894862492307138L, a2) /* invoke-custom */;
            if ((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5370894862492307138L, a2) /* invoke-custom */ == null) {
                return;
            }
            Object[] objArr2 = new Object[1];
            this[0] = Long.valueOf(a5);
            ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, objArr2, -5356527713904264290L, a2) /* invoke-custom */;
            if (B == 0) {
                return;
            }
            Object[] objArr3 = new Object[2];
            m79a((-1626185490) - 3347, (-1626185490) - 9610, (int) a2)[1] = Long.valueOf(a7);
            objArr3[0] = objArr3;
            String a8 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, objArr3, -5384330694738278895L, a2) /* invoke-custom */;
            if (a8 == null) {
                return;
            }
            Object[] objArr4 = new Object[3];
            objArr4[2] = (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -5370894862492307138L, a2) /* invoke-custom */;
            objArr4[1] = a8;
            this[0] = Long.valueOf(a3);
            Object a9 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr4, objArr4, -5383417191184823106L, a2) /* invoke-custom */;
            if (a9 == null) {
                return;
            }
            Object[] objArr5 = new Object[3];
            objArr5[2] = a9;
            B[1] = Long.valueOf(a6);
            objArr5[0] = objArr5;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, objArr5, -5385843859675449046L, a2) /* invoke-custom */;
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
        ).invoke(r0, r0, 3282729228577415402L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, java.lang.Object, java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable, java.lang.StringBuilder] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m74V(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        Throwable th = null;
        try {
            th = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(m79a((-419555070) - 19956, (-419555070) - 29727, (int) a2) + (String) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3275973707042399404L, a2) /* invoke-custom */), 3270995713266090819L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, m79a((-419555070) - 19964, 419555070 + 21853, (int) a2), 3296311070811052322L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, m79a((-419555070) - 19939, (-419555070) - 22644, (int) a2), m79a((-419555070) - 19952, 419555070 + 7809, (int) a2), 3282000504180813272L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, m79a((-419555070) - 19962, 419555070 + 32674, (int) a2), m79a((-419555070) - 19946, 419555070 + 21271, (int) a2), 3282000504180813272L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, m80a(9073, 8561887743286667022L ^ a2), 3271809886722533289L, a2) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, m80a(14538, 7705878938721483956L ^ a2), 3272235516531321034L, a2) /* invoke-custom */;
            if ((int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, 3282535822265917782L, a2) /* invoke-custom */ == m80a(2907, 6533450992904523558L ^ a2)) {
                StringBuilder a3 = new StringBuilder();
                ?? bufferedReader = new BufferedReader(new InputStreamReader((InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, 3269903576305527176L, a2) /* invoke-custom */));
                while (true) {
                    try {
                        ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(bufferedReader, 3286598235250615350L, a2) /* invoke-custom */;
                        if (B == 0) {
                            break;
                        }
                    } finally {
                    }
                }
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(bufferedReader, 3273044154378483324L, a2) /* invoke-custom */;
                JsonObject a4 = (JsonObject) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(JsonObject.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((JsonElement) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(JsonElement.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, 3281926962427341040L, a2) /* invoke-custom */, 3279184991582843753L, a2) /* invoke-custom */, 3276559031275145250L, a2) /* invoke-custom */;
                if ((boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m79a((-419555070) - 19970, 419555070 + 32646, (int) a2), 3272331619686364910L, a2) /* invoke-custom */) {
                    ?? B2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((JsonElement) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(JsonElement.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m79a((-419555070) - 19954, 419555070 + 17550, (int) a2), 3275018968315868031L, a2) /* invoke-custom */, 3294494008065940132L, a2) /* invoke-custom */;
                    if (B2 != 0 && (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m79a((-419555070) - 19949, (-419555070) - 29329, (int) a2), 3272331619686364910L, a2) /* invoke-custom */) {
                        String B3 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((JsonElement) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(JsonElement.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m79a((-419555070) - 19967, (-419555070) + (-((char) (-27925))), (int) a2), 3275018968315868031L, a2) /* invoke-custom */, 3279848320398466572L, a2) /* invoke-custom */;
                        if (th != null) {
                            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, 3272406257796163914L, a2) /* invoke-custom */;
                        }
                        return B3;
                    }
                }
            }
            if (th != null) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, 3272406257796163914L, a2) /* invoke-custom */;
                return null;
            }
            return null;
        } catch (Exception e) {
            if (th != null) {
                Throwable th2 = th;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th2, 3272406257796163914L, a2) /* invoke-custom */;
                return null;
            }
            return null;
        } catch (Throwable th3) {
            if (th != null) {
                Throwable th4 = th;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th4, 3272406257796163914L, a2) /* invoke-custom */;
            }
            throw th3;
        }
    }
}
