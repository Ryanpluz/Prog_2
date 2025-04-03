package livraria;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		Configs configs = new Configs();
		
		int id_livros = 1;
		
		boolean parar = false;
		
		do {
			
		int opcoes =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: \n [1]Adicionar \n[2]Consultar \n[3]Remover\n [4]Parar"));
		
		switch(opcoes){
		case 1:
			livros.add(configs.adicionarLivro(id_livros));
			id_livros++;
			break;
		case 2:
			configs.listarlivros(livros);
			break;
		case 3:
			System.out.println("Digite o ID do livro que deseja devolver: ");
			int id = leitor.nextInt();
			configs.removerLivro(livros,id);
			break;
		case 4:
			parar = true;
			break;
		}
		}while(!parar);

	}

}
