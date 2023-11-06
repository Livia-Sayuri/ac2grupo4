package prog.dist.api.repository;

import org.springframework.stereotype.Repository;
import prog.dist.api.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    public Integer usersLen(){
        return users.size();
    }
    public void save(User user){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
        users.add(user);
    }
    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        return users;
    }
}
