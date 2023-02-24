package codeTest;

import java.util.Random;

public class VerificationCode {
    // 随机生成五位验证码
    // 前四位是大小写字母最后一位为数字
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII表
            if (i <= 25) {
                chs[i] = (char)(97 + i);
            } else {
                chs[i] = (char)(65 + i -26);
            }
        }
        for (char ch : chs) {
            System.out.print(ch);
        }
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(chs.length); // 52, 0-51
            result = result + chs[num];
           System.out.println(chs[num]);
        }
        int number = random.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}
