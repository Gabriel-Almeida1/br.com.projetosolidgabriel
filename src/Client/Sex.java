package Client;

public class Sex {

    String id;
    String sexualOrientation;

    public Sex(String id, String sexualOrientation) {
        this.id = id;
        this.sexualOrientation = sexualOrientation;
    }

    public String getId() {
        return id;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id='" + id + '\'' +
                ", sexualOrientation='" + sexualOrientation + '\'' +
                '}';
    }
}
