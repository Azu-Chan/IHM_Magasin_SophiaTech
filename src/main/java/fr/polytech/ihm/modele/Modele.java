package fr.polytech.ihm.modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Modele {
	private static ObservableList<Produit> produitList = FXCollections.observableList(new ArrayList());
	
	private Modele(){
	}
	
	public static void init() throws IOException{
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "2","40", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "2","40", "9.0", "/images/produits/louane.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "2","40", "9.0", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("ttttttttttttttttttt","le monde" , "2","40", "9.0", "/images/produits/louane.jpg","CD"));
	}
	
	public static ObservableList<Produit> getProducts(){
		return produitList;
	}

}
