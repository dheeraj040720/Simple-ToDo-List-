package com.example.TodoList.Controller;


import com.example.TodoList.Entity.Todo;
import com.example.TodoList.ServiceImpl.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ToDoController {



    @Autowired
    private final ToDoServiceImpl toDoService;


    @Autowired
    public ToDoController(ToDoServiceImpl toDoService) {
        this.toDoService = toDoService;
    }


    @GetMapping("/index")
    public String getindex(Model model)
    {

        model.addAttribute("ToDo",new Todo());
        model.addAttribute("TODos",toDoService.getTasks()); //key value pair for diaplying data in frontend thymleaf template

        return "todo";

    }


    @PostMapping ("/saveTasks")
    public String saveTasks(@ModelAttribute("todo") Todo todo)
    {

        System.out.println(todo.toString());
        Todo todos=toDoService.saveTask(todo);


        return "redirect:/index";


    }



    @GetMapping("/gettasks")
    public String getTaks(Todo todo)
    {
        List<Todo> todogetData=toDoService.getTasks();




        return "redirect:/index";
    }



    @PostMapping("/updateTasks")

           public String updateTasks(Todo todo)
    {
        Todo todoUpdate=toDoService.update(todo);

        System.out.println(todoUpdate.toString());

        return "redirect:/index";


    }


 @GetMapping("/editTasks/{id}")
    public String EditTasks(@PathVariable("id") Integer id, Model model)

 {
     Optional<Todo> todo = toDoService.getById(id) ;

     System.out.println("edit "+todo.toString());

     if(todo.isPresent()) {

         model.addAttribute("Todos",todo.get());

         return "editTodo";

     }


     return "redirect:/index";
 }


 @GetMapping("/deleteTasks/{id}")
    public String DeleteTasks(@PathVariable("id") Integer id,Model model)
 {

     toDoService.deleteTasks(id);

     Optional<Todo>todoDelete=toDoService.getById(id);

     if(todoDelete.isPresent())
     {

         model.addAttribute("Todos","data deleted");
     }

     return"redirect:/index";



 }




}
