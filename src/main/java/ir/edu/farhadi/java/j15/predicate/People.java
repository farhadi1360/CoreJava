package ir.edu.farhadi.java.j15.predicate;

import java.io.Serializable;

public class People implements Serializable {
    private String firstName;
    private String lastName;
    private String contact;
    private String salary;
    private String city;

    public People(String firstName, String lastName, String contact, String salary, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

