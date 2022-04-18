package student.gulsumB;
//Write a Java program to find the largest and smallest element of an array.
public class Array_largestToSmallest {
    public static void main(String[] args) {
        int [] num={15,60,53,-85,500,1200,5};
        int max=num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }

        }
        System.out.println("max number =" +max);
        System.out.println("min number =" +min);
    }
}
