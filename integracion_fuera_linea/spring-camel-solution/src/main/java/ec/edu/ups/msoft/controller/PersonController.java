package ec.edu.ups.msoft.controller;

import ec.edu.ups.msoft.model.Person;
import ec.edu.ups.msoft.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping
    public void savePerson(@RequestBody Person person){
        personService.save(person);
    }
}
