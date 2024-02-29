package Paquete1;

import java.util.Random;

public class ClasePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num;
		Random numeroAleatorio = new Random();
		System.out.println("Ola");
		System.out.println( "Insertando los siguientes valores: " ); 
		// inserta 10 enteros aleatorios de 0 a 99 en arbol
	  for ( int i = 1; i <= 10; i++ )
    {
       Num = numeroAleatorio.nextInt( 100 );
       System.out.print( Num + " " );
    }
		System.out.println("Biuford");

	}
	

}
