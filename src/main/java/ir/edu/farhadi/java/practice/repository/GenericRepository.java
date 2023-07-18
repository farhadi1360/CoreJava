package ir.edu.farhadi.java.practice.repository;



import java.util.List;

public abstract class GenericRepository<T> {
    public abstract void save(T t);

    public abstract T update(T t);

    public abstract void delete(T t);

    public abstract T findByID(T t);

    public abstract List<T> getAll();
}
