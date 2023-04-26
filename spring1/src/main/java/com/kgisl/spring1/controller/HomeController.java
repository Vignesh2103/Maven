package com.kgisl.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping("/")
public String showPage() {

return "home";

}
@RequestMapping("/demo")
public String demoPage() {

return "demo";

}
    
}