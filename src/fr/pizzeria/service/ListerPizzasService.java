package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao datapizza, Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("Liste des pizzas");	
		Pizza[] pizza = datapizza.findAllPizzas();
		for(int i = 0; i < (pizza.length); i ++)
		{
			System.out.println(pizza[i].getCode()+" -> "+pizza[i].getLibelle()+" ("+pizza[i].getPrix()+"€)");
		}
	}
}
