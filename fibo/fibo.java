package fibo;

public class fibo{

    public int tamano;
    public String nombre;
 
    
    public fibo(String nombre, int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
 
    fibo() {
    } 
    
    public void mostrarSerie(){
    System.out.println(nombre+" de tamaño "+tamano+":");
        for (int i = 0; i <= tamano; i++) {
            System.out.print(fibonacci(i)+" ");
        }
       System.out.println();
    }

	public int fibonacci(int n)
		
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
