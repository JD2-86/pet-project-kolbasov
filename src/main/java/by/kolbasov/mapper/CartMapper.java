package by.kolbasov.mapper;

import by.kolbasov.dto.CartDto;
import by.kolbasov.entity.Cart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto cartToCartDto(Cart cart);
    List<CartDto> cartListToCartListDto(List<Cart> carts);
}
