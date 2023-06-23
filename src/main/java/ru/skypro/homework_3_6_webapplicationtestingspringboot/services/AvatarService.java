package ru.skypro.homework_3_6_webapplicationtestingspringboot.services;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework_3_6_webapplicationtestingspringboot.model.Avatar;

import java.io.IOException;

public interface AvatarService {
    Avatar findAvatar(Long studentId);

    Avatar findOrCreateAvatar(Long studentId);

    void uploadAvatar(Long studentId, MultipartFile avatarFile) throws IOException;
}
