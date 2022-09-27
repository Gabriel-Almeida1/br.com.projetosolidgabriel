package Client;
import java.util.Date;

public class PhysicalClient extends Client {

    String fullName;
    String cpf;
    String rg;
    String issuingEntity;
    Sex sexo;
    String birthDate;

    public PhysicalClient(String id,
                          Contact contact,
                          Address address,
                          boolean activeClient,
                          String registrationDate,
                          String fullName,
                          String cpf,
                          String rg,
                          String issuingEntity,
                          Sex sexo,
                          String birthDate) {
        super(id, contact, address, activeClient, registrationDate);
        this.fullName = fullName;
        this.cpf = cpf;
        this.rg = rg;
        this.issuingEntity = issuingEntity;
        this.sexo = sexo;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getIssuingEntity() {
        return issuingEntity;
    }

    public Sex getSexo() {
        return sexo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "PhysicalClient{" +
                "fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", issuingEntity='" + issuingEntity + '\'' +
                ", sexo=" + sexo +
                ", birthDate=" + birthDate +
                ", id='" + id + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", activeClient=" + activeClient +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
