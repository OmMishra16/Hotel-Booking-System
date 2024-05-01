package dev.group18.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String name, String email, String phoneNumber, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}