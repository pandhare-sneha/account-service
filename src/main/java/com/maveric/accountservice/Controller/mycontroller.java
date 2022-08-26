package com.maveric.accountservice.Controller;

import com.maveric.accountservice.Repository.CustomerRepository;
import com.maveric.accountservice.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Customer")
public class mycontroller {

    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping("/")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer)
    {
        Customer save = this.customerRepository.save(customer);
        return ResponseEntity.ok(save);
    }

   @GetMapping("/")
    public ResponseEntity<?> getCustomer()
    {

        return ResponseEntity.ok(this.customerRepository.findAll());
    }


}
