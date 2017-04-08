package com.cs313.cameron;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cameronlewis on 4/7/17.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String greeting() {
        return "greetings, Earthling!";
    }
}
