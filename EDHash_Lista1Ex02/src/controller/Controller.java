package controller;

import fatec.sp.gov.lib.listas.ListaGenerica;
import model.Morador;

public class Controller {

	ListaGenerica<Morador> moradores = new ListaGenerica<Morador>();
	
	public void cadastrar(String nomeMorador, int numeroApto, String modeloCarro, String placaCarro, String corCarro)
			throws Exception {
		Morador m = new Morador(nomeMorador, numeroApto, modeloCarro, placaCarro, corCarro);
		if (moradores.isEmpty()) {
			moradores.addFirst(m);
		} else {
			moradores.addLast(m);
		}
	}

	public void consultar() throws Exception {
		int tamanho = moradores.size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = moradores.get(i);
			System.out.println(m.toStringMorador());
		}
	}

	public void listarMoradoresDoAndar(int andar) throws Exception {
		int tamanho = moradores.size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = moradores.get(i);
			int ap = (int) m.getApartamento() / 100;
			if (ap == andar) {
				System.out.println(m.toStringMorador());
			}
		}
	}

	public void excluir(int numeroApto) throws Exception {
		int tamanho = moradores.size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = moradores.get(i);
			if (m.getApartamento() == numeroApto) {
				moradores.remove(i);
				System.out.println("Morador removido");
				return;
			}
		}
	}
}
