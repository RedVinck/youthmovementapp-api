package be.tandro.youthmovementapp.api.service;

import be.tandro.youthmovementapp.api.db.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebService {
    @Autowired
    private PersonRepository personRepository;


}
