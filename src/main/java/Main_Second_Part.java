import entities.User;
import orm.EntityManager;
import orm.config.Connector;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main_Second_Part {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        Connector.createConnection("root", "Badger3802!!", "custom_orm");
        Connection connection = Connector.getConnection();

        EntityManager<User> userEntityManager = new EntityManager<>(connection);

//        //CREATE TABLE
//        userEntityManager.doCreate(User.class);

//        //ALTER
//        userEntityManager.doAlter(User.class);
//
        // INSERT
        boolean persistResult = userEntityManager.persist(new User("user2", "p2", 18, LocalDate.now()));
        System.out.println(persistResult);

//        //SELECT
//        User first = userEntityManager.findFirst(User.class);
//        System.out.println(first);

    }
}
