package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;

/**
 * 
 * @author DorianBonnamy
 *	This class is the main class of the application, it contains a menu, a tab of Pizza, and all the functionalities of the app 
 */

public class PizzeriaAdminConsoleApp {
	
	public static void main(String args[]) {		
		//region Initialisation tableau
		boolean working = true;
		PizzaMemDao dataPizza = null;
		try {
			dataPizza = new PizzaMemDao();
		} catch (StockageException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		//init tab
		
		//end region
		Scanner scan = new Scanner(System.in);
		while(working){
			//Menu of the app
			
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Liste de pizza");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre � jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Quitter l'application");
			
			int choiceMainMenu = scan.nextInt();			
			
			MenuService service = MenuServiceFactory.getService(choiceMainMenu);
			
			if(service != null) {
				try{
					service.executeUC(dataPizza, scan);
				}catch (StockageException e) {
					e.getMessage();
				}
				
			}
			else if(choiceMainMenu == 99){
				System.out.println("Au revoir :(");
				working = false;				
			}			
		}
		scan.close();
	}	
}
