package Lesson39;

public class Main {
    public static void main(String[] args){
        LoginService loginService = new LoginService();
        try{
            System.out.println("passwordu yoxla");
            loginService.loginpin("12564");
        }
        catch (IncorrectPinException e){
            System.out.println("Xeta:" + e.getMessage());
        }
    }
}
