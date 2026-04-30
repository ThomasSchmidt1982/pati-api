package fr.schmidt.patiapi.repository;

import fr.schmidt.patiapi.entity.Person;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository <Person, Long>{
    Long Id(Long id);
    Optional<Person> findByEmail(String email);
}
