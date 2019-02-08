package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.Pizza.Pizza;

public interface IPizzaDao{

	List <Pizza> findAllPizzas(); //return all the data store in the Pizza tab
	void saveNewPizza(Pizza pizza) throws StockageException;
	void updatePizza(String codePizza, Pizza pizza) throws StockageException;
	void deletePizza(String codePizza) throws StockageException;
	Pizza findPizzaByCode(String codePizza) throws StockageException;
	boolean pizzaExists(String codePizza)throws StockageException;
	
}
