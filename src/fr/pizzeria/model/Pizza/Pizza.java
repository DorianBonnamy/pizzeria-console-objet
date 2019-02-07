package fr.pizzeria.model.Pizza;

import java.text.DecimalFormat;

/**
 * 
 * @author DorianBonnamy
 *	This class store data for each Pizza
 */

public final class Pizza {

	private int id;
	private String code;
	private String libelle;
	private double prix;
	private DecimalFormat mode_affichage = new DecimalFormat("#.##");
	
	//region CONSTRUCTOR
	public Pizza()
	{
		id = 0;
		code = null;
		libelle = null;
		prix = 0.0;
	}

	public Pizza( String code, String libelle, double prix)
	{
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Pizza(int id, String code, String libelle, double prix)
	{
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	//end region
	
	//region GETTER/SETTER
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}
	
	public void setPrix(double prix)
	{
		this.prix = prix;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getLibelle()
	{
		return libelle;
	}
	
	public String getPrix()
	{
		return mode_affichage.format(prix);
	}
	//end region
}
