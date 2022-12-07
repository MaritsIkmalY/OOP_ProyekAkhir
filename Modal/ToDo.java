package Modal;

import java.time.LocalDateTime;

public class ToDo {
    private int id;
    private int owner;
    private String task;
    private String description;
    private boolean status;
    private LocalDateTime date;

    public ToDo(int id, int owner, String task, String description) {
        setId(id);
        setOwner(owner);
        setTasks(task);
        setDescription(description);
        setStatus(false);
        setDate();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner() {
        return this.owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getTask() {
        return this.task;
    }

    public void setTasks(String task) {
        this.task = task;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate() {
        this.date = LocalDateTime.now();
    }

}
