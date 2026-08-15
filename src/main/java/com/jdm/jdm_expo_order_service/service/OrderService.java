package com.jdm.jdm_expo_order_service.service;

import com.jdm.jdm_expo_order_service.dto.OrderDTO;
import org.springframework.data.domain.Page;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(String id);
}