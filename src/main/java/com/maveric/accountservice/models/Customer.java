package com.maveric.accountservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "Account-service")
public class Customer {
    @Id
    private int id;
    private String type;
    private String customerId;

}