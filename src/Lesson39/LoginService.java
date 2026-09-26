package Lesson39;

public class LoginService {
    private static final String CORRECT_PIN = "1234";
    public void loginpin(String pin) throws IncorrectPinException{
        if(CORRECT_PIN.equals(pin)){
            System.out.println("Giris tesdiqlendi");
        }
        else{
            throw  new IncorrectPinException("Parol sehvdir");
        }
    }
}
