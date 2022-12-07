package View;

import Controller.ToDoController;
import java.util.Scanner;

public class AddTaskView {
    public ToDoController toDoController;
    Scanner input = new Scanner(System.in);
    String task;
    String description;

    public AddTaskView(ToDoController toDoController) {
        this.toDoController = toDoController;
    }

    public void addTask(int owner) {
        System.out.print("Task Name : ");
        task = input.nextLine();
        System.out.print("Description : ");
        description = input.nextLine();
        toDoController.addTask(owner, task, description);
    }
}
