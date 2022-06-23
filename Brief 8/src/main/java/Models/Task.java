package Models;

import javafx.beans.binding.BooleanExpression;

import java.time.LocalDate;

public class Task {

    private int ID_task;
    private String Title;
    private String Description;
    private String Status;
    private LocalDate Deadline;
    private int ID_Category;


    public int getID_task() {
        return ID_task;
    }
    public void setID_task(int iD_task) {
        ID_task = iD_task;
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDeadline() {
        return Deadline;
    }
    public void setDeadline(LocalDate deadline) {
        Deadline = deadline;
    }

    public int getID_Category() {
        return ID_Category;
    }
    public void setID_Category(int iD_Category) {
        ID_Category = iD_Category;
    }


    public Task() {}
    public Task(int iD_task, String title, String description, String status, String deadline, int iD_Category) {
        ID_task = iD_task;
        Title = title;
        Description = description;
        Status = status;
        Deadline = LocalDate.parse(deadline);
        ID_Category = iD_Category;
    }


    @Override
    public String toString() {
        return "Task [ID_task=" + ID_task + ", Title=" + Title + ", Description=" + Description + ", Status=" + Status
                + ", Deadline=" + Deadline + ", ID_Category=" + ID_Category + "]";
    }
}
