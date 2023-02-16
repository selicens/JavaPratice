package leecodeTest;

public class QuotientAndRemainder {
    // 不用除和取模|取余得到商数和余数
    // 被除数 / 除数 = 商数.余数
   /* int a = 100;
    int b = 10;
    100 - 10 = 90;
    90 - 10 = 80;
    ...
    10 - 10 = 0;
    商        余*/
    public static void main(String[] args) {
        int dividend = 100; // 定义变量记录被除数
        int divisor = 10; // 定义变量记录除数
        int count = 0; // 统计减的次数
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商：" + count);
        System.out.println("余：" + dividend);
    }
 }
