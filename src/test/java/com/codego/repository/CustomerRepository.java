package com.codego.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codego.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long > {

	boolean existsByEmail(String email);

}
