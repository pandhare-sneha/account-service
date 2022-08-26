package com.maveric.accountservice.Repository;

import com.maveric.accountservice.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
