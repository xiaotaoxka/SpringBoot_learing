package com.wztedu.controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("")
    public String getById() {
        System.out.println("spring boot is running...4");

        return "spring boot is running...4";
    }

}
