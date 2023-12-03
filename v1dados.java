public class Main {

	public static void main(String args[]) {
		
		int x = 0;
		int sumatorio = 0;
		int errores = 0;
		String texto = "";
		String mensaje = "";
		String stringsolonumeros = "";
		
		/*
		
		si sumas 0 + 0, hara la suma, dando de resultado 0, pero en el caso de que 
		intentes sumar parámetros que no tengan ningun número, tambien hara la suma
		ya que al no tener ningun número le asigna un cero. Pero seguira diciendo
		que "has introducido valores no validos".
		
		
		*/
		
		/* REALIZADO POR G0NZ410 24NCH3Z */
		
		
		
		for (int i = 0; i<args.length; i++){
		
			texto = args[i];
		
			stringsolonumeros = "";
		
			for (int z = 0; z<texto.length(); z++){
			
				if (texto.charAt(z) >= 48 && texto.charAt(z) <=57){
				
				stringsolonumeros += texto.charAt(z);
				
				} else {
				errores++;
				}
				
			}
			
			if (stringsolonumeros == ""){
				stringsolonumeros = "0";
			}
			
			sumatorio += Integer.parseInt(stringsolonumeros);
			
			if (i<args.length-1){
				mensaje += stringsolonumeros + " + ";
				
			} else {
				mensaje += stringsolonumeros;
				
			}
			
			x = 1;
		
	

	}
	
			switch (x){

				case 0:
				System.out.println("NO HAS INTRODUCIDO NADA");
				break;
				
				case 1: 
				System.out.println("LA SUMA DE : " + mensaje + " = " + sumatorio);
				
				if (errores > 0){
				System.out.println("HAS INTRODUCIDO VALORES NO VALIDOS");
				}
				break;
							
			}
			
		System.out.println(">  FIN  <");
	}

}
