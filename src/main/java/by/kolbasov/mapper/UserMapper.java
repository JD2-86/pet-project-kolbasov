package by.kolbasov.mapper;

import by.kolbasov.dto.UserDto;
import by.kolbasov.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto UserToUserDto(User user);
}
