package codeTest;

public class ShieldPhone {
    public static void main(String[] args) {
        String phone = "18782537831";
        String firstTreeNum = phone.substring(0, 3);
        String lastFourNum = phone.substring(7);
        System.out.println(firstTreeNum + "****" + lastFourNum);
    }
}
