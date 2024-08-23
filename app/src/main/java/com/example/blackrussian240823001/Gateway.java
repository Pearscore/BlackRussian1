package com.example.blackrussian240823001;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Gateway {
    public void runTestGateway() {
        String target1 = "www.google.com";
        String target2 = "www.naver.com";
        String target3 = "www.kakao.com";

        URL targetURL = null;
        try {
            targetURL = new URL(target2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection huConnection = new HttpURLConnection(targetURL) {
            @Override
            public void disconnect() {
                // make change in work-on-office
            }

            @Override
            public boolean usingProxy() {
                return false;
            }

            @Override
            public void connect() throws IOException {

            }
        };
    }
}
