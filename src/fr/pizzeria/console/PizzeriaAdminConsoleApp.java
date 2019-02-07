package fr.pizzeria.console;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.service.ListerPizzasService;

/**
 * 
 * @author DorianBonnamy
 *	This class is the main class of the application, it contains a menu, a tab of Pizza, and all the functionalities of the app 
 */

public class PizzeriaAdminConsoleApp {
	 
	private static PizzaMemDao datapizza = new PizzaMemDao();
	
	public static void main(String args[])
	{		
		//region Initialisation tableau
		boolean working = true;
				
		//init tab
		datapizza.saveNewPizza(new Pizza("PEP", "Pépéroni", 12.50));
		datapizza.saveNewPizza(new Pizza("MAR", "Margherita", 14.00));
		datapizza.saveNewPizza(new Pizza("REIN", "Reine", 11.50));
		datapizza.saveNewPizza(new Pizza("FRO", "Les 4 Fromages", 12.00));
		datapizza.saveNewPizza(new Pizza("CAN", "La cannibale", 12.50));
		datapizza.saveNewPizza(new Pizza("SAV", "La savoyade", 13.00));
		datapizza.saveNewPizza(new Pizza("ORI", "L'orientale", 13.50));
		datapizza.saveNewPizza(new Pizza("IND", "L'indienne", 14.00));
		//end region
		
		while(working)
		{
			//Menu of the app
			Scanner scan = new Scanner(System.in);
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Liste de pizza");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Quitter l'application");
			
			int choice_main_menu = scan.nextInt();
			
			switch(choice_main_menu)
			{
			//see the values of pizza's tab
			case 1:
				
				/*ListerPizzasService listerpizza = new ListerPizzasService();
				
				listerpizza.executeUC(datapizza, scan);*/
				
				System.out.println("Liste des pizzas");	
				Pizza[] pizza = datapizza.findAllPizzas();
				for(int i = 0; i < (pizza.length); i ++)
				{
					System.out.println(pizza[i].getCode()+" -> "+pizza[i].getLibelle()+" ("+pizza[i].getPrix()+"€)");
				}
				break;
				
				//Adding new value inside of the tab
			case 2:
				System.out.println("Ajout d'une nouvelle pizza");		
				System.out.println("Veuillez saisir le code");
				String code = scan.next();
				System.out.println("Veuillez rentrer le nom sans espaces");
				String libelle = scan.next();
				System.out.println("Veuillez saisir le prix");
				Double prix = Double.parseDouble(scan.next());
				//New version for adding Pizza
				datapizza.saveNewPizza( new Pizza(datapizza.findAllPizzas().length, code, libelle, prix));
				break;
				
			case 3:
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
				
				break;
				
			case 4:
				System.out.println("Suppression d'une pizza");
				System.out.println("Veuillez entrer le code de la pizza à supprimer");
				String codeSuppression = scan.next();
				datapizza.deletePizza(codeSuppression);
				break;
			
			case 99:
			default:
				System.out.println("Au revoir");
				working = false;
			}
		}
	}	
}
