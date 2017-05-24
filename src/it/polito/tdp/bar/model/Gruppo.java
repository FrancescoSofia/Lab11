package it.polito.tdp.bar.model;

public class Gruppo {
		
	private String nome;
	private int numPersone;
	private int durata;
	private double tolleranza;
	
	
	public Gruppo(String nome, int numPersone, int durata, double tolleranza) {
		super();
		this.nome = nome;
		this.numPersone = numPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumPersone() {
		return numPersone;
	}


	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public double getTolleranza() {
		return tolleranza;
	}


	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}


	@Override
	public String toString() {
		return "Gruppo [nome=" + nome + ", numPersone=" + numPersone + ", durata=" + durata + ", tolleranza="
				+ tolleranza + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Gruppo other = (Gruppo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
	
	
}
