package SpringBootRESTAPIs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import SpringBootRESTAPIs.model.*;
import SpringBootRESTAPIs.repository.AnimalRepository;

@Service
public class AnimalService {
	
	private AnimalRepository repo;
	
	@Autowired
	public AnimalService(AnimalRepository repo) {
		this.repo = repo;
	}
	
	public List<Animal> getAllAnimal() {
		return repo.findAll();
	}
	
	public Animal findByIDAnimal(Long ID) {
		return repo.findByID(ID);
	}
	
	public Animal addNewAnimal(Animal animals) {
		return repo.addNew(animals);
	}
	
	public void deleteByIDAnimal(Long ID) {
		 repo.deleteByID(ID);
	}

}
