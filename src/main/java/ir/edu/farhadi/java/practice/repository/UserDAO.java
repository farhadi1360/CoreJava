package ir.edu.farhadi.java.practice.repository;

import ir.edu.farhadi.java.practice.models.User;

import java.util.List;

public class UserDAO extends GenericRepository<User>{


    @Override
    public void save(User user) {
        System.out.println("User with name of ".concat(user.getName()).concat(" was saved"));
    }

    @Override
    public User update(User user) {
        System.out.println("User with name of ".concat(user.getName()).concat(" was updated"));
        return user;
    }

    @Override
    public void delete(User user) {
        System.out.println("User with name of ".concat(user.getName()).concat(" was deleted"));
    }

    @Override
    public User findByID(User user) {
        return user;
    }

    @Override
    public List<User> getAll() {
        return null;
    }


}
