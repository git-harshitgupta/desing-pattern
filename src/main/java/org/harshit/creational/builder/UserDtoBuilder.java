package org.harshit.creational.builder;

import java.time.LocalDate;

public interface UserDtoBuilder {
    UserDtoBuilder withFirstName(String fname);
    UserDtoBuilder withLastName(String lname);
    UserDtoBuilder withBirthday(LocalDate date);
    UserDtoBuilder withAddress(Address address);
    UserDto build();
    UserDto getUserDto();
}
