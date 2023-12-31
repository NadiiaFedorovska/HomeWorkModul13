package org.example;

public class AddressEntity {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoEntity geoEntity;

    public AddressEntity(String street, String suite, String city, String zipcode, GeoEntity geoEntity) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geoEntity = geoEntity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public GeoEntity getGeo() {
        return geoEntity;
    }

    public void setGeo(GeoEntity geoEntity) {
        this.geoEntity = geoEntity;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geoEntity +
                '}';
    }
}
