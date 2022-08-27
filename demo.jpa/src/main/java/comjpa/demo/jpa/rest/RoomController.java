package comjpa.demo.jpa.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import comjpa.demo.jpa.model.Room;
import comjpa.demo.jpa.repository.RoomRepository;


@Controller
public class RoomController {

	@Autowired
	private RoomRepository repository;
	
	
	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<Room> findAll(@RequestParam(required = true) String name){
		
		List<Room> rooms = new ArrayList<>();
		
		if(name==null) {
			Iterable<Room> result =this.repository.findAll();
			result.forEach(room ->{
				rooms.add(room);
			});
		}else {
			Room room =this.repository.findByname(name);
			if(room!=null) {
				rooms.add(room);
			}
		}
		return rooms;
	}
}
