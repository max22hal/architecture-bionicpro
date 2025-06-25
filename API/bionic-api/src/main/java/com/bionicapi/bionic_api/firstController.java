package com.bionicapi.bionic_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class firstController {

    @GetMapping("/reports")
    public String first_api() {

        return "Welcome to Bionic API!";
    }

}
