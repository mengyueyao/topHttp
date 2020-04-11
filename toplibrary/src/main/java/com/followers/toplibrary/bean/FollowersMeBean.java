package com.followers.toplibrary.bean;

import java.util.List;

public class FollowersMeBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"FollowersUserPk":"123123","UserName":"test","CoverImg":"http://image.biaobaiju.com/uploads/20180803/23/1533309822-GCcDphRmqw.jpg"}]
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
         * FollowersUserPk : 123123
         * UserName : test
         * CoverImg : http://image.biaobaiju.com/uploads/20180803/23/1533309822-GCcDphRmqw.jpg
         */

        private String FollowersUserPk;
        private String UserName;
        private String CoverImg;

        public String getFollowersUserPk() {
            return FollowersUserPk;
        }

        public void setFollowersUserPk(String FollowersUserPk) {
            this.FollowersUserPk = FollowersUserPk;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getCoverImg() {
            return CoverImg;
        }

        public void setCoverImg(String CoverImg) {
            this.CoverImg = CoverImg;
        }
    }
}
