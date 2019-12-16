package es.studium.Cuadrados;

public class Cuadrados {

	public static void main(String[] args) 
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números naturales es;"+sumaCuadrados());

	}
	
	public static int sumaCuadrados() 
	{
		int resultado;
		resultado=0;
		for(int i=0; i<100; i++) 
		{
			resultado=resultado + (i*i);
		}
		
		return(resultado);
	}

}
