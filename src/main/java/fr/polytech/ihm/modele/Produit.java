package fr.polytech.ihm.modele;

import javafx.scene.image.Image;

import java.io.IOException;

public class Produit {
	private String designation;
	private String categorie;
	private boolean enStock;
	private boolean enPromotion;
	private float prix;
	private Image image;
	
	public Produit(String designation, String categorie, boolean enStock, boolean enPromotion,
			float prix, String cheminImage) throws IOException{
		this.designation = designation;
		this.categorie = categorie;
		this.enStock = enStock;
		this.enPromotion = enPromotion;
		this.prix = prix;
		this.image = new Image(cheminImage);
	}
	
	public void setDesignation(String d){
		this.designation = d;
	}
	
	public String getDesignation(){
		return this.designation;
	}
	
	public void setCategorie(String c){
		this.categorie = c;
	}
	
	public String getCategorie(){
		return this.categorie;
	}
	
	public void setStock(boolean s){
		this.enStock = s;
	}
	
	public boolean getStock(){
		return this.enStock;
	}
	
	public void setPromo(boolean p){
		this.enPromotion = p;
	}
	
	public boolean getPromo(){
		return this.enPromotion;
	}
	
	public void setPrix(float p){
		this.prix = p;
	}
	
	public float getPrix(){
		return this.prix;
	}
	
	public void setImage(String c) throws IOException{
		this.image = new Image(c);
	}
	
	public Image getImage(){
		return this.image;
	}
}
