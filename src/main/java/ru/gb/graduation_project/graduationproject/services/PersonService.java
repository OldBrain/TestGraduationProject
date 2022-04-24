package ru.gb.graduation_project.graduationproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.graduation_project.graduationproject.models.Person;
import ru.gb.graduation_project.graduationproject.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findByPasport(String pasport) {
        return personRepository.findByPasport(pasport);
    }

}
