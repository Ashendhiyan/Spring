package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomers(){
        return new CustomerDTO("C001","Ashen","Hatton",5000.00);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomers(){
        return new CustomerDTO("C002","bawantha","Hatton",5000.00);
    }
}
