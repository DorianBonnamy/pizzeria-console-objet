package fr.pizzeria.console;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

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
			
			MenuService service = MenuServiceFactory.getService(choice_main_menu);
			
			if(service != null) {
				service.executeUC(datapizza, scan);
			}
			else if(choice_main_menu == 99)
			{
				System.out.println("Au revoir :(");
				working = false;				
			}
			
		}
	}	
}
