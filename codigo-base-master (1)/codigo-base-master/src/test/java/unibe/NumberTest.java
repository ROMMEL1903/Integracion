package unibe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

private Number a1;
    
	@Before
	public void before(){
    this.a1 = new Number(4, 2);
	}
	
	@Test
	public void add() {
		assertEquals(6, this.a1.addnumbers());
	}
	

	@Test
	public void less() {
		assertEquals(2, this.a1.lessnumbers());
	}
	

	@Test
	public void multiplication() {
		assertEquals(8, this.a1.lessnumbers());
	}
}
