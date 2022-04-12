package by.kolbasov.mapper;

import by.kolbasov.dto.UserDto;
import by.kolbasov.entity.User;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto UserToUserDto(User user);
}
