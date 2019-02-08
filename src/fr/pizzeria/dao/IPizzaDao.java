package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.Pizza.Pizza;

public interface IPizzaDao{

	/**
	 * 
	 * @return a list which contains all the pizza.
	 */
	List <Pizza> findAllPizzas(); //return all the data store in the Pizza tab
	
	/**
	 * permit to add a new pizza inside of the Pizza's List
	 * @param pizza
	 * @throws StockageException
	 */
	void saveNewPizza(Pizza pizza) throws StockageException;
	
	/**
	 * permit to update Pizza one by one inside of the Pizza's List
	 * @param codePizza
	 * @param pizza
	 * @throws StockageException
	 */
	void updatePizza(String codePizza, Pizza pizza) throws StockageException;
	
	/**
	 * permit to delete Pizza one by one inside of the Pizza's List
	 * @param codePizza
	 * @throws StockageException
	 */
	void deletePizza(String codePizza) throws StockageException;
	
	/**
	 * permit to find a Pizza by it Pizza's code
	 * @param codePizza
	 * @return the Pizza which correspond to the Pizza's code
	 * @throws StockageException
	 */
	Pizza findPizzaByCode(String codePizza) throws StockageException;
	
	/**
	 * 
	 * @param codePizza
	 * @return true if the Pizza is inside of the Pizza's List, else return false
	 * @throws StockageException
	 */
	boolean pizzaExists(String codePizza)throws StockageException;
	
}
