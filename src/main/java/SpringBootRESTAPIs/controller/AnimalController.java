package SpringBootRESTAPIs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootRESTAPIs.model.Animal;
import SpringBootRESTAPIs.service.AnimalService;

@RestController
@RequestMapping("/animal")
@CrossOrigin(origins = "*")
public class AnimalController {
	
	private final AnimalService service;
	
	public AnimalController(AnimalService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Animal> listAllAnimal() {
		return service.getAllAnimal();
	}
	
	@GetMapping("/{ID}")
	public Animal getAnimalByID(@PathVariable Long ID) {
		return service.findByIDAnimal(ID);
	}
	
	@PostMapping
	public Animal getNewAnimal(@RequestBody Animal animals) {
		return service.addNewAnimal(animals);
	}
	
	@DeleteMapping("/{ID}")
	public void removeAnimalByID(@PathVariable Long ID) {
		service.deleteByIDAnimal(ID);
	}
}
