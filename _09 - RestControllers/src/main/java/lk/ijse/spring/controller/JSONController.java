package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String getJsonRequest(@RequestBody CustomerDTO dto) {
        return "Hello JSON.."+dto.toString();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)    //  content - type=application/json
    public CustomerDTO sendBackJson(){
        return new CustomerDTO("C001","Ashen","kandy",1000.00);
    }
    @GetMapping(path = "Array" , produces = MediaType.APPLICATION_JSON_VALUE)    //  content - type=application/json
    public ArrayList<CustomerDTO> sendBackJsonArray(){
        ArrayList<CustomerDTO> all = new ArrayList<>();
        all.add(new CustomerDTO("C001","Ashen","kandy",1000.00));
        all.add(new CustomerDTO("C002","Chaluka","kurunegala",2000.00));
        all.add(new CustomerDTO("C003","Bawantha","Homagama",3000.00));
        return all;
    }
}
