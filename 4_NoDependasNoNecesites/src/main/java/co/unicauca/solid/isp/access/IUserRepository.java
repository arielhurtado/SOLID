package co.unicauca.solid.isp.access;

import co.unicauca.solid.isp.domain.User;
import java.util.List;

/**
 *
 * @author Libardo
 */
public interface IUserRepository {
    //User methods

    void createUser(User user);

    List<User> listUsers();

    void deleteUser(User user);

}
