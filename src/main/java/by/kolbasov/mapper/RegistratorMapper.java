package by.kolbasov.mapper;

import by.kolbasov.dto.RegistratorDto;
import by.kolbasov.entity.Registrator;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegistratorMapper {
    RegistratorDto registratorToRegistratorDto(Registrator registrator);
    List<RegistratorDto> registratorListToRegistratorDtoList(List<Registrator> registrators);
}
