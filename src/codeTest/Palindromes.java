package leecodeTest;

public class Palindromes {
    // 找回文数 121，正反都一样的数
    public static void main(String[] args) {
        int x = 12345; // 定义一个值
        int temp = x; // 定义一个临时变量记录x的值，用于最后的比较
        int num = 0; // 记录翻转过来的值

        while (x != 0) {
           // 从右往左获取每一个数字
            int g = x % 10;
            System.out.println("个位数：" + g);
            // 修改x的值，x / 10后下次的值会往左移一位
            x = x / 10;
            System.out.println("x-update：" + x);
            // 把当前获取到的数拼接到最右边,*10是为了防止1+2=3的情况
            num = num  * 10 + g;
            System.out.println("num-update：" + num);
        }
        System.out.println(num == temp); // 是回文数为true，反之为false
    }
}
