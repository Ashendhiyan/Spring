package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {

    // Exact mapping = ---------item/it/test1
    // Exact mapping = ---------item/test2/I0/tt1
    @GetMapping(path = "it/test1")
    public String test1() {
        return "Get Mapping Invoked..(test 1)";
    }

    @GetMapping(path = "test2/I0/tt1")
    public String test2() {
        return "Get mapping Invoked...(test 2)";
    }
}
