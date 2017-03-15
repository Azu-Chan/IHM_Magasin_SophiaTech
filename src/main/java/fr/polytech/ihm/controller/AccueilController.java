package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dziri on 05/03/17.
 */
public class AccueilController extends MenuController{
    private int cpt = 0;
    @FXML
    private ImageView bienvenue;
    private List<String> listeOfImage;
    
    @FXML
    public void initialize(){
        listeOfImage = new ArrayList<>();
        listeOfImage.add("/images/diapoAccueil/bienvenue.jpg");
        listeOfImage.add("/images/diapoAccueil/promotion.png");
        listeOfImage.add("/images/diapoAccueil/dvdp_inline.jpg");
        listeOfImage.add("/images/diapoAccueil/sa_6.jpg");
        bienvenue.setImage(new Image(listeOfImage.get(cpt)));
        
        if(langue)
            anglais();

    }
    
    public void remplaceImageUp(){
        cpt++;
        if(cpt == listeOfImage.size())
            cpt = 0;
        bienvenue.setImage(new Image(listeOfImage.get(cpt)));
    }
    
    public void remplaceImageDown(){
        cpt--;
        if(cpt == -1)
            cpt = listeOfImage.size() - 1;
        bienvenue.setImage(new Image(listeOfImage.get(cpt)));
    }
    
    public void anglais(){
        super.anglais();
        langue=true;
        lettre.setText("H");
        suite.setText("ome");
        button1.setText("Home");
    }
    
    public void francais(){
        langue=false;
        lettre.setText("A");
        suite.setText("ccueil");
        button1.setText("Accueil");
        button2.setText("Qui sommes nous?");
        button3.setText("Produits");
        lient1.setText("Qui sommes nous ?");
        lient2.setText("En savoir plus");
    }
}
