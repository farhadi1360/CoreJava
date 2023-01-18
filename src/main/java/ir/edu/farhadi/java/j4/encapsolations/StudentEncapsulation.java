package ir.edu.farhadi.java.j4.encapsolations;

import com.googlecode.gwt.crypto.util.Str;

public class StudentEncapsulation {

    private String name;

    private int age;

    public int readAge() {
        return age;
    }

    public void writeNAme(String name) {
        this.name = name;
    }
    public String readName(){
        return name;
    }
    public void writeAge(int age) {
        if (age>0){
            this.age = age;
        }else {
            throw new RuntimeException("Your age is not defined in the allowed range");
        }
    }


    void takeClass(){
        System.out.println(readName().concat(" with "+ readAge() +"".concat(" Can Take a Class")));
    }

    void reject(){
        System.out.println(readName().concat(" with "+ readAge() +"".concat(" must be Reject")));
    }
}
