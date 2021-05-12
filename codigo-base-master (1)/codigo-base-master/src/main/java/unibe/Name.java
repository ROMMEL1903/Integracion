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
	
	
	 public String returnname() {
	    	String r="";
	    	for (int i =name.length()-1;i>=0;i--) {
	    		r=r+name.charAt(i);
	    		
	    	}
	    	return r;
	    }
	 

	    public String write() {
	    	return this.name.toUpperCase();
	    }

}


	
	  
