import java.util.ArrayList;
import java.util.List;

public class Contact{

    private int a = 1;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public Contact(int a, String phoneNumber, String firstName, String lastName) {
        this.a = a;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;


    }
     public static void addContact(String[] args) {


         Contact contact1 = new Contact(1, "0745023556", "Emanuel", "Robotin");
         Contact contact2 = new Contact(2, "0742156559", "Ovidiu", "Robotin");
         Contact contact3 = new Contact(3, "0745025524", "Emanuela", "Robotin");
         Contact contact4 = new Contact(4, "0742156500", "Olivia", "Robotin");
         Contact contact5 = new Contact(5, "0745023206", "Ecaterina", "Robotin");
         Contact contact6 = new Contact(6, "0742158059", "Olimpia", "Robotin");
         Contact contact7 = new Contact(7, "0745023666", "Eugen", "Robotin");
         Contact contact8 = new Contact(8, "0742156889", "Adina", "Robotin");
         Contact contact9 = new Contact(9, "0745023446", "Elena", "Robotin");
         Contact contact10 = new Contact(10, "0742178559", "Georgiana", "Robotin");

         List<Contact> contactList1 = new ArrayList<>();
         contactList1.add(contact1);
         contactList1.add(contact2);
         contactList1.add(contact3);
         contactList1.add(contact4);
         contactList1.add(contact5);
         contactList1.add(contact6);
         contactList1.add(contact7);
         contactList1.add(contact8);
         contactList1.add(contact9);
         contactList1.add(contact10);

         for (Contact contact: contactList1) {
             System.out.println(contactList1.listIterator());
         System.out.println(contactList1.toString())
;
         }
         for ( int j=0; j<contactList1.size(); j++ )
             System.out.println("Contacts " + j + ": " + contactList1.get(j) );
     }

         public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "a=" + a +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


