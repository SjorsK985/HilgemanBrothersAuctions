package hva.miw.cohort17.hilgemanauctions.model.service;
import hva.miw.cohort17.hilgemanauctions.model.Lot;
import hva.miw.cohort17.hilgemanauctions.model.Person;
import hva.miw.cohort17.hilgemanauctions.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public void save(Person person){
        userDAO.save(person);
    }

    public Person findUserByID(int id){
        return userDAO.findUserByUserID(id);

    }

    public void addLot(Person person, Lot lot){
        person.addLotToSell(lot);
        save(person);
    }
}
