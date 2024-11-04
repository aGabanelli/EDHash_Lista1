package model;

public class Chocolate {

	private double volume;
	private String nomeReceita;
	private int peso;

	public Chocolate() {
		super();
	}

	public int hashCode() {
		return (int) ((volume - 50) / 50);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}

	@Override
	public String toString() {
		return "Barra volume: " + volume + ", Receita: " + nomeReceita + ", peso: " + peso + "g";
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}