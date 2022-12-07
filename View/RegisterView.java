package View;

import Database.Database;
import Controller.RegisterController;

public class RegisterView implements BaseView {
    public RegisterController registerController;
    String name;
    String username;
    String password;
    String phone;
    String address;

    public RegisterView(Database database) {
        registerController = new RegisterController(database);
    }

    public void input() {
        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        System.out.print("Phone : ");
        phone = input.nextLine();
        System.out.print("Address : ");
        address = input.nextLine();
    }

    public void registerForm() {
        System.out.println("Registrater Form");
        this.input();
        if (registerController.registerStore(name, username, password, phone, address))
            System.out.println("Registration Success");
        else
            System.out.println("Your Account Already Exist");
    }
}
