package services.impl;

import services.ServicioA;

/**
 * CLASE DE IMPLEMENTACIÓN DEL ServicioA (INTERFACE): METODO suma (a+b)
 */
public class ServicioAImpl implements ServicioA {

	@Override
	public int sumar(int a, int b) {
		
		return a+b;
	}

}
