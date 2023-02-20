package codeTest;

public class MethodPrintArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArr(arr);
        int max = getMax(arr);
        System.out.println(max);
        boolean bn = contains(arr, 6);
        System.out.println(bn);
        int[] newArr = copyOfRange(arr, 1, 4);
        for (int i : newArr) {
            System.out.println(i);
        }
    }
    public static void printArr(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println(']');
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) return true;
        }
        return  false;
    }
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to-from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
