package dev.group18.Services;

import dev.group18.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(int id) {
        return roomRepository.findById(id);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }

    public Room updateRoomAvailability(int id, boolean availability) {
        Room room = getRoomById(id).orElseThrow(() -> new RuntimeException("Room not found"));
        room.setAvailability(availability);
        return roomRepository.save(room);
    }

    public Room updateRoomPricing(int id, double price) {
        Room room = getRoomById(id).orElseThrow(() -> new RuntimeException("Room not found"));
        room.setPrice(price);
        return roomRepository.save(room);
    }
}