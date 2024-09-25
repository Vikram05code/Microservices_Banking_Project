package com.vikram.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    /**
     * The controller that handles all the requests.
     *
     * @author Vikram Sharma
     */

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

}