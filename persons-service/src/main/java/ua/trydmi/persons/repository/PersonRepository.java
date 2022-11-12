package ua.trydmi.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.trydmi.persons.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
