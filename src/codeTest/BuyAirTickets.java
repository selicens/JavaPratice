package codeTest;

import java.util.Scanner;

public class BuyAirTickets {
    public static void main(String[] arts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票金额");
        int ticket = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入舱位，0：头等舱，1：经济舱");
        int seat = scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                // 淡季
                System.out.println("淡");
                getPrice(ticket, seat, 0.7, 0.65);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                // 旺季
                System.out.println("旺");
                getPrice(ticket, seat, 0.9, 0.85);
                break;
            default:
                System.out.println("不在正确范围内");
        }
    }
    public static void getPrice(int num, int num2, double db1, double db2) {
        if (num == 0) {
            num2 = (int)(num * db1);
        } else {
            num2 = (int)(num * db2);
        }
        System.out.println(num2);
    }
}
