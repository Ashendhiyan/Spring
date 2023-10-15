package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

    //http://localhost:8080/restcontroller/variable/I001

    // (variable)  path segments
    // (I001) path segment

    //In spring we can retrieve value of path segments
    // to do that we hava to crate path variables -> {I001}

    @GetMapping(path = "{id:[I ][0-9]{3}}")
    public String test(@PathVariable("id") String itemCode){    // setting alias  when parameters names and variable names different
        return itemCode;
    }

    @GetMapping(path = "{id}/{name}")
    public String test2(@PathVariable String id,@PathVariable String name){
        return id+" "+name;
    }


    @GetMapping(path = "{id:[C][0-9]{3}}")
    public String test3(@PathVariable String id){
        return id;
    }

}
