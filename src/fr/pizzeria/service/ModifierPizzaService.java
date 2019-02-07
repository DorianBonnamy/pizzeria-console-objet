package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao datapizza, Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("Mise à jour d'une pizza");
		System.out.println("Veuillez entrer le code de la pizza à modifier");
		String oldCode = scan.next();
		
		//create new Pizza to store the next value
		Pizza temporaryPizza = new Pizza();
		System.out.println("Veuillez saisir le code");
		temporaryPizza.setCode(scan.next());
		System.out.println("Veuillez rentrer le nom sans espaces");
		temporaryPizza.setLibelle(scan.next()); 
		System.out.println("Veuillez saisir le prix");
		temporaryPizza.setPrix(Double.parseDouble(scan.next()));
		datapizza.updatePizza(oldCode,temporaryPizza);
	}

}
