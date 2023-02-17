package basicGrammar;
import java.util.Scanner;
public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入0-100的分数：");
        int num = scanner.nextInt();
        int status = 0;
        if (num > 0 && num <=100) {
            if (num > 20 && num <= 60) {
                System.out.println("成绩一般");
            } else if (num > 60  && num <= 80) {
                System.out.println("成绩还行");
                status = 1;
            } else {
                System.out.println("成绩不错");
                status = 2;
            }
        } else {
            System.out.println("不在0-100范围内");
        }
        switch (status) {
            case 1:
                System.out.println("继续加油");
                break;
            case 2:
                System.out.println("保持继续");
                break;
            default:
                System.out.println("打一顿就好");
                break;
        }
        /* case穿透
        * 1. case 0:
        *    case 1:
        *    case 2:....
        * 2. case 0,1,2: ...*/
        /** jdk12及以上
         * switch(value) {
         *     case 1 -> {
         *     // 不用写break来停止
         *     // 只有一行代码时可以省略花括号
         *     }
         *     case 2 -> 。。。。
         * */
    }
}
