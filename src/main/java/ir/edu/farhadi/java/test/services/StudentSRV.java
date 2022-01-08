package ir.edu.farhadi.java.test.services;

import ir.edu.farhadi.java.test.dao.DatabaseDAOInterface;
import ir.edu.farhadi.java.test.dao.StudentDAOInterface;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class StudentSRV {

    DatabaseDAOInterface interfaceDAO = new StudentDAOInterface();

    private void save() {
        interfaceDAO.save();
    }
    private void update() {
        interfaceDAO.update();
    }
    private void findByName(String name) {
        interfaceDAO.findByName(name);
    }
}
