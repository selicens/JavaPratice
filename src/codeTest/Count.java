package codeTest;

import java.util.Random;

public class Count {
    // 生成10位1~100随机数
    // 求所有数据之和
    // 求所有数据平均值
    // 统计有多少个数比平均数少
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100) + 1; // 0~99 => 1~100
            arr[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("和：" + sum);
        int avg = sum / arr.length;
        System.out.println("平均值：" + avg);
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + '\t');
            num = arr[i] < avg ? num+1 : num;
        }
        System.out.println("小于平均值的个数：" + num);
    }
}
