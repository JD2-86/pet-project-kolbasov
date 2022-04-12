package by.kolbasov.dto;

import by.kolbasov.entity.Cart;
import by.kolbasov.mapper.UserMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class CartDto {

    Long id;
    private UserDto user;
    private List<CameraDto> camera = new LinkedList<CameraDto>();
    private List<RegistratorDto> registrator = new LinkedList<RegistratorDto>();
    private List<IntercomDto> intercom = new LinkedList<IntercomDto>();

    public CartDto(Long id, UserDto user, List<CameraDto> camera, List<RegistratorDto> registrator, List<IntercomDto> intercom) {
        this.id = id;
        this.user = user;
        this.camera = camera;
        this.registrator = registrator;
        this.intercom = intercom;
    }

    public CartDto(){}
}
