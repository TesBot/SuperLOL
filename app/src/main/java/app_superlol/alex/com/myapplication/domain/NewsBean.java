package app_superlol.alex.com.myapplication.domain;

import java.util.List;

/**
 * Created by Jhin on 2017/6/1 0001.
 * 资讯解析Bean
 */

public class NewsBean {


    /**
     * data : [{"children":[{"id":10010,"title":"鏈\u20ac鏂�","type":1,"url":"/static/news/10010/list_1.json"},{"id":10011,"title":"涓撴爮","type":1,"url":"/static/news/10011/list_1.json"},{"id":10012,"title":"瀹樻柟","type":1,"url":"/static/news/10012/list_1.json"},{"id":10013,"title":"娲诲姩","type":1,"url":"/static/news/10013/list_1.json"},{"id":10014,"title":"鏀荤暐","type":1,"url":"/static/news/10014/list_1.json"},{"id":10015,"title":"濞变箰","type":1,"url":"/static/news/10015/list_1.json"}],"id":10000,"title":"鏂伴椈璧勮","type":1},{"id":10002,"title":"鎴戠殑濂藉弸","type":10,"url":"#"},{"id":10003,"title":"瓒ｅ懗鍔熻兘","type":2,"url":"#"},{"id":10004,"title":"鏁鏈熷緟","type":3,"url":"#"}]
     * retcode : 200
     */

    private int retcode;
    private List<DataBean> data;

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * children : [{"id":10010,"title":"鏈\u20ac鏂�","type":1,"url":"/static/news/10010/list_1.json"},{"id":10011,"title":"涓撴爮","type":1,"url":"/static/news/10011/list_1.json"},{"id":10012,"title":"瀹樻柟","type":1,"url":"/static/news/10012/list_1.json"},{"id":10013,"title":"娲诲姩","type":1,"url":"/static/news/10013/list_1.json"},{"id":10014,"title":"鏀荤暐","type":1,"url":"/static/news/10014/list_1.json"},{"id":10015,"title":"濞变箰","type":1,"url":"/static/news/10015/list_1.json"}]
         * id : 10000
         * title : 鏂伴椈璧勮
         * type : 1
         * url : #
         */

        private int id;
        private String title;
        private int type;
        private String url;
        private List<ChildrenBean> children;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public static class ChildrenBean {
            /**
             * id : 10010
             * title : 鏈€鏂�
             * type : 1
             * url : /static/news/10010/list_1.json
             */

            private int id;
            private String title;
            private int type;
            private String url;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
