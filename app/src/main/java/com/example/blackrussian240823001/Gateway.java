package com.example.blackrussian240823001;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Gateway {
    public void runTestGateway() {
        String target1 = "www.google.com";
        String target2 = "www.naver.com";

        URL targetURL = null;
        try {
            targetURL = new URL(target2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection huConnection = new HttpURLConnection(targetURL) {
            @Override
            public void disconnect() {

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
