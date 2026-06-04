package dev.azad1337.p000IliIllIilIilIl;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O */
/* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IlıİiIılİlIıiİlIiılIıİl/O.class */
public class C0001O {
    private static final String USER_AGENT;
    private static final String BOT_NAME;
    private static final String BOT_AVATAR;

    /* renamed from: a */
    public static boolean f3a;

    /* renamed from: b */
    private static final String[] f4b;

    /* renamed from: c */
    private static final String[] f5c;

    /* renamed from: d */
    private static final long[] f6d;

    /* renamed from: e */
    private static final Integer[] f7e;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0144, code lost:
    
        if (r3 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0147, code lost:
    
        r3 = r2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0121, code lost:
    
        r6 = 'r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0126, code lost:
    
        r6 = '|';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x012b, code lost:
    
        r6 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0130, code lost:
    
        r6 = '6';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0135, code lost:
    
        r6 = '=';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013a, code lost:
    
        r6 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014c, code lost:
    
        r3 = r1;
        r2 = r2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0150, code lost:
    
        if (r3 > r23) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0153, code lost:
    
        r0 = new java.lang.String(r2).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0161, code lost:
    
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
    
        r19 = "\u009e¨\u0083»\u000f\u001c®á\u008fØ\u0007\u0091\u0006à\u0085IËVW";
        r21 = "\u009e¨\u0083»\u000f\u001c®á\u008fØ\u0007\u0091\u0006à\u0085IËVW".length();
        r18 = '\f';
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
    
        dev.azad1337.p000IliIllIilIilIl.C0001O.f4b = r0;
        dev.azad1337.p000IliIllIilIilIl.C0001O.f5c = new java.lang.String[75];
        dev.azad1337.p000IliIllIilIilIl.C0001O.BOT_NAME = m11a(484342171, -484328598, (int) 7593986503266L);
        dev.azad1337.p000IliIllIilIilIl.C0001O.USER_AGENT = m11a(484342186, -484327286, (int) 7593986503266L);
        dev.azad1337.p000IliIllIilIilIl.C0001O.BOT_AVATAR = m11a(484342206, 484311762, (int) 7593986503266L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0174, code lost:
    
        r2 = new long[11];
        r10 = 0;
        r11 = "\u00977Ù¤ñ\u009aúôjã\u008fæ¢ÝÀÅò\tÕ©m2\u0016þjS\u009cð\u0010Suø?àê'C²à\u0082V)\u00ad®q\u000f\u0017ÛbUl»¡ä+Ö\\\"Ó4î\u0012@ÔMK��\u0013oÛ%ô";
        r12 = "\u00977Ù¤ñ\u009aúôjã\u008fæ¢ÝÀÅò\tÕ©m2\u0016þjS\u009cð\u0010Suø?àê'C²à\u0082V)\u00ad®q\u000f\u0017ÛbUl»¡ä+Ö\\\"Ó4î\u0012@ÔMK��\u0013oÛ%ô".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0187, code lost:
    
        r3 = r9;
        r9 = r9 + 8;
        r2 = r11.substring(r3, r9).getBytes("ISO-8859-1");
        r3 = r10;
        r5 = -1;
        r4 = ((((((((r2[0] & 255) << 56) | ((r2[1] & 255) << 48)) | ((r2[2] & 255) << 40)) | ((r2[3] & 255) << 32)) | ((r2[4] & 255) << 24)) | ((r2[5] & 255) << 16)) | ((r2[6] & 255) << 8)) | (r2[7] & 255);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02b0, code lost:
    
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r5 = r5 ^ 7593986503266L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02b7, code lost:
    
        switch(r4) {
            case 0: goto L38;
            default: goto L34;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0208, code lost:
    
        r6[r5] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020b, code lost:
    
        if (r9 < r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x020e, code lost:
    
        r11 = "D\\ZíLL¿^(fT¹àÌ\u0092µ";
        r12 = "D\\ZíLL¿^(fT¹àÌ\u0092µ".length();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0219, code lost:
    
        r4 = r9;
        r9 = r9 + 8;
        r3 = r11.substring(r4, r9).getBytes("ISO-8859-1");
        r3 = r2;
        r4 = r10 == true ? 1 : 0;
        r5 = ((((((((r3[0] & 255) << 56) | ((r3[1] & 255) << 48)) | ((r3[2] & 255) << 40)) | ((r3[3] & 255) << 32)) | ((r3[4] & 255) << 24)) | ((r3[5] & 255) << 16)) | ((r3[6] & 255) << 8)) | (r3[7] & 255);
        r10 = (r10 == true ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x029a, code lost:
    
        r5[r4] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x029d, code lost:
    
        if (r9 < r12) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a0, code lost:
    
        dev.azad1337.p000IliIllIilIilIl.C0001O.f6d = r2;
        dev.azad1337.p000IliIllIilIilIl.C0001O.f7e = new java.lang.Integer[11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00e7, code lost:
    
        if (r2 <= 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ea, code lost:
    
        r3 = r2;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ed, code lost:
    
        r5 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00f4, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:8:0x011c, code lost:
    
        r6 = 'K';
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x013c, code lost:
    
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
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42, types: [long] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0150 -> B:5:0x00ea). Please report as a decompilation issue!!! */
    static {
        int i;
        String[] strArr = new String[75];
        int i2 = 0;
        String str = "¦½m@\u009c}DOEïláª!¨téJ¨w\u008a<îÉi?\u0010\u008fÚ\u0004\u0003ÙjB\u0002p\u0012\u000eVY\u009b¯ß´fÝe`ÜW\u0097\\<\u0085\f;2\u0087\u0091\u0082\u0010Üó`\fí��\u0015'\u0097pÔ��Ñ¿¾E`\u0005ÊTeh²\u0018<\u008eâö:ï\r\u0007\u0087\u0080Q°&\\fÂ\u0092k$?\u008a5a\u00add:{Â\"K¥9\u001aX(DgÒ\b¬\u008b.j5í\u008e÷\u007f\u00838ç×|\u0088\u009b'8@\u0080\u0092áJ\u0082\u0002È\\\u0003ñ5G\u0002)7\u0006æëåé)J\u0004\u000fÙ{:\u0004®¯Oô\u000b\u008bpÅ£)Q\u007f\u0007:¾\u009a<\u0082\u0001Û\u0093\u009b¥\u0001\u0096¬#n\u0016,C-O\u0090}4¡Í\u008b=Ã\u0010ÕÄN¤+\u008ap;\u0083\u0002W&Û\u008e\u0081÷P_ªç\u001f^ª\u0095fÄ\u009e\u0096\u0001â+\u0014êuØ\u0013\u0085^2\u001d\u0010ç[\\»\u0084\u0018µ\u0084ßÙ'½\rJ\u0003Í¸W\u0013a\u0083®¦\u0083\u0090)²õYÑ\u000e½¨þÉYÐÖ\u0005Úx÷¤ñ*!Ät6ñ\u00adq×t\u001exI´2fæä\u00962¯\u0091bâÌ.\u008döêÄÃ\u0003ÄP\u009b\u0097��[±sE0\u001b\u0005Ü.&4\\\u0004iý½e\u000b\f\u00875]7\u008e¼üBÁ\u0095\u0005¤ßJ%Î\u0002¦>\rTÕ\u0004ÅV!iåw\u008ca\n[\nÓ\u0017õÕã8aç=T\u0002Éi\u0002xI\n\u0099e¼\u009bÊñDÞ\u0099sv¼\u009aÆÃq«\u0010µ~±ÞI\u0093ÅE\b¨K½\u001cÌ+_\"\u001aSÝ^\u0090½\u009cÈX\u009b\u001fÂ\u008fpùªDÅÉí\u0092ÜpýÙ1Ï\u009d\u001cÚ©\u0085!er0\u0012\u007f:\u0089¸/ÄÛN#Ì¼\u008b\u0088Ø\u008a\u0017\u0099\u0092GÍÖ§\u008c\u0017\u008dÛÀ\u0086\u0006-)yW¨DO\u0003â^ß\u009eØKl\u009cø!\u0003Q\u0094sÛÐÔ\u0088\u0004Ó\u0005¶\f\b_\u0086\u0013E|*Y\u0013o;M·¦\u0099ñ´Wß6}/R\u000eþì\u008e\u0019}b2\u0007ï;\u008d<½1<+*îö=\tÕ\u00036\u0091=@F\u0089`\u00169V\u0001Äk'éV\u008ag\u0097\u0018ÎáÇ)\u0092¨72\u0080wZ\u0014mâ\fü\u008dÕ\u0013ó<Mñû0\u00ad6¾\u008eX&\u008e\u0002\u009eÄ\u0005\u0093Õvé\u0090!\u0005=ð\taJc+6\u00810º½LG)Ào¶\u0090\u0001\u0085ð0l\u0012«\u0013Üßú\u0002§\u0011§OôL��Eü¹Teïf\u0010ö¢õ\fvüÊÎÉpê0\u009dz´^é\u0083ÑG\u008aè\u001bµ\u0016Íj\u007f\n\u001eV]þ\u0080©\u009eJ\u0018Ë\u0017È\u008e1Ù\u0082@ÀIM\u0082Èr\u007f\u0099aÇ\u0097\u001d\u009b\u0089\u00ad%`ò\u0090\u0002k8\u000bø\u007fÌÑObì\u0094\u008f\u008dX*\u0007\u008d\u0090Å\u008d\u0086¯\u0086\u0016Ìûè\u0082\u0003\u00ad\u0089iCªÆ\u000fSêTÞßøch\u0099x\u0081\u0013E\u0096ñ\u009b\u0080Ü\u0082\u0005\u0092\u0005íó¹-i\r8!\u0089[çò_\u009f±Ã¹ã@\u0002\u0010z\u0005¯'H\u0015\u0091\u0002Ic\b©\u0013ê\u009a¾\u0081êü\u0004Oõõ\u0014\u0002\u0099\u009e5ýdï\"\u0082/\u001f\u0087©\u0004Ò\r×^ýV\u0087\u0007c§\u001d\u0003\u001c\u00ad4\u001dÝ¸ËÏ\u00adÌ>#û vê|ãw¯;\u0081\u0094z©w\u008fq¥\u0095\u0080\u001eÞ\"b³}\u0003x\u0080Â\u0016\u009cÞ´Æk\u0088\u0091Õ§\u0084kBÒ\u0006îÆà°Äã\b\u009f\u008b,\u0089fãñ°\u0003\u000b\u0011\u008f5\u000b,1+Y\u000ed£Æ\u0080?\u009djLJ\u0014qO½®Æ\"g\u0089[\u00990(vÝ\u001a\u008eÈk%©\u00adË\u0007Ç\u0018+Ö\u0011)h\u001e5y9{\u009c[\r®6Ý-\u0097Më\u0003¬4éªèZêOY;\u001bÜ£%)\u001f\u001c\u009c»ã��¯gÐ³¸\u001cÆ'Ð8ÁUkø \u0091Õ®''¦\u00ad\u00118·��%¯\u0094\u0005L\u0093ü\u008bx\u000e\u009d° ��ÊëêxaH÷\u007fsÜü\"\u0082´JV\u0094\u009b+Å\u009fbxg\r\u0011a:\u0014={(P9ì\b/û\u008f$7\u0090xº7 æDr÷%±Æ|,h\b\u0080þ\u0017BÚ\u0085È÷h\t²ìá5g½\u009coGØc¡Pð\u0003àÄª¡\u0086\u001bÖ0¸ò.\u008d¦í\u000fÍ¥\u00ad\u0006©¿`\u008cs¿\u0004Q±ºì\b\u001aôè©\u0003\u0097\\6\u0002¦a\b'WOÝ÷\u0019Âç\f\u0012ä\u00122=-èÇG\u001c\u001e\t\u0016\u000e\u007fq\u0012HP$d7Ï¼Õ\u0094§��¯jAK\u0015\u0001z\u0006ï*ÄÑ\rM\u0004Yr7ä\u0005~*cîc\"Çz¨ájW\u0002\u0088\u001aõµ4\r\u009dQ\u0013\u0002(îx\n\u0098\u0091\u0093@f>\u0087cwö\u001fÆ]$iª)\u0087\u0015Kb×\u0016L\u0001\u0017\u00adm¿Kiµöä\u008dÊa\u001dFé ¤AÞR9à\u0085Iq\bÆs²5\u0090²\u008cþ\u0016-s\u0015\u0093Ä`µb\u0005\u000fúÍ\\¤\u0019ÏIM/\u0094\u008dJ7\u0004uÐ��ekã\u000f6\u0015!/©\u001a2Þ~\u0016\\\u0085úGà%«\f.\u009aµ\u008bbDÇ2Ä\u0082\u0091®\u0096cë¿Rñ\u0019\\×²)5y}_ëÿ\u0002d,\u0002õ\u0088";
        int length = "¦½m@\u009c}DOEïláª!¨téJ¨w\u008a<îÉi?\u0010\u008fÚ\u0004\u0003ÙjB\u0002p\u0012\u000eVY\u009b¯ß´fÝe`ÜW\u0097\\<\u0085\f;2\u0087\u0091\u0082\u0010Üó`\fí��\u0015'\u0097pÔ��Ñ¿¾E`\u0005ÊTeh²\u0018<\u008eâö:ï\r\u0007\u0087\u0080Q°&\\fÂ\u0092k$?\u008a5a\u00add:{Â\"K¥9\u001aX(DgÒ\b¬\u008b.j5í\u008e÷\u007f\u00838ç×|\u0088\u009b'8@\u0080\u0092áJ\u0082\u0002È\\\u0003ñ5G\u0002)7\u0006æëåé)J\u0004\u000fÙ{:\u0004®¯Oô\u000b\u008bpÅ£)Q\u007f\u0007:¾\u009a<\u0082\u0001Û\u0093\u009b¥\u0001\u0096¬#n\u0016,C-O\u0090}4¡Í\u008b=Ã\u0010ÕÄN¤+\u008ap;\u0083\u0002W&Û\u008e\u0081÷P_ªç\u001f^ª\u0095fÄ\u009e\u0096\u0001â+\u0014êuØ\u0013\u0085^2\u001d\u0010ç[\\»\u0084\u0018µ\u0084ßÙ'½\rJ\u0003Í¸W\u0013a\u0083®¦\u0083\u0090)²õYÑ\u000e½¨þÉYÐÖ\u0005Úx÷¤ñ*!Ät6ñ\u00adq×t\u001exI´2fæä\u00962¯\u0091bâÌ.\u008döêÄÃ\u0003ÄP\u009b\u0097��[±sE0\u001b\u0005Ü.&4\\\u0004iý½e\u000b\f\u00875]7\u008e¼üBÁ\u0095\u0005¤ßJ%Î\u0002¦>\rTÕ\u0004ÅV!iåw\u008ca\n[\nÓ\u0017õÕã8aç=T\u0002Éi\u0002xI\n\u0099e¼\u009bÊñDÞ\u0099sv¼\u009aÆÃq«\u0010µ~±ÞI\u0093ÅE\b¨K½\u001cÌ+_\"\u001aSÝ^\u0090½\u009cÈX\u009b\u001fÂ\u008fpùªDÅÉí\u0092ÜpýÙ1Ï\u009d\u001cÚ©\u0085!er0\u0012\u007f:\u0089¸/ÄÛN#Ì¼\u008b\u0088Ø\u008a\u0017\u0099\u0092GÍÖ§\u008c\u0017\u008dÛÀ\u0086\u0006-)yW¨DO\u0003â^ß\u009eØKl\u009cø!\u0003Q\u0094sÛÐÔ\u0088\u0004Ó\u0005¶\f\b_\u0086\u0013E|*Y\u0013o;M·¦\u0099ñ´Wß6}/R\u000eþì\u008e\u0019}b2\u0007ï;\u008d<½1<+*îö=\tÕ\u00036\u0091=@F\u0089`\u00169V\u0001Äk'éV\u008ag\u0097\u0018ÎáÇ)\u0092¨72\u0080wZ\u0014mâ\fü\u008dÕ\u0013ó<Mñû0\u00ad6¾\u008eX&\u008e\u0002\u009eÄ\u0005\u0093Õvé\u0090!\u0005=ð\taJc+6\u00810º½LG)Ào¶\u0090\u0001\u0085ð0l\u0012«\u0013Üßú\u0002§\u0011§OôL��Eü¹Teïf\u0010ö¢õ\fvüÊÎÉpê0\u009dz´^é\u0083ÑG\u008aè\u001bµ\u0016Íj\u007f\n\u001eV]þ\u0080©\u009eJ\u0018Ë\u0017È\u008e1Ù\u0082@ÀIM\u0082Èr\u007f\u0099aÇ\u0097\u001d\u009b\u0089\u00ad%`ò\u0090\u0002k8\u000bø\u007fÌÑObì\u0094\u008f\u008dX*\u0007\u008d\u0090Å\u008d\u0086¯\u0086\u0016Ìûè\u0082\u0003\u00ad\u0089iCªÆ\u000fSêTÞßøch\u0099x\u0081\u0013E\u0096ñ\u009b\u0080Ü\u0082\u0005\u0092\u0005íó¹-i\r8!\u0089[çò_\u009f±Ã¹ã@\u0002\u0010z\u0005¯'H\u0015\u0091\u0002Ic\b©\u0013ê\u009a¾\u0081êü\u0004Oõõ\u0014\u0002\u0099\u009e5ýdï\"\u0082/\u001f\u0087©\u0004Ò\r×^ýV\u0087\u0007c§\u001d\u0003\u001c\u00ad4\u001dÝ¸ËÏ\u00adÌ>#û vê|ãw¯;\u0081\u0094z©w\u008fq¥\u0095\u0080\u001eÞ\"b³}\u0003x\u0080Â\u0016\u009cÞ´Æk\u0088\u0091Õ§\u0084kBÒ\u0006îÆà°Äã\b\u009f\u008b,\u0089fãñ°\u0003\u000b\u0011\u008f5\u000b,1+Y\u000ed£Æ\u0080?\u009djLJ\u0014qO½®Æ\"g\u0089[\u00990(vÝ\u001a\u008eÈk%©\u00adË\u0007Ç\u0018+Ö\u0011)h\u001e5y9{\u009c[\r®6Ý-\u0097Më\u0003¬4éªèZêOY;\u001bÜ£%)\u001f\u001c\u009c»ã��¯gÐ³¸\u001cÆ'Ð8ÁUkø \u0091Õ®''¦\u00ad\u00118·��%¯\u0094\u0005L\u0093ü\u008bx\u000e\u009d° ��ÊëêxaH÷\u007fsÜü\"\u0082´JV\u0094\u009b+Å\u009fbxg\r\u0011a:\u0014={(P9ì\b/û\u008f$7\u0090xº7 æDr÷%±Æ|,h\b\u0080þ\u0017BÚ\u0085È÷h\t²ìá5g½\u009coGØc¡Pð\u0003àÄª¡\u0086\u001bÖ0¸ò.\u008d¦í\u000fÍ¥\u00ad\u0006©¿`\u008cs¿\u0004Q±ºì\b\u001aôè©\u0003\u0097\\6\u0002¦a\b'WOÝ÷\u0019Âç\f\u0012ä\u00122=-èÇG\u001c\u001e\t\u0016\u000e\u007fq\u0012HP$d7Ï¼Õ\u0094§��¯jAK\u0015\u0001z\u0006ï*ÄÑ\rM\u0004Yr7ä\u0005~*cîc\"Çz¨ájW\u0002\u0088\u001aõµ4\r\u009dQ\u0013\u0002(îx\n\u0098\u0091\u0093@f>\u0087cwö\u001fÆ]$iª)\u0087\u0015Kb×\u0016L\u0001\u0017\u00adm¿Kiµöä\u008dÊa\u001dFé ¤AÞR9à\u0085Iq\bÆs²5\u0090²\u008cþ\u0016-s\u0015\u0093Ä`µb\u0005\u000fúÍ\\¤\u0019ÏIM/\u0094\u008dJ7\u0004uÐ��ekã\u000f6\u0015!/©\u001a2Þ~\u0016\\\u0085úGà%«\f.\u009aµ\u008bbDÇ2Ä\u0082\u0091®\u0096cë¿Rñ\u0019\\×²)5y}_ëÿ\u0002d,\u0002õ\u0088".length();
        char c = 30;
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
    private static String m11a(int i, int i2, int i3) {
        int i4;
        int i5 = ((i ^ i3) ^ 19433) & 65535;
        if (f5c[i5] == null) {
            char[] charArray = f4b[i5].toCharArray();
            switch (charArray[0] & 255) {
                case 0:
                    i4 = 171;
                    break;
                case 1:
                    i4 = 181;
                    break;
                case 2:
                    i4 = 131;
                    break;
                case 3:
                    i4 = 239;
                    break;
                case 4:
                    i4 = 40;
                    break;
                case 5:
                    i4 = 37;
                    break;
                case 6:
                    i4 = 193;
                    break;
                case 7:
                    i4 = 20;
                    break;
                case 8:
                    i4 = 151;
                    break;
                case 9:
                    i4 = 161;
                    break;
                case 10:
                    i4 = 127;
                    break;
                case 11:
                    i4 = 22;
                    break;
                case 12:
                    i4 = 180;
                    break;
                case 13:
                    i4 = 81;
                    break;
                case 14:
                    i4 = 179;
                    break;
                case 15:
                    i4 = 199;
                    break;
                case 16:
                    i4 = 205;
                    break;
                case 17:
                    i4 = 213;
                    break;
                case 18:
                    i4 = 141;
                    break;
                case 19:
                    i4 = 157;
                    break;
                case 20:
                    i4 = 39;
                    break;
                case 21:
                    i4 = 111;
                    break;
                case 22:
                    i4 = 164;
                    break;
                case 23:
                    i4 = 243;
                    break;
                case 24:
                    i4 = 58;
                    break;
                case 25:
                    i4 = 224;
                    break;
                case 26:
                    i4 = 51;
                    break;
                case 27:
                    i4 = 167;
                    break;
                case 28:
                    i4 = 228;
                    break;
                case 29:
                    i4 = 208;
                    break;
                case 30:
                    i4 = 183;
                    break;
                case 31:
                    i4 = 215;
                    break;
                case 32:
                    i4 = 166;
                    break;
                case 33:
                    i4 = 197;
                    break;
                case 34:
                    i4 = 252;
                    break;
                case 35:
                    i4 = 238;
                    break;
                case 36:
                    i4 = 6;
                    break;
                case 37:
                    i4 = 191;
                    break;
                case 38:
                    i4 = 185;
                    break;
                case 39:
                    i4 = 19;
                    break;
                case 40:
                    i4 = 101;
                    break;
                case 41:
                    i4 = 91;
                    break;
                case 42:
                    i4 = 170;
                    break;
                case 43:
                    i4 = 139;
                    break;
                case 44:
                    i4 = 63;
                    break;
                case 45:
                    i4 = 16;
                    break;
                case 46:
                    i4 = 42;
                    break;
                case 47:
                    i4 = 26;
                    break;
                case 48:
                    i4 = 95;
                    break;
                case 49:
                    i4 = 87;
                    break;
                case 50:
                    i4 = 96;
                    break;
                case 51:
                    i4 = 105;
                    break;
                case 52:
                    i4 = 140;
                    break;
                case 53:
                    i4 = 222;
                    break;
                case 54:
                    i4 = 100;
                    break;
                case 55:
                    i4 = 237;
                    break;
                case 56:
                    i4 = 71;
                    break;
                case 57:
                    i4 = 232;
                    break;
                case 58:
                    i4 = 178;
                    break;
                case 59:
                    i4 = 168;
                    break;
                case 60:
                    i4 = 184;
                    break;
                case 61:
                    i4 = 225;
                    break;
                case 62:
                    i4 = 72;
                    break;
                case 63:
                    i4 = 46;
                    break;
                case 64:
                    i4 = 223;
                    break;
                case 65:
                    i4 = 142;
                    break;
                case 66:
                    i4 = 102;
                    break;
                case 67:
                    i4 = 249;
                    break;
                case 68:
                    i4 = 242;
                    break;
                case 69:
                    i4 = 162;
                    break;
                case 70:
                    i4 = 175;
                    break;
                case 71:
                    i4 = 241;
                    break;
                case 72:
                    i4 = 88;
                    break;
                case 73:
                    i4 = 138;
                    break;
                case 74:
                    i4 = 133;
                    break;
                case 75:
                    i4 = 203;
                    break;
                case 76:
                    i4 = 128;
                    break;
                case 77:
                    i4 = 60;
                    break;
                case 78:
                    i4 = 98;
                    break;
                case 79:
                    i4 = 64;
                    break;
                case 80:
                    i4 = 93;
                    break;
                case 81:
                    i4 = 173;
                    break;
                case 82:
                    i4 = 43;
                    break;
                case 83:
                    i4 = 135;
                    break;
                case 84:
                    i4 = 254;
                    break;
                case 85:
                    i4 = 118;
                    break;
                case 86:
                    i4 = 153;
                    break;
                case 87:
                    i4 = 50;
                    break;
                case 88:
                    i4 = 200;
                    break;
                case 89:
                    i4 = 146;
                    break;
                case 90:
                    i4 = 61;
                    break;
                case 91:
                    i4 = 70;
                    break;
                case 92:
                    i4 = 2;
                    break;
                case 93:
                    i4 = 122;
                    break;
                case 94:
                    i4 = 24;
                    break;
                case 95:
                    i4 = 134;
                    break;
                case 96:
                    i4 = 187;
                    break;
                case 97:
                    i4 = 137;
                    break;
                case 98:
                    i4 = 190;
                    break;
                case 99:
                    i4 = 36;
                    break;
                case 100:
                    i4 = 48;
                    break;
                case 101:
                    i4 = 227;
                    break;
                case 102:
                    i4 = 220;
                    break;
                case 103:
                    i4 = 188;
                    break;
                case 104:
                    i4 = 107;
                    break;
                case 105:
                    i4 = 169;
                    break;
                case 106:
                    i4 = 244;
                    break;
                case 107:
                    i4 = 18;
                    break;
                case 108:
                    i4 = 85;
                    break;
                case 109:
                    i4 = 136;
                    break;
                case 110:
                    i4 = 248;
                    break;
                case 111:
                    i4 = 41;
                    break;
                case 112:
                    i4 = 33;
                    break;
                case 113:
                    i4 = 148;
                    break;
                case 114:
                    i4 = 245;
                    break;
                case 115:
                    i4 = 4;
                    break;
                case 116:
                    i4 = 186;
                    break;
                case 117:
                    i4 = 14;
                    break;
                case 118:
                    i4 = 15;
                    break;
                case 119:
                    i4 = 29;
                    break;
                case 120:
                    i4 = 67;
                    break;
                case 121:
                    i4 = 176;
                    break;
                case 122:
                    i4 = 66;
                    break;
                case 123:
                    i4 = 129;
                    break;
                case 124:
                    i4 = 206;
                    break;
                case 125:
                    i4 = 109;
                    break;
                case 126:
                    i4 = 155;
                    break;
                case 127:
                    i4 = 79;
                    break;
                case 128:
                    i4 = 27;
                    break;
                case 129:
                    i4 = 68;
                    break;
                case 130:
                    i4 = 130;
                    break;
                case 131:
                    i4 = 121;
                    break;
                case 132:
                    i4 = 69;
                    break;
                case 133:
                    i4 = 11;
                    break;
                case 134:
                    i4 = 212;
                    break;
                case 135:
                    i4 = 17;
                    break;
                case 136:
                    i4 = 250;
                    break;
                case 137:
                    i4 = 1;
                    break;
                case 138:
                    i4 = 209;
                    break;
                case 139:
                    i4 = 117;
                    break;
                case 140:
                    i4 = 99;
                    break;
                case 141:
                    i4 = 104;
                    break;
                case 142:
                    i4 = 103;
                    break;
                case 143:
                    i4 = 132;
                    break;
                case 144:
                    i4 = 253;
                    break;
                case 145:
                    i4 = 94;
                    break;
                case 146:
                    i4 = 3;
                    break;
                case 147:
                    i4 = 182;
                    break;
                case 148:
                    i4 = 5;
                    break;
                case 149:
                    i4 = 226;
                    break;
                case 150:
                    i4 = 57;
                    break;
                case 151:
                    i4 = 38;
                    break;
                case 152:
                    i4 = 86;
                    break;
                case 153:
                    i4 = 30;
                    break;
                case 154:
                    i4 = 75;
                    break;
                case 155:
                    i4 = 31;
                    break;
                case 156:
                    i4 = 255;
                    break;
                case 157:
                    i4 = 189;
                    break;
                case 158:
                    i4 = 247;
                    break;
                case 159:
                    i4 = 83;
                    break;
                case 160:
                    i4 = 198;
                    break;
                case 161:
                    i4 = 231;
                    break;
                case 162:
                    i4 = 211;
                    break;
                case 163:
                    i4 = 45;
                    break;
                case 164:
                    i4 = 201;
                    break;
                case 165:
                    i4 = 158;
                    break;
                case 166:
                    i4 = 165;
                    break;
                case 167:
                    i4 = 9;
                    break;
                case 168:
                    i4 = 8;
                    break;
                case 169:
                    i4 = 35;
                    break;
                case 170:
                    i4 = 120;
                    break;
                case 171:
                    i4 = 235;
                    break;
                case 172:
                    i4 = 34;
                    break;
                case 173:
                    i4 = 194;
                    break;
                case 174:
                    i4 = 82;
                    break;
                case 175:
                    i4 = 53;
                    break;
                case 176:
                    i4 = 154;
                    break;
                case 177:
                    i4 = 202;
                    break;
                case 178:
                    i4 = 143;
                    break;
                case 179:
                    i4 = 156;
                    break;
                case 180:
                    i4 = 32;
                    break;
                case 181:
                    i4 = 114;
                    break;
                case 182:
                    i4 = 52;
                    break;
                case 183:
                    i4 = 44;
                    break;
                case 184:
                    i4 = 159;
                    break;
                case 185:
                    i4 = 21;
                    break;
                case 186:
                    i4 = 90;
                    break;
                case 187:
                    i4 = 124;
                    break;
                case 188:
                    i4 = 28;
                    break;
                case 189:
                    i4 = 126;
                    break;
                case 190:
                    i4 = 229;
                    break;
                case 191:
                    i4 = 62;
                    break;
                case 192:
                    i4 = 251;
                    break;
                case 193:
                    i4 = 119;
                    break;
                case 194:
                    i4 = 92;
                    break;
                case 195:
                    i4 = 204;
                    break;
                case 196:
                    i4 = 65;
                    break;
                case 197:
                    i4 = 59;
                    break;
                case 198:
                    i4 = 221;
                    break;
                case 199:
                    i4 = 174;
                    break;
                case 200:
                    i4 = 54;
                    break;
                case 201:
                    i4 = 97;
                    break;
                case 202:
                    i4 = 150;
                    break;
                case 203:
                    i4 = 123;
                    break;
                case 204:
                    i4 = 0;
                    break;
                case 205:
                    i4 = 217;
                    break;
                case 206:
                    i4 = 84;
                    break;
                case 207:
                    i4 = 56;
                    break;
                case 208:
                    i4 = 177;
                    break;
                case 209:
                    i4 = 147;
                    break;
                case 210:
                    i4 = 116;
                    break;
                case 211:
                    i4 = 246;
                    break;
                case 212:
                    i4 = 13;
                    break;
                case 213:
                    i4 = 108;
                    break;
                case 214:
                    i4 = 110;
                    break;
                case 215:
                    i4 = 233;
                    break;
                case 216:
                    i4 = 230;
                    break;
                case 217:
                    i4 = 12;
                    break;
                case 218:
                    i4 = 23;
                    break;
                case 219:
                    i4 = 196;
                    break;
                case 220:
                    i4 = 112;
                    break;
                case 221:
                    i4 = 73;
                    break;
                case 222:
                    i4 = 214;
                    break;
                case 223:
                    i4 = 195;
                    break;
                case 224:
                    i4 = 216;
                    break;
                case 225:
                    i4 = 113;
                    break;
                case 226:
                    i4 = 77;
                    break;
                case 227:
                    i4 = 47;
                    break;
                case 228:
                    i4 = 152;
                    break;
                case 229:
                    i4 = 160;
                    break;
                case 230:
                    i4 = 145;
                    break;
                case 231:
                    i4 = 149;
                    break;
                case 232:
                    i4 = 89;
                    break;
                case 233:
                    i4 = 163;
                    break;
                case 234:
                    i4 = 144;
                    break;
                case 235:
                    i4 = 219;
                    break;
                case 236:
                    i4 = 25;
                    break;
                case 237:
                    i4 = 192;
                    break;
                case 238:
                    i4 = 78;
                    break;
                case 239:
                    i4 = 234;
                    break;
                case 240:
                    i4 = 125;
                    break;
                case 241:
                    i4 = 7;
                    break;
                case 242:
                    i4 = 106;
                    break;
                case 243:
                    i4 = 55;
                    break;
                case 244:
                    i4 = 172;
                    break;
                case 245:
                    i4 = 76;
                    break;
                case 246:
                    i4 = 210;
                    break;
                case 247:
                    i4 = 49;
                    break;
                case 248:
                    i4 = 218;
                    break;
                case 249:
                    i4 = 240;
                    break;
                case 250:
                    i4 = 74;
                    break;
                case 251:
                    i4 = 80;
                    break;
                case 252:
                    i4 = 207;
                    break;
                case 253:
                    i4 = 115;
                    break;
                case 254:
                    i4 = 10;
                    break;
                default:
                    i4 = 236;
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
            f5c[i5] = new String(charArray).intern();
        }
        return f5c[i5];
    }

    /* renamed from: a */
    private static int m12a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 1143;
        if (f7e[i2] == null) {
            f7e[i2] = Integer.valueOf((int) (f6d[i2] ^ j));
        }
        return f7e[i2].intValue();
    }

    /* renamed from: dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O$r */
    /* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IlıİiIılİlIıiİlIiılIıİl/O$r.class */
    public static class r {
        private String title;
        private String description;
        private int color;
        private String timestamp;
        private String thumbnail;
        private String image;
        private String footer;
        private String footerIcon;
        private String author;
        private String authorIcon;
        private String authorUrl;
        private List<x> fields;

        /* renamed from: a */
        private static final String[] f8a;

        /* renamed from: b */
        private static final String[] f9b;

        /* renamed from: c */
        private static final long f10c;

        /*  JADX ERROR: Failed to decode insn: 0x003F: MOVE_MULTI, method: dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O.r.D(java.lang.Object[]):void
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
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:449)
            	at jadx.core.ProcessClass.process(ProcessClass.java:70)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:110)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
            */
        /* renamed from: D */
        public void m25D(java.lang.Object[] r9) {
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
                java.io.File r1 = (java.io.File) r1
                r12 = r1
                r0 = r10
                r1 = r0; r2 = r0; 
                r2 = 78788065040480(0x47a846a11860, double:3.8926476238807E-310)
                long r1 = r1 ^ r2
                r13 = r1
                r1 = r0; r2 = r0; 
                r2 = 5674267646608(0x52924b51a90, double:2.8034607094975E-311)
                long r1 = r1 ^ r2
                r15 = r1
                r0 = r8
                r1 = r13
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
                r4 = r3; r3 = r2; r2 = r1; r1 = r4; 
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 0
                r5 = r3; r3 = r4; r4 = r5; 
                r2[r3] = r4
                r2 = 6054177200364567455(0x5404c2165affbb9f, double:5.5423933770312455E96)
                r3 = r10
                java.lang.String r0 = call_site(
                    {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                    {STRING: "B"}
                    {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/String;}
                ).invoke(r0, r1, r2, r3)
                r1 = r15
                // decode failed: arraycopy: source index -1 out of bounds for object array[8]
                r1 = r12
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2; r2 = r1; r1 = r3; 
                r4 = r2; r2 = r3; r3 = r4; 
                r4 = 2
                r5 = r3; r3 = r4; r4 = r5; 
                r2[r3] = r4
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = r1; r1 = r2; r2 = r3; 
                r3 = 1
                r4 = r2; r2 = r3; r3 = r4; 
                r1[r2] = r3
                r1 = r0; r0 = r-1; r-1 = r-2; r-2 = r1; 
                r2 = r1; r1 = r0; r0 = r-1; r-1 = r2; 
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r3 = r1; r1 = r2; r2 = r3; 
                r0[r1] = r2
                r0 = 6068740174209453947(0x54387f08ede58f7b, double:5.232362970906936E97)
                r1 = r10
                call_site(
                    {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                    {STRING: "î"}
                    {METHOD_TYPE: (Ljava/lang/Object;, J, J)V}
                ).invoke(r-1, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p000IliIllIilIilIl.C0001O.r.m25D(java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0100, code lost:
        
            if (r3 != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0103, code lost:
        
            r3 = r2;
            r4 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00dd, code lost:
        
            r6 = '/';
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
        
            r6 = 'K';
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00e7, code lost:
        
            r6 = 'W';
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ec, code lost:
        
            r6 = 24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00f1, code lost:
        
            r6 = 27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00f6, code lost:
        
            r6 = 'i';
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0108, code lost:
        
            r3 = r1;
            r2 = r2;
            r1 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x010c, code lost:
        
            if (r3 > r17) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x010f, code lost:
        
            r0 = new java.lang.String(r2).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x011d, code lost:
        
            switch(r0) {
                case 0: goto L9;
                default: goto L4;
            };
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
        
            r3 = r14;
            r14 = r14 + 1;
            r0[r3] = r0;
            r1 = r11 + r12;
            r11 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r1 >= r15) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        
            r13 = "(_\"qÿP´Ëg\r«\u001aUfú\u008e\u0088í\u0084¯ÀÀ\u00ad";
            r15 = "(_\"qÿP´Ëg\r«\u001aUfú\u008e\u0088í\u0084¯ÀÀ\u00ad".length();
            r12 = '\t';
            r11 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        
            r4 = r14;
            r14 = r14 + 1;
            r0[r4] = r0;
            r2 = r11 + r12;
            r11 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            if (r2 >= r15) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        
            r12 = r13.charAt(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        
            dev.azad1337.p000IliIllIilIilIl.C0001O.r.f8a = r0;
            dev.azad1337.p000IliIllIilIilIl.C0001O.r.f9b = new java.lang.String[25];
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0141, code lost:
        
            r3 = (-4083167971353326185L) ^ 107627944339557L;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
        
            dev.azad1337.p000IliIllIilIilIl.C0001O.r.f10c = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x00a3, code lost:
        
            if (r2 <= 1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x00a6, code lost:
        
            r3 = r2;
            r4 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x00a9, code lost:
        
            r5 = r3[r4];
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x00b0, code lost:
        
            switch((r17 % 7)) {
                case 0: goto L18;
                case 1: goto L19;
                case 2: goto L20;
                case 3: goto L21;
                case 4: goto L22;
                case 5: goto L23;
                default: goto L24;
            };
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x00d8, code lost:
        
            r6 = '#';
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00f8, code lost:
        
            r3[r4] = (char) (r5 ^ r6);
            r17 = r17 + 1;
            r3 = r1;
            r2 = r2;
            r1 = r3;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v10, types: [long] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x010c -> B:5:0x00a6). Please report as a decompilation issue!!! */
        static {
            int i;
            ?? r0 = new String[25];
            int i2 = 0;
            String str = "\u0002VlúAû\u0082{\bµ%\u009eØ\u008a\bÈ\u0005\tZ\u009dk\u008f4\u009f/@£\tY\u0016\u0003¤)á¶\u008f\u0090\u0003.- \r\u001d¾L`Ó\u009cÍ\u0005}8\u0003\u00adÕ\u0010\u0083íT*\\\u009cH \u0016t\u0011ëd\t\u0017g\u0002Ú\u0085\bd$\u007f\")«\u0094q\b/\u000eÃ\u0010ä`VJ\u0002Ü\u0017\u0003\u001bm\u0006\u0002Ä/\b.Kí\u0015ä±\u00052\u0002\u0006Î\u000f´½º\u009e\u008cM\u009d¥\u0081\u008c\u0017Ê³ªr\u0014õ&\u009fù\u008aw\u0095áz2\u009bì\u009f¨Ò\u0003ÂÌò,\fjúgÆüô#\u0018Ñ2Ss\nóoX\u009a\u008cEs\u0003jR\n´^¶¶\u008f\u008a\tÛ\u0004i\nE·\u0094}PËw\u0099ê\u0001\u0002s\u0010\u001c\u0016÷ÂcR\u0086åY>èºÐBæ\u0083¥s\u0016å\u0080ØcWû2oÖ\u008c";
            int length = "\u0002VlúAû\u0082{\bµ%\u009eØ\u008a\bÈ\u0005\tZ\u009dk\u008f4\u009f/@£\tY\u0016\u0003¤)á¶\u008f\u0090\u0003.- \r\u001d¾L`Ó\u009cÍ\u0005}8\u0003\u00adÕ\u0010\u0083íT*\\\u009cH \u0016t\u0011ëd\t\u0017g\u0002Ú\u0085\bd$\u007f\")«\u0094q\b/\u000eÃ\u0010ä`VJ\u0002Ü\u0017\u0003\u001bm\u0006\u0002Ä/\b.Kí\u0015ä±\u00052\u0002\u0006Î\u000f´½º\u009e\u008cM\u009d¥\u0081\u008c\u0017Ê³ªr\u0014õ&\u009fù\u008aw\u0095áz2\u009bì\u009f¨Ò\u0003ÂÌò,\fjúgÆüô#\u0018Ñ2Ss\nóoX\u009a\u008cEs\u0003jR\n´^¶¶\u008f\u008a\tÛ\u0004i\nE·\u0094}PËw\u0099ê\u0001\u0002s\u0010\u001c\u0016÷ÂcR\u0086åY>èºÐBæ\u0083¥s\u0016å\u0080ØcWû2oÖ\u008c".length();
            char c = '\b';
            int i3 = -1;
            while (true) {
                int i4 = i3 + 1;
                String substring = str.substring(i4, i4 + c);
                ?? r1 = -1;
                while (true) {
                    String str2 = substring;
                    ?? r02 = r1;
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
        private static String m26a(int i, int i2, int i3) {
            int i4;
            int i5 = ((i ^ i3) ^ 30932) & 65535;
            if (f9b[i5] == null) {
                char[] charArray = f8a[i5].toCharArray();
                switch (charArray[0] & 255) {
                    case 0:
                        i4 = 190;
                        break;
                    case 1:
                        i4 = 70;
                        break;
                    case 2:
                        i4 = 177;
                        break;
                    case 3:
                        i4 = 142;
                        break;
                    case 4:
                        i4 = 130;
                        break;
                    case 5:
                        i4 = 11;
                        break;
                    case 6:
                        i4 = 244;
                        break;
                    case 7:
                        i4 = 240;
                        break;
                    case 8:
                        i4 = 19;
                        break;
                    case 9:
                        i4 = 255;
                        break;
                    case 10:
                        i4 = 204;
                        break;
                    case 11:
                        i4 = 12;
                        break;
                    case 12:
                        i4 = 200;
                        break;
                    case 13:
                        i4 = 125;
                        break;
                    case 14:
                        i4 = 119;
                        break;
                    case 15:
                        i4 = 23;
                        break;
                    case 16:
                        i4 = 133;
                        break;
                    case 17:
                        i4 = 69;
                        break;
                    case 18:
                        i4 = 93;
                        break;
                    case 19:
                        i4 = 203;
                        break;
                    case 20:
                        i4 = 53;
                        break;
                    case 21:
                        i4 = 211;
                        break;
                    case 22:
                        i4 = 92;
                        break;
                    case 23:
                        i4 = 55;
                        break;
                    case 24:
                        i4 = 208;
                        break;
                    case 25:
                        i4 = 6;
                        break;
                    case 26:
                        i4 = 252;
                        break;
                    case 27:
                        i4 = 57;
                        break;
                    case 28:
                        i4 = 61;
                        break;
                    case 29:
                        i4 = 36;
                        break;
                    case 30:
                        i4 = 85;
                        break;
                    case 31:
                        i4 = 40;
                        break;
                    case 32:
                        i4 = 63;
                        break;
                    case 33:
                        i4 = 38;
                        break;
                    case 34:
                        i4 = 35;
                        break;
                    case 35:
                        i4 = 184;
                        break;
                    case 36:
                        i4 = 226;
                        break;
                    case 37:
                        i4 = 24;
                        break;
                    case 38:
                        i4 = 214;
                        break;
                    case 39:
                        i4 = 43;
                        break;
                    case 40:
                        i4 = 75;
                        break;
                    case 41:
                        i4 = 81;
                        break;
                    case 42:
                        i4 = 165;
                        break;
                    case 43:
                        i4 = 170;
                        break;
                    case 44:
                        i4 = 150;
                        break;
                    case 45:
                        i4 = 246;
                        break;
                    case 46:
                        i4 = 98;
                        break;
                    case 47:
                        i4 = 189;
                        break;
                    case 48:
                        i4 = 65;
                        break;
                    case 49:
                        i4 = 174;
                        break;
                    case 50:
                        i4 = 201;
                        break;
                    case 51:
                        i4 = 230;
                        break;
                    case 52:
                        i4 = 129;
                        break;
                    case 53:
                        i4 = 187;
                        break;
                    case 54:
                        i4 = 196;
                        break;
                    case 55:
                        i4 = 18;
                        break;
                    case 56:
                        i4 = 221;
                        break;
                    case 57:
                        i4 = 216;
                        break;
                    case 58:
                        i4 = 231;
                        break;
                    case 59:
                        i4 = 42;
                        break;
                    case 60:
                        i4 = 127;
                        break;
                    case 61:
                        i4 = 47;
                        break;
                    case 62:
                        i4 = 191;
                        break;
                    case 63:
                        i4 = 99;
                        break;
                    case 64:
                        i4 = 168;
                        break;
                    case 65:
                        i4 = 144;
                        break;
                    case 66:
                        i4 = 179;
                        break;
                    case 67:
                        i4 = 117;
                        break;
                    case 68:
                        i4 = 155;
                        break;
                    case 69:
                        i4 = 193;
                        break;
                    case 70:
                        i4 = 167;
                        break;
                    case 71:
                        i4 = 173;
                        break;
                    case 72:
                        i4 = 205;
                        break;
                    case 73:
                        i4 = 66;
                        break;
                    case 74:
                        i4 = 17;
                        break;
                    case 75:
                        i4 = 28;
                        break;
                    case 76:
                        i4 = 141;
                        break;
                    case 77:
                        i4 = 90;
                        break;
                    case 78:
                        i4 = 181;
                        break;
                    case 79:
                        i4 = 89;
                        break;
                    case 80:
                        i4 = 79;
                        break;
                    case 81:
                        i4 = 132;
                        break;
                    case 82:
                        i4 = 115;
                        break;
                    case 83:
                        i4 = 232;
                        break;
                    case 84:
                        i4 = 254;
                        break;
                    case 85:
                        i4 = 1;
                        break;
                    case 86:
                        i4 = 152;
                        break;
                    case 87:
                        i4 = 195;
                        break;
                    case 88:
                        i4 = 112;
                        break;
                    case 89:
                        i4 = 215;
                        break;
                    case 90:
                        i4 = 222;
                        break;
                    case 91:
                        i4 = 160;
                        break;
                    case 92:
                        i4 = 3;
                        break;
                    case 93:
                        i4 = 185;
                        break;
                    case 94:
                        i4 = 13;
                        break;
                    case 95:
                        i4 = 124;
                        break;
                    case 96:
                        i4 = 253;
                        break;
                    case 97:
                        i4 = 148;
                        break;
                    case 98:
                        i4 = 178;
                        break;
                    case 99:
                        i4 = 59;
                        break;
                    case 100:
                        i4 = 41;
                        break;
                    case 101:
                        i4 = 118;
                        break;
                    case 102:
                        i4 = 233;
                        break;
                    case 103:
                        i4 = 16;
                        break;
                    case 104:
                        i4 = 106;
                        break;
                    case 105:
                        i4 = 111;
                        break;
                    case 106:
                        i4 = 128;
                        break;
                    case 107:
                        i4 = 145;
                        break;
                    case 108:
                        i4 = 213;
                        break;
                    case 109:
                        i4 = 54;
                        break;
                    case 110:
                        i4 = 62;
                        break;
                    case 111:
                        i4 = 97;
                        break;
                    case 112:
                        i4 = 224;
                        break;
                    case 113:
                        i4 = 58;
                        break;
                    case 114:
                        i4 = 136;
                        break;
                    case 115:
                        i4 = 39;
                        break;
                    case 116:
                        i4 = 94;
                        break;
                    case 117:
                        i4 = 239;
                        break;
                    case 118:
                        i4 = 161;
                        break;
                    case 119:
                        i4 = 143;
                        break;
                    case 120:
                        i4 = 234;
                        break;
                    case 121:
                        i4 = 107;
                        break;
                    case 122:
                        i4 = 202;
                        break;
                    case 123:
                        i4 = 225;
                        break;
                    case 124:
                        i4 = 31;
                        break;
                    case 125:
                        i4 = 198;
                        break;
                    case 126:
                        i4 = 80;
                        break;
                    case 127:
                        i4 = 114;
                        break;
                    case 128:
                        i4 = 4;
                        break;
                    case 129:
                        i4 = 91;
                        break;
                    case 130:
                        i4 = 207;
                        break;
                    case 131:
                        i4 = 0;
                        break;
                    case 132:
                        i4 = 10;
                        break;
                    case 133:
                        i4 = 157;
                        break;
                    case 134:
                        i4 = 71;
                        break;
                    case 135:
                        i4 = 121;
                        break;
                    case 136:
                        i4 = 194;
                        break;
                    case 137:
                        i4 = 206;
                        break;
                    case 138:
                        i4 = 197;
                        break;
                    case 139:
                        i4 = 120;
                        break;
                    case 140:
                        i4 = 218;
                        break;
                    case 141:
                        i4 = 183;
                        break;
                    case 142:
                        i4 = 60;
                        break;
                    case 143:
                        i4 = 109;
                        break;
                    case 144:
                        i4 = 247;
                        break;
                    case 145:
                        i4 = 176;
                        break;
                    case 146:
                        i4 = 34;
                        break;
                    case 147:
                        i4 = 108;
                        break;
                    case 148:
                        i4 = 68;
                        break;
                    case 149:
                        i4 = 171;
                        break;
                    case 150:
                        i4 = 166;
                        break;
                    case 151:
                        i4 = 9;
                        break;
                    case 152:
                        i4 = 110;
                        break;
                    case 153:
                        i4 = 235;
                        break;
                    case 154:
                        i4 = 30;
                        break;
                    case 155:
                        i4 = 113;
                        break;
                    case 156:
                        i4 = 249;
                        break;
                    case 157:
                        i4 = 84;
                        break;
                    case 158:
                        i4 = 87;
                        break;
                    case 159:
                        i4 = 182;
                        break;
                    case 160:
                        i4 = 104;
                        break;
                    case 161:
                        i4 = 237;
                        break;
                    case 162:
                        i4 = 122;
                        break;
                    case 163:
                        i4 = 188;
                        break;
                    case 164:
                        i4 = 153;
                        break;
                    case 165:
                        i4 = 67;
                        break;
                    case 166:
                        i4 = 72;
                        break;
                    case 167:
                        i4 = 154;
                        break;
                    case 168:
                        i4 = 236;
                        break;
                    case 169:
                        i4 = 88;
                        break;
                    case 170:
                        i4 = 227;
                        break;
                    case 171:
                        i4 = 199;
                        break;
                    case 172:
                        i4 = 219;
                        break;
                    case 173:
                        i4 = 146;
                        break;
                    case 174:
                        i4 = 220;
                        break;
                    case 175:
                        i4 = 78;
                        break;
                    case 176:
                        i4 = 131;
                        break;
                    case 177:
                        i4 = 228;
                        break;
                    case 178:
                        i4 = 83;
                        break;
                    case 179:
                        i4 = 27;
                        break;
                    case 180:
                        i4 = 56;
                        break;
                    case 181:
                        i4 = 135;
                        break;
                    case 182:
                        i4 = 137;
                        break;
                    case 183:
                        i4 = 37;
                        break;
                    case 184:
                        i4 = 163;
                        break;
                    case 185:
                        i4 = 172;
                        break;
                    case 186:
                        i4 = 50;
                        break;
                    case 187:
                        i4 = 164;
                        break;
                    case 188:
                        i4 = 158;
                        break;
                    case 189:
                        i4 = 32;
                        break;
                    case 190:
                        i4 = 180;
                        break;
                    case 191:
                        i4 = 100;
                        break;
                    case 192:
                        i4 = 223;
                        break;
                    case 193:
                        i4 = 7;
                        break;
                    case 194:
                        i4 = 64;
                        break;
                    case 195:
                        i4 = 33;
                        break;
                    case 196:
                        i4 = 159;
                        break;
                    case 197:
                        i4 = 5;
                        break;
                    case 198:
                        i4 = 52;
                        break;
                    case 199:
                        i4 = 248;
                        break;
                    case 200:
                        i4 = 82;
                        break;
                    case 201:
                        i4 = 46;
                        break;
                    case 202:
                        i4 = 51;
                        break;
                    case 203:
                        i4 = 217;
                        break;
                    case 204:
                        i4 = 2;
                        break;
                    case 205:
                        i4 = 242;
                        break;
                    case 206:
                        i4 = 8;
                        break;
                    case 207:
                        i4 = 192;
                        break;
                    case 208:
                        i4 = 139;
                        break;
                    case 209:
                        i4 = 138;
                        break;
                    case 210:
                        i4 = 25;
                        break;
                    case 211:
                        i4 = 175;
                        break;
                    case 212:
                        i4 = 101;
                        break;
                    case 213:
                        i4 = 26;
                        break;
                    case 214:
                        i4 = 238;
                        break;
                    case 215:
                        i4 = 149;
                        break;
                    case 216:
                        i4 = 86;
                        break;
                    case 217:
                        i4 = 140;
                        break;
                    case 218:
                        i4 = 245;
                        break;
                    case 219:
                        i4 = 241;
                        break;
                    case 220:
                        i4 = 105;
                        break;
                    case 221:
                        i4 = 103;
                        break;
                    case 222:
                        i4 = 212;
                        break;
                    case 223:
                        i4 = 48;
                        break;
                    case 224:
                        i4 = 22;
                        break;
                    case 225:
                        i4 = 147;
                        break;
                    case 226:
                        i4 = 169;
                        break;
                    case 227:
                        i4 = 210;
                        break;
                    case 228:
                        i4 = 151;
                        break;
                    case 229:
                        i4 = 209;
                        break;
                    case 230:
                        i4 = 186;
                        break;
                    case 231:
                        i4 = 95;
                        break;
                    case 232:
                        i4 = 44;
                        break;
                    case 233:
                        i4 = 123;
                        break;
                    case 234:
                        i4 = 20;
                        break;
                    case 235:
                        i4 = 250;
                        break;
                    case 236:
                        i4 = 14;
                        break;
                    case 237:
                        i4 = 156;
                        break;
                    case 238:
                        i4 = 74;
                        break;
                    case 239:
                        i4 = 126;
                        break;
                    case 240:
                        i4 = 116;
                        break;
                    case 241:
                        i4 = 29;
                        break;
                    case 242:
                        i4 = 229;
                        break;
                    case 243:
                        i4 = 251;
                        break;
                    case 244:
                        i4 = 76;
                        break;
                    case 245:
                        i4 = 102;
                        break;
                    case 246:
                        i4 = 15;
                        break;
                    case 247:
                        i4 = 162;
                        break;
                    case 248:
                        i4 = 49;
                        break;
                    case 249:
                        i4 = 77;
                        break;
                    case 250:
                        i4 = 96;
                        break;
                    case 251:
                        i4 = 73;
                        break;
                    case 252:
                        i4 = 45;
                        break;
                    case 253:
                        i4 = 21;
                        break;
                    case 254:
                        i4 = 134;
                        break;
                    default:
                        i4 = 243;
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
                f9b[i5] = new String(charArray).intern();
            }
            return f9b[i5];
        }

        /* renamed from: dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O$r$x */
        /* loaded from: Kumoro Utility 3.1.6.jar:dev/azad1337/IlıİiIılİlIıiİlIiılIıİl/O$r$x.class */
        public static class x {
            String name;
            String value;
            boolean inline;

            x(String a, String a2, boolean a3, long a4) {
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a, 6526343143352097503L, a4) /* invoke-custom */;
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a2, 6534657371965026126L, a4) /* invoke-custom */;
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a3, 6511365202074168352L, a4) /* invoke-custom */;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r m13b(Object[] a) {
            String str;
            long a2 = ((Long) a[0]).longValue();
            ?? r1 = (String) a[1];
            long a3 = a2 ^ 78199514062941L;
            if (r1 != 0) {
                try {
                    Object[] objArr = new Object[2];
                    r1[1] = Long.valueOf(a3);
                    objArr[0] = objArr;
                    str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, 6670589941608286655L, a2) /* invoke-custom */;
                } catch (RuntimeException unused) {
                    throw this;
                }
            } else {
                str = "";
            }
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, str, 6652815164697957000L, a2) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
        /* renamed from: k */
        public void m24k(Object[] a) {
            long a2 = ((Long) a[0]).longValue();
            Object[] objArr = new Object[1];
            this[0] = Long.valueOf(a2 ^ 102921015758250L);
            ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, -4481406924842389931L, a2) /* invoke-custom */;
            Object[] objArr2 = new Object[2];
            B[1] = Long.valueOf(a2 ^ 19081039875220L);
            objArr2[0] = objArr2;
            C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, -4526517367666234899L, a2) /* invoke-custom */;
        }

        /* renamed from: v */
        public r m16v(Object[] a) {
            long a2 = ((Long) a[0]).longValue();
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new SimpleDateFormat(m26a(245363040 + 31871, 245363040 + 22458, (int) a2)), new Date(), 1551706735230074124L, a2) /* invoke-custom */, 1557359098565139761L, a2) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: C */
        public r m17C(Object[] a) {
            String a2 = (String) a[0];
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a2 != null ? a2 : "", -5486098109906753032L, ((Long) a[1]).longValue()) /* invoke-custom */;
            return this;
        }

        public r(long a) {
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6286324779073231334L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6334400493274562691L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, (int) f10c, 6284905047431467293L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6338454652835192667L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6328712810564292081L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6272064659879761084L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6271376270514940808L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6334536171943025658L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6278905987914472588L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6275152848093475648L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, "", 6329747452277917411L, a) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, List.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, new ArrayList(), 6340620979265103224L, a) /* invoke-custom */;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: L */
        public r m18L(Object[] a) {
            long a2 = ((Long) a[0]).longValue();
            String a3 = (String) a[1];
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a3 != null ? a3 : "", 2173449742082596255L, a2) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r m19H(Object[] a) {
            String str;
            ?? r1 = (String) a[0];
            String a2 = (String) a[1];
            long a3 = ((Long) a[2]).longValue();
            long a4 = a3 ^ 113342584641468L;
            if (r1 != 0) {
                try {
                    Object[] objArr = new Object[2];
                    r1[1] = Long.valueOf(a4);
                    objArr[0] = objArr;
                    str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, 7742692984631869022L, a3) /* invoke-custom */;
                } catch (RuntimeException unused) {
                    throw this;
                }
            } else {
                str = "";
            }
            try {
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, str, 7748241155198179079L, a3) /* invoke-custom */;
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a2 != null ? a2 : "", 7739405365929568117L, a3) /* invoke-custom */;
                return this;
            } catch (RuntimeException unused2) {
                throw this;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
        /* renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r m20R(Object[] a) {
            String str;
            ?? r1 = (String) a[0];
            long a2 = ((Long) a[1]).longValue();
            String a3 = (String) a[2];
            String a4 = (String) a[3];
            long a5 = a2 ^ 9582108183951L;
            if (r1 != 0) {
                try {
                    Object[] objArr = new Object[2];
                    r1[1] = Long.valueOf(a5);
                    objArr[0] = objArr;
                    str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, 3549115359732524141L, a2) /* invoke-custom */;
                } catch (RuntimeException unused) {
                    throw this;
                }
            } else {
                str = "";
            }
            try {
                C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, str, 3575690028247120432L, a2) /* invoke-custom */;
                try {
                    C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a3 != null ? a3 : "", 3578552856652813820L, a2) /* invoke-custom */;
                    C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, a4 != null ? a4 : "", 3561088764569837663L, a2) /* invoke-custom */;
                    return this;
                } catch (RuntimeException unused2) {
                    throw this;
                }
            } catch (RuntimeException unused3) {
                throw this;
            }
        }

        /* renamed from: h */
        public r m22h(Object[] a) {
            boolean a2 = ((Boolean) a[0]).booleanValue();
            long a3 = ((Long) a[1]).longValue();
            (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, -7548744525753309765L, a3) /* invoke-custom */, new x("\u200b", "\u200b", a2, a3 ^ 67485521464698L), -7505459792116000431L, a3) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
        
            throw call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "B"}
                {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
            ).invoke(call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "B"}
                {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
            ).invoke(call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "B"}
                {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
            ).invoke(r1, m26a((-947505030) - 1121, 947505030 - 11433, (int) r1), 5521922585964724677L, r1), call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "T"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/String;}
            ).invoke(r8, 5504953314322193745L, r1), 5521922585964724677L, r1), "\"", 5521922585964724677L, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
        
            throw call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "B"}
                {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
            ).invoke(r1, ",", 5521922585964724677L, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x07da  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x07e3  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x05fc  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0700  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0772 A[EDGE_INSN: B:135:0x0772->B:74:0x0772 BREAK  A[LOOP:0: B:106:0x05e4->B:132:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0770 A[EDGE_INSN: B:148:0x0770->B:73:0x0770 BREAK  A[LOOP:0: B:106:0x05e4->B:132:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0545 A[Catch: RuntimeException -> 0x0584, TRY_LEAVE, TryCatch #18 {RuntimeException -> 0x0584, blocks: (B:167:0x0539, B:169:0x0545), top: B:166:0x0539 }] */
        /* JADX WARN: Removed duplicated region for block: B:199:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x05b9  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0787  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x07d2  */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Throwable, boolean] */
        /* JADX WARN: Type inference failed for: r0v104 */
        /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v108 */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v111 */
        /* JADX WARN: Type inference failed for: r0v116 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v125 */
        /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v133 */
        /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v141 */
        /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v149 */
        /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v161 */
        /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v170 */
        /* JADX WARN: Type inference failed for: r0v171 */
        /* JADX WARN: Type inference failed for: r0v172 */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, boolean] */
        /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, boolean] */
        /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Throwable, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r0v57 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v65 */
        /* JADX WARN: Type inference failed for: r0v66 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Throwable, java.lang.Object, dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O$r$x] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Throwable, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Throwable, java.lang.Object] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x076c -> B:104:0x0611). Please report as a decompilation issue!!! */
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String m23Q(Object[] objArr) {
            boolean z;
            ?? r0;
            int i;
            Object B;
            ?? r02;
            ?? B2;
            boolean z2;
            long longValue = ((Long) objArr[0]).longValue();
            ?? r03 = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5517042362951502363L, longValue) /* invoke-custom */;
            StringBuilder sb = new StringBuilder();
            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
            try {
                try {
                    ?? B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5516840336721723988L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                    boolean z3 = r03;
                    try {
                        if (longValue >= 0) {
                            if (!z3) {
                                if (B3 == 0) {
                                    (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1127, (-947505030) - (-17545), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5516840336721723988L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1119, (-947505030) - (-4763), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                }
                                B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501724918801079089L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                            }
                            z3 = r03;
                        }
                        try {
                            if (longValue >= 0) {
                                if (!z3) {
                                    if (B3 == 0) {
                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1116, 947505030 - 5131, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501724918801079089L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                    }
                                    (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1122, (-947505030) - (-3513), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (int) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5515279850141338287L, longValue) /* invoke-custom */, 5500575362707642265L, longValue) /* invoke-custom */, ",", 5521922585964724677L, longValue) /* invoke-custom */;
                                    B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5495786785257866473L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                }
                                z3 = r03;
                            }
                            try {
                                if (longValue >= 0) {
                                    if (!z3) {
                                        if (B3 == 0) {
                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1137, (-947505030) - (-5935), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5495786785257866473L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                        }
                                        B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5505185309854996035L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                    }
                                    z3 = r03;
                                }
                                try {
                                    if (longValue >= 0) {
                                        if (!z3) {
                                            if (B3 == 0) {
                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1145, (-947505030) - 4435, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5505185309854996035L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1125, 947505030 - 5917, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                            }
                                            B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528339558595759886L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                        }
                                        z3 = r03;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (longValue >= 0) {
                                                    if (!z3) {
                                                        if (B3 == 0) {
                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1123, (-947505030) - (-9909), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528339558595759886L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1120, (-947505030) - (-6072), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                        }
                                                        B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528772619671072826L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                    }
                                                    z3 = r03;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (longValue > 0) {
                                                                        if (!z3) {
                                                                            if (B3 != 0) {
                                                                                boolean B4 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501860580060545096L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                                z = r03;
                                                                                z2 = B4;
                                                                                r0 = B4;
                                                                                if (longValue > 0) {
                                                                                    if (!z) {
                                                                                        if (!B4) {
                                                                                        }
                                                                                        z2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5517302758858426174L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                                    }
                                                                                    z = r03;
                                                                                    r0 = z2;
                                                                                }
                                                                                if (longValue > 0) {
                                                                                    try {
                                                                                        if (!z) {
                                                                                            if (r0 == 0) {
                                                                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1141, 947505030 - 6302, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1118, 947505030 + 995, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5517302758858426174L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, "\"", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                ?? T = (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5523542204252514546L, longValue) /* invoke-custom */;
                                                                                                boolean z4 = r03;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (longValue >= 0) {
                                                                                                            if (!z4) {
                                                                                                                if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 5502090298052884864L, longValue) /* invoke-custom */) {
                                                                                                                    (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1126, (-947505030) - (-1434), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5523542204252514546L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, "\"", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                                }
                                                                                                                T = (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5504953314322193745L, longValue) /* invoke-custom */;
                                                                                                            }
                                                                                                            if (longValue > 0) {
                                                                                                                z4 = r03;
                                                                                                            }
                                                                                                            if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 5502090298052884864L, longValue) /* invoke-custom */) {
                                                                                                            }
                                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1117, 947505030 - 74, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                        }
                                                                                                        if (!z4) {
                                                                                                            if (T != 0) {
                                                                                                                T = (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5504953314322193745L, longValue) /* invoke-custom */;
                                                                                                            }
                                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1117, 947505030 - 74, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                        }
                                                                                                        if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 5502090298052884864L, longValue) /* invoke-custom */) {
                                                                                                        }
                                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1117, 947505030 - 74, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                    } catch (RuntimeException unused) {
                                                                                                        throw T;
                                                                                                    }
                                                                                                } catch (RuntimeException unused2) {
                                                                                                    throw T;
                                                                                                }
                                                                                            }
                                                                                            r0 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5513036609651096643L, longValue) /* invoke-custom */;
                                                                                        }
                                                                                        z = r03;
                                                                                    } catch (RuntimeException unused3) {
                                                                                        throw r0;
                                                                                    }
                                                                                }
                                                                                if (!z) {
                                                                                    if (r0 == 0) {
                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1144, (-947505030) - (-13313), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        r0 = 0;
                                                                                    }
                                                                                    B2 = sb;
                                                                                    String B5 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5522794876158495199L, longValue) /* invoke-custom */;
                                                                                    ?? r04 = B5;
                                                                                    boolean z5 = r03;
                                                                                    ?? r05 = r04;
                                                                                    String str = r04;
                                                                                    if (longValue > 0) {
                                                                                        if (!z5) {
                                                                                            try {
                                                                                                ?? B6 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, ",", 5496219026195037404L, longValue) /* invoke-custom */;
                                                                                                if (B6 != 0) {
                                                                                                    B5 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B5, 0, (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B5, 5522079475734811511L, longValue) /* invoke-custom */ - 1, 5530410579767182146L, longValue) /* invoke-custom */;
                                                                                                }
                                                                                                r05 = B5 + "}";
                                                                                            } catch (RuntimeException unused4) {
                                                                                                throw r04;
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                z5 = (boolean) C0003v.m40a(MethodHandles.lookup(), "Ë", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5522028457152902855L, longValue) /* invoke-custom */;
                                                                                                str = r05;
                                                                                            } catch (RuntimeException unused5) {
                                                                                                throw r05;
                                                                                            }
                                                                                        } catch (RuntimeException unused6) {
                                                                                            throw r05;
                                                                                        }
                                                                                    }
                                                                                    if (longValue > 0) {
                                                                                        if (z5) {
                                                                                            z5 = r03;
                                                                                        }
                                                                                        return str;
                                                                                    }
                                                                                    C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z5, 5517042362951502363L, longValue) /* invoke-custom */;
                                                                                    return str;
                                                                                }
                                                                                i = r0;
                                                                                while (true) {
                                                                                    try {
                                                                                        if (i < (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5514664570977633744L, longValue) /* invoke-custom */) {
                                                                                            B = (Object) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Object.class, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, i, 5530191464432485235L, longValue) /* invoke-custom */;
                                                                                            r02 = (x) B;
                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1130, (-947505030) - (-3621), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5519535241566080212L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1128, (-947505030) - (-7533), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5522726843928148293L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1140, (-947505030) - (-12662), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5500701278147017259L, longValue) /* invoke-custom */, 5524613945607724329L, longValue) /* invoke-custom */;
                                                                                            B2 = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "}", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                            if (longValue > 0) {
                                                                                                if (r03 != 0) {
                                                                                                    break;
                                                                                                }
                                                                                                Throwable th = r03;
                                                                                                if (longValue >= 0) {
                                                                                                    if (th == null) {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (i < (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5514664570977633744L, longValue) /* invoke-custom */ - 1) {
                                                                                                                    (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, ",", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                                                }
                                                                                                                i++;
                                                                                                            } catch (RuntimeException unused7) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (RuntimeException unused8) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                    th = r03;
                                                                                                }
                                                                                                if (th == null) {
                                                                                                }
                                                                                            } else {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        B = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1115, 947505030 - 7729, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        if (longValue >= 0) {
                                                                                            break;
                                                                                        }
                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1130, (-947505030) - (-3621), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5519535241566080212L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1128, (-947505030) - (-7533), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5522726843928148293L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1140, (-947505030) - (-12662), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5500701278147017259L, longValue) /* invoke-custom */, 5524613945607724329L, longValue) /* invoke-custom */;
                                                                                        B2 = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "}", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                                        if (longValue > 0) {
                                                                                        }
                                                                                    } catch (RuntimeException unused9) {
                                                                                        throw r02;
                                                                                    }
                                                                                    r02 = (x) B;
                                                                                }
                                                                                String B52 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5522794876158495199L, longValue) /* invoke-custom */;
                                                                                ?? r042 = B52;
                                                                                boolean z52 = r03;
                                                                                ?? r052 = r042;
                                                                                String str2 = r042;
                                                                                if (longValue > 0) {
                                                                                }
                                                                                if (longValue > 0) {
                                                                                }
                                                                                C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z52, 5517042362951502363L, longValue) /* invoke-custom */;
                                                                                return str2;
                                                                            }
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1143, 947505030 + 13874, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528772619671072826L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                        }
                                                                        z3 = r03;
                                                                    }
                                                                    if (longValue >= 0) {
                                                                        if (!z3) {
                                                                            if (B3 == 0) {
                                                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1129, (-947505030) - (-18290), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528772619671072826L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, "\"", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            }
                                                                            B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501860580060545096L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                        }
                                                                        if (longValue > 0) {
                                                                            z3 = r03;
                                                                        }
                                                                        if (B3 == 0) {
                                                                            try {
                                                                            } catch (RuntimeException unused10) {
                                                                                throw B3;
                                                                            }
                                                                        }
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1146, 947505030 - 5406, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501860580060545096L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, "\"", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1124, 947505030 - 10354, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        z2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5517302758858426174L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                        z = r03;
                                                                        r0 = z2;
                                                                        if (longValue > 0) {
                                                                        }
                                                                        if (!z) {
                                                                        }
                                                                        i = r0;
                                                                        while (true) {
                                                                            if (i < (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5514664570977633744L, longValue) /* invoke-custom */) {
                                                                            }
                                                                            B = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1115, 947505030 - 7729, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            if (longValue >= 0) {
                                                                            }
                                                                            r02 = (x) B;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1130, (-947505030) - (-3621), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5519535241566080212L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1128, (-947505030) - (-7533), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5522726843928148293L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1140, (-947505030) - (-12662), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5500701278147017259L, longValue) /* invoke-custom */, 5524613945607724329L, longValue) /* invoke-custom */;
                                                                            B2 = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "}", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            if (longValue > 0) {
                                                                            }
                                                                        }
                                                                        String B522 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5522794876158495199L, longValue) /* invoke-custom */;
                                                                        ?? r0422 = B522;
                                                                        boolean z522 = r03;
                                                                        ?? r0522 = r0422;
                                                                        String str22 = r0422;
                                                                        if (longValue > 0) {
                                                                        }
                                                                        if (longValue > 0) {
                                                                        }
                                                                        C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z522, 5517042362951502363L, longValue) /* invoke-custom */;
                                                                        return str22;
                                                                    }
                                                                    if (!z3) {
                                                                        if (B3 == 0) {
                                                                            B3 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5528772619671072826L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                        }
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1124, 947505030 - 10354, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        z2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5517302758858426174L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                        z = r03;
                                                                        r0 = z2;
                                                                        if (longValue > 0) {
                                                                        }
                                                                        if (!z) {
                                                                        }
                                                                        i = r0;
                                                                        while (true) {
                                                                            if (i < (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5514664570977633744L, longValue) /* invoke-custom */) {
                                                                            }
                                                                            B = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1115, 947505030 - 7729, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            if (longValue >= 0) {
                                                                            }
                                                                            r02 = (x) B;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1130, (-947505030) - (-3621), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5519535241566080212L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1128, (-947505030) - (-7533), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5522726843928148293L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1140, (-947505030) - (-12662), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5500701278147017259L, longValue) /* invoke-custom */, 5524613945607724329L, longValue) /* invoke-custom */;
                                                                            B2 = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "}", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                            if (longValue > 0) {
                                                                            }
                                                                        }
                                                                        String B5222 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5522794876158495199L, longValue) /* invoke-custom */;
                                                                        ?? r04222 = B5222;
                                                                        boolean z5222 = r03;
                                                                        ?? r05222 = r04222;
                                                                        String str222 = r04222;
                                                                        if (longValue > 0) {
                                                                        }
                                                                        if (longValue > 0) {
                                                                        }
                                                                        C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z5222, 5517042362951502363L, longValue) /* invoke-custom */;
                                                                        return str222;
                                                                    }
                                                                    if (longValue > 0) {
                                                                    }
                                                                    if (!z) {
                                                                    }
                                                                    i = r0;
                                                                    while (true) {
                                                                        if (i < (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5497816755164249802L, longValue) /* invoke-custom */, 5514664570977633744L, longValue) /* invoke-custom */) {
                                                                        }
                                                                        B = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1115, 947505030 - 7729, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        if (longValue >= 0) {
                                                                        }
                                                                        r02 = (x) B;
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "{", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1130, (-947505030) - (-3621), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5519535241566080212L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1128, (-947505030) - (-7533), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5522726843928148293L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, m26a((-947505030) - 1142, (-947505030) - 2678, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1140, (-947505030) - (-12662), (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (boolean) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5500701278147017259L, longValue) /* invoke-custom */, 5524613945607724329L, longValue) /* invoke-custom */;
                                                                        B2 = (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, "}", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                        if (longValue > 0) {
                                                                        }
                                                                    }
                                                                    String B52222 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5522794876158495199L, longValue) /* invoke-custom */;
                                                                    ?? r042222 = B52222;
                                                                    boolean z52222 = r03;
                                                                    ?? r052222 = r042222;
                                                                    String str2222 = r042222;
                                                                    if (longValue > 0) {
                                                                    }
                                                                    if (longValue > 0) {
                                                                    }
                                                                    C0003v.m40a(MethodHandles.lookup(), "r", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(!z52222, 5517042362951502363L, longValue) /* invoke-custom */;
                                                                    return str2222;
                                                                } catch (RuntimeException unused11) {
                                                                    throw r0;
                                                                }
                                                                if (B3 == 0) {
                                                                }
                                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1146, 947505030 - 5406, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */, (String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5501860580060545096L, longValue) /* invoke-custom */, 5521922585964724677L, longValue) /* invoke-custom */, "\"", 5521922585964724677L, longValue) /* invoke-custom */;
                                                                (StringBuilder) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(StringBuilder.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(sb, m26a((-947505030) - 1124, 947505030 - 10354, (int) longValue), 5521922585964724677L, longValue) /* invoke-custom */;
                                                                z2 = (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 5517302758858426174L, longValue) /* invoke-custom */, 5502090298052884864L, longValue) /* invoke-custom */;
                                                                z = r03;
                                                                r0 = z2;
                                                            } catch (RuntimeException unused12) {
                                                                throw B3;
                                                            }
                                                        } catch (RuntimeException unused13) {
                                                            throw B3;
                                                        }
                                                    } catch (RuntimeException unused14) {
                                                        throw B3;
                                                    }
                                                } catch (RuntimeException unused15) {
                                                    throw B3;
                                                }
                                            } catch (RuntimeException unused16) {
                                                throw B3;
                                            }
                                        } catch (RuntimeException unused17) {
                                            throw B3;
                                        }
                                    } catch (RuntimeException unused18) {
                                        throw B3;
                                    }
                                } catch (RuntimeException unused19) {
                                    throw B3;
                                }
                            } catch (RuntimeException unused20) {
                                throw B3;
                            }
                        } catch (RuntimeException unused21) {
                            throw B3;
                        }
                    } catch (RuntimeException unused22) {
                        throw B3;
                    }
                } catch (RuntimeException unused23) {
                    throw r03;
                }
            } catch (RuntimeException unused24) {
                throw r03;
            }
        }

        /* renamed from: M */
        public r m15M(Object[] a) {
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, ((Integer) a[1]).intValue(), -2641882615652557453L, ((Long) a[0]).longValue()) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            throw r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r m14t(Object[] a) {
            String str;
            ?? r1 = (String) a[0];
            long a2 = ((Long) a[1]).longValue();
            long a3 = a2 ^ 131418617324201L;
            if (r1 != 0) {
                try {
                    Object[] objArr = new Object[2];
                    r1[1] = Long.valueOf(a3);
                    objArr[0] = objArr;
                    str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, 2190581947524860747L, a2) /* invoke-custom */;
                } catch (RuntimeException unused) {
                    throw this;
                }
            } else {
                str = "";
            }
            C0003v.m40a(MethodHandles.lookup(), "L", MethodType.methodType(Void.TYPE, Object.class, String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, str, 2193939221624113433L, a2) /* invoke-custom */;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.util.List, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Throwable, long] */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r m21J(Object[] a) {
            String str;
            String str2;
            ?? r1 = (String) a[0];
            ?? r12 = (String) a[1];
            ?? longValue = ((Long) a[2]).longValue();
            boolean a2 = ((Boolean) a[3]).booleanValue();
            long a3 = longValue ^ 73204296881395L;
            long a4 = longValue ^ 41976219529849L;
            try {
                ?? T = (List) C0003v.m40a(MethodHandles.lookup(), "T", MethodType.methodType(List.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(this, 2899864700087114424L, longValue) /* invoke-custom */;
                if (r1 != 0) {
                    Object[] objArr = new Object[2];
                    r1[1] = Long.valueOf(a3);
                    objArr[0] = objArr;
                    str = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, 2899394289702698257L, longValue) /* invoke-custom */;
                } else {
                    str = "";
                }
                if (r12 != 0) {
                    Object[] objArr2 = new Object[2];
                    r12[1] = Long.valueOf(a3);
                    objArr2[0] = objArr2;
                    str2 = (String) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr2, 2899394289702698257L, longValue) /* invoke-custom */;
                } else {
                    str2 = "";
                }
                (boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, new x(str, str2, a2, a4), 2942076891267163730L, longValue) /* invoke-custom */;
                return this;
            } catch (RuntimeException unused) {
                throw longValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
        ).invoke(r0, r0, -6231681495162575648L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.net.HttpURLConnection, java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Throwable, java.lang.StringBuilder] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m8b(Object[] a) {
        String a2 = (String) a[0];
        String a3 = (String) a[1];
        long a4 = ((Long) a[2]).longValue();
        try {
            ?? r0 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(a2), -6237785512684386487L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m11a(1297199790 + 12173, 1297199790 - 1704, (int) a4), -6218099920969999064L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m11a(1297199790 + 12175, (-1297199790) - (-11090), (int) a4), a3, -6231288135875417646L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m11a(1297199790 + 12135, (-1297199790) - (-9161), (int) a4), m11a(1297199790 + 12127, 1297199790 + 6537, (int) a4), -6231288135875417646L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m12a(15061, 8407534885524969284L ^ a4), -6238106001407040605L, a4) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, m12a(15061, 8407534885524969284L ^ a4), -6241049306773082944L, a4) /* invoke-custom */;
            ?? B = (int) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6230749235643144868L, a4) /* invoke-custom */;
            if (B != m12a(8282, 5259582350970359240L ^ a4)) {
                if (B != m12a(30549, 5414698984480299717L ^ a4) && B != m12a(19829, 1714656719408554210L ^ a4)) {
                    if (B == m12a(4897, 7277537924786470590L ^ a4)) {
                        BufferedReader a5 = new BufferedReader(new InputStreamReader((InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6238891076125725310L, a4) /* invoke-custom */));
                        try {
                            StringBuilder a6 = new StringBuilder();
                            while (true) {
                                ?? B2 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -6226699498717290436L, a4) /* invoke-custom */;
                                if (B2 == 0) {
                                    break;
                                }
                            }
                            String B3 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, -6232496680716882694L, a4) /* invoke-custom */;
                            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -6240240634566380938L, a4) /* invoke-custom */;
                            if (r0 != 0) {
                                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6240887088998830784L, a4) /* invoke-custom */;
                            }
                            return B3;
                        } catch (Throwable th) {
                            try {
                                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, -6240240634566380938L, a4) /* invoke-custom */;
                            } catch (Throwable th2) {
                                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(th, th2, -6222142641584787189L, a4) /* invoke-custom */;
                            }
                            throw th;
                        }
                    }
                    if (r0 != 0) {
                        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6240887088998830784L, a4) /* invoke-custom */;
                    }
                    return null;
                }
            }
            if (r0 != 0) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6240887088998830784L, a4) /* invoke-custom */;
            }
            return null;
        } catch (Exception e) {
            if (0 != 0) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -6240887088998830784L, a4) /* invoke-custom */;
            }
            return null;
        } catch (Throwable th3) {
            if (0 != 0) {
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -6240887088998830784L, a4) /* invoke-custom */;
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O$r, java.lang.Object] */
    /* renamed from: U */
    public static void m3U(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        Consumer<r> a3 = (Consumer) a[1];
        ?? rVar = new r(a2 ^ 20136427417753L);
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a3, rVar, 2839592526567893213L, a2) /* invoke-custom */;
        Object[] objArr = new Object[1];
        rVar[0] = Long.valueOf(a2 ^ 15192468678273L);
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, 2840203191884777001L, a2) /* invoke-custom */;
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
    public static void m5o(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 1797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p000IliIllIilIilIl.C0001O.m5o(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "B"}
            {METHOD_TYPE: (Ljava/lang/Object;, Ljava/lang/Object;, J, J)Ljava/lang/StringBuilder;}
        ).invoke(r0, r0, 8699435561693050334L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.Object] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10W(Object[] a) throws Exception {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        HttpURLConnection a4 = null;
        try {
            a4 = (HttpURLConnection) (URLConnection) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(URLConnection.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new URL(a2), 8669687801957471863L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m11a(1664720070 - 27022, 40134 - ((char) (-32389)), (int) a3), 8685995822872661014L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m12a(20929, 6372002334322109801L ^ a3), 8670501975140233885L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m12a(15061, 8407539158708602490L ^ a3), 8673179201362165246L, a3) /* invoke-custom */;
            C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, m11a(1664720070 - 27032, 40134 - ((char) (-30775)), (int) a3), m11a(1664720070 - 27020, 40134 - ((char) (-26741)), (int) a3), 8698703005180164332L, a3) /* invoke-custom */;
            BufferedReader a5 = new BufferedReader(new InputStreamReader((InputStream) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(InputStream.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, 8670842842882718908L, a3) /* invoke-custom */));
            try {
                StringBuilder a6 = new StringBuilder();
                while (true) {
                    ?? B = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, 8694293591154143490L, a3) /* invoke-custom */;
                    if (B == 0) {
                        break;
                    }
                }
                String B2 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a6, 8700881317131812292L, a3) /* invoke-custom */;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a5, 8671736106701464392L, a3) /* invoke-custom */;
                if (a4 != null) {
                    C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a4, 8673350678939171966L, a3) /* invoke-custom */;
                }
                return B2;
            } finally {
            }
        } catch (Throwable th) {
            if (a4 != 0) {
                ?? r0 = a4;
                C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8673350678939171966L, a3) /* invoke-custom */;
            }
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: G */
    private static String m6G(Object[] a) {
        String a2 = (String) a[0];
        long a3 = ((Long) a[1]).longValue();
        return a2 == null ? "" : (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, "\\", m11a((-1724356920) - (-((char) (-28451))), 1724356920 - 11648, (int) a3), -4896112004771260900L, a3) /* invoke-custom */, "\"", m11a((-1724356920) - (-((char) (-28433))), 39224 - ((char) (-28140)), (int) a3), -4896112004771260900L, a3) /* invoke-custom */, "\n", m11a((-1724356920) - (-((char) (-28434))), 39224 - ((char) (-26980)), (int) a3), -4896112004771260900L, a3) /* invoke-custom */, "\r", m11a((-1724356920) - (-((char) (-28466))), (-1724356920) - (-13933), (int) a3), -4896112004771260900L, a3) /* invoke-custom */, "\t", m11a((-1724356920) - (-((char) (-28482))), 1724356920 - 17555, (int) a3), -4896112004771260900L, a3) /* invoke-custom */;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dev.azad1337.IlıİiIılİlIıiİlIiılIıİl.O$r, java.lang.Object] */
    /* renamed from: Q */
    public static void m4Q(Object[] a) {
        Consumer<r> a2 = (Consumer) a[0];
        long a3 = ((Long) a[1]).longValue();
        File a4 = (File) a[2];
        ?? rVar = new r(a3 ^ 139912927552069L);
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(a2, rVar, -741916036081894911L, a3) /* invoke-custom */;
        Object[] objArr = new Object[2];
        objArr[1] = a4;
        rVar[0] = Long.valueOf(a3 ^ 135181097017751L);
        C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Void.TYPE, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArr, objArr, -741208883335369921L, a3) /* invoke-custom */;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, java.util.regex.Matcher, java.lang.Object] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m9y(Object[] a) {
        long a2 = ((Long) a[0]).longValue();
        ?? B = (Matcher) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Matcher.class, Object.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke((Pattern) C0003v.m40a(MethodHandles.lookup(), "î", MethodType.methodType(Pattern.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("\"" + ((String) a[2]) + m11a(55866 + ((char) (-4559)), 55864 - ((char) (-7944)), (int) a2), -8993581029492809606L, a2) /* invoke-custom */, (String) a[1], -8937196309001826466L, a2) /* invoke-custom */;
        try {
            if (!(boolean) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -8951446695049473295L, a2) /* invoke-custom */) {
                return "";
            }
            ?? B2 = (String) C0003v.m40a(MethodHandles.lookup(), "B", MethodType.methodType(String.class, Object.class, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, 1, -8935252442412927088L, a2) /* invoke-custom */;
            return B2;
        } catch (RuntimeException unused) {
            throw B;
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
    /* renamed from: W */
    public static java.util.Map m7W(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p000IliIllIilIilIl.C0001O.m7W(java.lang.Object[]):java.util.Map");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(BitSet.java:628)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: R */
    public static void m2R(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p000IliIllIilIilIl.C0001O.m2R(java.lang.Object[]):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(BitSet.java:628)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: Z */
    public static void m1Z(java.lang.Object[] r8) {
        /*
            r0 = r8
            r1 = r0
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r0
            r2 = 1
            r1 = r1[r2]
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r10 = r1
            r0 = r10
            r1 = r0; r2 = r0; 
            r2 = 15672035443662(0xe40ee1b03ce, double:7.74301431312E-311)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = r12
            r1 = r9
            r2 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = r3; r3 = r4; r4 = r5; 
            r5 = 2
            r6 = r4; r4 = r5; r5 = r6; 
            r3[r4] = r5
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = r2; r2 = r3; r3 = r4; 
            r4 = 1
            r5 = r3; r3 = r4; r4 = r5; 
            r2[r3] = r4
            r2 = r1; r1 = r0; r0 = r-1; r-1 = r2; 
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r4 = r2; r2 = r3; r3 = r4; 
            r1[r2] = r3
            r1 = 5577273149164852773(0x4d667461274b9625, double:7.38983177662878E64)
            r2 = r10
            call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Ldev/azad1337/IlıİiIılİlIıiİlIiılIıİl/v;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "î"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)V}
            ).invoke(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.azad1337.p000IliIllIilIilIl.C0001O.m1Z(java.lang.Object[]):void");
    }
}
