package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Chara")
public class CharactorMappingController {

    //  item/I333
    //  item/Ivff
    //  item/I001


    @GetMapping(path = "item/I???")
    public String test(){
        return "Get Mapping Invoked..";
    }
}
