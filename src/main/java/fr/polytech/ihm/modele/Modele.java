package fr.polytech.ihm.modele;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Modele {
	private List<Produit> produitList = new ArrayList<>();
	private List<String> categories = new ArrayList<>();
	
	public Modele(){
	}
	
	public void init() throws IOException{
		categories.add("Livre");
		categories.add("CD");
		categories.add("DVD");
		
		produitList.add(new Produit("Louane", "CD", true, false, 9.99f, "src/main/ressources/images/produits/louane.jpg"));
	}
	
	
}
