import java.util.*;
/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что в во входной структуре будут
 * повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами.
 * Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Mariya Lazareva", "+7(925)456-89-75");
        phoneBook.addContact("Dmitrij Usov", "+7(905)546-23-53");
        phoneBook.addContact("Oleg Kravchenko", "+7(925)457-49-75");
        phoneBook.addContact("Tatiana Popova", "+7(905)578-33-53");
        phoneBook.addContact("Petr Sotnikov", "+7(905)678-33-52");
        phoneBook.addContact("Olesya Luneva", "+7(925)356-89-75");
        phoneBook.addContact("Dmitrij Usov", "+7(903)756-62-25");
        phoneBook.addContact("Tatiana Popova", "+7(903)756-11-25");
        phoneBook.addContact("Petr Sotnikov", "+7(903)456-11-21");
        phoneBook.addContact("Petr Sotnikov", "+7(903)456-00-24");

        phoneBook.printPhoneBook();
    }
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());

        list.sort(Comparator.comparingInt(el -> el.getValue().size()));
        Collections.reverse(list);

        for (Map.Entry<String, List<String>> el : list) {
            System.out.println(el.getValue().size() + ". " + el.getKey() + ": " + el.getValue());
        }
    }
}