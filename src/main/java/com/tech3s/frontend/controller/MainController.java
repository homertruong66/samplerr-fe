package com.tech3s.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * homertruong
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
