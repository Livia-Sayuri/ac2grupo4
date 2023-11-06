package prog.dist.api.repository;

import org.springframework.stereotype.Repository;
import prog.dist.api.model.Hotel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HotelRepository {
    List<Hotel> hoteis = new ArrayList<>();

    public Integer hoteisLen(){
        return hoteis.size();
    }
    public void save(Hotel hotel){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(hotel);
        hoteis.add(hotel);
    }
    public void update(Hotel hotel){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(hotel);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Hotel> listAll(){
        return hoteis;
    }
}
