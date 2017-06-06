package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/4 0004.
 */

public class AreaInfo {


    /**
     * data : [{"id":1,"strid":"HN1","isp":"电信一","name":"艾欧尼亚","idc":"东莞东城","tcls":257,"ob":1},{"id":2,"strid":"WT1","isp":"网通一","name":"比尔吉沃特","idc":"济南担山屯","tcls":258,"ob":1},{"id":3,"strid":"HN2","isp":"电信二","name":"祖安","idc":"杭州东冠","tcls":513,"ob":1},{"id":4,"strid":"HN3","isp":"电信三","name":"诺克萨斯","idc":"东莞大朗","tcls":769,"ob":1},{"id":5,"strid":"HN4","isp":"电信四","name":"班德尔城","idc":"成都光华","tcls":1025,"ob":0},{"id":6,"strid":"WT2","isp":"网通二","name":"德玛西亚","idc":"济南担山屯","tcls":514,"ob":1},{"id":7,"strid":"HN5","isp":"电信五","name":"皮尔特沃夫","idc":"杭州东冠","tcls":1281,"ob":0},{"id":8,"strid":"HN6","isp":"电信六","name":"战争学院","idc":"东莞大朗","tcls":1537,"ob":0},{"id":9,"strid":"WT3","isp":"网通三","name":"弗雷尔卓德","idc":"天津数据中心","tcls":770,"ob":1},{"id":10,"strid":"HN7","isp":"电信七","name":"巨神峰","idc":"杭州东冠","tcls":1793,"ob":0},{"id":11,"strid":"HN8","isp":"电信八","name":"雷瑟守备","idc":"东莞大朗","tcls":2049,"ob":0},{"id":12,"strid":"WT4","isp":"网通四","name":"无畏先锋","idc":"济南担山屯","tcls":1026,"ob":0},{"id":13,"strid":"HN9","isp":"电信九","name":"裁决之地","idc":"成都高新","tcls":2305,"ob":0},{"id":14,"strid":"HN10","isp":"电信十","name":"黑色玫瑰","idc":"东莞大朗","tcls":2561,"ob":0},{"id":15,"strid":"HN11","isp":"电信十一","name":"暗影岛","idc":"东莞大朗","tcls":2817,"ob":0},{"id":16,"strid":"WT5","isp":"网通五","name":"恕瑞玛","idc":"天津数据中心","tcls":1282,"ob":0},{"id":17,"strid":"HN12","isp":"电信十二","name":"钢铁烈阳","idc":"成都高新","tcls":3073,"ob":0},{"id":18,"strid":"HN13","isp":"电信十三","name":"水晶之痕","idc":"杭州东冠","tcls":3329,"ob":0},{"id":19,"strid":"HN14","isp":"电信十四","name":"均衡教派","idc":"南京二长","tcls":3585,"ob":0},{"id":20,"strid":"WT6","isp":"网通六","name":"扭曲丛林","idc":"天津数据中心","tcls":1538,"ob":0},{"id":21,"strid":"EDU1","isp":"教育网","name":"教育网专区","idc":"上海南汇","tcls":65539,"ob":0},{"id":22,"strid":"HN15","isp":"电信十五","name":"影流","idc":"南京二长","tcls":3841,"ob":0},{"id":23,"strid":"HN16","isp":"电信十六","name":"守望之海","idc":"南京二长","tcls":4097,"ob":0},{"id":24,"strid":"HN17","isp":"电信十七","name":"征服之海","idc":"东莞大朗","tcls":4353,"ob":0},{"id":25,"strid":"HN18","isp":"电信十八","name":"卡拉曼达","idc":"深圳蛇口","tcls":4609,"ob":0},{"id":26,"strid":"WT7","isp":"网通七","name":"巨龙之巢","idc":"天津数据中心","tcls":1794,"ob":0},{"id":27,"strid":"HN19","isp":"电信十九","name":"皮城警备","idc":"成都高新","tcls":4865,"ob":0},{"id":30,"strid":"BGP1","isp":"全网络大区一","name":"男爵领域","idc":"上海腾讯宝信DC","tcls":261,"ob":0}]
     * code : 0
     * msg : ok
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * strid : HN1
         * isp : 电信一
         * name : 艾欧尼亚
         * idc : 东莞东城
         * tcls : 257
         * ob : 1
         */

        private int id;
        private String strid;
        private String isp;
        private String name;
        private String idc;
        private int tcls;
        private int ob;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStrid() {
            return strid;
        }

        public void setStrid(String strid) {
            this.strid = strid;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdc() {
            return idc;
        }

        public void setIdc(String idc) {
            this.idc = idc;
        }

        public int getTcls() {
            return tcls;
        }

        public void setTcls(int tcls) {
            this.tcls = tcls;
        }

        public int getOb() {
            return ob;
        }

        public void setOb(int ob) {
            this.ob = ob;
        }
    }
}
