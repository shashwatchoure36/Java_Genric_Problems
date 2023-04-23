public class Generic_Find_Max {
	

	public static void toPrintMaxInteger(Integer[] inputArray) {
		System.out.println("ELEMENTS IN ARRAY : ");
		for (int element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		System.out.println();

		int x;
		int max = inputArray[0];
		System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
		for (int i = 1; i < inputArray.length; i++) {
			/*
			 * Using compareTo method to find maximum among integer values in array
			 */
			if ((inputArray[i].compareTo(max)) > 0) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
		System.out.println("---------------------------------------------------------");
	}

	public static void toPrintMaxDouble(Double[] inputArray) {
		System.out.println("ELEMENTS IN ARRAY : ");
		for (double element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		System.out.println();

		int x;
		double max = inputArray[0];
		System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
		for (int i = 1; i < inputArray.length; i++) {
			/*
			 * Using compareTo method 
			 * to find maximum 
			 * among float values 
			 * in array
			 */
			if ((inputArray[i].compareTo(max)) > 0) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("WELCOME TO FIND MAXIMUM PROBLEM USING GENERICS PROGRAM");
		System.out.println("---------------------------------------------------------");

		// Integer array
		Integer[] intarr = { 50, 10, 39, 7, 11 };
		Find_Maximum.toPrintMaxInteger(intarr);

		//Double array
		Double[] doublearr = { 23.7, 34.2, 72.9, 4.2, 52.2 };
		Generic_Find_Max.toPrintMaxDouble(doublearr);
	}

}

}
