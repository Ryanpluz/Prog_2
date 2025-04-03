package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Configs {
		
	Scanner scanner = new Scanner(System.in);
	
		
	
		public Livro adicionarLivro(int id) {
			System.out.println("Digite o nome do autor do livro: ");
			String titulo = scanner.nextLine();
			System.out.println("Digite o nome do autor: ");
			String autor = scanner.nextLine();
			System.out.println("Digite o ano de lançamento: ");
			int ano = scanner.nextInt();
			scanner.nextLine();
			Livro livro = new Livro(id, titulo, autor, ano);
			System.out.println("Adicionado");
			return livro;
		}
		
		
		public void listarlivros(ArrayList<Livro> livros) {
			if (livros.isEmpty()){
				System.out.println();
				System.out.println("Nenhum Livro Cadastrado");
				System.out.println();
				return;
			}
			
			
			System.out.println();
			System.out.println("Lista de Livros: ");
			for(int i=0; i < livros.size(); i++) {
				
				System.out.println(livros.get(i).toString());
				
			}
			System.out.println();
		}
		
		
		public void removerLivro(ArrayList<Livro> livros , int id) {
			
			for(int i=0; i< livros.size(); i++)
				if(livros.get(i).getId() == id) {
					System.out.println();
					System.out.println("Livro removido com sucesso" + livros.get(i).getTitulo());
					System.out.println();
					livros.remove(i);
					return;
				}
		}
		
}
