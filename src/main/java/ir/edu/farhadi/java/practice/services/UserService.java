package ir.edu.farhadi.java.practice.services;

import ir.edu.farhadi.java.practice.models.Penalty;
import ir.edu.farhadi.java.practice.models.User;

public interface UserService {
    void save(User user);

    User update(User user);

    void delete(User user);

    User findByID(User user);

    void deposit(User user);

    void charge(User user, Penalty penalty);
}
