package stream_z2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
             list.add(new Person("Kamil", "Nowak", 20, "male"));
             list.add(new Person("Jan", "Nijak", 30, "male"));
             list.add(new Person("Kamila", "Dzisiaj", 35, "female"));
             list.add(new Person("Justyna", "Nowak", 17, "female"));
        PersonService personService = new PersonService(list);
        System.out.println(personService.findAllMales());
        System.out.println(personService.findAllAdults());
        System.out.println(personService.getAllSurnamesDistinct());
        System.out.println(personService.filterMaleSurnames());
        System.out.println(personService.groupFamilies());
    }
}
