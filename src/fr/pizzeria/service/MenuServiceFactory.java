package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

public class MenuServiceFactory {
	
	public static MenuService getService(int choice_main_menu) {
		// TODO Auto-generated constructor stub
		
		switch(choice_main_menu){
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
