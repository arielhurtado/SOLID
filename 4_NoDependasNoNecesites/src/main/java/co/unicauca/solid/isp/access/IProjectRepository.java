package co.unicauca.solid.isp.access;

import co.unicauca.solid.isp.domain.Project;
import java.util.List;

/**
 * Interfaz de proyectos
 *
 * @author Libardo, Julio
 */
public interface IProjectRepository {

    //Project methods
    void createProject(Project project);

    List<Project> listProjectsByUser(int userId);

}
