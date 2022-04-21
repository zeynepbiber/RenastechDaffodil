package student.gulsumB;

public class presantation {
    public static void main(String[] args) {
   //     initilization  and itiration will be outside of while loop
     //  int i = 0; //inizilition\
 //       starting point =0
//
   //    while (i < 11) {//condition : as long as condition is true while will run 0
        //  ending point =10
    //     System.out.println("Hello world " + i); //0 1 2 3 4...10
//
       //     i++; //iteration



        //(Numbers) Divisible by 3, 5, 15
//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//ex:
//OutPut:
//Divisible By 15 15 30 45 60 75 90
//Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
        String divisibleby15 = "";
        String divisibleby3 = "";
        String divisibleby5 = "";
        int i = 1;
        while (i<= 100) {
            i++;
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleby15 +=" "+ i;
            } else if (i % 3 == 0 && i % 15 != 0) {
                divisibleby3 += " " + i;
            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleby5 += " " + i;
            }
        }
        System.out.println("divisible by 15" + "=" + divisibleby15);
        System.out.println("divisible by 3" + "=" + divisibleby3);
        System.out.println("divisible by 5" + "=" + divisibleby5);


//dowhile
//it will run once at the begining no mather your while condition is true or false
//it will continue to run if while is true
        int number=10;
        do { //do while run at least one time no mather condition is true or false
            System.out.println("do while ");

        } while (number < 10); //false

        int number2=3;
        do {
            // number2++;                                  //4 5 6 ...9 10
            System.out.println("number2 = " + number2); //3  4 5 ... 9
            number2++;

        }while (number2 < 10); //4 5

        //starting point 3
        //ending point 9
        //iteration ++
    }}