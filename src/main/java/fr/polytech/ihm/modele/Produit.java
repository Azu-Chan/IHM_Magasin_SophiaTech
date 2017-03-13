package fr.polytech.ihm.modele;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Produit {

	private Label description = new Label();
	private Label titre= new Label();
	private Label stock= new Label();
	private Label promotion= new Label();
	private Label prix= new Label();
	private ImageView cheminImage;
	private Label nom= new Label();
	
	public Produit(String description, String titre, String stock, String promotion,
			String prix, String cheminImage,String nom) throws IOException{
		this.cheminImage = new ImageView(new Image(cheminImage));
		this.cheminImage.setFitWidth(150);
		this.cheminImage.setFitHeight(150);
		this.description.setText(description);
		this.prix.setText(prix+"£");
		this.nom.setText(nom);
		this.promotion.setText(promotion+"%");
		this.titre.setText(titre);
		this.stock.setText(stock);
	}
	public Label getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description.setText(description);
	}

	public Label getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre.setText(titre);
	}

	public Label getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock.setText(stock);
	}

	public Label getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion.setText(promotion);
	}

	public Label getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix.setText(prix);
	}

	public ImageView getCheminImage() {
		return cheminImage;
	}

	public void setCheminImage(String cheminImage) {
		this.cheminImage = new ImageView(new Image(cheminImage));
	}

	public Label getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom.setText(nom);
	}



}
