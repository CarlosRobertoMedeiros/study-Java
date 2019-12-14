package br.com.roberto.grasp.herancacomposicaoeliskov;

/*
 * Princípio de Liskov(LSP) -> Liskov Subistitutive Principle
 * 
 * Para Pré condições As classes filhas não podem ser mais restritivas que as classes pai
 *     Ex. na classe pai uma regra de for de 1 a 100 na fila eu digo que não é mais de 1 a 100 e sim 1 a 50 
 *
 * Para Pós condições As classes filhas não podem ser menos restritivas que as classes pai
 *     Ex. um método devolve um inteniro de 1 a 100 e na classe filha muda devolvendo 1 a 200 
 *     
 * Toda a parte de pré e pós condições sempre vão quebrar o uso dos clientes(Quem consome a classe)
 * 
 *  Favoreça a composição de Objetos
 *  
 *  Refatorei tirando a heranção de conta e criando a composição ... isso usando o ManipuladorDeSaldo
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
