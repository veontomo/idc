package com.baeldung.idc;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Repository {
    
    private List<Task> items;
    
    @PostConstruct
    public void init() {
        
        System.out.println("sss");
    }

    public int getCount() {
        return 111;
    }

}
