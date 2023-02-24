package codeTest;

import java.util.Random;
import java.util.Scanner;

public class DichromaticSphere {
    public static void main(String[] args) {
        // 双色球，6个红球，1个蓝球
        // 红球不能重复(1-33)，蓝球可以和红球重复(1-16)
        int[] userNum = userInputNum();
        System.out.println("\n");
        int[] winningNum = createNum();
        System.out.println("\n");
        compare(winningNum, userNum);
    }
    public static int[] userInputNum() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 6;) {
            System.out.print("请输入红球号码" + (i + 1));
            int num = scanner.nextInt();
            if (num >=1 && num <= 33) {
                if (!isRedNum(arr, num)) {
                    arr[i] = num;
                    i++;
                } else {
                    System.out.print("已存在请重新输入");
                }
            } else {
                System.out.print("不在范围内请重新输入");
            }
        }
        while (true) {
            System.out.print("请输入蓝球号码");
            int blueNum = scanner.nextInt();
            if (blueNum >= 1 && blueNum <=16) {
                arr[6] = blueNum;
                break;
            } else {
                System.out.print("不在范围内请重新输入");
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }
    public static int[] createNum() {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < 6;) {
            int num = random.nextInt(33) + 1;
            if (!isRedNum(arr, num)) {
                arr[i] = num;
                i++;
            }
        }
        int blueNum = random.nextInt(16) + 1;
        arr[6] = blueNum;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }
    public static boolean isRedNum(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return  true;
        }
        return false;
    }
    public static void compare(int[] arr, int[] arr2) {
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < arr2.length -1; i++) {
            int redNum = arr2[i];
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] == redNum) {
                    redCount++;
                }
            }
        }
        int blueNum = arr2[6];
        if (blueNum == arr[6]) {
            blueCount++;
        }
        System.out.println("red" + redCount + "blue" + blueCount);
        switch (redCount) {
            case 1:
            case 2:
            case 3:
                System.out.print("$5");
                break;
            case 4:
                if (blueCount == 0) {
                    System.out.print("$10");
                } else {
                    System.out.print("$200");
                }
                break;
            case 5:
                if (blueCount == 0) {
                    System.out.print("$200");
                } else {
                    System.out.print("$3000");
                }
                break;
            case 6:
                if (blueCount == 0) {
                    System.out.print("$5000000");
                } else {
                    System.out.print("$10000000");
                }
                break;
            default :
                if (blueCount == 0) {
                    System.out.print("谢谢惠顾");
                } else {
                    System.out.print("$5");
                }
        }
    }
}
