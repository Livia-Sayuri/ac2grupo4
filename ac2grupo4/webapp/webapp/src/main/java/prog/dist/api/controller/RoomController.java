package prog.dist.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import prog.dist.api.repository.RoomRepository;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private RoomRepository roomRepository;

    @Autowired
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // Endpoint para listar todos os quartos
    @GetMapping
    public List<Integer> getAllRooms() {
        return roomRepository.getRoomList();
    }

    // Endpoint para criar um novo quarto
    @PostMapping
    public void createRoom(@RequestBody Integer roomNumber) {
        roomRepository.addRoom(roomNumber);
    }

    // Endpoint para atualizar informações de um quarto
    @PutMapping("/{roomNumber}")
    public void updateRoom(@PathVariable Integer roomNumber, @RequestBody Integer newRoomNumber) {
        roomRepository.updateRoom(roomNumber, newRoomNumber);
    }

    // Endpoint para recuperar informações de um quarto específico
    @GetMapping("/{roomNumber}")
    public Integer getRoom(@PathVariable Integer roomNumber) {
        return roomRepository.getRoom(roomNumber);
    }

    // Endpoint para excluir um quarto
    @DeleteMapping("/{roomNumber}")
    public void deleteRoom(@PathVariable Integer roomNumber) {
        roomRepository.deleteRoom(roomNumber);
    }
}

