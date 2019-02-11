package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza.CategoriePizza;
import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao{

	private List<Pizza> pizza = new ArrayList<Pizza>();
	
	public PizzaMemDao() throws SavePizzaException {
		saveNewPizza(new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE ));
		saveNewPizza(new Pizza("MAR", "Margherita", 14.00, CategoriePizza.POISSON ));
		saveNewPizza(new Pizza("REIN", "Reine", 11.50, CategoriePizza.SANS_VIANDE ));
		saveNewPizza(new Pizza("FRO", "Les 4 Fromages", 12.00, CategoriePizza.VIANDE ));
		saveNewPizza(new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.POISSON ));
		saveNewPizza(new Pizza("SAV", "La savoyade", 13.00, CategoriePizza.SANS_VIANDE ));
		saveNewPizza(new Pizza("ORI", "L'orientale", 13.50, CategoriePizza.VIANDE ));
		saveNewPizza(new Pizza("IND", "L'indienne", 14.00, CategoriePizza.POISSON ));
	}
	
	/**
	 * This function return now the tab pizza
	 */
	@Override
	public List<Pizza> findAllPizzas() {		
		return pizza;
	}

	@Override
	public void saveNewPizza(Pizza newPizza)  throws SavePizzaException{
		pizza.add(newPizza);		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza)  throws UpdatePizzaException{
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
	public void deletePizza(String codePizza)  throws DeletePizzaException{
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
	public Pizza findPizzaByCode(String codePizza)  throws DeletePizzaException{
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
	public boolean pizzaExists(String codePizza) throws DeletePizzaException{
		if(findPizzaByCode(codePizza) != null)
		{
			return true;
		}
		return false;
	}

}
