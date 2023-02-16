package leecodeTest;
import java.util.Scanner;
public class SquareRoot {
    // 求平方根
    /* 10
    1 * 1 = 1 < 10
    2 * 2 = 4 < 10
    3 * 3 = 9 < 10
    4 * 4 = 16 > 10
    推断：10的平方根在3-4之间 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            // i * i > num || i * i = num
            if (i * i == num) {
                System.out.println(i + "是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "是" + num + "的平方根");
                break;
            }
        }
    }
}
