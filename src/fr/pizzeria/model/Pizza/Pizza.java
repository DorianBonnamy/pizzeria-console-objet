package fr.pizzeria.model.Pizza;

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
	
	public Pizza(Pizza pizza)
	{
		this.code = pizza.getCode();
		this.libelle = pizza.getLibelle();
		this.prix = pizza.getPrix();
		
	}
	
	//end region
	
	//region GETTER/SETTER
	public void setId(int id)
	{
		this.id = id;
	}
	
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
	
	public Double getPrix()
	{
		return prix;
	}
	
	public String getPizza()
	{
		return code+", "+libelle+", "+Double.toString(prix)+"€";
	}
	//end region
}
