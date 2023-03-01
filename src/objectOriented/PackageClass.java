package objectOriented;

public class PackageClass {
    public static void main(String[] args) {
        String string = "JAVA";
        System.out.println(string.length());
        System.out.println(string.toLowerCase());
        Private p = new Private();
        System.out.println(p.height);
        //System.out.println(p.name);
        String name = p.method(string);
         /** 其他类不能访问private类型的值，但可以通过公共方法暴露值拿到 */
        System.out.println(name);
    }
}
