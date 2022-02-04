public class Fatorial {
	// versão iterativa do cálculo fatorial	
	public static int calcularFatorial (int n) {
	    int resultado = 1;

	    for (int i = 2; i <=n; i++)
		 resultado*= i;
	    return resultado;
	}
}