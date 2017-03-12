package fr.polytech.ihm.modele;

import java.io.IOException;

public class Produit {

	private String description;
	private String titre;
	private int stock;
	private float promotion;
	private float prix;
	private String cheminImage;
	private String nom;
	
	public Produit(String description, String titre, int stock, float promotion,
			float prix, String cheminImage,String nom) throws IOException{
		this.cheminImage = cheminImage;
		this.description = description;
		this.prix = prix;
		this.nom = nom;
		this.promotion = promotion;
		this.titre = titre;
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPromotion() {
		return promotion;
	}

	public void setPromotion(float promotion) {
		this.promotion = promotion;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getCheminImage() {
		return cheminImage;
	}

	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



}
