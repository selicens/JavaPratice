package codeTest;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        // 遍历数组，奇数扩大两倍，偶数变成二分之一
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num[i] = num[i] / 2;
            } else {
                num[i] = num[i] * 2;
            }
        }
        for (int i: num) {
            System.out.println(i);
        }
    }
}
