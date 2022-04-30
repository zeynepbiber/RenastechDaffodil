package student.engin;

import java.util.ArrayList;

public class lab14_ {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {


        String str = "abc123nm";

        char[] ch=new char[];
        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);
        }
        System.out.println(ch);
    }
}