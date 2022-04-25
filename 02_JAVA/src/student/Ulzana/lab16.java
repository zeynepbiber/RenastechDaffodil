package student.Ulzana;

public class lab16 {

    //1. Write a return method that can verify if a password is valid or not.
    //requirements:

    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false

    public static void main(String[] args) {
        System.out.println( validPassword("ULZANa1!"));
        System.out.println( validPassword("ulzana"));
        System.out.println( validPassword("ULZAN&"));
        System.out.println( validPassword("ULZANA5"));
        System.out.println( validPassword("ULZAN"));
        System.out.println( validPassword("ULZA N"));
    }

    public static boolean validPassword( String password){

        boolean result=false;

        if (password.length() >= 6 && !(password.contains(" "))) {
            for (int i = 0; i < password.length(); i++) {

            if ( (password.charAt(i)>=65  &&  password.charAt(i)<=90) &&
                    ( password.charAt(i)>=97 &&  password.charAt(i)<=122) &&
                  (( password.charAt(i)>=32 &&  password.charAt(i)<=47) && ( password.charAt(i)>=58 &&  password.charAt(i)<=64)
                && ( password.charAt(i)>=91 &&  password.charAt(i)<=96) && ( password.charAt(i)>=123 &&  password.charAt(i)<=126))
                       && ( password.charAt(i)>=48 &&  password.charAt(i)<=57))

            {result=true;}

        } }

        return result;








    }

}
