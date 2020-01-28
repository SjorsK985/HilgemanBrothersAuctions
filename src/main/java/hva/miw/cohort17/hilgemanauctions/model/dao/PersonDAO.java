package hva.miw.cohort17.hilgemanauctions.model.dao;

import hva.miw.cohort17.hilgemanauctions.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<Person, Integer> {

    Person findUserByEmail(String email);

    Person findUserByUserID(int id);

}
