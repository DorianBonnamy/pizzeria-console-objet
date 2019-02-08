package fr.pizzeria.exception;

/**
 * @class Treatment the list pizza's delete error
 * @author Dorian Bonnamy
 *
 */

public class DeletePizzaException extends StockageException{

	public DeletePizzaException () {
		super("Le code pizza rentré n'existe pas");
	}
	
	public DeletePizzaException (String msg) {
		super(msg);
	}
}
