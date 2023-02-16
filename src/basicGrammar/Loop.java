package com.company;

public class Loop {
    public static void main(String[] args) {
        // for循环
        for (int i = 0; i <= 4; i++){
            System.out.println("hello\t" + i);
        }
        // while循环
        int j = 5;
        while (j < 10) {
            System.out.println("world\t" + j);
            j++;
        }
        // do..while循环
        int k = 10;
        do {
            System.out.println("java\t" + k);
            k++;
        } while (k < 15);
        // for循环增强
        int [] numbers = {10, 20, 30};
        String [] strings = {"张三", "李四", "王五"};
        for (int n : numbers) {
            System.out.println("\t" + n);
        }
        for (String s : strings) {
            System.out.println("\t" + s);
        }
        // break与continue关键字
        for (int b: numbers) {
            if (b == 20) {
                break;
            }
            System.out.println("遇break停止：" + b);
        }
        for (int c: numbers) {
            if (c == 20) {
                continue;
            }
            System.out.println("遇continue跳过：" + c);
        }
    }
}
