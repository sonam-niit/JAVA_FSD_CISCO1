package com.cisco.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.rest.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
