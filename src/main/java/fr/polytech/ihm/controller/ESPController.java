package fr.polytech.ihm.controller;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;

public class ESPController extends MenuController {
	
	@FXML
	private BorderPane borderp;
	
	@FXML
    public void initialize(){
		double width = 800;
	    double height = 450;
        
		URL videoURL = getClass().getResource("/media/sodosopa.mp4");  
		Media media = new Media(videoURL.toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(media); 
		MediaView mediaView = new MediaView(mediaPlayer);
		
		mediaView.setFitWidth(width);
		mediaView.setFitHeight(height);
		
		BorderPane p = new BorderPane();
		Text t = new Text();
		
		t.setText("Nous sommes To be or to Have Cap Sophia, une filiale de To be or to Have.\n"
				+ "Tout à commencé avec deux ex-étudiants qui ont eu la volonté d'ouvrir une boutique "
				+ "de vente de produits un peu High-Tech suite à une reconversion professionnelle. "
				+ "L'opportunité d'ouvrir une filiale de la célèbre enseigne To be or to Have dans "
				+ "la zone commerciale de sophia nous a été donnée suite à notre persévérance... "
				+ "Et c'est ainsi que notre superbe magasin est né.\n\n"
				+ "Aujourd'hui, notre but est de pouvoir offrir les meilleurs produits et conseils "
				+ "à nos clients afin que tout le monde puisse sortir de ce lieu satisfait !\n"
				+ "Téléphone : +33 X XX XX XX XX)");
		
		borderp.setCenter(p);
		
		p.setCenter(mediaView);
		p.setBottom(t);
		t.setLayoutX(p.getLayoutX());
		
		mediaView.setOnMouseEntered(evt -> {   
			mediaPlayer.play(); 
		});
		
		mediaView.setOnMouseExited(evt -> {   
			mediaPlayer.pause();
		});
    }
}
