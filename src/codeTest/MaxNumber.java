package codeTest;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {13,5,22,19,42};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            System.out.println(max);
        }
    }
}
