public class Phone implements SmartPhone {

    private int BATTERY;
   private int batteryLife=80;
    private String name;
    private String colour;
    private String material;

    private int i;
    private String messageContent;
    private String message1;
    private String Phone1;
    private String contentMessage;
    private int a;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Phone(String name, String material, String colour, int BATTERY) {
    }


    //add new contacts
    @Override
    public void addContact( ) {

        Contact contact11 = new Contact(11, "0745023336", "Ema", "Robotin");
        Contact contact12 = new Contact(12, "0742156999", "Ovi", "Robotin");

    }
//send messages;
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        this.phoneNumber=phoneNumber;
        this.messageContent=messageContent;
       batteryLife--;
        System.out.println("Battery status:"+" " +getBatteryLife()+" "+"hours");
        if (messageContent.length() < 500 && batteryLife >= 1) {
          //setMessageContent("----Relax, nothing is under control!-------");
           // Message message1 = new Message("0748025665", "-------Relax, nothing is under control!------");
            System.out.println("Your message:"+" "+getMessageContent()+" "+"has been sent to" +" "+getPhoneNumber());
            System.out.println("Battery life is now:" +" "+(getBatteryLife()-1)+" "+ "hours");

        } else
            System.out.println("Battery is too low!");
    }


    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

     @Override
    public void listMessages(String phoneNumber) {

       this.phoneNumber= phoneNumber;
      // System.out.println("The message:"+ getMessageContent()+" "+ "was send it to the following number:"+" "+getPhoneNumber());
    }


//call contacts
    @Override
    public void call(String phoneNumber) {
  this.phoneNumber= phoneNumber;


        batteryLife--;
        System.out.println("Battery status:"+" " +getBatteryLife()+" "+"hours");
        if (batteryLife >= 2) {


            System.out.println("Your call was succesfull initiate to:" + " "+getPhoneNumber());
            System.out.println("Battery life is now:" +" "+(getBatteryLife()-2)+" "+ "hours");

        } else
            System.out.println("Battery is too low!");
    }



    @Override
    public void viewHistory() {

    }

    public Phone(int battery, String name, String material, String colour, int batteryLife) {
        BATTERY = battery;
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.batteryLife = batteryLife;

    }


    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void addContact(int a, String phoneNumber, String firstName, String lastName) {
        this.a = a;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;

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
        return "Phone{" +
                "BATTERY=" + BATTERY +
                ", batteryLife=" + batteryLife +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", i=" + i +
                ", messageContent='" + messageContent + '\'' +
                ", message1='" + message1 + '\'' +
                ", Phone1='" + Phone1 + '\'' +
                ", contentMessage='" + contentMessage + '\'' +
                ", a=" + a +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


