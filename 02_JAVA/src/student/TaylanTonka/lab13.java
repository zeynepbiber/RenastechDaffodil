package student.TaylanTonka;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {
        frequency("labaratuvar");
    }

    public static void frequency(String a)
    {
        for(int i =0;i<a.length();i++)
        {
            int count =0;
            for(int z=0;z<a.length();z++)
            {
                if(a.charAt(i) == a.charAt(z))
                {
                    count++;
                }
            }
            System.out.println(a.charAt(i)+" =  " + count);
        }

    }
}
