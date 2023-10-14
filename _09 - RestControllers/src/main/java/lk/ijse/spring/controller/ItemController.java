package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {

    @PostMapping
    public String saveItem(){
        return "Item saved..";
    }

    @GetMapping
    public String getAllItems(){
        return "Get All Customers..";
    }

    @DeleteMapping
    public String deleteItem(){
        return "Item Deleted..";
    }

    @PutMapping
    public String updateItem(){
        return "Item Updated...";
    }

}
