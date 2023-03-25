package Session_4.provateExamples;

public class Person {

    private String name;


    private static Person person;

    private Person(String name) {
        this.name = name;
    }

    public static Person init(String name) {

        if (person == null) {
            person = new Person(name);
            return person;
        } else {
            return person;
        }
    }

    public String getName() {
        return name;
    }
}