public class Generic_Find_Max {
	
	/*
	 * Implementing maximum problem 
	 * using Generics
	 */
	public static <E extends Comparable<E>> E toPrintMaxGenerics(E[] inputArray) {
		System.out.println("ELEMENTS IN ARRAY : ");
		
		/*Displaying the elements
		 * in array
		 */
		for (E element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		System.out.println();

		
		E max = inputArray[0];
		System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
		for (int i = 1; i < inputArray.length; i++) {
			/*
			 * Using compareTo method 
			 * to find maximum element 
			 * in array
			 */
			if (inputArray[i].compareTo(max) > 0) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
		System.out.println("---------------------------------------------------------");
		return max;

	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("WELCOME TO FIND MAXIMUM PROBLEM USING GENERICS PROGRAM");
		System.out.println("---------------------------------------------------------");

		// Integer array
		Integer[] intarr = { 25, 10, 33, 7, 11 };
		Generic_Find_Max.toPrintMaxGenerics(intarr);

		// Double array
		Double[] doublearr = { 12.4, 54.3, 64.0, 2.4, 25.7 };
		Generic_Find_Max.toPrintMaxGenerics(doublearr);

		// String array
		String[] stringarr = { "Strobary", "Chery", "Mango", "Banana", "Lemon" };
		Generic_Find_Max.toPrintMaxGenerics(stringarr);
	}

}