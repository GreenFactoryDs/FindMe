package com.chuno.findservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/find")
public class FindController {

    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        return "hello";
    }
}
