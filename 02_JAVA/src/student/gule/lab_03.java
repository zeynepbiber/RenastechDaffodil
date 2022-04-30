package student.gule;
//Lab 03 -  //(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class lab_03 {

    public static void main(String[] args) { // set doesn't allow duplicate value

        System.out.println(removeDup("GGGUULLEEE"));
    }

    public static String removeDup(String remove){

        char [] test = remove.toCharArray(); //[A,A,A,B,B,B,C,C,C]
        Set<Character> name = new LinkedHashSet<>(); // LinkedHashset follows order the any data type.
        for (char ch: test) {
            name.add(ch); //[A,B,C]
        }
        String newString = "";
        for (char ch1:name) { // left side of foreach data type of the collection, right side object name of the collection.
            newString = newString+ch1;
        }
        return newString;

    }
}
