package codeTest;

public class EncryptionAndDecryption {
    public static void main(String[] args) {
        int[] arr = {1,9,8,3};
        // 加密数字，每位数加5，再对10求余，再将所有数字翻转
        int encryptionNum = encryption(arr);
        System.out.println("加密：" + encryptionNum);
        // 解密数字
        int decryptionNum = decryption(encryptionNum);
        System.out.println("\n解密：" + decryptionNum);
    }
    public static int encryption(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int num = 0;
        for (int i : arr) {
            num = num * 10 + i;
        }
        return num;
    }
    public static int decryption(int num) {
        int temp = num;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp % 10;
            temp = temp / 10;
            System.out.println(arr[i]);
        }
        // 由于加密是通过对10取余，解密需要判断0~4之间+10，5~9不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
            System.out.print(arr[i] + "<-对取余进行反向");
        }
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
            num2 = num2 * 10 + arr[i];
        }
        return num2;
    }
}
