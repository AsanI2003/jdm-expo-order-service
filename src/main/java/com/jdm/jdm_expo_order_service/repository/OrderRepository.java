package com.jdm.jdm_expo_order_service.repository;

import com.jdm.jdm_expo_order_service.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {}
