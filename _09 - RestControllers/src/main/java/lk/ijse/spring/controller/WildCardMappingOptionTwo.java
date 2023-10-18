package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class WildCardMappingOptionTwo {

    //Wild Card Mapping
    //matches One Or more Characters in a path segment

    //  test/**/hello   ->   test//hello    (working)
    //  test/**/hello   ->   test/hello     (working)
    //  test/**/hello   ->   test/1111/1111/hello     (working)
    //  test/**/hello   ->   test/abcde/hello    (working)
    //  test/**/hello   ->   test/aaaaaa/bbbbbbb/ccccc/hello      (working)
    //  test/**/hello   ->   tested/aaaaaa/bbbbbbb/ccccc/hello      (Not working)
    //  test/**/hello   ->   test/abc/aaa/cccc      (Not working)

    @GetMapping(path = "test/**/hello")
    public String test1() {
        return "Get Mapping Invoked..(test 1)";
    }

//    @GetMapping(path = "test2/*/*")
//    public String test2() {
//        return "Get mapping Invoked...(test 2)";
//    }
}
