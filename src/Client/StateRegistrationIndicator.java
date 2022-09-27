package Client;

public class StateRegistrationIndicator {

    String id;
    String indicator;

    public StateRegistrationIndicator(String id, String indicator) {
        this.id = id;
        this.indicator = indicator;
    }

    public String getId() {
        return id;
    }

    public String getIndicator() {
        return indicator;
    }

    @Override
    public String toString() {
        return "StateRegistrationIndicator{" +
                "id='" + id + '\'' +
                ", indicator='" + indicator + '\'' +
                '}';
    }
}
