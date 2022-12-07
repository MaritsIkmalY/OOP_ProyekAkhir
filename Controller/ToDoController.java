package Controller;

import Modal.ToDo;
import Database.Database;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoController {
    public ToDo toDo;
    public Database database;
    int id = 1;

    public ToDoController(Database database) {
        this.database = database;
    }

    public void addTask(int owner, String task, String description) {
        toDo = new ToDo(id++, owner, task, description);
        database.ToDo.add(toDo);
    }

    public void showTask(int owner) {
        System.out.println("ID\t Task\t Description\t Status\t Date\t");
        for (ToDo toDo : database.ToDo) {
            if (toDo.getOwner() == owner) {
                System.out.print(toDo.getId() + "\t");
                System.out.print(toDo.getTask() + "\t");
                System.out.print(toDo.getDescription() + "\t");
                System.out.print(toString(toDo.isStatus()) + "\t");
                System.out.print(toString(toDo.getDate()) + "\t");
                System.out.println("");
            }
        }
    }

    public String toString(boolean isStatus) {
        if (isStatus == false) {
            return "Process";
        } else {
            return "Done";
        }
    }

    public String toString(LocalDateTime date) {
        DateTimeFormatter myTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(myTime);
        return formattedDate;
    }

    public boolean editTask(int id, int owner, String task, String description) {
        for (ToDo toDo : database.ToDo) {
            if (toDo.getId() == id && toDo.getOwner() == owner) {
                toDo.setTasks(task);
                toDo.setDescription(description);
                toDo.setDate();
                return true;
            }
        }
        return false;
    }

    public boolean editStatus(int id, int owner, boolean status) {
        for (ToDo toDo : database.ToDo) {
            if (toDo.getId() == id && toDo.getOwner() == owner) {
                toDo.setStatus(status);
                toDo.setDate();
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(int id, int owner) {
        int index = 0;
        for (ToDo toDo : database.ToDo) {
            if (toDo.getId() == id && toDo.getOwner() == owner) {
                database.ToDo.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

}
