package basicGrammar;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // 加
        int c = a + b;
        System.out.println("加：\t" + c);
        // 减
        int d = b - a;
        System.out.println("减：\t" + d);
        // 乘
        int e = a * b;
        System.out.println("乘：\t" + e);
        // 除，整数参与计算只能得到整数，小数参与计算才能得到小数
        int f = a / b;
        double g = 1.0 / 3;
        System.out.println("除-整数：\t" + f);
        System.out.println("除-小数：\t" + g);
        // 取模|取余
        int h = a % b;
        System.out.println("取模|取余：\t" + h);
        // 浮点数精度丢失
        double i = 0.1 + 0.2;
        System.out.println("浮点数精度丢失：\t" + i);
        // 自增
        System.out.println("自增：\t" + a++);
        System.out.println("自增：\t" + ++a);
        // 自减
        System.out.println("自减：\t" + b--);
        System.out.println("自减：\t" + --b);
        /* 赋值运算符
        * = 赋值
        * += 加后赋值
        * —= 减后赋值
        * *= 乘后赋值
        * /= 除后赋值
        * %= 取余后赋值
        */
        /* 关系运算符
        * ==
        * !=
        * >
        * >=
        * <
        * <=*/
        /* 逻辑运算符
        * & 与，并（并且），两边为真才为真
        * | 或，两边为假才是假
        * ^ 异或，相同为false，不同为true
        * ! 非，取反
        */
        /* 短路逻辑运算符
        * && 短路与，两边为真才为真，左边为false不再往后执行
        * || 短路或，两边为假才是假，左边为true不再往后执行
        */
        /* 三元运算符|三目运算符
        * a ? b : c
        */
        // 输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三位整数：");
        int num = scanner.nextInt();
        System.out.println("个位数：" + num % 10);
        System.out.println("十位数：" + num / 10 % 10);
        System.out.println("百位数：" + num / 100 % 10);
    }
}
