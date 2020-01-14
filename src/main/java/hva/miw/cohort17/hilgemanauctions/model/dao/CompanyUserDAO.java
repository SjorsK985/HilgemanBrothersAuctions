package hva.miw.cohort17.hilgemanauctions.model.dao;

import hva.miw.cohort17.hilgemanauctions.model.CompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyUserDAO extends JpaRepository<CompanyUser, Integer> {
}
