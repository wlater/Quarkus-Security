package org.acme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/security")
public class Security {

    @GetMapping("/")
    public String hello() {
        return "hello2";
    }
}