package co.edu.cue.ed.collections.set.linkedHashSet;



import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private String userName;

    public Person(String name, String lastname, String userName) {
        this.name = name;
        this.lastname = lastname;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(userName, person.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
