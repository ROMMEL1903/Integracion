package unibe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Nametest {

	private Name p1;
	
	@Before
	public void before () {
		this.p1 = new Name("hola");
		
	}
	
	@Test
	public void countCharecters() {
		assertEquals(4, this.p1.countCharecters());
	}
	
	

}
