package com.example.learning.service;

import com.example.learning.entity.Task;
import com.example.learning.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository repository;

    @Override
    public List<Task> getAllTask() {
        return repository.findAll();
    }

    @Override
    public Task getTaskByID(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Task saveTask(Task task) {
        return repository.save(task);
    }

    @Override
    public String deleteTask(Long id) {
        repository.deleteById(id);
        return "Task deleted successfully!";
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task existingTask = repository.findById(id).orElse(null);
        if (existingTask != null) {
            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setCompleted(task.isCompleted());
            return repository.save(existingTask);
        }
        return null;
    }
}
