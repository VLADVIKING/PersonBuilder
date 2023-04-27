package netology.ru;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    protected PersonBuilder(String name, String surname, int age, String address){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    protected PersonBuilder(){}

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
    }

    public Person build(){
        if (name == null || surname == null) {
            throw new IllegalStateException();
        }
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        return new Person(name, surname, age, address);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
