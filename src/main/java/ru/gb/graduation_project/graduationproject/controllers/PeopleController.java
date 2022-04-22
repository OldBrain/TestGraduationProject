package ru.gb.graduation_project.graduationproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.graduation_project.graduationproject.models.Person;
import ru.gb.graduation_project.graduationproject.services.PersonService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/people")
public class PeopleController {

    private final PersonService personService;

    @GetMapping()
     public Optional<Person> getAllPerson() {
          return personService.getAll();
      }

}