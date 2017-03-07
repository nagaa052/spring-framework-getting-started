package lesson3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String getHello() {
        String message = null;
        if (true) {
            System.out.printf("文字数" + message.length());
        }
        message.length();

        return "Hello!!!!";
    }
}