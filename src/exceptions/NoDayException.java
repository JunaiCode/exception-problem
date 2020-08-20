package exceptions;

public class NoDayException extends Exception {

	public NoDayException() {
		
		super("TODAY IS NOT YOUR DEPARTURE DAY ");
	}
}
