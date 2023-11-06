package prog.dist.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prog.dist.api.repository.UserRepository;
import prog.dist.api.model.User;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping()
    public void postUser(@RequestBody User user){
        user.setUserId(repository.usersLen());
        repository.save(user);
    }

    @PutMapping()
    public void put(@RequestBody User user){
        repository.update(user);
    }

    @GetMapping()
    public List<User> getAll(){
        return repository.listAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
