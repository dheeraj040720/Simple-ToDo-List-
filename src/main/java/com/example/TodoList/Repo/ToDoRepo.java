package com.example.TodoList.Repo;


import com.example.TodoList.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo  extends JpaRepository<Todo,Integer>  {
}
