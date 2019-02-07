package fr.pizzeria.service;

import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

public class MenuServiceFactory {
	
	public static MenuService getService(int choiceMainMenu) {		
		switch(choiceMainMenu){
		//see the values of pizza's tab
		case 1:		
			return  new ListerPizzasService();

			//Adding new value inside of the tab
		case 2:
			
			return new AjouterPizzaService();
			
		case 3:
			
			return new ModifierPizzaService();
			
		case 4:
			
			return new SupprimerPizzaService();	
		
		}
		return null;
	}
	
}
