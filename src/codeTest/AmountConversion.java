package codeTest;

import java.util.Scanner;

public class AmountConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = scanner.nextInt();
            if (money > 0 && money < 99999){
                break;
            } else {
                System.out.println("无效");
            }
        }
        String moneyStr = "";
        while (true) {
            int single = money % 10;
            if (money == 0) {
                break;
            }
            moneyStr = getCapitalNumber(single) + moneyStr;
            money = money / 10;
        }
        String replenishZero = getReplenishZero(moneyStr);
        String unit = getUnit(replenishZero);
        System.out.println(replenishZero);
        System.out.println(unit);
    }
    public static String getCapitalNumber(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍"," 陆", "柒", "捌", "玖"};
        return arr[num];
    }
    public static String getReplenishZero(String money) {
        int count = 7 - money.length();
        for (int i = 0; i < count; i++) {
            money = "零" + money;
        }
        return money;
    };
    public static String getUnit(String money) {
        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < money.length(); i++) {
            char c = money.charAt(i);
            result = result + c + units[i];
        }
        return result;
    }
}
