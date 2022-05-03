package student.Sanjay_HR;

public class Lab16 {
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    public static void main(String[] args) {
        passwordValidCheck("SkuNthole42069!!");
    }
    public static String passwordValidCheck(String password){
        String result="Valid Password--True";
        int numCount=0, upperCount=0, lowerCount=0, specialCount=0;
        if(password.length()<=6 && !password.contains(" ")){
            result="Password is invalid";
        }else{
            for (int i = 0; i < password.length(); i++) {
                if((password.charAt(i)>=33 && password.charAt(i)<=48) ||
                    (password.charAt(i)>=47 && password.charAt(i)<=58) ||
                    (password.charAt(i)>=64 && password.charAt(i)<=91) ||
                    (password.charAt(i)>=97 && password.charAt(i)<=122))
                    if((password.charAt(i)>38 && password.charAt(i)<48)){
                        specialCount++;
                    }else if(password.charAt(i)>47 && password.charAt(i)<58){
                        numCount++;
                    }else if(password.charAt(i)>64 && password.charAt(i)<91) {
                        upperCount++;
                    }else if(password.charAt(i)>97 && password.charAt(i)<122) {
                        lowerCount++;
                    }
            }
            if((specialCount<2) || (numCount<2) || (upperCount<2) || (lowerCount<2)){
                result="Not enough characters";
            }
            System.out.println(result);
        }return result;
    }
}
