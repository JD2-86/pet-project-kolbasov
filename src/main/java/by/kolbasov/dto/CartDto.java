package by.kolbasov.dto;

import by.kolbasov.entity.Camera;
import by.kolbasov.entity.Intercom;
import by.kolbasov.entity.Registrator;
import by.kolbasov.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class CartDto {
    Long id;
    private User user;
    private List<Camera> camera = new LinkedList<Camera>();
    private List<Registrator> registrator = new LinkedList<Registrator>();
    private List<Intercom> intercom = new LinkedList<Intercom>();

}
