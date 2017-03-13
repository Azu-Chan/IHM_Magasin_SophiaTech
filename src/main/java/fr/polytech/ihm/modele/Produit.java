package fr.polytech.ihm.modele;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Produit {

	private String description;
	private String titre;
	private String stock;
	private String promotion;
	private String prix;
	private ImageView cheminImage;
	private String nom;
	
	public Produit(String description, String titre, String stock, String promotion,
			String prix, String cheminImage,String nom) throws IOException{
		this.cheminImage = new ImageView(new Image(cheminImage));
		this.cheminImage.setFitWidth(150);
		this.cheminImage.setFitHeight(150);
		this.description = description;
		this.prix = prix+"£";
		this.nom = nom;
		this.promotion = promotion+"%";
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

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public ImageView getCheminImage() {
		return cheminImage;
	}

	public void setCheminImage(String cheminImage) {
		this.cheminImage = new ImageView(new Image(cheminImage));
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



}
