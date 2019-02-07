package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao{

	private Pizza[] pizza = new Pizza[0];
	
	/**
	 * This function return now the tab pizza
	 */
	@Override
	public Pizza[] findAllPizzas() {		
		return pizza;
	}

	@Override
	public void saveNewPizza(Pizza newpizza) {
		// TODO Auto-generated method stub
		Pizza[] temporarypizza = new Pizza[pizza.length+1];
		for(int i = 0; i < pizza.length ; i++)
		{
			temporarypizza[i] = pizza[i];
		}
		temporarypizza[pizza.length] = new Pizza(newpizza);
		temporarypizza[pizza.length].setId(pizza.length);
		pizza = temporarypizza;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.pizza.length ; i++)
		{
			if(this.pizza[i].getCode().equals(codePizza))
			{
				this.pizza[i] = pizza;
				break;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
		int j;
		for(j = 0; j < this.pizza.length ; j++)
		{
			if(this.pizza[j].getCode().equals(codePizza))
			{
				break;
			}
		}
		//Replace the old tab by new one
		Pizza[] temporaryPizza = new Pizza[this.pizza.length-1];
		for(int k = 0; k < j ; k ++)
		{
			temporaryPizza[k] = this.pizza[k];
		}
		for(int k = j ; k < temporaryPizza.length; k ++)
		{
			temporaryPizza[k] = this.pizza[k+1];
		}
		this.pizza = temporaryPizza;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.pizza.length ; i++)
		{
			if(this.pizza[i].getCode().equals(codePizza))
			{
				return this.pizza[i];
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
