package novo.iphone;

import aparelho.Smartfone;

public class NovoIphone {
	public static void main(String[] args) {
		Smartfone novoAparelho = new Smartfone();

		novoAparelho.ligar();
		novoAparelho.atender();
		novoAparelho.iniciarCorreioVoz();

		novoAparelho.exibirPagina();
		novoAparelho.adicionarNovaAba();
		novoAparelho.atualizarPagina();

		novoAparelho.tocar();
		novoAparelho.pausar();
		novoAparelho.selecionarMusica();
	}
}
