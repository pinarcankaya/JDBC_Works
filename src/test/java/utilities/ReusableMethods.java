package utilities;




import java.util.concurrent.ThreadLocalRandom;


public class ReusableMethods {


    // ===== RONDOM DATA === //

    public static String getNewEmail(String email) {
        String data = "abcdefghijklmnoprstuvyzxw0123456789";
        int indexOfEt = email.indexOf("@");
        String emailFirstPart = email.substring(0, indexOfEt);
        String emailSecondPart = email.substring(indexOfEt); //@gmail.com
        String ekMail = "";
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random()*data.length());
            ekMail += data.charAt(random);
        }
        emailFirstPart = emailFirstPart + ekMail;
        email = emailFirstPart + emailSecondPart;
        return email;
    }

    public static String getNewRequestNumber(String mobileNumber) {
        String data = "0123456789";
        String numberFirstPart = mobileNumber.substring(0,mobileNumber.length()-3);
        String numberSecondPart = "";
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random()*data.length());
            numberSecondPart += data.charAt(random);
        }
        mobileNumber = numberFirstPart + numberSecondPart;

        return mobileNumber;

    }

    public static String randomMethod(int a, int ilkAscii, int sonAscii){
        String myData ="";
        for (int i=0;i<a;i++) {
            char ascii = (char) ThreadLocalRandom.current().nextInt(ilkAscii, sonAscii );
            myData =myData + ascii;
        }
        return myData;
    }
}
