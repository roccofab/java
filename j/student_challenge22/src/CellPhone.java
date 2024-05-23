import java.util.ArrayList;
import java.util.Scanner;

public class CellPhone {
    long phoneNo;
    long Imei;
    private ArrayList<Contact> contacts;

    public CellPhone(long phoneNo, long Imei) {
        this.phoneNo = phoneNo;
        this.Imei = Imei;
        this.contacts = new ArrayList<>();
    }
    public void sendMessage(long phoneNo, String message) {  //find contact by number and then sent the message to the contact
        Contact contact = findByNum(phoneNo);
        if (contact != null) {
            System.out.println("New Message Sent to " + contact.getName() + " : " + message);
        } else {
            System.out.println("Contact with phone number " + phoneNo + " not found.");
        }
    }
    public void callContact(long phoneNo) {   //find contact by number and then call him
        Contact contact = findByNum(phoneNo);
        if (contact != null) {
            System.out.println("Calling: " +contact.getPhoneNo());
        } else {
            System.out.println("Contact with phone number " + phoneNo + " not found.");
        }
    }
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println(contact.getName() + " has been added");
    }
    public void removeContact(Contact contact) {
        contacts.remove(contact);
        System.out.println(contact.getName() + " has been removed");
    }
    public void printContacts() {
        for (Contact contact : contacts) {
            if(contacts.isEmpty()){
                System.out.println("No Contacts Found");
                return;
            } else {
                System.out.println(contact.getName());
            }
        }
    }
    public Contact findByNum(long phoneNo) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNo() == phoneNo) {
                return contact;
            }
        }
        return null;
    }
    public void callContactByNum(long phoneNo) {
        Contact contact = findByNum(phoneNo);
        if (contact != null) {
            callContact(contact.getPhoneNo());
        } else {
            System.out.println("Number: " +contact.getPhoneNo()+ " Not Found");
        }
    }
}
