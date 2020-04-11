package com.followers.toplibrary.bean;

import java.util.List;

public class TopLikesPostBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":7,"UserPk":"123123","UserName":"test","BeforeId":33,"Url":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","Img":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","TotalViewCount":0,"IsShow":false,"Remark":"test","ExpirationTime":"2020-04-10T17:31:01+08:00","update_at":"2020-04-10T17:28:01+08:00","CreatedAt":"2020-04-10T17:28:01+08:00","IsLike":0},{"id":6,"UserPk":"1234","UserName":"chenjia1992","BeforeId":32,"Url":"sdhjkwer234jksdf","Img":"https://baidu.com","TotalViewCount":0,"IsShow":false,"Remark":"😊😂🚗哈哈hahah","ExpirationTime":"2020-04-10T14:21:09+08:00","update_at":"2020-04-10T14:18:09+08:00","CreatedAt":"2020-04-10T14:18:09+08:00","IsLike":0},{"id":3,"UserPk":"1234","UserName":"chenjia1993","BeforeId":8,"Url":"sdhjkwer234jksdf","Img":"https://baidu.com","TotalViewCount":21,"IsShow":false,"Remark":"18😊😂🚗哈哈hahah","ExpirationTime":"2020-04-06T20:58:59+08:00","update_at":"2020-04-06T20:57:59+08:00","CreatedAt":"2020-04-06T20:57:59+08:00","IsLike":0}]
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
         * id : 7
         * UserPk : 123123
         * UserName : test
         * BeforeId : 33
         * Url : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg
         * Img : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg
         * TotalViewCount : 0
         * IsShow : false
         * Remark : test
         * ExpirationTime : 2020-04-10T17:31:01+08:00
         * update_at : 2020-04-10T17:28:01+08:00
         * CreatedAt : 2020-04-10T17:28:01+08:00
         * IsLike : 0
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
        private int IsLike;

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

        public int getIsLike() {
            return IsLike;
        }

        public void setIsLike(int IsLike) {
            this.IsLike = IsLike;
        }
    }
}
