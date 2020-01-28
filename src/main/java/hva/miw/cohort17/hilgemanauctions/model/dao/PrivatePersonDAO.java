package hva.miw.cohort17.hilgemanauctions.model.dao;

import hva.miw.cohort17.hilgemanauctions.model.PrivatePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivateUserDAO extends JpaRepository<PrivatePerson, Integer> {

    PrivatePerson getPrivateUserByUserID(int id);
}
