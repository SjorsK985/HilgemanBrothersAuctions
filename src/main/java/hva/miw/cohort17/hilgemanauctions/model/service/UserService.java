package hva.miw.cohort17.hilgemanauctions.model.service;
import hva.miw.cohort17.hilgemanauctions.model.Lot;
import hva.miw.cohort17.hilgemanauctions.model.User;
import hva.miw.cohort17.hilgemanauctions.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public void save(User user){
        userDAO.save(user);
    }

    public User findUserByID(int id){
        return userDAO.findUserByUserID(id);

    }

    public void addLot(User user, Lot lot){
        user.addLotToSell(lot);
        save(user);
    }
}
