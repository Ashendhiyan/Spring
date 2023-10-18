package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    //   We can narrow down requests using Headers also


    //  produce -> response type json
    // for frontEnd validation = Accept -> application/json     ---> only get as response (application/json type)
 /*   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomers(){
        return new CustomerDTO("C001","Ashen","Hatton",5000.00);
    }

    //  consume -> application/json  (request body should include Content_type=application/json header )
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomers(){
        return new CustomerDTO("C002","bawantha","Hatton",5000.00);
    }*/


    @GetMapping(consumes = "text/html" ,  produces = "application/json")
    public CustomerDTO testMethodOne(){
        return new CustomerDTO("C001","TEXT","Kurunegala",3000);
    }
    @GetMapping(consumes = "application/json" ,  produces = "application/json")
    public CustomerDTO testMethodTwo(){
        return new CustomerDTO("C002","JSON","Kurunegala",3000);
    }
    @GetMapping(headers = {"Content-Type=text/css","Accept=application/json"})
    public CustomerDTO testMethodThree(){
        return new CustomerDTO("C003","Headers","Kurunegala",3000);
    }
}

