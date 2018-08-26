package ar.edu.untref.aydoo;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class fibo{


		public static List<Integer> getFibonacci(int limite) {
	        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
	                .limit(limite)
	                .map(n -> n[0])
	                .collect(toList());
		}
	}

