package ir.edu.farhadi.java.test;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TestLogic {

    int[] items = {10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55};

    int[] numbers = new int[]{-8, 7, 5, 9, 10, -2, 3};

    char cArr[] = {'r','q','s','p'};

    String[] strings = new String[]{"Mustafa", "Reza", "Shervin", "Ali"};

    Employee mustafa = new Employee(6, "Mustafa");
    Employee shervin = new Employee(3, "Shervin");
    Employee reza = new Employee(4, "Reza");
    Employee[] employees = new Employee[]{mustafa, shervin, reza};


    @Test
    public void findMaxFromItems() {
        int max = Arrays.stream(items).max().getAsInt();
        assertEquals(100, max);
    }

    @Test
    public void findMinFromItems() {
        int min = Arrays.stream(items).min().getAsInt();
        assertEquals(0, min);
    }

    @Test
    public void findMaxFromCollections() {
        List<Integer> numbers = Arrays.stream(items).boxed().collect(Collectors.toList());
        Integer max = Collections.max(numbers);
        assertEquals(100, max.intValue());
    }

    @Test
    public void findMinFromCollections() {
        List<Integer> numbers = Arrays.stream(items).boxed().collect(Collectors.toList());
        Integer min = Collections.min(numbers);
        assertEquals(0, min.intValue());
    }
    @Test
    public void sortNumberArray(){
        Arrays.sort(numbers);
        assertArrayEquals(new int[] { -8, -2, 3, 5, 7, 9, 10 }, numbers);
    }
    @Test
    public void sortCharArray() {
        Arrays.sort(cArr);
        assertArrayEquals(new char[]{'p','q','r', 's'}, cArr);
    }

    @Test
    public void sortStringArray() {
        Arrays.sort(strings);
        assertArrayEquals(new String[] { "Ali", "Mustafa","Reza","Shervin" }, strings);
    }
    @Test
    public void sortByEmployeesObjects() {
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        assertArrayEquals(new Employee[] {mustafa,reza,shervin}, employees);
    }
    @Test
    public void sortByEmployeeWithComplexFields(){
        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getCode));
        assertArrayEquals(new Employee[] {mustafa,reza,shervin}, employees);
    }
    @Test
    public void findCountOccurrencesOfCharacter() {
        String someString = "elephant";
        long count = someString.chars().filter(ch -> ch == 'e').count();
        assertEquals(2, count);
    }
    @Test
    public void findCountOccurrenceOfEachCharacter() {
        String word = "AAABBB";
        Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> mapExcepted = new HashMap<>();
        mapExcepted.put("A", 3l);
        mapExcepted.put("B", 3l);
        assertTrue(charCount.equals(mapExcepted));

    }



}
