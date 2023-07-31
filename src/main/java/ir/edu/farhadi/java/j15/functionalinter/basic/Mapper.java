package ir.edu.farhadi.java.j15.functionalinter.basic;

public class Mapper {

    public static void main(String[] args) {
        Convertor<PersonEntity, PersonModel> convertor = (entity) -> new PersonModel(entity.getFirstName(), entity.getLaseName());
        personEntityToPersonModel(convertor);
    }

    public static void personEntityToPersonModel(Convertor<PersonEntity,PersonModel> convertor) {
        PersonEntity entity = new PersonEntity("Mostafa", "Farhadi");
        PersonModel model = convertor.convert(entity);
        System.out.println(model);
    }
    @FunctionalInterface
    public interface Convertor<E,M> {
        M convert(E e);
    }
}
