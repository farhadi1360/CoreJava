package ir.edu.farhadi.java.j15.methosrefrencs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
//        testByLambda();
//        sample1ForMethodReferencing();
//        sample2ForMethodReferencing();
        testByMethodReference();
    }

    /* i am going to create new list of userEntity by using
        method reference and Consumer (new feathers in java 8)
     */
    private static void sample1ForMethodReferencing() {
        List<UserEntity> userEntityList = Arrays.asList(getAllUserEntities());
        List<UserEntity> userList = new ArrayList<>();
        Consumer<UserEntity> userDTOConsumer = userList::add;
        Consumer consumer = System.out::println;
        userEntityList.forEach(userDTOConsumer);
        userList.forEach(consumer);
    }

    private static void testByLambda() {
        List<UserEntity> userEntityList = Arrays.asList(getAllUserEntities());
        List<UserEntity> userList = new ArrayList<>();
        userEntityList.forEach(user -> {
            userList.add(user);
        });
        userList.forEach(System.out::println);
    }

    private static void testByMethodReference() {
        List<UserEntity> userEntityList = Arrays.asList(getAllUserEntities());
        List<UserEntity> userList = new ArrayList<>();
        userEntityList.forEach(userList::add);
        userList.forEach(System.out::println);
    }

    private static UserEntity[] getAllUserEntities() {
        UserEntity[] userEntities = {
                new UserEntity("Mustafa", "Farhadi"),
                new UserEntity("Javad", "Karimi"),
                new UserEntity("Alireza", "Darabi")
        };
        return userEntities;
    }

    private static void sample2ForMethodReferencing() {
        Converter<UserEntity, UserDTO> converter = Mapper::toDTO;
        doAction(converter);

    }

    private static void doAction(Converter<UserEntity, UserDTO> converter) {
        UserDTO userDTO = converter.convert(new UserEntity("Mustafa", "Farhadi"));
        System.out.println(userDTO);
    }
}
