package netology.ru;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

    try { Person person1 = new PersonBuilder().setName("Ivan")
                .setSurname("Ivanov")
                .setAge(25)
                .build();
        System.out.println(person1);
    } catch (IllegalStateException e) {
        e.printStackTrace();
    }

    try { Person person2 = new PersonBuilder().setName("Petya")
                .setSurname("Petrov")
                .setAge(-100)
                .build();
        System.out.println(person2);
    } catch (IllegalArgumentException e) {
        e.printStackTrace();
    }
}
}