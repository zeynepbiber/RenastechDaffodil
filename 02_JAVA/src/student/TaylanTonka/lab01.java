package student.TaylanTonka;

public class lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
    String sample = "ABCD";
    String result = reverse(sample);
        System.out.println("result = " + result);


    }

    public static String reverse(String a)
    {
        int lastIndex = a.length()-1;
        String result = "";

        for(int i =lastIndex;i>=0;i--)
        {
            result += a.charAt(i);
        }
        return result;
    }

}
