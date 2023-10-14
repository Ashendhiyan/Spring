package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String test(){
        return "Customer Controller";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer Saved and Post Method Invoked";
    }
}
