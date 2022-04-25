package student.Ulzana;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters





    public static String frequency(String word){

        String result="";
        for (int i = 0; i < word.length(); i++) {
          int count=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;}

            }result += word.charAt(i)+count+" ";
        }
        return result;
    }
}
