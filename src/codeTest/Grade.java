package codeTest;

import java.util.Random;

public class Grade {
    // 6名评委评分，【0-100】之间的整数，去掉最高分、最低分，剩下四位评委的平均分
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr = getRandom(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int mean = getMean(arr);
        System.out.println(max + "<-max min->" + min);
        System.out.println((mean - max - min) / arr.length - 2);
    }
    public static int[] getRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(101);
            arr[i] = num;
        }
        return arr;
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = max > i ? max : i;
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            min = min < i ? min : i;
        }
        return min;
    }
    public static int getMean(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        return count;
    }
}
