package ec.edu.ups.msoft.repository;

import ec.edu.ups.msoft.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonCrudRepository extends JpaRepository<Person,Integer> {
}
