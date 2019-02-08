package fr.pizzeria.exception;

/**
 * @class class mother for exception treatment
 * @author Dorian Bonnamy
 *
 */

public abstract class StockageException extends Exception{

	public StockageException () {
		
	}
	public StockageException (String msg) {
		System.out.println(msg);
	}
}
