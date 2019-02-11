package fr.pizzeria.model.Pizza;

import java.util.Scanner;

import fr.pizzeria.model.CategoriePizza.CategoriePizza;

/**
 * This class store data for each Pizza
 * @author DorianBonnamy
 * 	nbPizza is the total of all Pizza which have been add.
 *	id is the index of the Pizza
 *	code is the code to identify the Pizza
 *	libelle is the name of the Pizza
 *	prix is the price of the Pizza
 */

public final class Pizza {

	public static int nbPizza;
	
	private int id;
	private String code;
	private String libelle;
	private double prix;
	private CategoriePizza categoriePizza;

	public Pizza()
	{
		id = nbPizza++;
		this.code = null;
		this.libelle = "";
		this.prix = 0.0;
		this.categoriePizza = null;
	}
	
	public Pizza( String code, String libelle, double prix, CategoriePizza categoriePizza ){
		id = nbPizza++;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categoriePizza = categoriePizza;
	}

	public Pizza(int id, String code, String libelle, double prix, CategoriePizza categoriePizza){
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categoriePizza = categoriePizza;
	}

	public Pizza(Pizza pizza){
		this.code = pizza.getCode();
		this.libelle = pizza.getLibelle();
		this.prix = pizza.getPrix();
		this.categoriePizza = pizza.getCategoriePizza();
	}

	//end region

	//region GETTER/SETTER
	public void setId(int id){
		this.id = id;
	}

	public void setCode(String code){
		this.code = code;
	}

	public void setLibelle(String libelle){
		this.libelle = libelle;
	}

	public void setPrix(double prix){
		this.prix = prix;
	}

	public int getId(){
		return id;
	}

	public String getCode(){
		return code;
	}

	public String getLibelle(){
		return libelle;
	}

	public Double getPrix(){
		return prix;
	}

	public String toString()
	{
		return code+", "+libelle+", "+Double.toString(prix)+"€, "+categoriePizza;
	}
	
	public String getPizza(){
		return code+", "+libelle+", "+Double.toString(prix)+"€, "+categoriePizza;
	}
	
	public CategoriePizza getCategoriePizza()
	{
		return categoriePizza;
	}
	
	public static CategoriePizza choiceCategorie(Scanner scan)
	{
		CategoriePizza[] categoriePizzaTmp = CategoriePizza.values();
		for(int i = 0; i < categoriePizzaTmp.length ; i++)
		{
			System.out.println(i+" : "+categoriePizzaTmp[i]);
		}
		int choiceCategoriePizza = scan.nextInt();
		for(int i = 0; i < categoriePizzaTmp.length ; i++)
		{
			if(choiceCategoriePizza == i)
			{
				return categoriePizzaTmp[i];
			}
		}
		return null;
	}

	public void setPizza(String code, String libelle, Double prix){
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	//end region
}
