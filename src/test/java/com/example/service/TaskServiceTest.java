package com.example.service;

import com.example.model.Task;
import com.example.repository.TaskRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void shouldSaveTask() {
        TaskRepository mockRepo = mock(TaskRepository.class);
        TaskService service = new TaskService(mockRepo);

        Task task = new Task("Tarea 1", "Descripción 1");
        Task saved = new Task("Tarea 1", "Descripción 1");
        saved.setId(1L);

        when(mockRepo.save(task)).thenReturn(saved);

        Task result = service.saveTask(task);

        assertEquals(1L, result.getId());
        assertEquals("Tarea 1", result.getTitle());
        assertFalse(result.isCompleted());
    }
}
