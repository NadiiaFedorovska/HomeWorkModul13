package org.example;

public class UserEntity {
    private int id;
    private String name;
    private String username;
    private String email;
    private AddressEntity addressEntity;
    private String phone;
    private String website;
    private CompanyEntity companyEntity;

    public UserEntity(int id, String name, String username, String email, AddressEntity addressEntity, String phone, String website, CompanyEntity companyEntity) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.addressEntity = addressEntity;
        this.phone = phone;
        this.website = website;
        this.companyEntity = companyEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressEntity getAddress() {
        return addressEntity;
    }

    public void setAddress(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CompanyEntity getCompany() {
        return companyEntity;
    }

    public void setCompany(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + addressEntity +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + companyEntity +
                '}';
    }
}
