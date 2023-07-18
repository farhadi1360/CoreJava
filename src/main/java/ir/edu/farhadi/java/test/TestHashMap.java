package ir.edu.farhadi.java.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class    TestHashMap {

    @Test
    public  void hashMapFiltering() {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, ".Net");
        hmap.put(22, "Java");
        hmap.put(33, "NodeJs");
        hmap.put(44, "Python");



        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey().intValue() == 22)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(22, "Java");
        assertTrue(result.equals(mapExcepted));
    }

    @Test
    public void filterMapByBothKeysAndValues() {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, ".Net");
        hmap.put(22, "Java");
        hmap.put(33, "NodeJs");
        hmap.put(44, "Python");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(p -> p.getKey().intValue() <= 22) //filter by key
                .filter(map -> map.getValue().startsWith("J")) //filter by value
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(22, "Java");
        assertTrue(result.equals(mapExcepted));
    }
    @Test
    public void filterAndMapToString(){
        Map<Integer, String> map = getTestHashMap();

        //Map -> Stream -> Filter -> String
        String result = map.entrySet().stream()
                .filter(x -> "Java.com".equals(x.getValue()))
                .map(x->x.getValue())
                .collect(Collectors.joining());
        assertEquals("Java.com", result);
    }
    @Test
    public void filterAndMapToHashMap(){
        Map<Integer, String> map= getTestHashMap();
        //Map -> Stream -> Filter -> MAP
        Map<Integer, String> collect = map.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(2, "Python.com");
        assertEquals(mapExcepted, collect);
    }
    @Test
    public void filterMapByMoreValueAndCollectToMap() {
        Map<Integer, String> mapt = getTestHashMap();
        Map<Integer, String> result = mapt.entrySet()
                .stream()
                .filter(map -> map.getValue().contains("aws.amazon")) //filter by value
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(4, "aws.amazon.com");
        mapExcepted.put(5, "aws.amazon.ec2.com");
        mapExcepted.put(6, "aws.amazon.s3com");
        assertEquals(mapExcepted, result);
    }
    @Test
    public void filterMapValueByPredicate() {
        Map<Integer, String> hosting = getTestHashMap();
        Map<Integer, String> filteredMap = filterByValue(hosting, x -> x.contains("Java"));
        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(1, "Java.com");
        assertEquals(mapExcepted, filteredMap);
    }
    @Test
    public void filterMapOfMultiValueByPredicate() {
        Map<Integer, String> hosting = getTestHashMap();
        Map<Integer, String> filteredMap = filterByValue(hosting, x -> (x.contains("aws") || !x.contains("Python")));
        Map<Integer, String> mapExcepted = new HashMap<>();
        mapExcepted.put(1, "Java.com");
        mapExcepted.put(3, "digitalocean.com");
        mapExcepted.put(4, "aws.amazon.com");
        mapExcepted.put(5, "aws.amazon.ec2.com");
        mapExcepted.put(6, "aws.amazon.s3com");
        assertEquals(mapExcepted, filteredMap);
    }

    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(x -> predicate.test(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static  Map<Integer, String> getTestHashMap() {
        Map<Integer, String> mapt = new HashMap<>();
        mapt.put(1, "Java.com");
        mapt.put(2, "Python.com");
        mapt.put(3, "digitalocean.com");
        mapt.put(4, "aws.amazon.com");
        mapt.put(5, "aws.amazon.ec2.com");
        mapt.put(6, "aws.amazon.s3com");
        return mapt;
    }

}
