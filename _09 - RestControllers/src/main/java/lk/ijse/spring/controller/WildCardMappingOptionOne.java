package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCardMappingOptionOne {

    //Wild Card Mapping
    //matches One Or more Characters in a path segment

    //  test/*/hello   ->   test//hello (not working)
    //  test/*/hello   ->   test/1/hello (working)
    //  test/*/hello   ->   test/abcde/hello (working)
    //  test/*/hello   ->   test/f324h/hello (working)

    @GetMapping(path = "test/*/hello")
    public String test1() {
        return "Get Mapping Invoked..(test 1)";
    }

    @GetMapping(path = "test2/*/*")
    public String test2() {
        return "Get mapping Invoked...(test 2)";
    }
}
