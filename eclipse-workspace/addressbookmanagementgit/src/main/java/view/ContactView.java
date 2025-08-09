package view;

import model.ContactModel;
import java.util.List;
import java.util.Scanner;

public class ContactView {
    private Scanner sc;

    public ContactView() {
        sc = new Scanner(System.in);
    }

    public ContactModel getContactInput() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        return new ContactModel(name, phone, email, address);
    }

    public String getNameInput() {
        System.out.print("Enter Name: ");
        return sc.nextLine();
    }

    public String getPhoneInput() {
        System.out.print("Enter Phone Number: ");
        return sc.nextLine();
    }

    public String getEmailInput() {
        System.out.print("Enter Email: ");
        return sc.nextLine();
    }

    public void showContact(ContactModel contact) {
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("❌ Contact not found!");
        }
    }

    public void showAllContacts(List<ContactModel> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (ContactModel contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public int showMenu() {
        System.out.println("\n📒 Address Book Menu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Edit Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Search by Name");
        System.out.println("5. Search by Phone");
        System.out.println("6. Search by Email");
        System.out.println("7. Sort by Name");
        System.out.println("8. Sort by Phone");
        System.out.println("9. Sort by Email");
        System.out.println("10. View All Contacts");
        System.out.println("11. Exit");
        System.out.print("Enter choice: ");
        return Integer.parseInt(sc.nextLine());
    }
}
