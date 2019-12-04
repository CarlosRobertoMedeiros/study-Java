package br.com.roberto.java8.certificacaooca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrabalhandoComPacoteJavaUtil {

	public static void main(String[] args) {

		//Para Certifica��o Refazer o c�digo sem IDE
		// O Comparable implementa a interface compareTo usando o this
		// O Comparator implementa interfaces de Compara��o ente 2 objetos
		// Para o sort funcionar essas interfaces tem que ser implementadas
		
		// Ordenando Uma Lista de Conta Banc�ria

		// Criando as contas
		Conta conta1 = new Conta(5452, "Carlos Roberto");
		Conta conta2 = new Conta(1234, "Luciene Alves");
		Conta conta3 = new Conta(3145, "Assis Lima");
		Conta conta4 = new Conta(2438, "Lucia Lima");

		// Adicionando na lista
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);

		// Usando o sort de Collections
		// Para ter �xito tem que implementar a Interface Comparable
		
		System.out.println("---------------------------------------");
		System.out.println("TESTANDO COMPARA��O A PARTIR DO C�DIGO ");
		System.out.println("---------------------------------------");
		
		//Informando quais ser�o os par�metros de compara��o para o sort de Collections
		Collections.sort(contas);
		System.out.println(contas);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("TESTANDO COMPARA��O A PARTIR DO NOME POR QUANTIDADE DE CARACTERES");
		System.out.println("------------------------------------------------------------------");
		
		//Implementando uma Nova Forma de Compara��o Pelo Tamanho dos Nomes
		TamanhoDoNomeComparator tamanhoDoNomeComparator = new TamanhoDoNomeComparator();
		Collections.sort(contas,tamanhoDoNomeComparator);
		System.out.println(contas);

	}
}

class TamanhoDoNomeComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta conta, Conta outraConta) {
		return Integer.compare(conta.getNome().length(), outraConta.getNome().length());
	}
}

class Conta implements Comparable<Conta> {
	private int codigo;
	private String nome;

	public Conta(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Conta outraConta) {

		/*Para entendimento
		if (this.codigo < outraConta.codigo) {
			return -1;
		}

		if (this.codigo > outraConta.codigo) {
			return 1;
		}
		return 0;
		*/
		
		//Para Implementa��o
		return Integer.compare(this.codigo, outraConta.codigo);
	}
	
	@Override
	public String toString() {
		return "[ C�digo "+this.codigo+" "+ " Nome "+this.nome+" ] \n";
	}
}
