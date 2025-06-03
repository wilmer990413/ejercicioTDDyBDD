package com.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void shouldInstantiateTaskCorrectly() {
        Task task = new Task("Tarea 1", "Descripción 1");
        assertEquals("Tarea 1", task.getTitle());
        assertEquals("Descripción 1", task.getDescription());
        assertFalse(task.isCompleted());
    }
}
