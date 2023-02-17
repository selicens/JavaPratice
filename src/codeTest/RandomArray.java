package codeTest;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(arr.length); // 0~4
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
