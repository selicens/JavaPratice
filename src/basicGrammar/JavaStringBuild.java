package basicGrammar;

public class JavaStringBuild {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        // StringBuild是Java已经写好的类，底层做了一些特殊处理，打印对象不是地址值
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb2.reverse());
        stringBuilder.append("asd");
        System.out.println(stringBuilder.toString());

        // StringBuild使用场景：字符串拼接、反转
    }
}
