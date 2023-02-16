package leecodeTest;

import java.util.Scanner;

public class PrimeNumber {
    // 质数，只能被1和自身整除的数，否则被称为合数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                 flag = false;
                 break;
            }
        }
        System.out.println(num + (flag ? "是质数" : "不是质数"));
    }
}
