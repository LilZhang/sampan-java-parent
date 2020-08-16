package com.lilzh.sampan.test.lilzhmodel.util;

import java.net.InetAddress;

public class DemoUtils {

    public static String getHostName() {

        String hostName = "none";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hostName;
    }

}
