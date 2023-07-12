package orm;

import java.sql.SQLException;

public interface DBContext<E> {

    boolean persist(E entity) throws IllegalAccessException, SQLException;

    Iterable<E> find(Class<E> eClass);

    Iterable<E> find(Class<E> eClass, String where);

    E findFirst(Class<E> table);

    E findFirst(Class<E> table, String where);
}
