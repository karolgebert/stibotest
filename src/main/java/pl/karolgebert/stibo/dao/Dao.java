package pl.karolgebert.stibo.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    T save(T t);

    void update(long id, T t);

    void delete(long id);
}
