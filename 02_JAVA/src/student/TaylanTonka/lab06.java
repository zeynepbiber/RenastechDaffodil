package student.TaylanTonka;

public class lab06 {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] arr = {1,2,64,-123213,6};
        int max = findMax(arr);
        System.out.println("max = " + max);

    }
    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
