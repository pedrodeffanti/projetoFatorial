public class Fatorial {
	// versão iterativa do cálculo fatorial	
	public static int calcularFatorial (int n) throws IllegalArgumentException {
	    if (n<0)
	           throw new IllegalArgumentException("não existe fatorial para numeros negativos");	   
	    int resultado = 1;
	    if (n !=0) {
	    for (int i = 2; i <=n; i++)
		 resultado*= i;
	  } 
	   return resultado;
	}
}