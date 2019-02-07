package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao datapizza, Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("Liste des pizzas");	
		List<Pizza> pizza = datapizza.findAllPizzas();
		for(int i = 0; i < (pizza.size()); i ++)
		{
			System.out.println(pizza.get(i).getPizza());
		}
	}
}
