package ir.edu.farhadi.java.j15.methosrefrencs.simple;

import ir.edu.farhadi.java.j15.functionalinter.basic.PersonEntity;
import ir.edu.farhadi.java.j15.functionalinter.basic.PersonModel;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Mapper<E, M> {
    E toEntity(M model);

}

public class Test3 {

    public static void main(String[] args) {
//        step1();
//        step2();
        step3();
    }

    public static void step1() {
        Mapper<PersonEntity, PersonModel> mapper = Test3::toEntity;
        PersonEntity personEntity = mapper.toEntity(new PersonModel("Mostafa", "Farhadi"));
        System.out.println(personEntity);
    }

    public static void step2() {
        BiFunction<String,String,PersonEntity> personEntityConstructor = PersonEntity::new;
        PersonEntity personEntity = personEntityConstructor.apply("Mostafa", "Farhadi");
        System.out.println(personEntity);
    }

    public static void step3(){
        Supplier<PersonEntity> personEntitySupplier = PersonEntity::new;
        PersonEntity personEntity = personEntitySupplier.get();
        personEntity.setFirstName("Javad");
        personEntity.setLaseName("Karimi");
        System.out.println(personEntity);
    }


    public static PersonEntity toEntity(PersonModel model) {
        return new PersonEntity(model.getName(), model.getFamily());
    }

}
