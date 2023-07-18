package ir.edu.farhadi.java.j11.fanap.model;

public class Employe extends Human{
    private long salary;

    public Employe(String name, String family, long salary) {
        super(name, family);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


}
