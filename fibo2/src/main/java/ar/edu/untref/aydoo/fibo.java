package ar.edu.untref.aydoo;

	public class fibo{

		  
	 /*   public fibo() {
	    } 
	    */

	    public static int fibonacci(int n){
	           if (n > 1){
	              return fibonacci(n-1) + fibonacci(n-2); 
	           }
	           else if (n == 1) {
	               return 1;
	           }
	           else if (n == 0 ){
	               return 0;
	           }
	           else{
	               System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	               return -1; 
	           }

	   	}
	}

