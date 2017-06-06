package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/5 0005.
 */

public class UserAreaBean {

    /**
     * data : [{"area_id":3,"qquin":"U6521824015394137005","icon_id":25,"name":"我最萌88","level":2,"tier":255,"queue":255,"win_point":0},{"area_id":15,"qquin":"U6034903703596075156","icon_id":1259,"name":"我最萌88","level":30,"tier":5,"queue":0,"win_point":13},{"area_id":27,"qquin":"U16921076938487335477","icon_id":25,"name":"我最萌88","level":6,"tier":255,"queue":255,"win_point":0}]
     * retCode : 0
     * msg :
     */

    private int retCode;
    private String msg;
    private List<DataBean> data;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
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
         * area_id : 3
         * qquin : U6521824015394137005
         * icon_id : 25
         * name : 我最萌88
         * level : 2
         * tier : 255
         * queue : 255
         * win_point : 0
         */

        private int area_id;
        private String qquin;
        private int icon_id;
        private String name;
        private int level;
        private int tier;
        private int queue;
        private int win_point;

        public int getArea_id() {
            return area_id;
        }

        public void setArea_id(int area_id) {
            this.area_id = area_id;
        }

        public String getQquin() {
            return qquin;
        }

        public void setQquin(String qquin) {
            this.qquin = qquin;
        }

        public int getIcon_id() {
            return icon_id;
        }

        public void setIcon_id(int icon_id) {
            this.icon_id = icon_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getTier() {
            return tier;
        }

        public void setTier(int tier) {
            this.tier = tier;
        }

        public int getQueue() {
            return queue;
        }

        public void setQueue(int queue) {
            this.queue = queue;
        }

        public int getWin_point() {
            return win_point;
        }

        public void setWin_point(int win_point) {
            this.win_point = win_point;
        }
    }
}
