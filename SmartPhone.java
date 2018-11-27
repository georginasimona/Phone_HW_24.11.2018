public interface SmartPhone {



    void addContact();
    void sendMessage(String phoneNumber, String contentMessage);
    void listMessages(String phoneNumber);
    void call(String phoneNumber);
    void viewHistory();



    }
