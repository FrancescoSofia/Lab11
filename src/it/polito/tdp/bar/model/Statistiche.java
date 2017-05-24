package it.polito.tdp.bar.model;

import java.util.*;

import it.polito.tdp.bar.model.Event.EventType;




public class Statistiche {
	
//	private int NG; // numero gruppi (2000);
	private Map<Integer,Tavolo> tavoli;
	
	
	
	//private int TEMPO_AL_BAR =  
	
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
		clientiTotali += gruppo.getNumPersone();
		
		double tolleranza = Math.random();
		
		Tavolo t = this.assegnaTavolo(gruppo);
		if(t ==null){
			if(gruppo.getTolleranza()>=tolleranza){
				
				clientiSoddisfatti += gruppo.getNumPersone();
			}
			else{
				clientiInsoddisfatti += gruppo.getNumPersone();
			}
		}
		else{
			Event e = new Event(gruppo,t,time,EventType.OUT) ;
			queue.add(e) ;
		}
		
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
		
		e.getTavolo().setFree(true);
		
	}
	
	public Tavolo assegnaTavolo(Gruppo g){
		int min = 0;
		int tavolo = 0;
		for(Tavolo t: tavoli.values()){
			if(t.isFree()==true){
			if( min<g.getNumPersone()/t.getPosti() && g.getNumPersone()/t.getPosti() >=0.5){
				min = g.getNumPersone()/t.getPosti();
				tavolo = t.getId();
			}}}
	if(tavolo!=0){
		tavoli.get(tavolo).setFree(false);
	}
	return tavoli.get(tavolo);
}
	
}
