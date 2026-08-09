package co.unicauca.solid.isp.access;

import co.unicauca.solid.isp.domain.Project;
import co.unicauca.solid.isp.domain.Task;
import co.unicauca.solid.isp.domain.User;
import java.util.List;

/**
 * Interfaz de operaciones sobre el repositorio de datos, Tiene centralizado el
 * acceseo a los datos. Interfaz gorda, tiene demasiadas responsabilidades. Es
 * volátil puede cambiar por el tiempo. Lo estable debe quedar en las
 * interfaces, y clases abstractas, lo volatil debe quedar en las
 * implementaciones.
 *
 * @author Libardo, Julio
 */
public interface IRepository {

    //User methods
    void createUser(User user);

    List<User> listUsers();

    void deleteUser(User user);

    //Project methods
    void createProject(Project project);

    List<Project> listProjectsByUser(int userId);

    //Task methods
    void createTask(Task task);

    List<Task> listCompletedTasksByUser(int userId);

    void deleteTask(Task task);
}
