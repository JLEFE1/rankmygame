package org.homegrown.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@RequestMapping("/signin")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login2(Locale locale, Model model) {
        return "login";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String loginWithError(Locale locale, Model model) {
        model.addAttribute("error", true);
        return "login";
    }
}
