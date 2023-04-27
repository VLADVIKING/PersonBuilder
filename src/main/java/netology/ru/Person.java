package netology.ru;

import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected static int age;
    protected static String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static int getAge() {
        return age;
    }

    public static String getAddress() {
        return address;
    }

    public static boolean hasAge() {
        if (getAge() != 0) {
            return true;
        }
        return false;
    }

    public static boolean hasAddress() {
        if (getAddress() != null) {
            return true;
        }
        return false;
    }

    public static int happyBirthday() {
        age = getAge() + 1;
            return age;
    }


    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(name, getSurname(), 5 , getAddress());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}
