package br.com.roberto.grasp.herancacomposicaoeliskov;

/*
 * Princ�pio de Liskov(LSP) -> Liskov Subistitutive Principle
 * 
 * Para Pr� condi��es As classes filhas n�o podem ser mais restritivas que as classes pai
 *     Ex. na classe pai uma regra de for de 1 a 100 na fila eu digo que n�o � mais de 1 a 100 e sim 1 a 50 
 *
 * Para P�s condi��es As classes filhas n�o podem ser menos restritivas que as classes pai
 *     Ex. um m�todo devolve um inteniro de 1 a 100 e na classe filha muda devolvendo 1 a 200 
 *     
 * Toda a parte de pr� e p�s condi��es sempre v�o quebrar o uso dos clientes(Quem consome a classe)
 * 
 *  Favore�a a composi��o de Objetos
 *  
 *  Refatorei tirando a heran��o de conta e criando a composi��o ... isso usando o ManipuladorDeSaldo
 * */
public class ChamadorDeInvestimentos {

	public static void main(String[] args) {

		for (ContaComum conta : contasDoBanco()) {
			conta.rende();

			System.out.println(" Novo Saldo ");
			System.out.println(conta.getSaldo());
		}

	}

}
