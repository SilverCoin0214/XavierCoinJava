package com.zuoxuan.scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.02f;

        System.out.println("请输入数据:");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("整数数据为" + i);
        } else {
            System.out.println("输入的不是整数数据!");
        }

        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("小数数据为" + f);
        } else {
            System.out.println("输入的不是小数数据!");
        }

        scanner.close();
    }
}
