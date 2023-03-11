package basicGrammar;

import java.util.StringJoiner;

public class JavaStringJoiner {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        int[] nums = {1, 2, 3};
        for (int num : nums) {
            stringJoiner.add(num + "");
        }
        System.out.println(stringJoiner);
    }
}
