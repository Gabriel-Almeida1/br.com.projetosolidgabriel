package Client;
import java.util.Date;

public class Client {

    String id;  // como settar um ID para todos os outros ficando algo mais padrão;
    Contact contact;
    Address address;
    boolean activeClient;
    String registrationDate;

    public Client(String id,
                  Contact contact,
                  Address address,
                  boolean activeClient,
                  String registrationDate) {
        this.id = id;
        this.contact = contact;
        this.address = address;
        this.activeClient = activeClient;
        this.registrationDate = registrationDate;
    }

    public String getId() {
        return id;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isActiveClient() {
        return activeClient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", activeClient=" + activeClient +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
