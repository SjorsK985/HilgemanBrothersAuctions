package hva.miw.cohort17.hilgemanauctions.model.dao;

import hva.miw.cohort17.hilgemanauctions.model.PrivateUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivateUserDAO extends JpaRepository<PrivateUser, Integer> {
}
