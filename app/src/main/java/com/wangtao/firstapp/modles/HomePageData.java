package com.wangtao.firstapp.modles;

import java.util.List;

/**
 * 首页主页面数据实体类
 * Created by lanouhn on 16/8/24.
 */
public class HomePageData {

    /**
     * status : 1
     * msg : 成功
     * ts : 1472009652
     * data : {"banner":[{"id":"1063","title":"脑洞大开，你准备好了吗？","sub_title":"","type":"topic_list","topic_type":"","photo":"http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/10155101.jpg?v=1471836366","extend":"4580,4653,4059,2153,1832,1217,1085,7944,4973,4256","index":124,"parent_id":"1","photo_width":"900","photo_height":"432","is_show_icon":0},{"id":"1058","title":"我的小窝打造计划","sub_title":"","type":"topic_list","topic_type":"","photo":"http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/10210198.jpg?v=1471572623","extend":"4046,3195,2991,2499,9230,5191,4215,3404,3284,2663","index":123,"parent_id":"1","photo_width":"900","photo_height":"432","is_show_icon":0},{"id":"1062","title":"活动 | 晒一晒你的文艺小情调","sub_title":"","type":"topic_detail","topic_type":"2","photo":"http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/48101529.jpg?v=1471835040","extend":"9498","index":122,"parent_id":"1","photo_width":"900","photo_height":"432","is_show_icon":0},{"id":"1060","title":"备上TA  我就是颜值旋涡","sub_title":"","type":"topic_list","topic_type":"","photo":"http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/55100544.jpg?v=1471573799","extend":"9126,8859,8738,9101,7469","index":119,"parent_id":"1","photo_width":"900","photo_height":"432","is_show_icon":0},{"id":"1056","title":"被安利千百次的美妆好货","sub_title":"","type":"topic_list","topic_type":"","photo":"http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/51495549.jpg?v=1471423507","extend":"2509,3670,4991,3870,2522,3951,3647,5971","index":118,"parent_id":"1","photo_width":"900","photo_height":"432","is_show_icon":0}],"insert_element":[],"category_element":[{"id":"99999999","title":"精选","sub_title":"","type":"topic_main","topic_type":"","photo":"","extend":"","is_show_icon":0},{"id":"812","title":"原创精选","sub_title":"","type":"topic_list","topic_type":"","photo":"","extend":"9567,9813,9254,9627,9399,7617,9502,9455,9175,9374,9313,9183,9169,9216,8999,9290,9180,9101,9140,9126,8859,8543,9003,8732,8719,8767,8860,8731,8738,8087,7672,8654,8384,8191,8253,8311,8052,7694,7251,8193,7996,8231,7981,7749,7885,7948,7795,7593,7390,7871","index":150,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"612","title":"一周最热","sub_title":"","type":"topic_list","topic_type":"","photo":"","extend":"9448,9326,9311,9506,9230,9425,9766,9193,9426,9422,8695,8040,8762,8018","index":147,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"420","title":"美妆&穿搭","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"13","index":143,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"413","title":"礼物","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"3","index":142,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"422","title":"美食","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"15","index":141,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"423","title":"设计感","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"16","index":140,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"417","title":"文艺","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"8","index":135,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0},{"id":"415","title":"学生党","sub_title":"","type":"topic_scene","topic_type":"","photo":"","extend":"5","index":130,"parent_id":"23","photo_width":"","photo_height":"","is_show_icon":0}]}
     */

    private String status;
    private String msg;
    private int ts;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1063
         * title : 脑洞大开，你准备好了吗？
         * sub_title :
         * type : topic_list
         * topic_type :
         * photo : http://7xiwnz.com2.z0.glb.qiniucdn.com/element1/201608/10155101.jpg?v=1471836366
         * extend : 4580,4653,4059,2153,1832,1217,1085,7944,4973,4256
         * index : 124
         * parent_id : 1
         * photo_width : 900
         * photo_height : 432
         * is_show_icon : 0
         */

        private List<BannerBean> banner;
        private List<?> insert_element;
        /**
         * id : 99999999
         * title : 精选
         * sub_title :
         * type : topic_main
         * topic_type :
         * photo :
         * extend :
         * is_show_icon : 0
         */

        private List<CategoryElementBean> category_element;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<?> getInsert_element() {
            return insert_element;
        }

        public void setInsert_element(List<?> insert_element) {
            this.insert_element = insert_element;
        }

        public List<CategoryElementBean> getCategory_element() {
            return category_element;
        }

        public void setCategory_element(List<CategoryElementBean> category_element) {
            this.category_element = category_element;
        }

        public static class BannerBean {
            private String id;
            private String title;
            private String sub_title;
            private String type;
            private String topic_type;
            private String photo;
            private String extend;
            private int index;
            private String parent_id;
            private String photo_width;
            private String photo_height;
            private int is_show_icon;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTopic_type() {
                return topic_type;
            }

            public void setTopic_type(String topic_type) {
                this.topic_type = topic_type;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getExtend() {
                return extend;
            }

            public void setExtend(String extend) {
                this.extend = extend;
            }

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getPhoto_width() {
                return photo_width;
            }

            public void setPhoto_width(String photo_width) {
                this.photo_width = photo_width;
            }

            public String getPhoto_height() {
                return photo_height;
            }

            public void setPhoto_height(String photo_height) {
                this.photo_height = photo_height;
            }

            public int getIs_show_icon() {
                return is_show_icon;
            }

            public void setIs_show_icon(int is_show_icon) {
                this.is_show_icon = is_show_icon;
            }
        }

        public static class CategoryElementBean {
            private String id;
            private String title;
            private String sub_title;
            private String type;
            private String topic_type;
            private String photo;
            private String extend;
            private int is_show_icon;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTopic_type() {
                return topic_type;
            }

            public void setTopic_type(String topic_type) {
                this.topic_type = topic_type;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getExtend() {
                return extend;
            }

            public void setExtend(String extend) {
                this.extend = extend;
            }

            public int getIs_show_icon() {
                return is_show_icon;
            }

            public void setIs_show_icon(int is_show_icon) {
                this.is_show_icon = is_show_icon;
            }
        }
    }
}
