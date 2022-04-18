package student.gulsumB;
//Given a string, return a new string where the first and last chars have been exchanged.
public class frontBack {
    public static void main(String[] args) {
        frontback("gulsum");
        frontback("bulgan");
    }

    public static void frontback(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse.charAt(0)+name.substring(1,name.length()-1)+name.substring(0,1));
    }
}
