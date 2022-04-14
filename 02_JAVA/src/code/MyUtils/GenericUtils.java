package code.MyUtils;

import java.util.Arrays;

public class GenericUtils {

    //print a hello
    public static void hello(){
        System.out.println("Hello Hello");
    }

    //reverse a string
    public static void reverseString(String name){
        String reversedResult="";

        for (int i =name.length() -1 ; i >=0 ; i--){
            reversedResult += name.charAt(i);
        }

        System.out.println("reversedResult = " + reversedResult);
    }

    public static void Stars(){
        System.out.println("*************************************");
    }

    //create a  method that will will print array in descending order
    public static void descendingSort(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        System.out.println(Arrays.toString(descArr));
    }

    //create a return method that will print array in descending order
    //logic is to take an array and return that array in descending order
    //that means my return type is int []
    public static int [] descendingSort2(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        return descArr;
    }

}
