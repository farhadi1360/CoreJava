package ir.edu.farhadi.java.j15.methosrefrencs;

public class Mapper {

    public static UserDTO toDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO("DTO"+userEntity.getName(),userEntity.getFamily());
        return userDTO;
    }
}
