package Aplication;

import java.util.Scanner;

import service.Iphone;

public class Pessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a opção do seu Iphone: ");
		System.out.println("[1]Musica\n[2]Telefone\n[3]Navegador ");
		int n = sc.nextInt();
		Iphone p1 = new Iphone();
		if(n == 1) {
			p1.selecionarMusica();
			p1.play();
			p1.pausar();
		}else if(n == 2){         
			p1.ligar();
			p1.Tocando();
			p1.atender();
			p1.inciarCorreioVoz();
		}else {
			p1.exibirPagina();
			p1.adicionarNovaAba();
			p1.atualizarPagina();
		}
		
		sc.close();
		

	}

}
