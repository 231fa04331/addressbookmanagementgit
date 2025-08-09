package main;

import controller.ContactController;
import model.ContactDatabase;
import view.ContactView;

public class ContactMain {
    public static void main(String[] args) {
        ContactDatabase db = new ContactDatabase();
        ContactView view = new ContactView();
        ContactController controller = new ContactController(db, view);
        controller.start();
    }
}
