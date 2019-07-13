package com.baeldung.idc;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class Repository {

    private List<Task> items;

    @PostConstruct
    public void init() {
        Faker faker = new Faker(Locale.ENGLISH);
        final int s = faker.random()
            .nextInt(20);
        System.out.println(s);
        this.items = IntStream.range(0, s)
            .mapToObj(i -> new Task(i, faker.book()
                .title(),
                faker.shakespeare()
                    .asYouLikeItQuote(),
                null))
            .collect(Collectors.toList());

    }

    public int getCount() {
        return items.size();
    }

    public List<Task> getItems() {
        return items;
    }

}
