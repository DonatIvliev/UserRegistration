package Screens.LogInScreen;

import Screens.MainScreen.MainScreenModel;
import Screens.MainScreen.MainScreenUI;

import java.util.Scanner;

public class LoginUI {

    LoginModel model = new LoginModel();
    Scanner input = new Scanner(System.in);
    MainScreenUI main = null;


    public void login(){
        do{
            var email = inputEmail();
            var password = inputPassword();
            model.login(email, password);
            printLoginResult(model.getLoginResult());
        }
        while (model.requireLogin());
        if(model.loginSuccess()){
            main = new MainScreenUI();
        }

    }

    private String inputPassword() {
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
        if(password.length() < 6){
            System.out.println("Password must be at least 6 characters!");
        }

        return password;
    }

    private String inputEmail() {
        System.out.println("Please enter your email: ");
        String email = input.nextLine();
        if(!email.contains("@")){
            System.out.println("Email must contain @");
            return inputEmail();
        }
        return email;
    }

    private void printLoginResult(String loginResult){

        System.out.println(loginResult);

    }


}
