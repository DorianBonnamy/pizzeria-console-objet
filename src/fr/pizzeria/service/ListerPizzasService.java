package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

/**
 * This class is a service which herite from the class MenuService.
 * This class permit to see all Pizzas inside of the Pizza's List
 * @author DorianBonnamy
 *
 */

class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao dataPizza, Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("Liste des pizzas");	
		List<Pizza> pizza = dataPizza.findAllPizzas();
		for(int i = 0; i < (pizza.size()); i ++)
		{
			System.out.println(pizza.get(i).getPizza());
		}
	}
}
