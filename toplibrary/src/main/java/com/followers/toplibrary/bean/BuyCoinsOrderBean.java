package com.followers.toplibrary.bean;

import java.util.List;

public class BuyCoinsOrderBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":9,"created_at":"2020-04-10T17:06:29+08:00","update_at":"2020-04-10T17:11:23+08:00","user_pk":"123123","user_name":"test","product_id":6,"token":"","pay_status":1,"pay_type":1,"pay_no":"PAYID-L2IDODQ2CR24264TK730103F","pay_price":0.99,"coin_count":132,"paypal_gift_ratio":10,"large_payment":false,"payment_id":"6V180051GT7207210"}]
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
         * id : 9
         * created_at : 2020-04-10T17:06:29+08:00
         * update_at : 2020-04-10T17:11:23+08:00
         * user_pk : 123123
         * user_name : test
         * product_id : 6
         * token :
         * pay_status : 1
         * pay_type : 1
         * pay_no : PAYID-L2IDODQ2CR24264TK730103F
         * pay_price : 0.99
         * coin_count : 132
         * paypal_gift_ratio : 10
         * large_payment : false
         * payment_id : 6V180051GT7207210
         */

        private int id;
        private String created_at;
        private String update_at;
        private String user_pk;
        private String user_name;
        private int product_id;
        private String token;
        private int pay_status;
        private int pay_type;
        private String pay_no;
        private double pay_price;
        private int coin_count;
        private int paypal_gift_ratio;
        private boolean large_payment;
        private String payment_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
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

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public int getPay_type() {
            return pay_type;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public double getPay_price() {
            return pay_price;
        }

        public void setPay_price(double pay_price) {
            this.pay_price = pay_price;
        }

        public int getCoin_count() {
            return coin_count;
        }

        public void setCoin_count(int coin_count) {
            this.coin_count = coin_count;
        }

        public int getPaypal_gift_ratio() {
            return paypal_gift_ratio;
        }

        public void setPaypal_gift_ratio(int paypal_gift_ratio) {
            this.paypal_gift_ratio = paypal_gift_ratio;
        }

        public boolean isLarge_payment() {
            return large_payment;
        }

        public void setLarge_payment(boolean large_payment) {
            this.large_payment = large_payment;
        }

        public String getPayment_id() {
            return payment_id;
        }

        public void setPayment_id(String payment_id) {
            this.payment_id = payment_id;
        }
    }
}
