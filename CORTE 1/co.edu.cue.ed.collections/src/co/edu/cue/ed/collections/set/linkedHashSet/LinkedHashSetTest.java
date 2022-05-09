package co.edu.cue.ed.collections.set.linkedHashSet;



import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Person p1 = new Person("Santiago", "Jaramillo", "sjaramillo");
        Person p2 = new Person("Antonio", "Banderas", "anto_flags");
        Person p3 = new Person("Sergio", "Jaramillo", "sjaramillo");
        Person p4 = new Person("Felipe", "Ortiz", "feliOrtiz");

        Set<Person> people = new LinkedHashSet<>();

        people.add(p4);
        people.add(p1);
        people.add(p3);
        people.add(p2);

        for (Person person : people) {
            System.out.println(person);
            System.out.println(person.hashCode());
        }

        //people.
    }
}
