package com.MyLiqPay;

import com.liqpay.LiqPay;

import java.util.HashMap;

public class Applicationn {


    public static void main(String[] args) {


        HashMap<String, String> params = new HashMap<String, String>();
        params.put("action", "pay");
        params.put("amount", "1");
        params.put("currency", "USD");
        params.put("description", "description text");
        params.put("order_id", "order_id_1");
        params.put("version", "3");


        LiqPay liqpay = new LiqPay("i66823577067"
                , "RUtwa6WZfpnbcgEZKANifBXc8Rz0z2usEp9a8kP9");
        String html = liqpay.cnb_form(params);
        System.out.println(html);
    }

}
