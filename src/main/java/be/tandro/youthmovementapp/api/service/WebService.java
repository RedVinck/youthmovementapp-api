package be.tandro.youthmovementapp.api.service;

import be.tandro.youthmovementapp.api.db.PersonRepository;
import be.tandro.youthmovementapp.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {
    @Autowired
    private PersonRepository personRepository;


    public List<Person> findAllPersons(){
        return personRepository.findAll();
    }

    public void add(Person person) {
        personRepository.save(person);
    }
}
