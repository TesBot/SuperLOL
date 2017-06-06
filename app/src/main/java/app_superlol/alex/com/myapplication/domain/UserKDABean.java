package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/5 0005.
 */

public class UserKDABean {

    /**
     * data : [{"result":0,"list_num":6,"batt_sum_info":[{"battle_type":4,"last_battle_time":1492741845,"total_num":207,"win_num":96,"lose_num":111,"leave_num":0,"reserved2":0,"tier":5,"queue":2,"win_point":68},{"battle_type":3,"last_battle_time":1492741845,"total_num":96,"win_num":51,"lose_num":44,"leave_num":1,"reserved2":0,"tier":4,"queue":4,"win_point":0},{"battle_type":6,"last_battle_time":0,"total_num":4,"win_num":2,"lose_num":2,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":2,"last_battle_time":0,"total_num":1,"win_num":1,"lose_num":0,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":1,"last_battle_time":0,"total_num":295,"win_num":138,"lose_num":157,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":7,"last_battle_time":0,"total_num":113,"win_num":55,"lose_num":53,"leave_num":5,"reserved2":0,"tier":255,"queue":255,"win_point":0}]}]
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
         * result : 0
         * list_num : 6
         * batt_sum_info : [{"battle_type":4,"last_battle_time":1492741845,"total_num":207,"win_num":96,"lose_num":111,"leave_num":0,"reserved2":0,"tier":5,"queue":2,"win_point":68},{"battle_type":3,"last_battle_time":1492741845,"total_num":96,"win_num":51,"lose_num":44,"leave_num":1,"reserved2":0,"tier":4,"queue":4,"win_point":0},{"battle_type":6,"last_battle_time":0,"total_num":4,"win_num":2,"lose_num":2,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":2,"last_battle_time":0,"total_num":1,"win_num":1,"lose_num":0,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":1,"last_battle_time":0,"total_num":295,"win_num":138,"lose_num":157,"leave_num":0,"reserved2":0,"tier":255,"queue":255,"win_point":0},{"battle_type":7,"last_battle_time":0,"total_num":113,"win_num":55,"lose_num":53,"leave_num":5,"reserved2":0,"tier":255,"queue":255,"win_point":0}]
         */

        private int result;
        private int list_num;
        private List<BattSumInfoBean> batt_sum_info;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public int getList_num() {
            return list_num;
        }

        public void setList_num(int list_num) {
            this.list_num = list_num;
        }

        public List<BattSumInfoBean> getBatt_sum_info() {
            return batt_sum_info;
        }

        public void setBatt_sum_info(List<BattSumInfoBean> batt_sum_info) {
            this.batt_sum_info = batt_sum_info;
        }

        public static class BattSumInfoBean {
            /**
             * battle_type : 4
             * last_battle_time : 1492741845
             * total_num : 207
             * win_num : 96
             * lose_num : 111
             * leave_num : 0
             * reserved2 : 0
             * tier : 5
             * queue : 2
             * win_point : 68
             */

            private int battle_type;
            private int last_battle_time;
            private int total_num;
            private int win_num;
            private int lose_num;
            private int leave_num;
            private int reserved2;
            private int tier;
            private int queue;
            private int win_point;

            public int getBattle_type() {
                return battle_type;
            }

            public void setBattle_type(int battle_type) {
                this.battle_type = battle_type;
            }

            public int getLast_battle_time() {
                return last_battle_time;
            }

            public void setLast_battle_time(int last_battle_time) {
                this.last_battle_time = last_battle_time;
            }

            public int getTotal_num() {
                return total_num;
            }

            public void setTotal_num(int total_num) {
                this.total_num = total_num;
            }

            public int getWin_num() {
                return win_num;
            }

            public void setWin_num(int win_num) {
                this.win_num = win_num;
            }

            public int getLose_num() {
                return lose_num;
            }

            public void setLose_num(int lose_num) {
                this.lose_num = lose_num;
            }

            public int getLeave_num() {
                return leave_num;
            }

            public void setLeave_num(int leave_num) {
                this.leave_num = leave_num;
            }

            public int getReserved2() {
                return reserved2;
            }

            public void setReserved2(int reserved2) {
                this.reserved2 = reserved2;
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
}
