package _AD004.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @GetMapping("/test")
    public String test() {
        return "Item Controller Working";
    }

    @GetMapping
    public String getItems() {
        return "List of items";
    }

    @PostMapping
    public String addItem() {
        return "Item added successfully";
    }
}