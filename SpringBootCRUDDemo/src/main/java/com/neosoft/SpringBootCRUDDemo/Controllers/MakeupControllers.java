package com.neosoft.SpringBootCRUDDemo.Controllers;

import com.neosoft.SpringBootCRUDDemo.Entity.Makeup;
import com.neosoft.SpringBootCRUDDemo.Services.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MakeupControllers {

    @Autowired
    private MakeupService makeupService;

    @PostMapping("/save")
    public Makeup saveMakeup(@RequestBody Makeup makeup) {
        return makeupService.save(makeup);
    }

    @GetMapping("/get/{id}")
    public Makeup getMakeup(@PathVariable int id) {
        return makeupService.get(id);
    }

    @PutMapping("/update")
    public Makeup updateMakeup(@RequestBody Makeup makeup) {
        return makeupService.update(makeup);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMakeup(@PathVariable int id) {
        makeupService.delete(id);
    }









}
