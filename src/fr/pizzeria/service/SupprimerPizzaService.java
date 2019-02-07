package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(IPizzaDao dataPizza, Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("Suppression d'une pizza");
		System.out.println("Veuillez entrer le code de la pizza à supprimer");
		String codeSuppression = scan.next();
		dataPizza.deletePizza(codeSuppression);
	}

}
