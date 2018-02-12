package com.scen.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 单元测试
 * 测试Utils包中的工具类
 * Created by Scen  on 2017/9/17.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String text = bufr.readLine();
        System.out.println(text);
    }
}
