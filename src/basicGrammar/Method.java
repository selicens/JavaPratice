package basicGrammar;

public class Method {
    // 方法（method）程序中最小的执行单元
    public static void main(String[] args) {
        // main程序中的主方法
        testMethod(); // 调用自定义的方法
        testMethod2(20, 30);
        System.out.println(testMethod3(10,20));
    }
    public static void testMethod() {
        // 最简单的方法定义
        System.out.println("custom method");
    }
    public static void testMethod2(int value, int value2) {
        // 带参数的方法定义
        System.out.println("custom method2\t" + value + value2);
    }
    public static int testMethod3(int num, int num2) {
        // 带返回值的方法定义
        return num + num2;
    }
}
