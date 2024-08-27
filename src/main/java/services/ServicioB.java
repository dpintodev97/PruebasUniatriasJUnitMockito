package services;
/***
 * 1.ServicioB (interface) DEPENDE DE ServicioA (interface) PARA ACCEDER A LOS SERVCICIOS QUE ALLÍ TENGA, EN ESTE CASO,
 * 	EL METODO ABTSRACTO DE sumar ; POR ESO AQUÍ ESCRIBIMOS UN getServicioA();
 * 
 * 2.MÉTODO void setServicioA(9; : PARA ESTABLECER QUE ESTE ServicioB DEPENDE DE OTRA CLASE, DEL MÉTODO DE OTRA CLASE
 * 
 * 3.METODO PROPIO multiplicarSumar CON 3 PARAMETROS; PARA QUE PUEDA MULTIPLICAR LA SUMA DE ESOS DOS VALORES int a, int b
 * 	AQUI IMPLEMENTARÁ EL METODO ABSTRACTO sumar DE ServicioA
 * 
 * 4.METODO MULTIPLICAR, int a, int b
 */
public interface ServicioB {
	//TOMAR METODO DE ServicioA:
	public ServicioA getServicioA();
	
	//DEPENDE DE METODO DE OTRA CLASE:
	public void setServicioA(ServicioA servicioA);
	
	//AQUI IMPLEMENTARTÁ sumar DE ServicioA:
	public int multiplicarSumar(int a, int b, int multiplicador);
	
	public int multiplicar(int a, int b);
	
	

}
