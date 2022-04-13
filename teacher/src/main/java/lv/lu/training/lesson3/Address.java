package lv.lu.training.lesson3;

public class Address {

    private String street;
    private int houseNumber;
    private String city;
    private String country;
    private String zipCode;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getFullAddress() {
        return street
                + " "
                + houseNumber
                + ", "
                + city
                + ", "
                + country
                + ", "
                + zipCode;
    }

}
