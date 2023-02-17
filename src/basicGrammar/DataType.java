package basicGrammar;

public class DataType {
    public static void main(String[] args) {
        // 类型 变量名 = 变量值
        // 整数
        byte be = 10;
        short st = 11;
        int it = 12;
        long lg = 13L; // long类型数据值后需要加一个l作为后缀，不区分大小写，但为了方便和数字1区分，建议大写
        // 小数|浮点数
        float ft = 0.14F; // float类型数据值后需要加一个F作为后缀,不区分大小写
        double de = 0.15;
        /**
         * 取值范围：byte < short < int < long < float < double
         * 隐式转换： 数据类型不一样，不能进行计算，需要转成一样的
         * 转换规则1： 取值范围小的会提升为取值范围大的类型，然后进行运算
         * 转换规则2： byte、short、char在运算时会直接提升为int，然后再进行运算
         * byte, short, char —> int —> long —> float —> double
         * */
        long a = st + lg;
        int b = be + it;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        /** 强制转换 */
        int c = (int)(ft + de);
        System.out.println("c:" + c);
        // 字符
        char cr = '1';
        // 布尔
        boolean bn = true;
    }
}
