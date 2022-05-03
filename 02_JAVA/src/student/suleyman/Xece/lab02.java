package student.suleyman.Xece;

public class lab02 {

    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        String str3 = "dab";
        System.out.println("abc and cab has same letters  = " + sameLetters(str1,str2));
        System.out.println("cab and dab has  same letters  = " + sameLetters(str2,str3));
    }

    public static boolean sameLetters(String a,String b)
    {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        boolean finalResult = true;
        for(int i =0;i<first.length;i++)
        {
            boolean result = false;
            for(int z=0;z<second.length;z++)
            {
                if(first[i]==second[z])
                {

                    result=true;
                }
            }
            if (result==false)
            {
                finalResult = false;

            }
        }
        return finalResult;
    }
}


