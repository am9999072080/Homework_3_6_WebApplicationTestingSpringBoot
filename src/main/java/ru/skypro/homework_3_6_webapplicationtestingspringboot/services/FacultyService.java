package ru.skypro.homework_3_6_webapplicationtestingspringboot.services;

import ru.skypro.homework_3_6_webapplicationtestingspringboot.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty add(Faculty faculty);

    Faculty remove(Long id);

    Faculty update(Faculty faculty);

    Faculty get(Long id);

    Collection<Faculty> getByNameOrColor(String name, String color);

    Collection<Faculty> getAll();
}
