package br.com.roberto.designpatternsgof.estrutural.facadeesingleton;

public class EmpresaFachadaSingleton {
	
	/*Fazer com que o objeto tenha uma �nica Inst�ncia em todo o sistema*/
	public static EmpresaFachada instancia;
	
	protected EmpresaFachadaSingleton() {}
	
	public EmpresaFachada getInstance() {
		if (instancia==null)
				instancia = new EmpresaFachada();
		return instancia;
	}

}
