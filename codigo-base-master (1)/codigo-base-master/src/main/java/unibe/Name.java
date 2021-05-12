package unibe;

public class Name {
   
	private String name;

	public Name(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    	
	public int countCharecters() {
		return this.name.length();
		
	}
	
}
	
	  
