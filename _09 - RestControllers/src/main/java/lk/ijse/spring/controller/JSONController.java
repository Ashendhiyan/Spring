package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String getJsonRequest() {
        return "Hello JSON..";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO sendBackJson(){
        return new CustomerDTO("C001","Ashen","kandy",1000.00);
    }
}
