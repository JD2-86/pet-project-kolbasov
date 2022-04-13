package by.kolbasov.dto;

import by.kolbasov.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    private Long id;

    private String address;
    private String num;
    private String period;
    private String description;
    private User user;
}
