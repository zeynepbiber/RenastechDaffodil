package student.gulsumB;
//(String) Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
public class lab04 {
    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String name){

        String result="";
        for (int i = 0; i < name.length(); i++) {
            int count = 0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;}}

            if (count == 1) {result+= name.charAt(i);}}
        return result;

    }

}


