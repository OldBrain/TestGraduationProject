package ru.gb.graduation_project.graduationproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.graduation_project.graduationproject.models.Person;
import ru.gb.graduation_project.graduationproject.repositories.PersonRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Optional<Person> getAll() {
        return personRepository.getAll();
    }

    public Optional<Person> findByPasport(String pasport) {
        return personRepository.findByPasport(pasport);
    }

}
