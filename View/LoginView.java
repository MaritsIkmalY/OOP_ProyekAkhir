package View;

import Controller.LoginController;
import Database.Database;

public class LoginView implements BaseView {
    public LoginController loginController;
    public LandingView landingView;
    public MainView mainView;
    String username;
    String password;

    public LoginView(Database database) {
        loginController = new LoginController(database);
        mainView = new MainView(database);
    }

    public void setLandingView(LandingView landingView) {
        this.landingView = landingView;
    }

    public void input() {
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
    }

    public void loginForm() {
        System.out.println("Login Form");
        this.input();
        if (loginController.checkUser(username, password)) {
            mainView.setUser(loginController.user);
            mainView.setLandingView(landingView);
            mainView.feature();
        } else {
            System.out.println("Wrong Username and Password Check Again\n");
            this.loginForm();
        }
    }

}
