package com.baeldung.idc;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class ToDoController implements ToDoOperations {

    private Repository repo;

    public ToDoController(Repository repo) {
        this.repo = repo;
    }

    @Override
    public int count() {
        return repo.getCount();
    }

    @Override
    public List<Task> getAll() {

        return Arrays.asList(new Task());
    }

}
