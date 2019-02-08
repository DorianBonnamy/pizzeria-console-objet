package fr.pizzeria.exception;

/**
 * @class Treatment the list pizza's add error
 * @author Dorian Bonnamy
 *
 */

public class SavePizzaException extends StockageException{

	public SavePizzaException () {
		super("Il n'est point possible d'ajouter cette pizza");
	}
	public SavePizzaException (String msg) {
		super(msg);
	}

}
