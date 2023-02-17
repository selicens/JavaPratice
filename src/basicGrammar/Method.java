package basicGrammar;

public class Method {
    // 方法（method）程序中最小的执行单元
    public static void main(String[] args) {
        // main程序中的主方法
        testMethod(); // 调用自定义的方法
        testMethod2(20);
    }
    public static void testMethod() {
        // 最简单的方法定义
        System.out.println("custom method");
    }
    public static void testMethod2(int value) {
        // 带参数的方法定义
        System.out.println("custom method2\t" + value);
    }
}
