package codeTest;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = scanner.nextInt();
        String romanNumStr = "";
        while (true) {
            int single = num % 10;
            num = num / 10;
            romanNumStr = romanNumber(single) + romanNumStr;
            if (num == 0) {
                break;
            }
        }
        System.out.println(romanNumStr);
    }
    public static String romanNumber(int num) {
        String[] romanNum = {"", "Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return romanNum[num];
    }
}
