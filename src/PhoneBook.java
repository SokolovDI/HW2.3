import java.util.*;
import java.util.Collections;

public class PhoneBook {
    private final HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String person, String phoneNumber) {
        if (book.containsKey(person)) {
            List<String> numbers = book.get(person);
            if (!numbers.contains(phoneNumber)) {
                numbers.add(phoneNumber);
                System.out.printf("%s добавлен для %s%n", phoneNumber, person);
            }
        } else {
            book.put(person, new ArrayList<>(Collections.singletonList(phoneNumber)));
            System.out.printf("%s добавлен для %s%n", phoneNumber, person);
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname))
            return book.get(surname);
        else {
            System.out.printf("%s не найден", surname);
            return new ArrayList<>();
        }
    }

    public static void Task2() {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("SkyWalker", "111111");
        phonebook.add("Vader", "222222");
        phonebook.add("Solo", "333333");
        phonebook.add("SkyWalker", "444444");
        phonebook.add("Vader", "555555");

        System.out.println("SkyWalker");
        System.out.println(phonebook.get("SkyWalker"));
        System.out.println("Vader");
        System.out.println(phonebook.get("Vader"));
        System.out.println("Solo");
        System.out.println(phonebook.get("Solo"));

        phonebook.add("SkyWalker", "666666");
        System.out.println("SkyWalker");
        System.out.println(phonebook.get("SkyWalker"));

        System.out.println(phonebook.get("Yoda"));
    }
}
