package hva.miw.cohort17.hilgemanauctions.model.dao;

import hva.miw.cohort17.hilgemanauctions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

    User findUserByUserID(int id);

}
