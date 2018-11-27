import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Phone phone1 = new Samsung("Samsung Galaxy S6", "Aluminium", "Black", 80);
        Phone phone2 = new Samsung("Samsung Galaxy S8", "Glass", "Red", 90);
        Phone phone3 = new Assus("Assus ZenPhone 2", "Metal", "Gold", 100);
        Phone phone4 = new Assus("Assus ZenPhone 4", "Metal& Glass& Plastic", "Pink", 48);

       Contact contact11 = new Contact(1, "0745023556", "Emanuel", "Robotin");
       Contact contact12 = new Contact(2, "0742156559", "Ovidiu", "Robotin");

        System.out.println("The following contact was added to Contact List:\t" + contact11.getPhoneNumber() +" "+ contact11.getFirstName() +" "+ contact11.getLastName());
        System.out.println("The following contact was added to Contact List:\t" + contact12.getPhoneNumber() +" "+ contact12.getFirstName() + " "+ contact12.getLastName());



//add new contact to phone1, phone2, phone3 and phone 4;
        phone1.addContact(1,"07585624521","Geo","Ausan");
        phone1.addContact(2,"07585584521","Geogi","Ana");

        phone2.addContact(1,"0757770156","Mihaela","Filip");
        phone2.addContact(2,"0759957156","Ela","Filip");

        phone3.addContact(1,"0757778856","Radu","Filip");
        phone3.addContact(2,"0755557156","Margareta","Filip");

        phone4.addContact(1,"0755778856","Raluca","Filip");
        phone4.addContact(2,"0733357156","Marga","Filip");


            phone1.addContact();

        phone1.sendMessage("0745023556","-----Relax, nothing is under control!------");

        phone1.listMessages("0748025665");
        phone1.call("0742156559");

    }


}
