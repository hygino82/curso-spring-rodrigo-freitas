package br.com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/list")
    public ModelAndView getList(){
        return new ModelAndView("index");
    }
}
