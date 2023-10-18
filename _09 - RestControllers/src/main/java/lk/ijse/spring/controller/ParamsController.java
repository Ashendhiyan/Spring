package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"param1","param2"})
    public String test1(String param1, String param2){
        return "Hello.."+ param1+" "+param2;
    }

    @GetMapping
    public String test2(){
        return "Hello 2..";
    }

    @GetMapping(params = {"name","salary"})
    public String test3(String name,@RequestParam("salary") double mySalary){
        return "hello 3.."+name+" "+mySalary;
    }

    @GetMapping(path = "one",params = {"id"})
    public String test4(String id){
        return "Hello 4.."+id;
    }
}
