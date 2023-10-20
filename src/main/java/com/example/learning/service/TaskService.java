package com.example.learning.service;

import com.example.learning.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();
    Task getTaskByID(Long id);
    Task saveTask(Task task);
    String deleteTask(Long id);
    Task updateTask(Long id, Task task);
}
