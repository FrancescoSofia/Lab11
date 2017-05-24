package it.polito.tdp.bar.model;

public class Event implements Comparable<Event> {

	
	public enum EventType {
		OUT;
	}

	private Tavolo tavolo ;
	private Gruppo gruppo ;
	private int time;
	private EventType type ;
	
	@Override
	public int compareTo(Event other) {
		return this.time-other.time;
	}

	public Event( Gruppo gruppo,Tavolo tavolo, int time, EventType type) {
		super();
		this.tavolo = tavolo;
		this.gruppo = gruppo;
		this.time = time;
		this.type = type;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public Gruppo getGruppo() {
		return gruppo;
	}

	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}
	

}
