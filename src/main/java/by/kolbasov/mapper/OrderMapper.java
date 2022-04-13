package by.kolbasov.mapper;

import by.kolbasov.dto.IntercomDto;
import by.kolbasov.dto.OrderDto;
import by.kolbasov.entity.Intercom;
import by.kolbasov.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto OrderToOrderDto(Order order);
    List<OrderDto> orderListToOrderDtoList(List<Order> orders);
}
