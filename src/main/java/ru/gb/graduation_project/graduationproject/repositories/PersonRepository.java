package ru.gb.graduation_project.graduationproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.gb.graduation_project.graduationproject.models.Person;

import java.util.List;
import java.util.Optional;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    Optional<Person> findByName(String name);

//    @Query("select c from Person c")
//    Optional<Person> getAll();

    @Override
    List<Person> findAll();

    Optional<Person> findByPasport(String pasport);


}
