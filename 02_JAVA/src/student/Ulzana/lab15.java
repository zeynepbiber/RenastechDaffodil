package student.Ulzana;

import java.util.Arrays;

public class lab15 {

    public static void main(String[] args) {

   //  Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
   //  sort the individual string and append them back together
   //  Input:  "DC501GCCCA098911"    OutPut: "CD015ACCCG011899"

        String name="DC501GCCCA098911";
        String newString="";
        String newString1="";

        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)>57){
                newString +=""+name.charAt(i);
                System.out.println("name = " + name.charAt(i));
                if (name.charAt(i)<=47 && name.charAt(i)>=57 ){
                    newString1+=""+name.charAt(i);
                    System.out.println("name.charAt(i)IFFFF = " + name.charAt(i));

                }


            }


        }
        System.out.println(newString);
        System.out.println(newString1);

    }

}
