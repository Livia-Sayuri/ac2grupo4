package prog.dist.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prog.dist.api.model.Hotel;

@Repository
public class RoomRepository {
    private final Hotel hotel;

    @Autowired
    public RoomRepository(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Integer> getRoomList() {
        return hotel.getRoomList();
    }

    public void addRoom(Integer roomNumber) {
        List<Integer> roomList = hotel.getRoomList();
        roomList.add(roomNumber);
    }

    public void updateRoom(Integer roomNumber, Integer newRoomNumber) {
        List<Integer> roomList = hotel.getRoomList();
        int index = roomList.indexOf(roomNumber);
        if (index != -1) {
            roomList.set(index, newRoomNumber);
        }
    }

    public Integer getRoom(Integer roomNumber) {
        List<Integer> roomList = hotel.getRoomList();
        if (roomList.contains(roomNumber)) {
            return roomNumber;
        }
        return null;
    }

    public void deleteRoom(Integer roomNumber) {
        List<Integer> roomList = hotel.getRoomList();
        roomList.remove(roomNumber);
    }
}