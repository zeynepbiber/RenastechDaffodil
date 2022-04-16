package student.Ulzana;

public class lab01 {
  //  ## Lab 01 - //(String) Reverse
  //Write a return method that can reverse  String
  // Ex: Reverse("ABCD"); ==> DCBA
  public static void main(String[] args) {
      System.out.println(reverseString("Java"));

  }
   public static String reverseString(String word){
      String result="";
         for (int i = word.length()-1;   i >=0;   i--) {
              result += word.charAt(i);}
       System.out.println("Entered word : "+word+ ". Reversed : ");
      return result;
  }
}
