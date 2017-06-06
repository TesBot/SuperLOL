package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/4 0004.
 */

public class HerosBean  {

    /**
     * herosurl : http://ossweb-img.qq.com/images/lol/img/champion/
     * data : [{"id":100000,"name":"Yasuo","ch_name":"浜氱储","called":"鐤鹃鍓戣豹"},{"id":100001,"name":"Annie","ch_name":"瀹夊Ξ","called":"榛戞殫涔嬪コ"},{"id":100002,"name":"Galio","ch_name":"鍔犻噷濂�","called":"姝ｄ箟宸ㄥ儚"},{"id":100003,"name":"Olaf","ch_name":"濂ユ媺澶�","called":"鐙傛垬澹�"},{"id":100004,"name":"Leblanc","ch_name":"涔愯姍鍏�","called":"璇℃湳濡栧К"},{"id":100005,"name":"TwistedFate","ch_name":"宕旀柉鐗�","called":"鍗＄墝澶у笀"},{"id":100006,"name":"XinZao","ch_name":"璧典俊","called":"寰烽偊鎬荤"},{"id":100007,"name":"Urgot","ch_name":"鍘勫姞鐗�","called":"棣栭涔嬪偛"},{"id":100008,"name":"Vladimir","ch_name":"寮楁媺鍩虹背灏�","called":"鐚╃孩鏀跺壊鑰�"},{"id":100009,"name":"Fiddlesticks","ch_name":"璐瑰痉鎻愬厠","called":"鏈棩浣胯\u20ac�"},{"id":100010,"name":"Kayle","ch_name":"鍑皵","called":"瀹\u2033垽澶╀娇"},{"id":100011,"name":"MasterYi","ch_name":"鏄�","called":"鏃犳瀬鍓戝湥"},{"id":100012,"name":"Alistar","ch_name":"闃垮埄鏂","called":"鐗涘ご閰嬮暱"},{"id":100013,"name":"Ryze","ch_name":"鐟炲吂","called":"绗︽枃娉曞笀"},{"id":100014,"name":"Sion","ch_name":"濉炴仼","called":"浜＄伒鍕囧＋"},{"id":100015,"name":"Sivir","ch_name":"甯岀淮灏�","called":"鎴樹簤濂崇"},{"id":100016,"name":"Soraka","ch_name":"绱㈡媺鍗�","called":"浼楁槦涔嬪瓙"},{"id":100017,"name":"Teemo","ch_name":"鎻愯帿","called":"杩呮嵎鏂ュ\u20ac�"},{"id":100018,"name":"Tristana","ch_name":"宕斾笣濉斿","called":"楹︽灄鐐墜"},{"id":100019,"name":"Warwick","ch_name":"娌冮噷鍏�","called":"鍡滆鐚庢墜"},{"id":100020,"name":"Nunu","ch_name":"鍔姫","called":"闆汉楠戝＋"},{"id":100021,"name":"MissFortune","ch_name":"鍘勮繍灏忓","called":"璧忛噾鐚庝汉"},{"id":100022,"name":"Ashe","ch_name":"鑹惧笇","called":"瀵掑啺灏勬墜"},{"id":100023,"name":"Tryndamere","ch_name":"娉拌揪绫冲皵","called":"铔棌涔嬬帇"},{"id":100024,"name":"Jax","ch_name":"璐惧厠鏂�","called":"姝﹀櫒澶у笀"},{"id":100025,"name":"Morgana","ch_name":"鑾敇濞�","called":"鍫曡惤澶╀娇"},{"id":100026,"name":"Zilean","ch_name":"鍩哄叞","called":"鏃堕棿瀹堟姢鑰�"},{"id":100027,"name":"Singed","ch_name":"杈涘悏寰�","called":"鐐奸噾鏈＋"},{"id":100028,"name":"Evelynn","ch_name":"浼婅姍鐞�","called":"瀵\u2033鍒堕\u20ac犺\u20ac�"},{"id":100029,"name":"Twitch","ch_name":"鍥惧","called":"鐦熺柅涔嬫簮"},{"id":100030,"name":"Karthus","ch_name":"鍗\u2033皵钀ㄦ柉","called":"姝讳骸棰傚敱鑰�"},{"id":100031,"name":"Chogath","ch_name":"绉戝姞鏂�","called":"铏氱┖鎭愭儳"},{"id":100032,"name":"Amumu","ch_name":"闃挎湪鏈�","called":"娈囦箣鏈ㄤ箖浼�"},{"id":100033,"name":"Rammus","ch_name":"鎷夎帿鏂�","called":"鎶敳榫欓緹"},{"id":100034,"name":"Anivia","ch_name":"鑹惧凹缁翠簹","called":"鍐版櫠鍑ゅ嚢"},{"id":100035,"name":"Shaco","ch_name":"钀ㄥ厠","called":"鎭堕瓟灏忎笐"},{"id":100036,"name":"DrMundo","ch_name":"钂欏","called":"绁栧畨鐙備汉"},{"id":100037,"name":"Sona","ch_name":"濞戝","called":"鐞寸憻浠欏コ"},{"id":100038,"name":"Kassadin","ch_name":"鍗¤惃涓�","called":"铏氱┖琛岃\u20ac�"},{"id":100039,"name":"Irelia","ch_name":"鑹剧憺鑾変簹","called":"鍒\u20ac閿嬫剰蹇�"},{"id":100040,"name":"Janna","ch_name":"杩﹀","called":"椋庢毚涔嬫\u20ac�"},{"id":100041,"name":"Gangplank","ch_name":"鏅湕鍏�","called":"娴锋磱涔嬬伨"},{"id":100042,"name":"Corki","ch_name":"搴撳","called":"鑻卞媷鎶曞脊鎵�"},{"id":100043,"name":"Karma","ch_name":"鍗\u2033皵鐜�","called":"澶╁惎鑰�"},{"id":100044,"name":"Taric","ch_name":"濉旈噷鍏�","called":"瀹濈煶楠戝＋"},{"id":100045,"name":"Veigar","ch_name":"缁磋喀","called":"閭伓灏忔硶甯�"},{"id":100046,"name":"Trundle","ch_name":"鐗规湕寰峰皵","called":"璇呭拻宸ㄩ瓟"},{"id":100047,"name":"Swain","ch_name":"鏂淮鍥�","called":"绛栧＋缁熼"},{"id":100048,"name":"Caitlyn","ch_name":"鍑壒鐞�","called":"鐨煄濂宠"},{"id":100049,"name":"Blitzcrank","ch_name":"甯冮噷鑼�","called":"钂告苯鏈哄櫒浜�"},{"id":100050,"name":"Malphite","ch_name":"澧ㄨ彶鐗�","called":"鐔斿博宸ㄥ吔"},{"id":100051,"name":"Katarina","ch_name":"鍗＄壒鐞冲","called":"涓嶇ゥ涔嬪垉"},{"id":100052,"name":"Nocturne","ch_name":"榄旇吘","called":"姘告亽姊﹂瓏"},{"id":100053,"name":"Maokai","ch_name":"鑼傚嚡","called":"鎵洸鏍戠簿"},{"id":100054,"name":"Renekton","ch_name":"闆峰厠椤�","called":"鑽掓紶灞犲か"},{"id":100055,"name":"JarvanIV","ch_name":"鍢夋枃鍥涗笘","called":"寰风帥瑗夸簹鐜嬪瓙"},{"id":100056,"name":"Oriana","ch_name":"濂ュ埄瀹夊","called":"鍙戞潯榄旂伒"},{"id":100057,"name":"Wukong","ch_name":"瀛欐偀绌�","called":"榻愬ぉ澶у湥"},{"id":100058,"name":"Brand","ch_name":"甯冨叞寰�","called":"澶嶄粐鐒伴瓊"},{"id":100059,"name":"LeeSin","ch_name":"鏉庨潚","called":"鐩插儳"},{"id":100060,"name":"Vayne","ch_name":"钖囨仼","called":"鏆楀鐚庢墜"},{"id":100061,"name":"Rumble","ch_name":"鍏板崥","called":"鏈烘鍏晫"},{"id":100062,"name":"Cassiopeia","ch_name":"鍗℃柉濂ヤ僵濞�","called":"榄旇泧涔嬫嫢"},{"id":100063,"name":"Skarner","ch_name":"鏂崱绾�","called":"姘存櫠鍏堥攱"},{"id":100064,"name":"Heimerdinger","ch_name":"榛戦粯涓佹牸","called":"澶у彂鏄庡"},{"id":100065,"name":"Nasus","ch_name":"鍐呯憻鏂�","called":"娌欐紶姝荤"},{"id":100066,"name":"Nidalee","ch_name":"濂堝痉涓�","called":"鐙傞噹濂崇寧鎵�"},{"id":100067,"name":"Udyr","ch_name":"涔岃开灏�","called":"鍏界伒琛岃\u20ac�"},{"id":100068,"name":"Poppy","ch_name":"娉㈡瘮","called":"閽㈤搧澶т娇"},{"id":100069,"name":"Gragas","ch_name":"鍙ゆ媺鍔犳柉","called":"閰掓《"},{"id":100070,"name":"Pantheon","ch_name":"娼樻．","called":"鎴樹簤涔嬬帇"},{"id":100071,"name":"Ezreal","ch_name":"浼婃辰鐟炲皵","called":"鎺㈤櫓瀹�"},{"id":100072,"name":"Mordekaiser","ch_name":"鑾痉鍑拻","called":"閾侀摖鍐ラ瓊"},{"id":100073,"name":"Jhin","ch_name":"鐑�","called":"鎴忓懡甯�"},{"id":100074,"name":"Rakan","ch_name":"娲�","called":"骞荤繋"},{"id":100075,"name":"Xayah","ch_name":"闇�","called":"閫嗙窘"},{"id":100076,"name":"Yorick","ch_name":"绾﹂噷鍏�","called":"鐗ч瓊浜�"},{"id":100077,"name":"Akali","ch_name":"闃垮崱涓�","called":"鏆楀奖涔嬫嫵"},{"id":100078,"name":"kennen","ch_name":"鍑崡","called":"鐙傛毚涔嬪績"},{"id":100079,"name":"Garen","ch_name":"鐩栦鸡","called":"寰风帥瑗夸簹涔嬪姏"},{"id":100080,"name":"Leona","ch_name":"钑炬濞�","called":"鏇欏厜濂崇"},{"id":100081,"name":"Malzahar","ch_name":"椹皵鎵庡搱","called":"铏氱┖鍏堢煡"},{"id":100082,"name":"Talon","ch_name":"娉伴殕","called":"鍒\u20ac閿嬩箣褰�"},{"id":100083,"name":"Riven","ch_name":"閿愰洴","called":"鏀鹃\u20ac愪箣鍒�"},{"id":100084,"name":"KogMaw","ch_name":"鍏嬫牸鑾�","called":"娣辨笂宸ㄥ彛"},{"id":100085,"name":"Shen","ch_name":"鎱�","called":"鏆厜涔嬬溂"},{"id":100086,"name":"Lux","ch_name":"鎷夊厠涓�","called":"鍏夎緣濂抽儙"},{"id":100087,"name":"Xerath","ch_name":"娉芥媺鏂�","called":"杩滃彜宸伒"},{"id":100088,"name":"Shyvana","ch_name":"甯岀摝濞�","called":"榫欒姝﹀К"},{"id":100089,"name":"Ahri","ch_name":"闃跨嫺","called":"涔濆熬濡栫嫄"},{"id":100090,"name":"Graves","ch_name":"鏍奸浄绂忔柉","called":"娉曞鐙傚緬"},{"id":100091,"name":"Fizz","ch_name":"鑿插吂","called":"娼睈娴风伒"},{"id":100092,"name":"Volibear","ch_name":"娌冨埄璐濆皵","called":"闆烽渾鍜嗗摦"},{"id":100093,"name":"Nautilus","ch_name":"璇烘彁鍕掓柉","called":"娣辨捣娉板潶"},{"id":100094,"name":"Viktor","ch_name":"缁村厠鎵�","called":"鏈烘鍏堥┍"},{"id":100095,"name":"Sejuani","ch_name":"鐟熷簞濡�","called":"鍑涘啲涔嬫\u20ac�"},{"id":100096,"name":"Fiora","ch_name":"鑿插ゥ濞�","called":"鏃犲弻鍓戝К"},{"id":100097,"name":"Zed","ch_name":"鍔�","called":"褰辨祦涔嬩富"},{"id":100098,"name":"Ziggs","ch_name":"鍚夋牸鏂�","called":"鐖嗙牬楝兼墠"},{"id":100099,"name":"Lulu","ch_name":"鐠愮拹","called":"浠欑伒濂冲帆"},{"id":100100,"name":"Darven","ch_name":"寰疯幈鏂�","called":"鑽ｈ\u20ac\u20ac琛屽垜瀹�"}]
     */

    private String herosurl;
    private List<DataBean> data;

    public String getHerosurl() {
        return herosurl;
    }

    public void setHerosurl(String herosurl) {
        this.herosurl = herosurl;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 100000
         * name : Yasuo
         * ch_name : 浜氱储
         * called : 鐤鹃鍓戣豹
         */

        private int id;
        private String name;
        private String ch_name;
        private String called;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCh_name() {
            return ch_name;
        }

        public void setCh_name(String ch_name) {
            this.ch_name = ch_name;
        }

        public String getCalled() {
            return called;
        }

        public void setCalled(String called) {
            this.called = called;
        }
    }
}
