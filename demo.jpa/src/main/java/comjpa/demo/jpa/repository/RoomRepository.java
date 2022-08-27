package comjpa.demo.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comjpa.demo.jpa.model.Room;
@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
	
	Room findByname(String name);
}
