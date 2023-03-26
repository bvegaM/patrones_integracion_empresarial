package ec.edu.ups.msoft.service;

import ec.edu.ups.msoft.model.Person;
import ec.edu.ups.msoft.repository.PersonCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl {

    @Autowired
    PersonCrudRepository personCrudRepository;

    public void save(Person person){
        personCrudRepository.save(person);
    }

    public void saveAll(List<Person> personList){
        personCrudRepository.saveAll(personList);
    }
}
