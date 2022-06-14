package stream_z2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> list;

    public PersonService(List<Person> list) {
        this.list = list;
    }

    public List<Person> findAllMales(){
        return list.stream()
                .filter(person -> person.getGender().equals("male"))
                .collect(Collectors.toList());
    }

    public List<Person> findAllAdults(){
        return list.stream()
                .filter(person -> person.getAge()>=18)
                .collect(Collectors.toList());
    }

    public List<String> getAllSurnamesDistinct(){
        return list.stream()
                .map(Person::getSurname)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> filterMaleSurnames(){
        return list.stream()
                .filter(person -> person.getGender().equals("male"))
                .map(Person::getSurname)
                .collect(Collectors.toList());
    }

    public Map<String,List<Person>> groupFamilies(){
        return list.stream()
                .collect(Collectors.groupingBy(person -> person.getSurname()));
    }

}
