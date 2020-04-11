package com.followers.toplibrary.bean;

import java.util.List;

public class CoinsBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":6,"created_at":"2019-07-26T11:55:32+08:00","update_at":"2019-10-20T10:54:36+08:00","coin_num":120,"price":0.99,"discount":"0","title":"","tips":"","enable":"1","google_pay_id":"com.data1","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":false},{"id":5,"created_at":"2019-07-26T11:55:32+08:00","update_at":"2019-10-20T10:54:57+08:00","coin_num":400,"price":2.99,"discount":"20","title":"","tips":"","enable":"1","google_pay_id":"com.data2","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":false},{"id":4,"created_at":"2019-07-26T11:55:32+08:00","update_at":"2019-10-20T10:55:04+08:00","coin_num":1100,"price":5.99,"discount":"30","title":"","tips":"","enable":"1","google_pay_id":"com.data3","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":false},{"id":3,"created_at":"2019-07-26T11:52:08+08:00","update_at":"2019-10-20T10:57:11+08:00","coin_num":3100,"price":11.99,"discount":"50","title":"","tips":"","enable":"1","google_pay_id":"com.data4","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":false},{"id":2,"created_at":"2019-07-26T11:36:38+08:00","update_at":"2019-10-20T10:57:18+08:00","coin_num":9000,"price":21.99,"discount":"70","title":"","tips":"","enable":"1","google_pay_id":"com.data5","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":true},{"id":9,"created_at":"2019-07-26T11:36:38+08:00","update_at":"2019-10-20T10:57:18+08:00","coin_num":9000,"price":21.99,"discount":"70","title":"","tips":"","enable":"1","google_pay_id":"com.data5","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":true},{"id":7,"created_at":"2019-08-12T11:54:04+08:00","update_at":"2019-10-20T10:54:31+08:00","coin_num":26000,"price":49.99,"discount":"80","title":"","tips":"","enable":"1","google_pay_id":"com.data6","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":true},{"id":8,"created_at":"2019-08-12T11:55:17+08:00","update_at":"2019-10-20T10:59:25+08:00","coin_num":56000,"price":99.99,"discount":"90","title":"","tips":"","enable":"1","google_pay_id":"com.data7","paypal_gift_ratio":10,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0","large_payment":true}]
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
         * id : 6
         * created_at : 2019-07-26T11:55:32+08:00
         * update_at : 2019-10-20T10:54:36+08:00
         * coin_num : 120
         * price : 0.99
         * discount : 0
         * title :
         * tips :
         * enable : 1
         * google_pay_id : com.data1
         * paypal_gift_ratio : 10
         * enable_paypal : 1
         * enable_google_pay : 1
         * enable_apple_pay : 0
         * large_payment : false
         */

        private int id;
        private String created_at;
        private String update_at;
        private int coin_num;
        private double price;
        private String discount;
        private String title;
        private String tips;
        private String enable;
        private String google_pay_id;
        private int paypal_gift_ratio;
        private String enable_paypal;
        private String enable_google_pay;
        private String enable_apple_pay;
        private boolean large_payment;

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

        public int getCoin_num() {
            return coin_num;
        }

        public void setCoin_num(int coin_num) {
            this.coin_num = coin_num;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }

        public String getGoogle_pay_id() {
            return google_pay_id;
        }

        public void setGoogle_pay_id(String google_pay_id) {
            this.google_pay_id = google_pay_id;
        }

        public int getPaypal_gift_ratio() {
            return paypal_gift_ratio;
        }

        public void setPaypal_gift_ratio(int paypal_gift_ratio) {
            this.paypal_gift_ratio = paypal_gift_ratio;
        }

        public String getEnable_paypal() {
            return enable_paypal;
        }

        public void setEnable_paypal(String enable_paypal) {
            this.enable_paypal = enable_paypal;
        }

        public String getEnable_google_pay() {
            return enable_google_pay;
        }

        public void setEnable_google_pay(String enable_google_pay) {
            this.enable_google_pay = enable_google_pay;
        }

        public String getEnable_apple_pay() {
            return enable_apple_pay;
        }

        public void setEnable_apple_pay(String enable_apple_pay) {
            this.enable_apple_pay = enable_apple_pay;
        }

        public boolean isLarge_payment() {
            return large_payment;
        }

        public void setLarge_payment(boolean large_payment) {
            this.large_payment = large_payment;
        }
    }
}
