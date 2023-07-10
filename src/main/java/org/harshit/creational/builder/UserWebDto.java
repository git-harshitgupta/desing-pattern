package org.harshit.creational.builder;

public class UserWebDto implements UserDto{
    private String name;
    private String address;
    private String age;

    public UserWebDto(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
