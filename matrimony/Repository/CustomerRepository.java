package com.matrimony.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	

	

	

	

}
