package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao{

	private List<Pizza> pizza = new ArrayList<Pizza>();
	
	public PizzaMemDao() throws StockageException {
		saveNewPizza(new Pizza("PEP", "Pépéroni", 12.50));
		saveNewPizza(new Pizza("MAR", "Margherita", 14.00));
		saveNewPizza(new Pizza("REIN", "Reine", 11.50));
		saveNewPizza(new Pizza("FRO", "Les 4 Fromages", 12.00));
		saveNewPizza(new Pizza("CAN", "La cannibale", 12.50));
		saveNewPizza(new Pizza("SAV", "La savoyade", 13.00));
		saveNewPizza(new Pizza("ORI", "L'orientale", 13.50));
		saveNewPizza(new Pizza("IND", "L'indienne", 14.00));
	}
	
	/**
	 * This function return now the tab pizza
	 */
	@Override
	public List<Pizza> findAllPizzas() {		
		return pizza;
	}

	@Override
	public void saveNewPizza(Pizza newPizza)  throws StockageException{
		pizza.add(newPizza);		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza)  throws StockageException{
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
	public void deletePizza(String codePizza)  throws StockageException{
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
	public Pizza findPizzaByCode(String codePizza)  throws StockageException{
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
	public boolean pizzaExists(String codePizza) throws StockageException{
		if(findPizzaByCode(codePizza) != null)
		{
			return true;
		}
		return false;
	}

}
