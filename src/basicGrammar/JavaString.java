package basicGrammar;

public class JavaString {
    public static void main(String[] args) {
        String str1 = new String("s1");
        String str2 = "s1";
        System.out.println(str1 == str2);
        // 因为str1是栈区的地址值
        System.out.println(str1.equals(str2));
        boolean b = str1.equalsIgnoreCase(str2);
        System.out.println(b);
    }
}
