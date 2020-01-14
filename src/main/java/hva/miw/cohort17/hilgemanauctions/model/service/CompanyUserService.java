package hva.miw.cohort17.hilgemanauctions.model.service;

import hva.miw.cohort17.hilgemanauctions.model.CompanyUser;
import hva.miw.cohort17.hilgemanauctions.model.dao.CompanyUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyUserService {
    @Autowired
    CompanyUserDAO companyUserDAO;

    public void save(CompanyUser companyUser){
        companyUserDAO.save(companyUser);
    }
}
