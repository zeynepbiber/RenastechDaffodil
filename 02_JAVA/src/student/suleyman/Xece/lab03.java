package student.suleyman.Xece;

public class lab03 {

    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC


    public static void main(String[] args) {

        String word = "AAABBBCCC";
        String result =  removeDup(word);

        System.out.println("String sentence is = " + word);
        System.out.println("Result is = " + result);
    }

    public static String removeDup(String sentence)
    {

        String result = "";
        for(int i =0;i<sentence.length();i++)
        {

            if(!(result.contains(""+sentence.charAt(i))))
            {
                result+=""+sentence.charAt(i);
            }
        }


        return result;
    }


}








