package it.polito.tdp.bar.model;

public class Tavolo {
	
	private int posti;
	private boolean free;
		

	public Tavolo(int posti) {
		super();
		this.posti = posti;
		free = true;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

}
