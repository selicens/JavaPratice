package codeTest;

public class Exchange {
    // 交换首尾索引的元素
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(arr[i] + "\t" + arr[j]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
