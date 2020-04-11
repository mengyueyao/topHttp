package com.followers.toplibrary.bean;

import java.util.List;

public class TopFollowersPostBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"UserPk":"123123","UserName":"test","BeforeId":1,"Url":"www.baidu.com","Img":"www.baidu.com","TotalViewCount":0,"IsShow":false,"Remark":"test follower","ExpirationTime":"2020-04-11T17:49:08+08:00","update_at":"2020-04-11T17:49:08+08:00","CreatedAt":"2020-04-11T17:49:08+08:00","IsFollowers":0}]
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
         * id : 1
         * UserPk : 123123
         * UserName : test
         * BeforeId : 1
         * Url : www.baidu.com
         * Img : www.baidu.com
         * TotalViewCount : 0
         * IsShow : false
         * Remark : test follower
         * ExpirationTime : 2020-04-11T17:49:08+08:00
         * update_at : 2020-04-11T17:49:08+08:00
         * CreatedAt : 2020-04-11T17:49:08+08:00
         * IsFollowers : 0
         */

        private int id;
        private String UserPk;
        private String UserName;
        private int BeforeId;
        private String Url;
        private String Img;
        private int TotalViewCount;
        private boolean IsShow;
        private String Remark;
        private String ExpirationTime;
        private String update_at;
        private String CreatedAt;
        private int IsFollowers;

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

        public int getBeforeId() {
            return BeforeId;
        }

        public void setBeforeId(int BeforeId) {
            this.BeforeId = BeforeId;
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

        public boolean isIsShow() {
            return IsShow;
        }

        public void setIsShow(boolean IsShow) {
            this.IsShow = IsShow;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String Remark) {
            this.Remark = Remark;
        }

        public String getExpirationTime() {
            return ExpirationTime;
        }

        public void setExpirationTime(String ExpirationTime) {
            this.ExpirationTime = ExpirationTime;
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

        public int getIsFollowers() {
            return IsFollowers;
        }

        public void setIsFollowers(int IsFollowers) {
            this.IsFollowers = IsFollowers;
        }
    }
}
