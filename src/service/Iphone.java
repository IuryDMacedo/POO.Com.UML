package service;

public class Iphone implements AparelhoTelefonico,Musicial,NavegadorInternet{

	
	public Iphone() {
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Pagina Aberta!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba Aberta!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina Atualizada!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica!");
		
	}

	@Override
	public void play() {
		System.out.println("Musica tocando!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica Pausada!");
		
	}

	@Override
	public void ligar() {
		System.out.println("Chamando Contacto!");
		
	}

	@Override
	public void Tocando() {
		System.out.println("Seu telefone esta tocando!");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo!");
		
	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("Chamada Não atendida, Mensagem no Correio de Voz!");
		
	}

	
	
	
}
