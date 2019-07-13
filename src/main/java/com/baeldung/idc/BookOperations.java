package com.baeldung.idc;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BookOperations {
    @GetMapping("/count")
    int count();

    @GetMapping("/")
    List<Book> getAll();
    
    @GetMapping("/{id}")
    Optional<Book> getById(@PathVariable int id);
}
