package marko_manev;

final class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy-Konstruktor (private, weil nur copyOf ihn nutzt)
    private Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Statische Factory-Methode
    public static Person copyOf(Person p) {
        if (p == null) {
            throw new IllegalArgumentException("Person darf nicht null sein");
        }
        return new Person(p);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Copyof {

    public static void main(String[] args) {

        Person p1 = new Person("Jolanta", 30);

        Person p2 = Person.copyOf(p1);

        System.out.println("Original: " + p1);
        System.out.println(p1.getName());

        System.out.println("Kopie:    " + p2);
        System.out.println(p2.getName());

    }
}
 