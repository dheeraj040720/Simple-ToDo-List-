package com.example.TodoList.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo {



public Todo() {


}



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getStatus() {
        return status;
    }

    public Todo(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Todo(int id, String taskDescription, String userName, String targetDate) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.userName = userName;
        this.targetDate = targetDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    private String taskDescription;

    private String userName;



    private String targetDate;

    private String status;
}
