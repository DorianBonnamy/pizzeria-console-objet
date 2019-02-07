package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao datapizza, Scanner scan) {
		// TODO Auto-generated method stub

		System.out.println("Ajout d'une nouvelle pizza");		
		System.out.println("Veuillez saisir le code");
		String code = scan.next();
		System.out.println("Veuillez rentrer le nom sans espaces");
		String libelle = scan.next();
		System.out.println("Veuillez saisir le prix");
		Double prix = Double.parseDouble(scan.next());
		//New version for adding Pizza
		datapizza.saveNewPizza( new Pizza(datapizza.findAllPizzas().size(), code, libelle, prix));
	}

}
