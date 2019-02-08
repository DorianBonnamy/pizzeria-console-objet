package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

/**
 * This class is the mother class for services to manage the Pizza's List
 * @author DorianBonnamy
 *
 */

public abstract class MenuService{

	public abstract void executeUC(IPizzaDao dataPizza, Scanner scan) throws StockageException;
	
}
