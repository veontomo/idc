package com.baeldung.idc;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ToDoOperations {
    @GetMapping("/count")
    int count();

    @GetMapping("/")
    List<Task> getAll();
}
