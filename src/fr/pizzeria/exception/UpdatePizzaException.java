package fr.pizzeria.exception;

/**
 * @class Treatment the list pizza's update error
 * @author Dorian Bonnamy
 *
 */

public class UpdatePizzaException extends StockageException{

	public UpdatePizzaException () {
		super("Il n'est pas possible de modifier cette pizza ");
	}
	public UpdatePizzaException (String msg) {
		super(msg);
	}
}