package co.edu.cue.hashTables.exercises.exercise1;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String identification;

    public Person(String name, String lastName, int age, String identification) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", identification='" + identification + '\'' +
                '}';
    }
}