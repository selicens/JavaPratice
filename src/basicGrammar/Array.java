package basicGrammar;

public class Array {
    public static void main(String[] args) {
        double[] arrayDouble = {0.5, 0.8, 20}; // 简化格式
        // double类型数组容器(byte,short,int,long,float,double)
        short st = 15;
        byte bt = 20;
        // int[] arrayInt = {10, 10.5, true, st, bt};
        // int类型数组容器可容纳(byte,short,int),不能容纳(boolean，double)
        int arrayInt2[] = {10, 20, 30};
        /** 数据类型 [] 数组名 = {}
         * 数据类型 数组名[] = {}
         * */
        // 静态初始化：数据类型[] 数组名 = new 数据类型[] {}
        int[] arrayInt3 = new int[]{10, 20, 30}; // 完整格式
        String[] arrayString = new String[]{"张三", "李四", "王五"};
        double[] arrayDouble2 = new double[]{1.93, 1.84, 1.75};
        System.out.println(arrayString); // [Ljava.lang.String;@1b6d3586, 地址值
        /* [: 表示当前是一个数组
        * @: 表示一个分隔符号*/
        int it = arrayInt2[1]; // 索引、下标、index
        System.out.println(it);
        for (int i = 0; i < arrayInt3.length - 1; i++) {
            System.out.println(arrayInt3[i]);
        }
        for (double i: arrayDouble2) {
            System.out.println(i);
        }
        // 动态初始化：数据类型[] 数组名 = new 数据类型[数组的长度]
        String[] arrayString2 = new String[10];
        System.out.println(arrayString2[0]); // null
        /* 整数类型默认初始值：0
        * 小数类型默认初始值：0.0
        * 字符类型默认初始值：/u0000 空格
        * 布尔类型默认初始值：false
        * 引用数据类型默认初始值：null*/
        /** 区别
         * 静态：手动指定数组元素
         * 动态：手动指定数组长度*/
        /**
         * 栈：方法运行时使用的内存，比如main方法执行，进入方法栈中执行
         * 堆：存储对象或数组，new来创建的，都存储在堆内存
         * 方法区 -> 元空间：存储可以运行的class文件
         * 本地方法栈：JVM在使用操作系统功能的时候使用，和我们开发无关
         * 寄存器：CPU使用，和我们开发无关
         * */
    }
}
