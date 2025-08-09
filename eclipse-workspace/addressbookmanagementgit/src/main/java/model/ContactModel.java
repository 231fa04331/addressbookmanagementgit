package model;

import java.util.ArrayList;
import java.util.List;

public class ContactModel {
    // ------------------ Contact Fields ------------------
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;

    // Constructor
    public ContactModel(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + phone + " | " + email + " | " + address;
    }

    // ------------------ Database Inside Model ------------------
    public static class ContactDatabase {
        private List<ContactModel> contacts;

        public ContactDatabase() {
            contacts = new ArrayList<>();
        }

        public void addContact(ContactModel contact) {
            contacts.add(contact);
        }

        public List<ContactModel> getAllContacts() {
            return contacts;
        }

        public ContactModel findByName(String name) {
            for (ContactModel c : contacts) {
                if (c.getName().equalsIgnoreCase(name)) {
                    return c;
                }
            }
            return null;
        }

        public ContactModel findByPhone(String phone) {
            for (ContactModel c : contacts) {
                if (c.getPhone().equals(phone)) {
                    return c;
                }
            }
            return null;
        }

        public ContactModel findByEmail(String email) {
            for (ContactModel c : contacts) {
                if (c.getEmail().equalsIgnoreCase(email)) {
                    return c;
                }
            }
            return null;
        }

        public boolean updateContact(int id, String name, String phone, String email, String address) {
            for (ContactModel c : contacts) {
                if (c.getId() == id) {
                    c.setName(name);
                    c.setPhone(phone);
                    c.setEmail(email);
                    c.setAddress(address);
                    return true;
                }
            }
            return false;
        }

        public boolean deleteContact(int id) {
            return contacts.removeIf(c -> c.getId() == id);
        }
    }
}
