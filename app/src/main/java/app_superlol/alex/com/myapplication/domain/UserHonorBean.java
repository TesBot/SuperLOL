package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/5 0005.
 */

public class UserHonorBean {

    /**
     * data : [{"result":0,"triple_kills":21,"quadra_kills":2,"penta_kills":0,"god_like_num":52,"kills_total":2934,"assists_total":2978,"ward_placed_total":4563}]
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
         * triple_kills : 21
         * quadra_kills : 2
         * penta_kills : 0
         * god_like_num : 52
         * kills_total : 2934
         * assists_total : 2978
         * ward_placed_total : 4563
         */

        private int result;
        private int triple_kills;
        private int quadra_kills;
        private int penta_kills;
        private int god_like_num;
        private int kills_total;
        private int assists_total;
        private int ward_placed_total;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public int getTriple_kills() {
            return triple_kills;
        }

        public void setTriple_kills(int triple_kills) {
            this.triple_kills = triple_kills;
        }

        public int getQuadra_kills() {
            return quadra_kills;
        }

        public void setQuadra_kills(int quadra_kills) {
            this.quadra_kills = quadra_kills;
        }

        public int getPenta_kills() {
            return penta_kills;
        }

        public void setPenta_kills(int penta_kills) {
            this.penta_kills = penta_kills;
        }

        public int getGod_like_num() {
            return god_like_num;
        }

        public void setGod_like_num(int god_like_num) {
            this.god_like_num = god_like_num;
        }

        public int getKills_total() {
            return kills_total;
        }

        public void setKills_total(int kills_total) {
            this.kills_total = kills_total;
        }

        public int getAssists_total() {
            return assists_total;
        }

        public void setAssists_total(int assists_total) {
            this.assists_total = assists_total;
        }

        public int getWard_placed_total() {
            return ward_placed_total;
        }

        public void setWard_placed_total(int ward_placed_total) {
            this.ward_placed_total = ward_placed_total;
        }
    }
}
