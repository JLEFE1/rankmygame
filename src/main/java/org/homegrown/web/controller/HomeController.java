package org.homegrown.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = "disclaimer", method = RequestMethod.GET)
    public String disclaimer(ModelMap model) {
        return "disclaimer";
    }

    @RequestMapping(value = "contact", method = RequestMethod.GET)
    public String contact(ModelMap model) {
        return "contact";
    }

}

