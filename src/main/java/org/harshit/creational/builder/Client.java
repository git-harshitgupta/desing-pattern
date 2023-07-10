package org.harshit.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        UserDtoBuilder userDtoBuilder= new UserDtoWebBuilder();
        UserDto userDto = directBuild(userDtoBuilder,createUser());
        System.out.println(userDto);
    }

    private static UserDto directBuild(UserDtoBuilder builder, User user){
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
