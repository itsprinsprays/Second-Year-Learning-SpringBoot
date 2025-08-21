package Day39_MavenBasic;

import com.google.gson.Gson;

public class GSONBasic {
	
	public static void main(String[] args) {
			
		Gson gson = new Gson();
		
		  Person p = new Person("Prince", 20);
	      String json = gson.toJson(p);
	      System.out.println("Java to JSON: " + json);

	      // Convert JSON → Java object
	      Person p2 = gson.fromJson("{\"name\":\"Jediel\",\"age\":21}", Person.class);
	      System.out.println("JSON to Java: " + p2.getName() + ", " + p2.getAge());
		
		
	}

}


