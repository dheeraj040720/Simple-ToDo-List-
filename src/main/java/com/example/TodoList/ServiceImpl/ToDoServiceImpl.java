package com.example.TodoList.ServiceImpl;

import com.example.TodoList.Entity.Todo;
import com.example.TodoList.Repo.ToDoRepo;
import com.example.TodoList.Service.ToDoSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl  implements ToDoSercvice {




    private final ToDoRepo todorepo;


    @Autowired
    public ToDoServiceImpl(ToDoRepo todorepo) {
        this.todorepo = todorepo;
    }


    @Override
    public Todo saveTask(Todo todo)
    {
        return todorepo.save(todo);
    }

    @Override
    public List<Todo> getTasks() {
        return (List<Todo>) todorepo.findAll() ;
    }

    @Override
    public Todo update(Todo todo) {
        return todorepo.save(todo);
    }

    @Override
    public Optional<Todo> getById(int id) {
        return todorepo.findById(id);
    }

    @Override
    public void deleteTasks(int id) {
        todorepo.deleteById(id);

    }
}
