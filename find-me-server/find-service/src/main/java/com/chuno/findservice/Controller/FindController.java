package com.chuno.findservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/find")
public class FindController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
