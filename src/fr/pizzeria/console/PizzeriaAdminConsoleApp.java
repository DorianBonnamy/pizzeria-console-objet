package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;

/**
 * 
 * @author DorianBonnamy
 *	This class is the main class of the application, it contains a menu, a tab of Pizza, and all the functionalities of the app 
 */

public class PizzeriaAdminConsoleApp {

	
	public static void main(String args[]){		
		//region Initialisation tableau
		boolean working = true;
		PizzaMemDao dataPizza = new PizzaMemDao();
		//init tab
		dataPizza.saveNewPizza(new Pizza("PEP", "Pépéroni", 12.50));
		dataPizza.saveNewPizza(new Pizza("MAR", "Margherita", 14.00));
		dataPizza.saveNewPizza(new Pizza("REIN", "Reine", 11.50));
		dataPizza.saveNewPizza(new Pizza("FRO", "Les 4 Fromages", 12.00));
		dataPizza.saveNewPizza(new Pizza("CAN", "La cannibale", 12.50));
		dataPizza.saveNewPizza(new Pizza("SAV", "La savoyade", 13.00));
		dataPizza.saveNewPizza(new Pizza("ORI", "L'orientale", 13.50));
		dataPizza.saveNewPizza(new Pizza("IND", "L'indienne", 14.00));
		//end region
		Scanner scan = new Scanner(System.in);
		while(working){
			//Menu of the app
			
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Liste de pizza");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Quitter l'application");
			
			int choiceMainMenu = scan.nextInt();			
			
			MenuService service = MenuServiceFactory.getService(choiceMainMenu);
			
			if(service != null) {
				service.executeUC(dataPizza, scan);
			}
			else if(choiceMainMenu == 99){
				System.out.println("Au revoir :(");
				working = false;				
			}			
		}
		scan.close();
	}	
}
