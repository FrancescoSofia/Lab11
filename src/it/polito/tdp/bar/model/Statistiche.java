package it.polito.tdp.bar.model;

import java.util.*;

import it.polito.tdp.bar.model.Event.EventType;



public class Statistiche {
	
//	private int NG; // numero gruppi (2000);
	private Map<Integer,Tavolo> tavoli;
	
	
	//private int TEMPO_AL_BAR =  
	
	private int tavoliOccupati = 0;
	
	private PriorityQueue<Event> queue;
	
	private int clientiTotali= 0;
	private int clientiSoddisfatti = 0;
	private int clientiInsoddisfatti = 0;
	
	
	public Statistiche( Map<Integer, Tavolo> tavoli) {
		super();
		this.tavoli = tavoli;
		this.queue = new PriorityQueue<>();
	}	

	public int getClientiTotali() {
		return clientiTotali;
	}


	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}


	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}


	public void addGruppo(Gruppo gruppo, int time) {
		for(Tavolo t: tavoli.values()){
			if(t.isFree()==true){
			if(t.getPosti()==gruppo.getNumPersone()){
				
			}
		}}
		Tavolo tavolo = new Tavolo(10);
		Event e = new Event(gruppo,tavolo,time,EventType.OUT) ;
		queue.add(e) ;
	}


	public void run() {
		while (!queue.isEmpty()) {
			Event e = queue.poll();
			System.out.println(e);

			switch (e.getType()) {
			case OUT:
				processOutEvent(e);
				break;
			}
		}
	}
	
	private void processOutEvent(Event e) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	

}
