package com.study.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost(); // 내 컴퓨터의 IP 정보를 구현한다.
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }

        try {
            InetAddress[] isArray = InetAddress.getAllByName("google.com"); // 내 컴퓨터의 IP 정보를 구현한다.
            for(InetAddress ia: isArray) {
                System.out.println(ia.getHostAddress());
            }
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }
    }
}
