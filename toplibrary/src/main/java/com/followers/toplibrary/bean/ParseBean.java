package com.followers.toplibrary.bean;

import java.util.List;

public class ParseBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"is_private":false,"is_first_load":true,"user_cover":"https://scontent-nrt1-1.cdninstagram.com/vp/2f7c5312484f64633e258dcc7e2c5d7c/5E41CEF1/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=scontent-nrt1-1.cdninstagram.com","user_pk":"6060192636","followers":325,"followings":2,"posts":4,"end_cursor":"","post_items":[{"like_count":0,"view_count":118,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/6c710b4bf820ebaf7e58726b382c3566/5DAA880D/t51.2885-15/sh0.08/e35/s640x640/62150296_145807826591105_2153406706936809130_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105","short_code":"BzPa9AjhsI2","is_video":true},{"like_count":177,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/18887ef92c24a9ff9c245637e30da899/5E5E801C/t51.2885-15/sh0.08/e35/s640x640/21911384_280148339165646_2641926661141954560_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=106","short_code":"BZYbZ5SDDpp","is_video":false},{"like_count":181,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/1f5c96f4746c395a5b773a9a6829a1d6/5E411CEC/t51.2885-15/e35/21909351_2368713813353033_2587001532733980672_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105","short_code":"BZYbYinj0Rd","is_video":false},{"like_count":170,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/1d08e1b1a92aaee84db5ae5612fc6104/5E4627C7/t51.2885-15/sh0.08/e35/s640x640/21909259_480861722269561_6797306506409672704_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=101","short_code":"BZYbWozjCQq","is_video":false}]}
     */

    private int code;
    private String message;
    private boolean status;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * is_private : false
         * is_first_load : true
         * user_cover : https://scontent-nrt1-1.cdninstagram.com/vp/2f7c5312484f64633e258dcc7e2c5d7c/5E41CEF1/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=scontent-nrt1-1.cdninstagram.com
         * user_pk : 6060192636
         * followers : 325
         * followings : 2
         * posts : 4
         * end_cursor :
         * post_items : [{"like_count":0,"view_count":118,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/6c710b4bf820ebaf7e58726b382c3566/5DAA880D/t51.2885-15/sh0.08/e35/s640x640/62150296_145807826591105_2153406706936809130_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105","short_code":"BzPa9AjhsI2","is_video":true},{"like_count":177,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/18887ef92c24a9ff9c245637e30da899/5E5E801C/t51.2885-15/sh0.08/e35/s640x640/21911384_280148339165646_2641926661141954560_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=106","short_code":"BZYbZ5SDDpp","is_video":false},{"like_count":181,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/1f5c96f4746c395a5b773a9a6829a1d6/5E411CEC/t51.2885-15/e35/21909351_2368713813353033_2587001532733980672_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105","short_code":"BZYbYinj0Rd","is_video":false},{"like_count":170,"view_count":0,"pic_url":"https://scontent-sin6-2.cdninstagram.com/vp/1d08e1b1a92aaee84db5ae5612fc6104/5E4627C7/t51.2885-15/sh0.08/e35/s640x640/21909259_480861722269561_6797306506409672704_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=101","short_code":"BZYbWozjCQq","is_video":false}]
         */

        private boolean is_private;
        private boolean is_first_load;
        private String user_cover;
        private String user_pk;
        private String user_name;
        private int followers;
        private int followings;
        private int posts;
        private String end_cursor;
        private List<PostItemsBean> post_items;

        public boolean isIs_private() {
            return is_private;
        }

        public void setIs_private(boolean is_private) {
            this.is_private = is_private;
        }

        public boolean isIs_first_load() {
            return is_first_load;
        }

        public void setIs_first_load(boolean is_first_load) {
            this.is_first_load = is_first_load;
        }

        public String getUser_cover() {
            return user_cover;
        }

        public void setUser_cover(String user_cover) {
            this.user_cover = user_cover;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getFollowers() {
            return followers;
        }

        public void setFollowers(int followers) {
            this.followers = followers;
        }

        public int getFollowings() {
            return followings;
        }

        public void setFollowings(int followings) {
            this.followings = followings;
        }

        public int getPosts() {
            return posts;
        }

        public void setPosts(int posts) {
            this.posts = posts;
        }

        public String getEnd_cursor() {
            return end_cursor;
        }

        public void setEnd_cursor(String end_cursor) {
            this.end_cursor = end_cursor;
        }

        public List<PostItemsBean> getPost_items() {
            return post_items;
        }

        public void setPost_items(List<PostItemsBean> post_items) {
            this.post_items = post_items;
        }

        public static class PostItemsBean {
            /**
             * like_count : 0
             * view_count : 118
             * pic_url : https://scontent-sin6-2.cdninstagram.com/vp/6c710b4bf820ebaf7e58726b382c3566/5DAA880D/t51.2885-15/sh0.08/e35/s640x640/62150296_145807826591105_2153406706936809130_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105
             * short_code : BzPa9AjhsI2
             * is_video : true
             */

            private int like_count;
            private int view_count;
            private String pic_url;
            private String short_code;
            private boolean is_video;

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public int getView_count() {
                return view_count;
            }

            public void setView_count(int view_count) {
                this.view_count = view_count;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getShort_code() {
                return short_code;
            }

            public void setShort_code(String short_code) {
                this.short_code = short_code;
            }

            public boolean isIs_video() {
                return is_video;
            }

            public void setIs_video(boolean is_video) {
                this.is_video = is_video;
            }
        }
    }
}
