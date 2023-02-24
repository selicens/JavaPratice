package codeTest;

import java.util.Random;

public class LotteryDraw {
    // 抽奖，奖品随机不能重复
    public static void main(String[] args) {
        int[] arr = {100,200,500,700,900};
        int[] newArr = new int[arr.length];
        Random random = new Random();
        // 方式一
        for (int i = 0; i < arr.length;) {
            int num = random.nextInt(arr.length);
            if (!contains(newArr, arr[num])) {
                newArr[i] = arr[num];
                i++;
            }
        }
        // 优化
        optimize(arr);
        for (int i : newArr) {
            System.out.print(i);
        }
    }
    public static boolean contains(int[] arr, int prize) {
        // 判断prize在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
    public static void optimize(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
