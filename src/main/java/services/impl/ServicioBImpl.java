package services.impl;

import services.ServicioA;
import services.ServicioB;
/**
 * clase IMPLEMENTACION DE METODOS DE ServicioB; 
 * PATRON DE DISEÑO DE INYECCION DE DEPENDENCIAS CON private ServicoA servicioA PORQUE ES MI DEPENDENCIA, ES DECIR,
 * 		DEPENDE DE UN SERVICIO DE OTRO ELEMNTO ; 
 * SE DEPENDE PORQUE USO ServicioA PARA POR EJEMPLO, SUMAR 2 VALORES
 * -----------------------------------------
 * ServicoBImpl DEPENDE DE ServicioAImpl
 * -----------------------------------------	
 */
public class ServicioBImpl implements ServicioB {
	
	//-- DEPENDENCIA (PATRÓN INYECCIÇON DE DEPENDENCIAS; ELEMENTO CON SUS MÉTODOS, EN ESTE CASO, sumar() ):
	private ServicioA servicioA;

	
	//1.OBTENEMOS LA DEPENDENCIA servicoA:
	@Override
	public ServicioA getServicioA() {
		
		return servicioA;
	}

	//2.INICIALIZAMOS LA DEPENDENCIA servicioA: 
	@Override
	public void setServicioA(ServicioA servicioA) {
		this.servicioA = servicioA;

	}

	//3.AQUÍ USAMOS LA DEPENDENCIA servicioA:
	@Override
	/**
	 * DEPENDEMOS DE ServicioA servicoA; PORTQUE TOMO SU MÉTODO sumar()
	 */
	public int multiplicarSumar(int a, int b, int multiplicador) {
		
		return servicioA.sumar(a, b)*multiplicador;
	}

	@Override
	public int multiplicar(int a, int b) {
		
		return a*b;
	}

}
