package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

//Cette classe est appelé "PizzeriaAdminConsoleApp" dans le tp
public class Pizza_shop {
	
//	private ArrayList<Pizza> pizza = new ArrayList<Pizza>();
	
	public static void main(String args[])
	{		
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
