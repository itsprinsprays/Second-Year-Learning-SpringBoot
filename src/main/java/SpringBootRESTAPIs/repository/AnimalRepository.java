package SpringBootRESTAPIs.repository;

import org.springframework.stereotype.Repository;
import  SpringBootRESTAPIs.model.*;
import java.util.*;

@Repository
public class AnimalRepository {
	
	private List<Animal> animal = new ArrayList<Animal>(Arrays.asList(
				new Animal(1L,"Buddy","Dog"),
				new Animal(2l,"Misky","Cat")
			));
	
	public List<Animal> findAll() {
		return animal;
	}

	
	public Animal findByID(Long ID) {
		return animal.stream()
				.filter(s -> s.getID().equals(ID))
				.findFirst()
				.orElse(null);
	}
	
	public Animal addNew(Animal animals) {
		animal.add(animals);
		return animals;
	}
	
	public void deleteByID(Long ID) {
		 animal.removeIf(s -> s.getID().equals(ID));
	}
	
}
	
	


