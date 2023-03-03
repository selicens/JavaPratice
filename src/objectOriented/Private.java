package objectOriented;

public class Private {
    private String name;
    private int age;
    public double height;
    public Private() {} // 构造方法-空参，不写虚拟机会自动定义一个
    public Private(int age) {} // 构造方法-有参
    /**
     * private只能在本类中被访问
     * 其他类需要使用就提供方法，用public修饰*/
    public String method(String str) {
        name = str;
        System.out.println("private与public,同一个类中public方法可以访问private" + this.name);
        return name;
    }
}
