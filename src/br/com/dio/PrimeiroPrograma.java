package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 4;
		int soma = a + b;
		System.out.println("Hello World " + soma);*/
		}
}
class Livro{
	private String nome;
	private String npag;
	
}
