package student.gulsumB;
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
public class returnMethod_reverse {
    public static void main(String[] args) {
       reverse("ABCD");
    }


    public static void reverse(String word) {
        String reverseword="";
        for (int i =word.length()-1; i>=0 ; i--) {
            reverseword+=word.charAt(i);


        } System.out.println(reverseword);
    }

    }
