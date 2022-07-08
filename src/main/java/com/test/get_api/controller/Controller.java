package com.test.get_api.controller;

import org.springframework.web.bind.annotation.*;
// api return string with "hi "
@RestController
@RequestMapping(path = "/api-example/v1.0")
public class Controller {
    @GetMapping(path = "/get")
    public @ResponseBody String getRequest(@RequestBody String strReceived){
        return "hi " + strReceived ;
    }
}
