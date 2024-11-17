package Screens.LogInScreen;

import Models.User;

public class LoginModel {
    User[] users = {
            new User("Sofiia", "sofiia@gmail.com","12345"),
            new User("Denys", "denys@gmail.com","54321A"),
            new User("Sam", "sam@gmail.com","")};

    User loggedInUser = null;
    int loginAttempts = 0;
    public void login(String email, String password) {
        loginAttempts++;
        for(User user : users) {
            if(user.email.equals(email) && user.password.equals(password)) {
                loggedInUser = user;
                return;
            }
        }
        loggedInUser = null;
    }

    public String getLoginResult() {
        if(loggedInUser == null) {
            return "login failed, you have " + (3 - loginAttempts) + " attempts left.";
        }
        else{
            return loggedInUser.fullName + " logged in successfully";
        }
    }

    public boolean requireLogin() {
        return loggedInUser == null && loginAttempts < 3 ;

    }

    public boolean loginSuccess() {
        return loggedInUser != null;
    }
}


