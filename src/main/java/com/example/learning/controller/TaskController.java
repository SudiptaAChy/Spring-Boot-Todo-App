package com.example.learning.controller;

import com.example.learning.entity.Task;
import com.example.learning.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping("/task")
    public List<Task> getAllTasks() {
        return service.getAllTask();
    }

    @PostMapping("/task")
    public Task saveTask(
            @RequestBody Task task
    ) {
        return service.saveTask(task);
    }

    @GetMapping("/task/{id}")
    public Task getTaskByID(
            @PathVariable("id") Long id
    ) {
        return service.getTaskByID(id);
    }

    @DeleteMapping("/task/{id}")
    public String deleteTaskByID(
            @PathVariable("id") Long id
    ) {
        return service.deleteTask(id);
    }

    @PutMapping("/task/{id}")
    public Task updateTask(
            @PathVariable Long id,
            @RequestBody Task task
    ) {
        return service.updateTask(id, task);
    }
}
