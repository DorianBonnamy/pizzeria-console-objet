package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.StockageException;
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
		/**
		 * During the app is on, we steel block on this while.
		 */
		Scanner scan = new Scanner(System.in);
		while(working){
			//Menu of the app			
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Liste de pizza");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Quitter l'application");
			
			/**
			 * choiceMainMenu is the int value to use for knowing what the user want to do
			 */	
			int choiceMainMenu = scan.nextInt();			
			
			/**
			 * service is an instance of services, which permit to see, add, update or delete an element of the Pizza's List 
			 */
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
