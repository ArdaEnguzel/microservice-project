package com.microservice.accountsservice.dto.customer;

import com.microservice.accountsservice.dto.AccountDto;
import lombok.Data;

@Data
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountDto accountDto;
}
