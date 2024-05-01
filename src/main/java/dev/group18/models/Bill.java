package dev.group18.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Bill {
    private int billId;
    private int customerId;
    private int hotelId;
    private int paymentModeId;
    private int totalAmount;
    private int discount;
    private int finalAmount;

    public Bill() {
    }

    public Bill(int billId, int customerId, int hotelId, int paymentModeId, int totalAmount, int discount, int finalAmount) {
        this.billId = billId;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.paymentModeId = paymentModeId;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.finalAmount = finalAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", customerId=" + customerId +
                ", hotelId=" + hotelId +
                ", paymentModeId=" + paymentModeId +
                ", totalAmount=" + totalAmount +
                ", discount=" + discount +
                ", finalAmount=" + finalAmount +
                '}';
    }
}
