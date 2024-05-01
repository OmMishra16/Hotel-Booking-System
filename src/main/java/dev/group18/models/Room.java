package dev.group18.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Room {
    private int id;
    private RoomType type;
    private RoomStatus status;
    private double price;
    private int hotelId;

    public Room() {
    }

    public Room(int id, RoomType type, RoomStatus status, double price, int hotelId) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.price = price;
        this.hotelId = hotelId;
    }

    // Method to update room status
    public void updateStatus(RoomStatus newStatus) {
        this.status = newStatus;
    }

    // Method to update room price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type=" + type +
                ", status=" + status +
                ", price=" + price +
                ", hotelId=" + hotelId +
                '}';
    }
}