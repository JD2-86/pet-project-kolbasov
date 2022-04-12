package by.kolbasov.mapper;

import by.kolbasov.dto.CartDto;
import by.kolbasov.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

    CartDto CartToCartDto(Cart cart);
}
