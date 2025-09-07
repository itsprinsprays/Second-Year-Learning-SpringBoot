package SpringBootRESTAPIs.model;

public class Animal {
	
	private long ID;
	private String name;
	private String species;
	
	public Animal(Long ID, String name, String species) {
		this.ID = ID;
		this.name = name;
		this.species = species;
	}
	
	public Long getID() { return ID; }
	public String getName() { return name; }
	public String getSpecies() { return species; }

}
