package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;


//REST - Representational State transfer (A way of data transfer among client server app)
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String test(){
        return "Customer Controller";
    }

    @GetMapping(path = "search")
    public String searchCustomer(){
        return "Search Customer";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer Saved and Post Method Invoked";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer deleted..!";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer updated..!";
    }
}
