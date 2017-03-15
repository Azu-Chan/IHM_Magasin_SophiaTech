package fr.polytech.ihm.modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Modele {
	private static ObservableList<Produit> produitList = FXCollections.observableList(new ArrayList<>());
	private static ObservableList<Message> messageList = FXCollections.observableList(new ArrayList<>());
	
	private Modele(){
	}
	
	public static void init() throws IOException{
		produitList.add(new Produit("Le célèbre album de \nnirvana comme as you are.","Come As you are" , "oui","33", "10", "/images/produits/nirvana.jpg","CD"));
		produitList.add(new Produit("La jeune et dynamique\n Louane qui vous envoutera\n avec sa magnifique voix !","Chambre 12" , "oui","40", "50", "/images/produits/louane.jpg","CD"));
		}
	
	public static ObservableList<Produit> getProducts(){
		return produitList;
	}
	
	public static ObservableList<Message> getMessages(){
		return messageList;
	}
}
