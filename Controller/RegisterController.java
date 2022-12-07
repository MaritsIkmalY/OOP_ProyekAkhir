package Controller;

import Database.Database;
import Modal.User;
import java.util.Objects;

public class RegisterController {
    public Database database;
    User user;
    int id = 1;

    public RegisterController(Database database) {
        this.database = database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public boolean registerStore(String name, String username, String password, String phone, String address) {
        for (User user : database.User) {
            if (Objects.equals(user.getUsername(), username)) {
                return false;
            }
        }
        this.user = generateUser(name, username, password, phone, address);
        this.storeToDB(this.user);
        return true;
    }

    public User generateUser(String name, String username, String password, String phone, String address) {
        return new User(id++, name, username, password, phone, address);
    }

    public void storeToDB(User user) {
        database.User.add(user);
    }
}
