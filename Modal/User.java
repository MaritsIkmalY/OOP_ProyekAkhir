package Modal;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String address;

    public User(int id, String name, String username, String password, String phone, String address) {
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setPhone(phone);
        this.setAddress(address);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showProfile() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phone);
        System.out.println("Address : " + this.address);
    }

}
