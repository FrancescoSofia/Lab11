package it.polito.tdp.bar.model;

public class Tavolo {
	
	private int id;
	private int posti;
	private boolean free;
		

	public Tavolo(int id, int posti) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", posti=" + posti + ", free=" + free + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tavolo other = (Tavolo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
