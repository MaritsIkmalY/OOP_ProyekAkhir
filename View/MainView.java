package View;

import Modal.*;
import Database.Database;
import Controller.ToDoController;

// import Controller.ToDoController;

public class MainView implements BaseView {
    public User user;
    public LandingView landingView;
    public ToDoController toDoController;
    public AddTaskView addTaskView;
    public EditTaskView editTaskView;
    public DeleteTaskView deleteTaskView;
    public Database database;
    int choose;

    public MainView(Database database) {
        toDoController = new ToDoController(database);
        addTaskView = new AddTaskView(toDoController);
        editTaskView = new EditTaskView(toDoController);
        deleteTaskView = new DeleteTaskView(toDoController);
        this.database = database;
    }

    public void setLandingView(LandingView landingView) {
        this.landingView = landingView;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void sideBar() {
        System.out.println(" ");
        System.out.println(user.getName() + "(" + user.getId() + ")");
        System.out.println("1. Show To Do List");
        System.out.println("2. Add To Do List");
        System.out.println("3. Edit To Do List");
        System.out.println("4. Delete To Do List");
        System.out.println("5. Show User Profile");
        System.out.println("6. Logout");
    }

    public void input() {
        System.out.print("Choose : ");
        choose = input.nextInt();
        input.nextLine();
    }

    public void routing() {
        switch (choose) {
            case 1:
                toDoController.showTask(user.getId());
                this.feature();
                break;
            case 2:
                addTaskView.addTask(user.getId());
                this.feature();
                break;
            case 3:
                toDoController.showTask(user.getId());
                editTaskView.editOption(user.getId());
                this.feature();
                break;
            case 4:
                toDoController.showTask(user.getId());
                deleteTaskView.deleteTask(user.getId());
                this.feature();
                break;
            case 5:
                user.showProfile();
                this.feature();
                break;
            case 6:
                this.user = null;
                landingView.landingPage(landingView);
                break;
            default:
                System.out.println("Wrong Choose");
        }
    }

    public void feature() {
        this.sideBar();
        this.input();
        this.routing();
    }
}
