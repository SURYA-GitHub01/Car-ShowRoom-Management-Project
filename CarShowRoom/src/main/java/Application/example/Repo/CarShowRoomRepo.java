package Application.example.Repo;

import Application.example.Entity.ShowRoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface CarShowRoomRepo extends CrudRepository<ShowRoomEntity,Integer> {

}
