package student.TaylanTonka;

import java.util.Arrays;

public class lab07 {
    public static void main(String[] args) {
        //Write a return method that can concate two arrays
        String[] first = {"a","b","cd","e"};
        String[] second = {"f","e","gh","j"};
        String[] newArr = concat(first,second);
        System.out.println("newArr = " + Arrays.toString(newArr));
    }
    public static String[] concat(String[] a,String[] b)
    {
        String[] newArr = new String[a.length+b.length];
        int count = 0;
        for(int i =0;i<a.length;i++)
        {
            newArr[count] = a[i];
            count++;
        }
        for(int z =0;z<a.length;z++)
        {
            newArr[count] = b[z];
            count++;
        }
        return newArr;
    }

}
