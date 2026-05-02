package com.klef.fsad.exam;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/project")
public class controller {

    private final service srv;

    public controller(service srv) {
        this.srv = srv;
    }

    
    @PostMapping
    public project insert(@RequestBody project p) {
        return srv.insert(p);
    }

    
    @GetMapping
    public List<project> getAll() {
        return srv.getAll();
    }
}
