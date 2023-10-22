package com.example.TodoList.Service;


import com.example.TodoList.Entity.Todo;
import com.example.TodoList.Repo.ToDoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ToDoSercvice {


    Todo saveTask(Todo todo);

    List<Todo> getTasks();

    Todo update(Todo todo);

    Optional<Todo> getById(int id);

    void deleteTasks(int id);











}
