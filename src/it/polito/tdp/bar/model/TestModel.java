package it.polito.tdp.bar.model;

import java.util.HashMap;

public class TestModel {
	
	

	public static void main(String[] args) {
		
	 HashMap<Integer,Tavolo> tavoli = new HashMap<Integer,Tavolo>();
		
		
		tavoli.put(1,new Tavolo(1,10)); 
		tavoli.put(2,new Tavolo(2,10)); 
		tavoli.put(3,new Tavolo(3,8)); 
		tavoli.put(4,new Tavolo(4,8)); 
		tavoli.put(5,new Tavolo(5,8)); 
		tavoli.put(6,new Tavolo(6,8)); 
		tavoli.put(7,new Tavolo(7,6)); 
		tavoli.put(8,new Tavolo(8,6)); 
		tavoli.put(9,new Tavolo(9,6)); 
		tavoli.put(10,new Tavolo(10,6)); 
		tavoli.put(11,new Tavolo(11,4)); 
		tavoli.put(12,new Tavolo(12,4)); 
		tavoli.put(13,new Tavolo(13,4)); 
		tavoli.put(14,new Tavolo(14,4)); 
		tavoli.put(15,new Tavolo(15,4)); 		
		
		Statistiche stat = new Statistiche(tavoli) ;
		
		for(int i=0; i<2000; i++) {
			double tolleranza = Math.random();
			int durata = (int)(60+Math.random()*61);
			int numPersone = (int) (Math.random()*11);
			int time = (int) (Math.random()*11);
					
			Gruppo g = new Gruppo ("Gruppo"+String.valueOf(i),numPersone,durata,tolleranza) ;
			stat.addGruppo(g, 8*60+ time);
		}
		
		stat.run();
		
		System.out.println("Totali:   " + stat.getClientiTotali());
		System.out.println("Soddisfatti:" + stat.getClientiSoddisfatti());
		System.out.println("Insoddisfatti:     " + stat.getClientiInsoddisfatti());


	}

	}


