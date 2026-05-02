package com.klef.fsad.exam;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class service {

    private final repository repo;

    public service(repository repo) {
        this.repo = repo;
    }

    
    public project insert(project p) {
        p.setDate(new Date());
        return repo.save(p);
    }

   
    public List<project> getAll() {
        return repo.findAll();
    }
}
