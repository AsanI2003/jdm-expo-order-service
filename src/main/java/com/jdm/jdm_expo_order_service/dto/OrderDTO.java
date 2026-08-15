package com.jdm.jdm_expo_order_service.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private String id;
    private Long vehicleId;
    private String customerName;
    private String customerContact;
    private String status;
}
