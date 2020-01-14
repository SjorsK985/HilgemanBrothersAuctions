package hva.miw.cohort17.hilgemanauctions.model.service;
import hva.miw.cohort17.hilgemanauctions.model.PrivateUser;
import hva.miw.cohort17.hilgemanauctions.model.dao.PrivateUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivateUserService {
    @Autowired
    PrivateUserDAO privateUserDAO;

    public void save(PrivateUser privateUser){
        privateUserDAO.save(privateUser);
    }
}
