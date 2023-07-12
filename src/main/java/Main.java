import entities.Courses;
import entities.User;
import orm.EntityManager;
import orm.config.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
        Connector.createConnection("root", "Badger3802!!", "soft_uni");

        Connection connection = Connector.getConnection();

        EntityManager<User> userEntityManager = new EntityManager<>(connection);
        boolean persistResult = userEntityManager.persist(new User("u3", "p3", 24, LocalDate.now()));


        System.out.println(persistResult);

        EntityManager<Courses> courseEntityManager = new EntityManager<>(connection);
        courseEntityManager.persist(new Courses("Math", 12));

//        EntityManager<Department> departmentEntityManager = new EntityManager<>(connection);
//        departmentEntityManager.persist(new Department());
    }
}
