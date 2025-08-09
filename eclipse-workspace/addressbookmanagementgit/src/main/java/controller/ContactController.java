package controller;


import model.ContactModel;
import view.ContactView;

public class ContactController {
    private ContactDatabase db;
    private ContactView view;

    public ContactController(ContactDatabase db, ContactView view) {
        this.db = db;
        this.view = view;
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = view.showMenu();
            switch (choice) {
                case 1:
                    db.addContact(view.getContactInput());
                    break;
                case 2:
                    String editName = view.getNameInput();
                    db.updateContact(editName, view.getContactInput());
                    break;
                case 3:
                    db.deleteContact(view.getNameInput());
                    break;
                case 4:
                    view.showContact(db.searchByName(view.getNameInput()));
                    break;
                case 5:
                    view.showContact(db.searchByPhone(view.getPhoneInput()));
                    break;
                case 6:
                    view.showContact(db.searchByEmail(view.getEmailInput()));
                    break;
                case 7:
                    db.sortByName();
                    break;
                case 8:
                    db.sortByPhone();
                    break;
                case 9:
                    db.sortByEmail();
                    break;
                case 10:
                    view.showAllContacts(db.getAllContacts());
                    break;
                case 11:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
