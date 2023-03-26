package Pojo;

import lombok.Data;

@Data
public class Location {

    private Street street;
    private String city;
    private String state;

    public Street getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    private String country;
    private String postcode;
    private Coordinates coordinates;
    private Timezone timezone;
}
