package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;

//Cette classe est appelé "PizzeriaAdminConsoleApp" dans le tp
public class Pizza_shop {
	 
	private static Pizza[] pizza = new Pizza[8];
	
//	private ArrayList<Pizza> pizza = new ArrayList<Pizza>();
	
	public static void main(String args[])
	{		
		//region Initialisation tableau
		
				
		pizza[0] = new Pizza(0, "PEP", "Pépéroni", 12.50);
		pizza[1] = new Pizza(1, "MAR", "Margherita", 14.00);
		pizza[2] = new Pizza(2, "REIN", "Reine", 11.50);
		pizza[3] = new Pizza(3, "FRO", "Les 4 Fromages", 12.00);
		pizza[4] = new Pizza(4, "CAN", "La cannibale", 12.50);
		pizza[5] = new Pizza(5, "SAV", "La savoyade", 13.00);
		pizza[6] = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizza[7] = new Pizza(7, "IND", "L'indienne", 14.00);
		//end region
		
		while(true)
		{
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
			case 1:
				System.out.println("Liste des pizzas");	
				for(int i = 0; i < pizza.length; i ++)
				{
					System.out.println(pizza[i].getCode()+" -> "+pizza[i].getLibelle()+" ("+pizza[i].getPrix()+"€)");
				}
//				for(int i = 0; i < pizza.size() ; i++)
				{
//					System.out.println(pizza.get(i).getLibelle());
				}
//				seePizza();
				break;
				
			case 2:
				System.out.println("Ajout d'une nouvelle pizza");	
//				addPizza();
				break;
				
			case 3:
				System.out.println("Mise à jour d'une pizza");
//				modifyPizza();
				break;
				
			case 4:
				System.out.println("Suppression d'une pizza");
//				deletePizza();
				break;
				
			case 99:
				System.out.println("Au revoir");
			}
		}
		
		
	}	
	
	/*private void seePizza()
	{
		for(int i = 0; i < pizza.size() ; i++)
		{
			System.out.println(pizza.get(i).getLibelle());
		}
		menuMain();
	}
	
	private void addPizza()
	{		
		System.out.println("Ajout d'une nouvelle pizza");		
		//pizza.add(scan.nextLine());
		menuMain();
	}
	
	private void modifyPizza()
	{
		System.out.println("Mise à jour d'une pizza");
		//pizza.modifyPizza(scan.nextLine());
		menuMain();
	}
	
	private void deletePizza()
	{
		System.out.println("Suppression d'une pizza");
		//pizza.deletePizza(scan.nextLine());
		menuMain();
	}*/
}
