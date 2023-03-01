package objectOriented;

public class Private {
    private String name;
    private int age;
    public double height;
    /**
     * private只能在本类中被访问
     * 其他类需要使用就提供方法，用public修饰*/
    public String method(String str) {
        name = str;
        System.out.println("private与public,同一个类中public方法可以访问private");
        return name;
    }
}
