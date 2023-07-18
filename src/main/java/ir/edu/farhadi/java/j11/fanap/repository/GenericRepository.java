package ir.edu.farhadi.java.j11.fanap.repository;

import ir.edu.farhadi.java.j11.fanap.model.Human;

import java.util.List;

public interface GenericRepository <T extends Human>{

    void save(T t);

    T update(T t);

    void delete(T t);

    T findByID(T t);

    List<T> getAll();
}
