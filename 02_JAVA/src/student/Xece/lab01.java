package student.Xece;

public class lab01 {
    //(String) Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        String word = "ABCD";
        System.out.println("String word =" + word);
        String result = reverse(word);
        System.out.println("Reverse word = " + result);
    }

    public static String reverse(String word)
    {
        int lastIndex = word.length()-1;
        String result = "";

        for(int i =lastIndex;i>=0;i--)
        {
            result += word.charAt(i);
        }
        return result;
    }
}
