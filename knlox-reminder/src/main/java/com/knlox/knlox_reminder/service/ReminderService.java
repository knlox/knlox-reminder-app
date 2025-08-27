package com.knlox.knlox_reminder.service;

import com.knlox.knlox_reminder.entity.Reminder;
import com.knlox.knlox_reminder.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReminderService {
    @Autowired private ReminderRepository reminderRepository;

    public List<Reminder> getAll() {
        return reminderRepository.findAll();
    }

    public Reminder save(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public Reminder update(Long id, Reminder updated) {
        Reminder reminder = reminderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reminder not found"));
        reminder.setTitle(updated.getTitle());;
        reminder.setReminderTime(updated.getReminderTime());
        return reminderRepository.save(reminder);
    }

    public void delete(Long id) {
        reminderRepository.deleteById(id);
    }
}
