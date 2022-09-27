package Client;

public class Address {

    String id;
    String cep;
    String uf;
    String city;
    String district;
    String street;
    String complement;

    public Address(String id,
                   String cep,
                   String uf,
                   String city,
                   String district,
                   String street,
                   String complement) {
        this.id = id;
        this.cep = cep;
        this.uf = uf;
        this.city = city;
        this.district = district;
        this.street = street;
        this.complement = complement;
    }

    public String getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
