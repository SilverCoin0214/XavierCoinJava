package com.zuoxuan.scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收:");

        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("輸出的內容為:"+str);
        }

        scanner.close();
    }

}
