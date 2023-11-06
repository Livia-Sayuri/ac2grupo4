package prog.dist.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prog.dist.api.model.Hotel;
import prog.dist.api.repository.HotelRepository;

import java.util.List;

@RestController
@RequestMapping("/hoteis")
public class HotelController {

    @Autowired
    private HotelRepository repository;

    @PostMapping()
    public void postUser(@RequestBody Hotel hotel){
        hotel.setHotelId(repository.hoteisLen());
        repository.save(hotel);
    }

    @PutMapping()
    public void put(@RequestBody Hotel hotel){
        repository.update(hotel);
    }

    @GetMapping()
    public List<Hotel> getAll(){
        return repository.listAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
