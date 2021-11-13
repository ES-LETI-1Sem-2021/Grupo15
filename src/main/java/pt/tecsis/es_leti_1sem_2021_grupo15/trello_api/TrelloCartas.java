package pt.tecsis.es_leti_1sem_2021_grupo15.trello_api;

import java.util.HashMap;
import java.util.List;

import org.trello4j.Trello;
import org.trello4j.model.Board;
import org.trello4j.model.Card;

public class TrelloCartas {
	

	//Tambem da título dos cartoes, Requerimento feito com os ID do Board (EX:Reuni�es, Daily Scrum, etc...)		
	public static List<Card> getTituloDeTodasAsCartas(Trello trelloApi, String NomeDoQuadro){
		
		
		String ProjectID= TrelloID.getQuadroID(trelloApi,NomeDoQuadro);
		
		List<Card> cartas = trelloApi.getCardsByBoard(ProjectID);
		
		for (Card carta : cartas) {
            System.out.println(carta.getName());//+"- "+ cartas.getId()+"-"+cartas.getIdBoard());
		}
		
		return cartas;
		
		
	}
	
	
	
	
	private static List<Card> getCartasPorFila(Trello trelloApi, String Fila, String NomeDoQuadro){
		
		String FilaID= TrelloID.getFilaID(trelloApi, NomeDoQuadro,Fila);
		
		List<Card> cards = trelloApi.getCardsByList(FilaID);
		
		return cards;
		
	}
	
	
	
	
	public static List<Card> getTituloDasCartasPorFila(Trello trelloApi, String Fila, String NomeDoQuadro){
				
			List<Card> checklists = getCartasPorFila(trelloApi, Fila, NomeDoQuadro);
			
			for (Card cartas : checklists) {
	            System.out.println(cartas.getName());//+"- "+ cartas.getId()+"-"+cartas.getIdBoard());
			}
			
			return checklists;
			
			
	}
	
	
	
	//Retorna o Título de cada Carta, e o conteudo de cada carta, requerimento feito com os nome da fila e o nome do Quadro  (EX:[R0] - Entendimento do projeto e configura��es iniciais -------- etc...)
	public static  List<Card> getCartasDescricaoPorFila(Trello trelloApi,String Fila, String NomeDoQuadro){  //, //Board projectName) {
			
		
		List<Card> cards = getCartasPorFila(trelloApi, Fila, NomeDoQuadro);

		for (Card cartas : cards) {
            System.out.println(cartas.getName()+ "  -----------------  " + cartas.getDesc() );//+"-"+cartas.getIdBoard());
		}
		
		return cards;
	     
	     
	}

}