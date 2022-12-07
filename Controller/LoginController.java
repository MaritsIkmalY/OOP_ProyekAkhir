package Controller;

import View.LoginView;
import Database.Database;
import java.util.Objects;
import Modal.User;

public class LoginController {
    public LoginView loginView;
    public Database database;
    public User user;

    public LoginController(Database database) {
        this.database = database;
    }

    public boolean checkUser(String username, String password) {
        for (User user : database.User) {
            if (Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password)) {
                setUser(user);
                return true;
            }
        }
        return false;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
