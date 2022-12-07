package View;

import Controller.ToDoController;
import java.util.Scanner;

public class DeleteTaskView {
    public ToDoController toDoController;
    Scanner input = new Scanner(System.in);
    int choose;

    public DeleteTaskView(ToDoController toDoController) {
        this.toDoController = toDoController;
    }

    public void input() {
        System.out.print("Choose Task Want To Delete : ");
        choose = input.nextInt();
        input.nextLine();
    }

    public void deleteSuccess() {
        System.out.println("Delete Success");
    }

    public void deleteFailed() {
        System.out.println("Delete Failed");
    }

    public void deleteTask(int owner) {
        this.input();
        if (toDoController.deleteTask(choose, owner)) {
            this.deleteSuccess();
        } else {
            this.deleteFailed();
        }
    }
}
