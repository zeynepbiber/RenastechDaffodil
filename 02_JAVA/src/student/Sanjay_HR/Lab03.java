package student.Sanjay_HR;

public class Lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {
        removeDuplicate("AAABBBCCC");

    }
    public static String removeDuplicate(String str){
        String result="";
        System.out.println("String = "+str);
        for (int i = 0; i < str.length(); i++) {
            if(i+1<str.length() && str.charAt(i) !=str.charAt(str.charAt(i))){
                result+=str.charAt(i);
            }if(i+1==str.length()){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }
}
