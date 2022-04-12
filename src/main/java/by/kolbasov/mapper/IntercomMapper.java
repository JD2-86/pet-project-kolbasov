package by.kolbasov.mapper;

import by.kolbasov.dto.IntercomDto;
import by.kolbasov.entity.Intercom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IntercomMapper {
    IntercomDto IntercomToIntercomDto(Intercom intercom);
    List<IntercomDto> intercomListToIntercomDtoList(List<Intercom> intercoms);
}
