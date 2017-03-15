package fr.polytech.ihm.controller;

import java.io.IOException;

import fr.polytech.ihm.modele.Message;
import fr.polytech.ihm.modele.Modele;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MessageController {
	@FXML
    private ImageView toBeOrToHave;
	
	@FXML
	private TableView<Message> tableView;
	
	@FXML
    public void initialize(){
		TableColumn<Message, String> titre = new TableColumn<>("Expéditeur");
        titre.setCellValueFactory(new PropertyValueFactory<>("client"));
        titre.setPrefWidth(200);
        
        TableColumn<Message, String> contenu = new TableColumn<>("Message");
        contenu.setCellValueFactory(new PropertyValueFactory<>("contenu"));
        contenu.setPrefWidth(1200);
        
        tableView.getColumns().addAll(titre, contenu);
        tableView.setItems(Modele.getMessages());
        tableView.setVisible(true);
    }
	
	public void retour() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
