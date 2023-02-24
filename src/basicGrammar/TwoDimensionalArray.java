package basicGrammar;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 二维数组
        // 数据类型[][] 数组名 = new 数据类型[][]{{数组1}, {数组1}}
        int[][] arr = {
                {1,2},
                {3,4}
        };
        System.out.println(arr[0][1]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        // 数据类型[][] 数组名 = new 数据类型[m][n]
        // m,n表示数组长度
        int[][] arr2 = new int[2][3];
        int[] arr3 = {4,5};
        int[] arr4 = {6,7,8};
        // 会有4个一维数组地址
        arr2[0] = arr3;
        arr2[1] = arr4;
        // 赋值后会被覆盖，原先的地址值会被垃圾回收
    }
}
