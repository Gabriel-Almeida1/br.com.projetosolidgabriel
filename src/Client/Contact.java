package Client;

public class Contact {

    String id;
    String contactNumber;
    String email;

    public Contact(String id, String contactNumber, String email) {
        this.id = id;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
