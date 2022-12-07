package View;

import Controller.LandingController;

public class LandingView implements BaseView {
    public AboutUsView aboutUsView;
    public LoginView loginView;
    public RegisterView registerView;
    public LandingController landingController;
    public LandingView landingView;
    int choose;

    public LandingView() {
        landingController = new LandingController();
        aboutUsView = new AboutUsView();
        registerView = new RegisterView(landingController.database);
        loginView = new LoginView(landingController.database);
    }

    public void navBar() {
        System.out.print("DoIT\t");
        System.out.print("1. About Us\t");
        System.out.print("2. Login\t");
        System.out.print("3. Register\t");
        System.out.print("4. Exit Application\t\n");
    }

    public void input() {
        System.out.print("Choose : ");
        choose = input.nextInt();
        input.nextLine();
    }

    public void choosingRoute() {
        switch (choose) {
            case 1:
                aboutUsView.descriptionApp();
                this.landingPage(landingView);
                break;
            case 2:
                loginView.setLandingView(landingView);
                loginView.loginForm();
                break;
            case 3:
                registerView.registerForm();
                this.landingPage(landingView);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Choose");
        }
    }

    public void setLandingView(LandingView landingView) {
        this.landingView = landingView;
    }

    public void landingPage(LandingView landingView) {
        this.setLandingView(landingView);
        this.navBar();
        this.input();
        this.choosingRoute();
    }
}
