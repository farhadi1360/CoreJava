package ir.edu.farhadi.java.j11.fanap.services;

import ir.edu.farhadi.java.j11.fanap.model.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    Student update(Student student);

    Student getById(Student student);

    void delete(Student student);

    List<Student> getAll();
}
