package ru.skypro.homework_3_6_webapplicationtestingspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework_3_6_webapplicationtestingspringboot.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);
}
