package ir.edu.farhadi.java.j4.fanap;

public class Factory {
    private String name;

    public static void main(String[] args) {
        testAccess(Access.ADMIN);
    }

    public static void  testAccess(String role) {
        if (role.equals(Access.ADMIN)){
            System.out.println("All Actions");
        }else if (role.equals(Access.USER)){
            System.out.println("Just View");
        }
    }
}
