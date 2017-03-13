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
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "1","23", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "2","40", "9.0", "/images/produits/louane.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "3","30", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "6","11", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "8","3", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "8","77", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "1","99", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "0","1", "9.0", "/images/produits/louane.jpg","CD"));
	}
	
	public static ObservableList<Produit> getProducts(){
		return produitList;
	}

	public static ObservableList<String> getCategories(){
		return categories;
	}
}
