package fibo;

public class fibo{

    public int tamano;
    public String nombre;
 
    
    
    public fibo(String nombre, int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
  // contructor para probar en los test
    fibo() {
    } 
    
  // metodo para ser utilizado en clase main y deolver la serir de fibonnaci
    public void mostrarSerie(){
    System.out.println(nombre+" de tamaño "+tamano+":");
        for (int i = 0; i <= tamano; i++) {
            System.out.print(fibonacci(i)+" ");
        }
       System.out.println();
    }

    //funcion fibonacci
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