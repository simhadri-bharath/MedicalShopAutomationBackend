package com.bharath.msa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharath.msa.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
	List<Orders> findByCustomerId(Long customerId);
}
