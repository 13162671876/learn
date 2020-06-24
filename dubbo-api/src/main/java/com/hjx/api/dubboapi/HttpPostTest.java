package com.hjx.api.dubboapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpPostTest {
    void testPost(String urlStr) {
        try {
            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "text/xml");

            OutputStreamWriter out = new OutputStreamWriter(con
                    .getOutputStream());
            String xmlInfo = "<xml><body><![CDATA[test]]></body><charset><![CDATA[UTF-8]]></charset><device_info><![CDATA[WEB]]></device_info><is_raw><![CDATA[0]]></is_raw><mch_create_ip><![CDATA[1.1.1.1]]></mch_create_ip><mch_id><![CDATA[131530000003]]></mch_id><nonce_str><![CDATA[t9bcpogJNha9sKQ1Dy7GvcAoyswqZbZF]]></nonce_str><notify_url><![CDATA[http://www.weimobdev.com/wmpay/notify/channel/wepayez]]></notify_url><out_trade_no><![CDATA[609920191223000000250001]]></out_trade_no><service><![CDATA[pay.weixin.jspay]]></service><sign><![CDATA[0417CFBD5E60DE82CFBA4B6F86ECAA65]]></sign><sign_type><![CDATA[MD5]]></sign_type><total_fee><![CDATA[10]]></total_fee><version><![CDATA[2.0]]></version></xml>";
            System.out.println("urlStr=" + urlStr);
            System.out.println("xmlInfo=" + xmlInfo);
            out.write(new String(xmlInfo.getBytes("UTF-8")));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con
                    .getInputStream()));
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        String url = "https://gateway.wepayez.com/pay/gateway";
        new HttpPostTest().testPost(url);
    }
}  