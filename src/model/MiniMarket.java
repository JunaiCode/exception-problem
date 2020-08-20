package model;
import java.util.*;
import exceptions.NoDayException;
import exceptions.NoAgeException;

public class MiniMarket {
	
	private String name;
	private int count;
	private int day;
	private ArrayList<Person> persons;
	
	public MiniMarket(String name) {
		
		this.name = name;
		count = 0;
		Calendar c = new GregorianCalendar();
		day = (c.get(Calendar.DATE));
		persons = new ArrayList<Person>(); 
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Person> getClients(){
		return persons;
	}
	
	public void increaseCounter() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public void Register(Person p) throws NoAgeException, NoDayException {
		
	if(p.getType().equalsIgnoreCase("TI")) {
		
		throw new NoAgeException();
	}
	
	int penultimateNumber = Character.getNumericValue((p.getDocument().charAt((p.getDocument().length())-2)));
	
	if((penultimateNumber%2 == 0 && day%2 == 0) || (penultimateNumber%2 != 0 && day%2 != 0)) {
		
		throw new NoDayException();
	}
	
	for(int i = 0; i<persons.size();i++) {
		if(persons.get(i) == null) {
			persons.add(i,p);
		}
			
		}
	}
	
	public int getDay() {
		return day;
	}
	

}
