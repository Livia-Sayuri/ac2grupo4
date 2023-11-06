package prog.dist.api.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<Integer> roomList = new ArrayList<Integer>();
    private String city;
    private Integer hotelId;
    private String category;

    public Hotel() {}
    public Hotel(String hotelName, String password, List<Integer> roomList, String city, Integer hotelId, String category) {
        this.hotelName = hotelName;
        this.roomList = roomList;
        this.city = city;
        this.hotelId = hotelId;
        this.category = category;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Integer> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Integer> roomList) {
        this.roomList = roomList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
