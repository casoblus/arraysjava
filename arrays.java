import java.util.Scanner;
class Arrays
{
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
	}
}
