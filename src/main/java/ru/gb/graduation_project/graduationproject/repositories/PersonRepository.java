package ru.gb.graduation_project.graduationproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.gb.graduation_project.graduationproject.models.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Optional<Person> findByName(String name);

    @Query("select c from Person c")
    Optional<Person> getAll();

    Optional<Person> findByPasport(String pasport);


}
