package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.List;

public class Program {
	
	protected Program() {
		
	}
	

	public static void main(String[] args) {

		 int limite = Integer.valueOf(args[0]);
	        List<Integer> resultado = fibo.getFibonacci(limite);
	        StringBuffer sb = new StringBuffer("fibo<").append(limite).append(">: ");
	        for (int valor: resultado) {
	            sb.append(valor).append(" ");
	        }
	        System.out.println(sb.toString());
	}

}

