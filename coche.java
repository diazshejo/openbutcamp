package tema3;

public class coche {
	//atributos de la clase
	private int Puertas;
	
	//constructor
	public coche() {
		Puertas = 2;
	}
	
	//metodo incrementa las puertas 
	public int Puertas(int NuevaPuerta) {
		
		int s = NuevaPuerta + Puertas;
		
		return s;
	}
	
	
	public static void main(String[] args) {
		
		//creacion del objeto
		coche miCoche  = new  coche();
		
		
		//funcion incrementa las puertas del coche
		int IncrementoPuertas = miCoche.Puertas(1);
		
		//impresion del total de puertas del coche
		System.out.println("Total de puertas del coche " + IncrementoPuertas);
	}
}
