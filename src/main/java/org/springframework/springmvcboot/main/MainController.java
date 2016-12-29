package org.springframework.springmvcboot.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index() {
    	System.out.println("Main controller executed!");
        return "app.html";
    }
    
}
