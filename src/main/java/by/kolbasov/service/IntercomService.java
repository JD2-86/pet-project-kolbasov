package by.kolbasov.service;

import by.kolbasov.dto.IntercomDto;
import by.kolbasov.entity.Intercom;

import java.util.List;

public interface IntercomService {
    List<IntercomDto> findAll();

    IntercomDto findById(Long id);

    void save(Intercom intercom);

    void delete(Long id);
}
