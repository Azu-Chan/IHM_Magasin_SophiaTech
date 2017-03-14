package fr.polytech.ihm.controller;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ESPController extends MenuController {
	
	@FXML
	private BorderPane borderp;
	
	@FXML
    public void initialize(){
		double width = 730;
	    double height = 4120;
        
		URL videoURL = getClass().getResource("/media/sodosopa.mp4");  
		Media media = new Media(videoURL.toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(media); 
		MediaView mediaView = new MediaView(mediaPlayer);
		
		mediaView.setFitWidth(width);
		mediaView.setFitHeight(height);
		
		Label t = new Label();
		Label t2 = new Label();
		
		t.setText("Nous sommes To be or to Have Cap Sophia, une filiale de To be or to Have.\n\n"
				+ "Tout à commencé avec deux ex-étudiants qui ont eu la volonté d'ouvrir une boutique "
				+ "de vente de produits un peu High-Tech suite à une reconversion professionnelle.\n"
				+ "L'opportunité d'ouvrir une filiale de la célèbre enseigne To be or to Have dans "
				+ "la zone commerciale de sophia nous a été donnée suite à notre persévérance...\n\n"
				+ "Et c'est ainsi que notre superbe magasin est né.");
		
		t2.setText("Aujourd'hui, notre but est de pouvoir offrir les meilleurs produits et conseils "
				+ "à nos clients afin que tout le monde puisse sortir de ce lieu satisfait !\n\n"
				+ "Téléphone : +33 X XX XX XX XX\n"
				+ "Adresse : 99 Rue de Sophia, 06999, Sophia\n"
				+ "Site web : www.example.com");
		
		t.setWrapText(true);
		t.setFont(new Font("Arial", 14));
		t.setPadding(new Insets(12,12,12,12));
		
		t2.setWrapText(true);
		t2.setFont(new Font("Arial", 14));
		t2.setPadding(new Insets(12,12,12,12));
		
		borderp.setCenter(mediaView);
		borderp.setTop(t);
		borderp.setBottom(t2);
		
		mediaView.setOnMouseEntered(evt -> {   
			mediaPlayer.play(); 
		});
		
		mediaView.setOnMouseExited(evt -> {   
			mediaPlayer.pause();
		});
    }
}
