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
		boolean working = true;
				
		//init tab
		pizza[0] = new Pizza(0, "PEP", "Pépéroni", 12.50);
		pizza[1] = new Pizza(1, "MAR", "Margherita", 14.00);
		pizza[2] = new Pizza(2, "REIN", "Reine", 11.50);
		pizza[3] = new Pizza(3, "FRO", "Les 4 Fromages", 12.00);
		pizza[4] = new Pizza(4, "CAN", "La cannibale", 12.50);
		pizza[5] = new Pizza(5, "SAV", "La savoyade", 13.00);
		pizza[6] = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizza[7] = new Pizza(7, "IND", "L'indienne", 14.00);
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
				System.out.println("Liste des pizzas");	
				for(int i = 0; i < pizza.length; i ++)
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
				Pizza[] temporarypizza = new Pizza[pizza.length+1];
				for(int i = 0; i < pizza.length ; i++)
				{
					temporarypizza[i] = pizza[i];
				}
				temporarypizza[pizza.length] = new Pizza(pizza.length, code, libelle, prix);
				pizza = temporarypizza;
				break;
				
			case 3:
				System.out.println("Mise à jour d'une pizza");
//				modifyPizza();
				System.out.println("Veuillez entrer le code de la pizza à modifier");
				String oldCode = scan.next();
				int i;
				for(i = 0; i < pizza.length ; i++)
				{
					if(pizza[i].getCode().equals(oldCode))
					{
						break;
					}
				}
				//If i == pizza.length, oldCode is not inside of tab pizza
				if( i == pizza.length)
				{
					System.out.println("Aucune pizza n'a ce code");
				}
				else
				{
					//Replace the value i. i is the indix of the place where we want to change the values.
					System.out.println("Veuillez saisir le code");
					pizza[i].setCode(scan.next());
					System.out.println("Veuillez rentrer le nom sans espaces");
					pizza[i].setLibelle(scan.next()); 
					System.out.println("Veuillez saisir le prix");
					pizza[i].setPrix(Double.parseDouble(scan.next()));
				}
				break;
				
			case 4:
				System.out.println("Suppression d'une pizza");
				System.out.println("Veuillez entrer le code de la pizza à supprimer");
				String codeSuppression = scan.next();
				//Try if "codeSupression" exists in tab pizza
				int j;
				for(j = 0; j < pizza.length ; j++)
				{
					if(pizza[j].getCode().equals(codeSuppression))
					{
						break;
					}
				}
				/* Replace the old tab by new one*/
				Pizza[] temporaryPizza = new Pizza[pizza.length-1];
				for(int k = 0; k < j ; k ++)
				{
					temporaryPizza[k] = pizza[k];
				}
				for(int k = j+1 ; k < temporaryPizza.length; k ++)
				{
					temporaryPizza[k] = pizza[+1];
				}
				pizza = temporaryPizza;
//				deletePizza();
				break;
			
			case 99:
			default:
				System.out.println("Au revoir");
				working = false;
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
