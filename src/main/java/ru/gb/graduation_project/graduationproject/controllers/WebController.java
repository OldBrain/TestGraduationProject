package ru.gb.graduation_project.graduationproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.graduation_project.graduationproject.models.Person;
import ru.gb.graduation_project.graduationproject.services.PersonService;

@Controller
@RequiredArgsConstructor
public class WebController {


    @GetMapping("/")

    public String index(Model model) {
//        model.addAttribute("allContract", Person);
        return "index";
    }
}
