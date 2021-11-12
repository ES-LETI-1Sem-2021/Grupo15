package pt.tecsis.es_leti_1sem_2021_grupo15.trello_api;

import java.util.List;

import org.trello4j.Trello;
import org.trello4j.TrelloImpl;
import org.trello4j.model.Action;
import org.trello4j.model.Card;
import org.trello4j.model.Checklist;


public class TrelloApiMain {
	
	
	private static final String trelloKey="dab38c0e84b88819e31482cf6017c733";
	private static final String trelloAccessToken="835f871fa169a6727334a677943a48dbc4369af0ebb26356f9b2c3cc291e1ff0";
	
	
	public static void main(String[] args) {
	     
		Trello trelloApi = new TrelloImpl(trelloKey, trelloAccessToken); 
	   
	     
	    //List<Board> boards = TrelloQuadros.getNomeDoProjeto(trelloApi);
	    List<Card> quadros = TrelloQuadros.getQuadros(trelloApi);//,boards.get(0));
	    
		//List<org.trello4j.model.List> checklists =  TrelloQuadros.getList(trelloApi);
	
	    List<Action> actions = TrelloQuadros.getActions(trelloApi, quadros.get(0).getId());
	

	
	}
	
	
	
	
     
}


