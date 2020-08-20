package model;
import exceptions.NoAgeException;

import static org.junit.jupiter.api.Assertions.*;
import exceptions.NoDayException;
import org.junit.jupiter.api.Test;


class MiniMarketTest {

	private MiniMarket shop;
	private Person p;
	
	public void setupCorrectly() {
		shop = new MiniMarket("barrios");
		//You maybe need change the number, because i use the class Day, put a correct number
		p = new Person("212333","CC");
		
	}
	
	public void setupNoAge() {
		shop = new MiniMarket("barrios");
		p = new Person("212634","TI");
		
	}
	
	public void setupNoNumber() {
		
		shop = new MiniMarket("barrios");
		//You maybe need change the number, because i use the class Day, put an incorrect number
		p = new Person("212664","CC");
	}
	
	@Test
	public void testRegister1() {
		setupCorrectly();
		try {
			
			shop.Register(p);
			
			assertEquals(1, shop.getPersons().size());
			
		}
		
		catch(NoDayException d){
			
			fail(d.getMessage());
			
		}
		catch(NoAgeException a) {
			
			fail(a.getMessage());
		}
		
	}
	
	@Test
	public void testRegister2() {
		setupNoAge();
		try {
			
			shop.Register(p);
			
			assertEquals(1, shop.getPersons().size());
			
		}
		
		catch(NoDayException d){
			
			fail(d.getMessage());
			
		}
		catch(NoAgeException a) {
			
			assertEquals(0, shop.getPersons().size());
		}
		
	}
	
	@Test
	public void testRegister3() {
		setupNoNumber();
		try {
			
			shop.Register(p);
			
			assertEquals(1, shop.getPersons().size());
			
		}
		
		catch(NoDayException d){
			
			assertEquals(0, shop.getPersons().size());
			
			
		}
		catch(NoAgeException a) {
			
			fail(a.getMessage());
		}
		
	}


}
