package ar.edu.untref.aydoo;

import java.util.Scanner;

public class fibo{

  
    public fibo() {
    } 
    
  // metodo main que muestra el resultado
    public static void main(String[] args) {
    	   Scanner escaner = new Scanner(System.in);
           int n = escaner.nextInt();
           for (int i = 0; i <= n; i++) {
               int resultado = fibonacci(i);
            System.out.print(fibonacci(i)+" ");
        }
       System.out.println();
    }

    //funcion fibonacci
	public static int fibonacci(int n)
		
	{
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
