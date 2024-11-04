package controller;

import model.Chocolate;
import fatec.sp.gov.lib.listas.ListaGenerica;

public class DoceiraController {

	ListaGenerica[] listaDoce;

	public DoceiraController() {
		listaDoce = new ListaGenerica[5];
		inicializarLista();
	}

	private void inicializarLista() {
		int tamanho = listaDoce.length;
		for (int i = 0; i < tamanho; i++) {
			listaDoce[i] = new ListaGenerica();
		}
	}

	public void identificarDoce(Chocolate chocolate) throws Exception {
		int posicao = (int) chocolate.hashCode();
		if (posicao == 0) {
			chocolate.setNomeReceita("Bombom");
			chocolate.setPeso(60);
			listaDoce[posicao].addLast(chocolate);
		}
		if (posicao == 1) {
			chocolate.setNomeReceita("Pavê");
			chocolate.setPeso(115);
			listaDoce[posicao].addLast(chocolate);
		}

		if (posicao == 2) {
			chocolate.setNomeReceita("Brigadeiro");
			chocolate.setPeso(160);
			listaDoce[posicao].addLast(chocolate);
		}

		if (posicao == 3) {
			chocolate.setNomeReceita("Bolo");
			chocolate.setPeso(215);
			listaDoce[posicao].addLast(chocolate);
		}
		if (posicao == 4) {
			chocolate.setNomeReceita("Ovos de Páscoa");
			chocolate.setPeso(280);
			listaDoce[posicao].addLast(chocolate);
		}

	}

	public void listarReceitas() throws Exception {
		int tamanho = listaDoce.length;

		for (int i = 0; i < tamanho; i++) {
			int tamanhoLista = listaDoce[i].size();
			for (int j = 0; j < tamanhoLista; j++) {
				System.out.println(listaDoce[i].get(j));
			}
		}
	}

}