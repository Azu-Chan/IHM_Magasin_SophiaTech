package fr.polytech.ihm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import fr.polytech.ihm.modele.Modele;

/**
 * Created by dziri on 26/02/17.
 */
public class Main extends Application {

        public static void main(String[] args) { launch(args); }

        @Override
        public void start(Stage primaryStage) throws IOException{
        	Modele.init();
        	
        	new AdminView();
        	
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/accueil.fxml"));
            primaryStage.setTitle("IHM_CLIENT");
            primaryStage.setScene(new Scene(root,1920,1080));
            primaryStage.show();
        }

}

class AdminView {
    
    AdminView() throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin.fxml"));
    	
    	Stage subStage = new Stage();
    	subStage.setTitle("IHM_ADMIN");
    	subStage.setScene(new Scene(root,1920,1080));
    	subStage .show();
    }
}
