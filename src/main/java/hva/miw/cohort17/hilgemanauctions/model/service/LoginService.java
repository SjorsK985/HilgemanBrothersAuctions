package hva.miw.cohort17.hilgemanauctions.model.service;

import hva.miw.cohort17.hilgemanauctions.model.User;
import hva.miw.cohort17.hilgemanauctions.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserDAO userDAO;

    public User retrieveUserFromDb(String email){
        User user = userDAO.findUserByEmail(email);
        return user;
    }

    public boolean validatePassword(User user, String password) {
        return user.getPassword().equals(password);
    }
}
