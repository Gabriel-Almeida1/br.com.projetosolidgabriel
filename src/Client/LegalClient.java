package Client;

import java.util.Date;

public class LegalClient extends Client {

    String cnpj;
    String companyName;
    String corporateName;
    StateRegistrationIndicator stateRegistrationIndicator;
    String stateRegistration;
    String cityRegistration;

    public LegalClient(String id,
                       Contact contact,
                       Address address,
                       boolean activeClient,
                       String registrationDate,
                       String cnpj,
                       String companyName,
                       String corporateName,
                       StateRegistrationIndicator stateRegistrationIndicator,
                       String stateRegistration,
                       String cityRegistration) {
        super(id, contact, address, activeClient, registrationDate);
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.corporateName = corporateName;
        this.stateRegistrationIndicator = stateRegistrationIndicator;
        this.stateRegistration = stateRegistration;
        this.cityRegistration = cityRegistration;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public StateRegistrationIndicator getStateRegistrationIndicator() {
        return stateRegistrationIndicator;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public String getCityRegistration() {
        return cityRegistration;
    }

    @Override
    public String toString() {
        return "LegalClient{" +
                "cnpj='" + cnpj + '\'' +
                ", companyName='" + companyName + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", stateRegistrationIndicator=" + stateRegistrationIndicator +
                ", stateRegistration='" + stateRegistration + '\'' +
                ", cityRegistration='" + cityRegistration + '\'' +
                ", id='" + id + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", activeClient=" + activeClient +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
