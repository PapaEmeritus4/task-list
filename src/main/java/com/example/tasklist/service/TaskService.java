package com.example.tasklist.service;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long userId);

    Task updateTask(Task task);

    Task create(Task task, Long userId);

    void delete(Long id);
}
