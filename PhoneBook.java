import java.util.*;

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
}