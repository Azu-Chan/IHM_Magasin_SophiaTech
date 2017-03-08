package fr.polytech.ihm.modele;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Modele {
	private static List<Produit> produitList = new ArrayList<>();
	private static List<String> categories = new ArrayList<>();
	
	private Modele(){
	}
	
	public static void init() throws IOException{
		categories.add("Livre");
		categories.add("CD");
		categories.add("DVD");
		
		produitList.add(new Produit("Louane", "CD", true, false, 9.99f, "/images/produits/louane.jpg"));
		produitList.add(new Produit("bjr", "Livre", true, false, 15f, "/images/bienvenue.jpg"));
	}
	
	public static List<Produit> getProducts(){
		return produitList;
	}

}
