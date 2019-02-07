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
	public void saveNewPizza(Pizza newPizza) {
		pizza.add(newPizza);
		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for(int i = 0; i < this.pizza.size() ; i++)
		{
			if(this.pizza.get(i).getCode().equals(codePizza))
			{
				this.pizza.get(i).setPizza(pizza.getCode(), pizza.getLibelle(), pizza.getPrix() );
				break;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
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
		if(findPizzaByCode(codePizza) != null)
		{
			return true;
		}
		return false;
	}

}
