package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza.CategoriePizza;
import fr.pizzeria.model.Pizza.Pizza;

/**
 * This class is a service which herite from the class MenuService.
 * This class permit to update Pizzas inside of the Pizza's List
 * @author DorianBonnamy
 *
 */

class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao dataPizza, Scanner scan) throws StockageException{
		// TODO Auto-generated method stub
		
		System.out.println("Mise � jour d'une pizza");
		System.out.println("Veuillez entrer le code de la pizza � modifier");
		String oldCode = scan.next();
		
		//create new Pizza to store the next value
		
		System.out.println("Veuillez saisir le code");
		String code = scan.next();
		System.out.println("Veuillez rentrer le nom sans espaces");
		String libelle = scan.next(); 
		System.out.println("Veuillez saisir le prix");
		Double prix = Double.parseDouble(scan.next());
		
		Pizza pizza = new Pizza();
		CategoriePizza[] tabCategoriePizza = pizza.getListCategoriePizza();
		for(int i = 0; i < tabCategoriePizza.length ; i++)
		{
			System.out.println(i +" : "+tabCategoriePizza[i].getCategoriePizza());
		}
		int choiceCategoriePizza = scan.nextInt();
		CategoriePizza categoriePizza = null;
		for(int i = 0; i < tabCategoriePizza.length ; i ++)
		{
			if(choiceCategoriePizza == i)
			{
				categoriePizza = tabCategoriePizza[i];
			}
		}
		
		Pizza temporaryPizza = new Pizza(code, libelle, prix, categoriePizza);
		dataPizza.updatePizza(oldCode,temporaryPizza);
	}

}
