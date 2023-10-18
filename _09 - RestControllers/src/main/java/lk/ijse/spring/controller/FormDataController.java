package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {

    //  x-www-form-url-encoded
    // query String

    @PostMapping("test")
    public String testForm1(String id,String name){
        return "Request received.."+id+" "+name;
    }
    @PostMapping
    public String customer(@ModelAttribute CustomerDTO dto){
        return dto.toString();
    }
}
