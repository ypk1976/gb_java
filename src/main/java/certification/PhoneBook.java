package certification;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Set<String> phoneNumbers = phoneBook.getOrDefault(name, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public void removeContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            Set<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.remove(phoneNumber);
            if (phoneNumbers.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public void displayContacts() {
        // Создаем список записей в телефонной книге, сортируем его по убыванию числа телефонов
        List<Map.Entry<String, Set<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        // Выводим на экран отсортированные контакты
        for (Map.Entry<String, Set<String>> entry : sortedContacts) {
            String name = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("John", "123456789");
        phoneBook.addContact("John", "987654321");
        phoneBook.addContact("Emma", "555555555");
        phoneBook.addContact("Emma", "777777777");
        phoneBook.addContact("Emma", "999999999");
        phoneBook.addContact("Michael", "111111111");
        phoneBook.displayContacts();
    }
}
