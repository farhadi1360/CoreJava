package ir.edu.farhadi.java.j15.methosrefrencs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

//        sample1ForMethodReferencing();
        sample2ForMethodReferencing();

    }

    /* i am going to create new list of userEntity by using
        method reference and Consumer (new feathers in java 8)
     */
    private static void sample1ForMethodReferencing(){
        UserEntity [] userEntities = {
                new UserEntity("Mustafa","Farhadi"),
                new UserEntity("Javad","Karimi"),
                new UserEntity("Alireza","Darabi")
        };

        List<UserEntity> userEntityList = Arrays.asList(userEntities);
        List<UserEntity> userList = new LinkedList<>();
        Consumer<UserEntity> userDTOConsumer = userList::add;
        userEntityList.forEach(userDTOConsumer);
        userList.forEach(System.out::println);
    }

    private static void sample2ForMethodReferencing(){
        Converter<UserEntity,UserDTO> converter = Mapper::toDTO;
        UserDTO userDTO = converter.convert( new UserEntity("Mustafa","Farhadi"));
        System.out.println(userDTO);

    }

}
