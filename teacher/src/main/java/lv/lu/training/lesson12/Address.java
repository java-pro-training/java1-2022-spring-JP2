package lv.lu.training.lesson12;

public class Address {

    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public Address(String country, String city, String street, String house, String quarter) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.quarter = quarter;
    }

    public String getFullAddress() {
        return new StringBuilder()
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
    }


}
