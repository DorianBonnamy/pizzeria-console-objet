package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.model.Pizza.Pizza;

public interface IPizzaDao {

	List <Pizza> findAllPizzas(); //return all the data store in the Pizza tab
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);
	
}
