package fr.pizzeria.model.Pizza;

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

	public Pizza( String code, String libelle, double prix){
		id = nbPizza++;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Pizza(int id, String code, String libelle, double prix){
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Pizza(Pizza pizza){
		this.code = pizza.getCode();
		this.libelle = pizza.getLibelle();
		this.prix = pizza.getPrix();

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

	public String getPizza(){
		return code+", "+libelle+", "+Double.toString(prix)+"€";
	}

	public void setPizza(String code, String libelle, Double prix){
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	//end region
}
