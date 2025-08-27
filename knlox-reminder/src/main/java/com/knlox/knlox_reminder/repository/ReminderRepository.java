package com.knlox.knlox_reminder.repository;

import com.knlox.knlox_reminder.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long>{
}
