package be.tandro.youthmovementapp.api.db;

import be.tandro.youthmovementapp.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalanceRepository extends JpaRepository<Person, Long> {

    Person findPersonByNameAndSurname(String name, String surname);

    List<Person> findPersonByNameAndSurnameAndAge(String name, String surname, Integer age);

    List<Person> findPersonsByName(String name);

    List<Person> findPersonsByNameAndAge(String name, Integer age);

    List<Person> findPersonsBySurname(String surname);

    List<Person> findPersonsBySurnameAndAge(String surname, Integer age);

    List<Person> findPersonsByAge(Integer age);

    List<Person> findPersonsByAgeGreaterThanEqualAndAgeLessThanEqual(Integer min, Integer max);
}
