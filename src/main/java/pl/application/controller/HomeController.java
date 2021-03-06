package pl.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home page controller
 * Created by Aleksander on 2017-07-10.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    public static final String HOME_PAGE = "index";

    @GetMapping
    public String displayHomePage(){
        return HOME_PAGE;
    }
}
