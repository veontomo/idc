package com.baeldung.idc;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController implements BookOperations {

    private Repository repo;

    public BookController(Repository repo) {
        this.repo = repo;
    }

    @Override
    public int count() {
        return repo.getCount();
    }

    @Override
    public List<Book> getAll() {
        return repo.getItems();
    }

    @Override
    public Optional<Book> getById(int id) {
        return repo.getById(id);
    }

}
