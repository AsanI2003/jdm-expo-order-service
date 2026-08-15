package com.jdm.jdm_expo_order_service.service.serviceimpl;

import com.jdm.jdm_expo_order_service.dto.OrderDTO;
import com.jdm.jdm_expo_order_service.model.Order;
import com.jdm.jdm_expo_order_service.repository.OrderRepository;
import com.jdm.jdm_expo_order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = Order.builder()
                .vehicleId(orderDTO.getVehicleId())
                .customerName(orderDTO.getCustomerName())
                .customerContact(orderDTO.getCustomerContact())
                .status(orderDTO.getStatus() != null ? orderDTO.getStatus() : "PENDING")
                .build();

        Order savedOrder = orderRepository.save(order);
        return mapToDTO(savedOrder);
    }

    @Override
    public OrderDTO getOrderById(String id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found with ID: " + id));
        return mapToDTO(order);
    }

    private OrderDTO mapToDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setVehicleId(order.getVehicleId());
        dto.setCustomerName(order.getCustomerName());
        dto.setCustomerContact(order.getCustomerContact());
        dto.setStatus(order.getStatus());
        return dto;
    }
}