package exceptions;

public class NoDayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDayException() {
		
		super("TODAY IS NOT YOUR DEPARTURE DAY ");
	}
}
