package View;

import Controller.ToDoController;
import java.util.Scanner;

public class EditTaskView {
    public ToDoController toDoController;
    Scanner input = new Scanner(System.in);
    boolean status;
    int choose;
    String task;
    String description;

    public EditTaskView(ToDoController toDoController) {
        this.toDoController = toDoController;
    }

    public void option() {
        System.out.println("1. Edit Task");
        System.out.println("2. Edit Status");
    }

    public void choose() {
        System.out.print("Choose : ");
        choose = input.nextInt();
        input.nextLine();
    }

    public void routing(int owner) {
        switch (choose) {
            case 1:
                this.editTask(owner);
                break;
            case 2:
                this.editStatus(owner);
                break;
            default:
                System.out.println("Wrong Choose");
        }
    }

    public void editOption(int owner) {
        this.option();
        this.choose();
        this.routing(owner);
    }

    public void editSuccess() {
        System.out.println("Edit Success");
    }

    public void editFailed() {
        System.out.println("Edit Failed");
    }

    public void editTask(int owner) {
        System.out.print("Choose Task Want To Edit : ");
        choose = input.nextInt();
        input.nextLine();
        System.out.print("Edit Task : ");
        task = input.nextLine();
        System.out.print("Edit Description : ");
        description = input.nextLine();
        if (toDoController.editTask(choose, owner, task, description)) {
            this.editSuccess();
        } else {
            this.editFailed();
        }
    }

    public void editStatus(int owner) {
        System.out.print("Choose Task Want To Change the Status : ");
        choose = input.nextInt();
        input.nextLine();
        System.out.print("Edit Status : ");
        status = input.nextBoolean();
        input.nextLine();
        if (toDoController.editStatus(choose, owner, status)) {
            this.editSuccess();
        } else {
            this.editFailed();
        }
    }
}
