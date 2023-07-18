package ir.edu.farhadi.java.j6;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Personnel extends Human {

    public Personnel(){
        System.out.println("Constructor Of Personnel was called");
    }

    private String personnelCode;

    public Personnel(String personnelCode) {
        this.personnelCode = personnelCode;
        System.out.println("Constructor Of Personnel was called with these parameters  ".concat(personnelCode));
    }

    public String getPersonnelCode() {
        return personnelCode;
    }

    public void setPersonnelCode(String personnelCode) {
        this.personnelCode = personnelCode;
    }

    public void checkPersonnelCode() {
        System.out.println("checkPersonnelCode was callled");
    }
    public static void calculateAgeOfPerson(){
        System.out.println("Call calculateAgeOfPerson");
    }


}
