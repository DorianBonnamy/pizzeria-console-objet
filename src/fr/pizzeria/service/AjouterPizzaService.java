package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza.CategoriePizza;
import fr.pizzeria.model.Pizza.Pizza;

/**
 * This class is a service which herite from the class MenuService.
 * This class permit to add a new Pizza inside of the Pizza's List
 * @author DorianBonnamy
 *
 */

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao dataPizza, Scanner scan) throws StockageException{
		System.out.println("Ajout d'une nouvelle pizza");		
		System.out.println("Veuillez saisir le code");
		String code = scan.next();
		System.out.println("Veuillez rentrer le nom sans espaces");
		String libelle = scan.next();
		System.out.println("Veuillez saisir le prix");
		Double prix = Double.parseDouble(scan.next());
		//New version for adding Pizza
		Pizza pizza = new Pizza();
		CategoriePizza[] value = pizza.getListCategoriePizza();
		for(int i = 0; i < value.length ; i++)
		{
			System.out.println(i+" : "+value[i].getCategoriePizza());
		}
		int choiceCategoriePizza = scan.nextInt();
		CategoriePizza categoriePizza = null;
		for(int i = 0; i < value.length ; i ++)
		{
			if(choiceCategoriePizza == i)
			{
				categoriePizza = value[i];
			}
		}
		
		dataPizza.saveNewPizza( new Pizza(dataPizza.findAllPizzas().size(), code, libelle, prix,categoriePizza));
	}
}