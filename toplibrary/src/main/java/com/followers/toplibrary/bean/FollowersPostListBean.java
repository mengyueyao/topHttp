package com.followers.toplibrary.bean;

import java.util.List;

public class FollowersPostListBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":33,"UserPk":"123123","UserName":"test","Url":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","Img":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","TotalViewCount":0,"Remark":"test","IsShow":true,"update_at":"2020-04-10T17:28:01+08:00","CreatedAt":"2020-04-10T17:28:01+08:00"},{"id":34,"UserPk":"123123","UserName":"test","Url":"http://www.17qq.com/img_qqtouxiang/89913990.jpeg","Img":"http://www.17qq.com/img_qqtouxiang/89913990.jpeg","TotalViewCount":0,"Remark":"test","IsShow":true,"update_at":"2020-04-10T17:37:45+08:00","CreatedAt":"2020-04-10T17:37:45+08:00"}]
     */

    private int code;
    private String message;
    private boolean status;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 33
         * UserPk : 123123
         * UserName : test
         * Url : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg
         * Img : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg
         * TotalViewCount : 0
         * Remark : test
         * IsShow : true
         * update_at : 2020-04-10T17:28:01+08:00
         * CreatedAt : 2020-04-10T17:28:01+08:00
         */

        private int id;
        private String UserPk;
        private String UserName;
        private String Url;
        private String Img;
        private int TotalViewCount;
        private String Remark;
        private boolean IsShow;
        private String update_at;
        private String CreatedAt;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserPk() {
            return UserPk;
        }

        public void setUserPk(String UserPk) {
            this.UserPk = UserPk;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String Url) {
            this.Url = Url;
        }

        public String getImg() {
            return Img;
        }

        public void setImg(String Img) {
            this.Img = Img;
        }

        public int getTotalViewCount() {
            return TotalViewCount;
        }

        public void setTotalViewCount(int TotalViewCount) {
            this.TotalViewCount = TotalViewCount;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String Remark) {
            this.Remark = Remark;
        }

        public boolean isIsShow() {
            return IsShow;
        }

        public void setIsShow(boolean IsShow) {
            this.IsShow = IsShow;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
        }

        public String getCreatedAt() {
            return CreatedAt;
        }

        public void setCreatedAt(String CreatedAt) {
            this.CreatedAt = CreatedAt;
        }
    }
}
