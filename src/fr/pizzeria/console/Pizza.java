package fr.pizzeria.console;

public class Pizza {

	private int id;
	private String code;
	private String libelle;
	private double prix;
	
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

	Pizza(int id, String code, String libelle, double prix)
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
	
	public double getPrix()
	{
		return prix;
	}
	//end region
}
