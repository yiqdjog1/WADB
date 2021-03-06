package moe.haruue.wadb.util;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import moe.haruue.util.StandardUtils;

import static android.content.Context.WIFI_SERVICE;

/**
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */

public class IPUtils {

    // 获取本地IP函数
    public static String getLocalIPAddress() {
        @SuppressLint("WifiManagerLeak") WifiManager wifiManger = (WifiManager) StandardUtils.getApplication().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManger.getConnectionInfo();
        return intToIp(wifiInfo.getIpAddress());
    }


    private static String intToIp(int i) {
        return (i & 0xFF) + "." + ((i >> 8) & 0xFF) + "." + ((i >> 16) & 0xFF) + "." + (i >> 24 & 0xFF);
    }

}
