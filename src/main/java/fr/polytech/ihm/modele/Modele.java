package fr.polytech.ihm.modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Modele {
	private static ObservableList<Produit> produitList = FXCollections.observableList(new ArrayList<>());
	private static ObservableList<String> categories = FXCollections.observableList(new ArrayList<>());
	
	private Modele(){
	}
	
	public static void init() throws IOException{
		categories.add("Livre");
		categories.add("CD");
		categories.add("DVD");
		
		produitList.add(new Produit("ttttttttttttttttttt", "le monde" , 2,40f, 9.0f, "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt", "le monde" , 2,40f, 9.0f, "/images/produits/louane.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt", "le monde" , 2,40f, 9.0f, "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt", "le monde" , 2,40f, 9.0f, "/images/produits/louane.jpg","CD"));
	}
	
	public static ObservableList<Produit> getProducts(){
		return produitList;
	}

	public static ObservableList<String> getCategories(){
		return categories;
	}
}
