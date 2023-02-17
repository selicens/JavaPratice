package codeTest;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10); // 0-9
        int count = 0;
        while (true) {
            System.out.println("请输入0-10整数");
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            count++;
            if (count == 3) {
                System.out.println("保底，随机数是" + num);
                break;
            }
            if (guessNum > num) {
                System.out.println("big");
            } else if (guessNum < num) {
                System.out.println("small");
            } else {
                System.out.println("yeah");
                break;
            }
        }
    }
}
