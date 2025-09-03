package remaining_topics.object;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bob");
        int i = 5;

        setPersonName(person, i);
        System.out.println(person.getName() + " " + i);

        getAnotherObjectNot(person);
        System.out.println(person.getName());

        Person anotherPerson;
        anotherPerson = getAnotherObject();
        System.out.println(anotherPerson.getName());
    }

    private static void setPersonName(Person person, int num) {
        person.setName("sumit");
        num = 99;
    }

    private static void getAnotherObjectNot(Person person) {
        person = new Person();
        person.setName("shesh");
    }

    private static Person getAnotherObject() {
        Person person = new Person();
        person.setName("main");
        return person;
    }
}
