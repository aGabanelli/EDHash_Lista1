package model;

public class Morador {

	private String nomeMorador;
	private int numeroApto;
	private String modeloCarro;
	private String placaCarro;
	private String corCarro;
	
	public Morador(String nomeMorador, int numeroApto, String modeloCarro, String placaCarro, String corCarro) {
		this.nomeMorador = nomeMorador;
		this.numeroApto = numeroApto;
		this.modeloCarro = modeloCarro;
		this.placaCarro = placaCarro;
		this.corCarro = corCarro;
	}

	public int getApartamento() {
        return numeroApto;
    }

    public String getNome() {
        return nomeMorador;
    }

    public String toStringMorador() {
        return "Apartamento: " + numeroApto + ", Nome: " + nomeMorador + ", Carro: " + modeloCarro + " (" + corCarro + "), Placa: " + placaCarro;
    }
	
}
