package ir.edu.farhadi.java.j15.predicate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    static String line = "";
    static final String splitBy = ",";
    public static void main(String[] args) {
//        simplePredicate();

        List<People> peopleList = readDataFromCSVFile();

        Predicate<People> cityCheck = people -> ("Tehran".equalsIgnoreCase(people.getCity()));


        Double totalSalaryFromTehran = peopleList.stream().filter(cityCheck)
                .mapToDouble(p -> Double.parseDouble(p.getSalary()))
                .sum();

        System.out.println("Totally Salary From Tehran Is :  "+totalSalaryFromTehran);

    }

    private static void simplePredicate() {
        Predicate<Integer> greater_than = x -> (x > 10);
        System.out.println(greater_than.test(11));
    }


    private static List<People> readDataFromCSVFile() {
        List<People> peopleList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\csv\\people.csv"));
            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                People people = new People(employee[0],employee[1],employee[2],employee[3],employee[4]);
                peopleList.add(people);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return peopleList;
    }
}
