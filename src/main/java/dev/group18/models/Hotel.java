package dev.group18.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Hotel {
    private List<Room> rooms;

    public Hotel() {
    }

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                '}';
    }
}