package com.cs313.cameron;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String main() {
        return "home";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "testing 2nd method";
    }
}
