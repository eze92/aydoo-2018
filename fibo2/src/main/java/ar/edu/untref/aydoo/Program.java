package ar.edu.untref.aydoo;

public class Program {
	
	protected Program() {
		
	}
	
	  // metodo main que muestra el resultado

	public static void main(String[] args) {
	        int N = Integer.parseInt(args[0]);
		System.out.print("fibo");
		System.out.print("<");
		System.out.print(N);
		System.out.print(">:");
	        for (int i = 0; i < N; i++) {
	            System.out.print(fibo.fibonacci(i)+ " ");
	    }
	    System.out.println();  
	}

}
