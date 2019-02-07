package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao{

	private List<Pizza> pizza = new ArrayList<Pizza>();
	
	/**
	 * This function return now the tab pizza
	 */
	@Override
	public List<Pizza> findAllPizzas() {		
		return pizza;
	}

	@Override
	public void saveNewPizza(Pizza newpizza) {
		// TODO Auto-generated method stub
		pizza.add(newpizza);
		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
		Pizza oldpizza = findPizzaByCode(codePizza);
		
		oldpizza = pizza;
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
		int j;
		for(j = 0; j < this.pizza.size() ; j++)
		{
			if(this.pizza.get(j).getCode().equals(codePizza))
			{
				pizza.remove(j);
				break;
			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.pizza.size() ; i++)
		{
			if(this.pizza.get(i).getCode().equals(codePizza))
			{
				return this.pizza.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		if(findPizzaByCode(codePizza) != null)
		{
			return true;
		}
		return false;
	}

}
