package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

/**
 * This class is a service which herite from the class MenuService.
 * This class permit to delete Pizzas inside of the Pizza's List
 * @author DorianBonnamy
 *
 */

class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(IPizzaDao dataPizza, Scanner scan) throws StockageException {
		// TODO Auto-generated method stub
		System.out.println("Suppression d'une pizza");
		System.out.println("Veuillez entrer le code de la pizza à supprimer");
		String codeSuppression = scan.next();
		dataPizza.deletePizza(codeSuppression);
	}
}
