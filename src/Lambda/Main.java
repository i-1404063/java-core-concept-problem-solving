package Lambda;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    // here we used Predicate functional interface which is built in already in
    // java.
    public static void getPersonsGreaterThanAgePredicate(List<Person> peoples, Predicate<Person> tester) {

        for (Person people : peoples) {
            if (tester.test(people)) {
                System.out.println(people);
            }
        }
    }

    public static void main(String... args) {

        List<Person> peoples = Person.getDefaultPersons();
        getPersonsGreaterThanAgePredicate(peoples, p -> {
            return p.getSex() == Person.Sex.MALE && p.getAge() > 22;
        });

    }
}
