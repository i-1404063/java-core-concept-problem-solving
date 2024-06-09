package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private Integer age;
    private Sex sex;

    public Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }

    public String printPerson() {
        return this.toString();
    }

    public static List<Person> getDefaultPersons() {
        ArrayList<Person> peoples = new ArrayList<>();

        peoples.add(
                new Person("shabbir", 21, Sex.MALE));

        peoples.add(
                new Person("tamim", 18, Sex.MALE));

        peoples.add(
                new Person("Jony", 26, Sex.MALE));

        peoples.add(
                new Person("farin", 23, Sex.FEMALE));

        return peoples;
    }
}
