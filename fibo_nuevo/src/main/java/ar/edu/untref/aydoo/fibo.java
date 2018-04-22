package ar.edu.untref.aydoo;


public class fibo{

  
    public fibo() {
    } 
    
  // metodo main que muestra el resultado

public static void main(String[] args) {
	//String vd = args[0];
    int N = Integer.parseInt(args[0]);
    int valor = Integer.parseInt(args[0]);
	System.out.print("fibo");
	System.out.print("<");
	System.out.print(N);
	System.out.print(">:");
   /* for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i)+ " ");
    }*/
    if (args[0] == "-0=vd") {
    	for (int i = 0; i < N; i++) {
    		System.out.print(invertirFibo(i)+ " "); 	
    	}
    }
    System.out.println();  
}

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
    public static int invertirFibo(int n){
        if(n <= 1) {
            System.out.println(fibonacci(n));
        }
        else{
            System.out.println(fibonacci(n));
            invertirFibo(n-1);
        }
		return -1;
    }
}



