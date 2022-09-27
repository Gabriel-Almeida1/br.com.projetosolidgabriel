package Main;

import Client.*;

public class Main {

    public static void main(String[] args) {

        StateRegistrationIndicator stateRegistrationIndicator = new StateRegistrationIndicator(
                "323.565",
                "31.1234.78"
        );

        Sex sex = new Sex(
                "323.565",
                "Male"
                );

        Contact contact = new Contact(
            "323.565",
            "+55 83 99141-8631",
            "gaa.alcz@live.com"
        );

        Address address = new Address(
                "323.565",
                "58900-000",
                "PB",
                "Cajazeiras",
                "Center",
                "Rua Tenente Arsenio",
                "311"
        );

        LegalClient legalClient = new LegalClient(
                "323.565",
                contact,
                address,
                true,
                "27/09/2022",
                "01.4456.7987.0001/01",
                "Distribuidora Santos",
                "Patricia Almeida",
                stateRegistrationIndicator,
                "Paraiba",
                "Cajazeiras"
        );

        PhysicalClient physicalClient = new PhysicalClient(
                "323.565",
                contact,
                address,
                true,
                "27/09/2022",
                "Gabriel Almeida",
                "123.456.789-11",
                "212211 3",
                "SSP-PB",
                sex,
                "06/11/1997"
                );
    }

}
