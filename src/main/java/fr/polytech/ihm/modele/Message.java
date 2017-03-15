package fr.polytech.ihm.modele;

public class Message {
	private String client;
	private String contenu;
	
	public Message(String client, String contenu){
		this.client = client;
		this.contenu = contenu;
	}
	
	public String getClient(){
		return client;
	}
	
	public String getContenu(){
		return contenu;
	}
}
