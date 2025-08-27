package com.knlox.knlox_reminder.controller;

import com.knlox.knlox_reminder.entity.Reminder;
import com.knlox.knlox_reminder.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reminers")
public class ReminderController {
    @Autowired
    private ReminderService reminderService;

    @GetMapping
    public List<Reminder> getAll() {
        return reminderService.getAll();
    }

    @PostMapping
    public Reminder create(@RequestBody Reminder reminder) {
        return reminderService.save(reminder);
    }

    @PutMapping("/{id}")
    public Reminder update(@PathVariable long id, @RequestBody Reminder reminder) {
        return reminderService.update(id,reminder);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reminderService.delete(id);
    }
}
