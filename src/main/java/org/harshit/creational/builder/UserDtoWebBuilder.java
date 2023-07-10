package org.harshit.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDtoWebBuilder implements UserDtoBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto dto;
    @Override
    public UserDtoBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date,LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address = address.getHouseNumber()+", "+ address.getStreet()
                +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
        return this;
    }

    @Override
    public UserDto build() {
        dto = new UserWebDto(firstName+" "+lastName,address,age);
        return dto;
    }

    @Override
    public UserDto getUserDto() {
        return dto;
    }
}
