package by.kolbasov.service.intercomService;

import by.kolbasov.entity.goods.Intercom;

import java.util.List;

public interface IntercomService {
    List<Intercom> findAll();

    Intercom findById(Long id);

    void save(Intercom intercom);
}
