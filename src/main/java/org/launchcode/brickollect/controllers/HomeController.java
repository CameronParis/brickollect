package org.launchcode.brickollect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "brickollect/home")
public class HomeController {

    @RequestMapping(value = "")
    public String index() {
        return "brickollect/index";
    }

}
