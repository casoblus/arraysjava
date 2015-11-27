import java.util.Scanner;
class Arrays
{
	private static void VER_PAREJAS( int[] array0, int[] array1 ) 
	{	
		int i, sumarrays = 0;
		// Devolve suma dos dous arrays
		for( i = 0; i < array0.length; i++ )
		{
			sumarrays += array0[i];	
		}

		for( i = 0; i < array1.length; i++ )
		{
			sumarrays += array1[i];	
		}
		// Visualiza as parellas de valores que
		// tienen el mismo indice en ambos arrays.
		if( array0.length == array1.length )
		{
			// Si tienen la misma longitud, 
			// muestro los valores emparejados
			System.out.println( "\tA0\t*\tA1\t" );
			
			for( i = 0; i < array0.length; i++ )
			{
				System.out.println( "\t" + array0[i] + "\t*\t" + array1[i] + "\t" );
			}
		}
	}
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		// Declara array
		int[] numeros;
		
		// Tamano del array
		int tamano = 10;
		numeros = new int[ tamano ];
		
		// indice de array
		int i;
		// Suma
		int suma = 0;

		int buscar;

		// pido numeros y los voy guardando en las posiciones del array
		for( i = 0; i < tamano; i++ )
		{
			System.out.println( "numero " + i );
			numeros[i] = sc.nextInt();
		}
				
		// Muestra cada valor del array
		for ( i = 0; i < tamano; i++ )
		{
			System.out.println( numeros[i] );
		}

		// Suma todos los valores del array
		for ( i = 0; i < tamano; i++ )
		{
			suma += numeros[i];
		}

		System.out.println( "La suma es: " + suma );

		// Se pide al usuario que numero buscar.
		System.out.println( "Buscar posicion del numero: " );
		buscar = sc.nextInt();

		for ( i = 0; i < tamano; i++ )
		{
			if ( numeros[i] == buscar )
				System.out.println( "El numero existe en las posicion: " + i );
		}

		// Muestra cual es el menor introducido
		int menor = 0, mayor = 0;
		for ( i = 0; i < tamano; i++ )
		{
			// La primera vez, asigno el valor de la primera posicion
			// del array para eliminar el 0 que contienen las variables menor y mayor.
			if( i == 0 ) 
			{
				menor = numeros[i];
				mayor = numeros[i];
			} else {
				if( menor > numeros[i] ) 
				{
					menor = numeros[i];
				} 
				else if( mayor < numeros[i] )
				{
					mayor = numeros[i];
				}
			}
		}

		System.out.println( "El menor valor introducido es: " + menor );
	
		System.out.println( "El mayor valor introducido es: " + mayor );
		
		int[] A0 = { 1, 2, 3, 4 };
		int[] A1 = { 3, 4, 5, 6 };	
		
		VER_PAREJAS( A0, A1 );
	}
}
