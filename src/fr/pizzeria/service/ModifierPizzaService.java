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
		
		System.out.println("Mise à jour d'une pizza");
		System.out.println("Veuillez entrer le code de la pizza à modifier");
		String oldCode = scan.next();
		
		//create new Pizza to store the next value
		
		System.out.println("Veuillez saisir le code");
		String code = scan.next();
		System.out.println("Veuillez rentrer le nom sans espaces");
		String libelle = scan.next(); 
		System.out.println("Veuillez saisir le prix");
		Double prix = Double.parseDouble(scan.next());
		
		CategoriePizza categoriePizza = Pizza.choiceCategorie(scan);
		
		if( categoriePizza != null)
		{
			dataPizza.saveNewPizza( new Pizza(dataPizza.findAllPizzas().size(), code, libelle, prix,categoriePizza));
		}
	}

}
