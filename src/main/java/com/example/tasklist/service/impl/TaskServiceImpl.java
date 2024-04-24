package com.example.tasklist.service.impl;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

    @Override
    public Task create(Task task, Long userId) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
