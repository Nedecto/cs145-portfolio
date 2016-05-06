import java.util.Scanner;

/**
 *  v.20160429
 *  This class contains only STATIC methods. Each method below executes a 
 * 	a basic aspect of programming (loops, conditionals, arrays, variables, 
 *	simple math computations, etc.). Your task is to implement each method
 *	below as indicated in the comments. You will use another file 
 *	(e.g., PortfolioApp.java) to run and test your method implementations.
 */
class MyPortfolio {

    /**
     * Prompts the user for their name. This method should use a Scanner object
     * to retrieve the name. It shoud return the collected string.
     */
	static String getFirstName() {
		Scanner name_1 = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = name_1.next();
        return name;
	}


    /**
     * Accepts a list of integers as an argument and prints the integers to 
     * the screen on one line.
     */	
	static void printIntegerList(int[] values) {        
		for(int i = 0; i < values.length ; i++){
		 System.out.print(values[i] + " ");
		}

	}


    /**
     * Accepts a list of integers as an argument and prints the integers IN REVERSE 
     * ORDER to the screen on one line.
     */	
	static void printIntegerListReversed(int[] values) {
        	for(int i = values.length -1; i > -1; i--) {
            		System.out.print(values[i] + " ");         
        	}

	}

    /**
     * Accepts two characters, swaps the value of left_char and right_char
     * and returns the "new" left_char.
      */	
	static char swapLeftWithRight(char left_char, char right_char) {
		char x = left_char;
		left_char = right_char;
		right_char = x;
		return left_char ;
	}

    /**
     * Accepts a list of integers as an argument and swaps the first value 
     * with the last value in the list. This method should create a new array
     * containing the swapped version of the array passed in as the argument.
     */	
	static int[] swapFirstWithLast(int[] values) {
        int x = 0;
        x = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = x;
       

		return values;
	}

    /**
     * Accepts a list of integers as an argument and returns the smallest value
     * found in the list.
     */	
	static int min(int[] values) {
        int x = values[0];
        for(int i = 0; i < values.length; i++){
            if (values[i] < x) {
                x = values[i];
            }
        }
		return x;
	}

    /**
     * Accepts a list of integers as an argument and returns the largest value
     * found in the list.
     */	
	static int max(int[] values) {
        int x = values[0];
        for(int i = 0; i < values.length; i++){
            if (values[i] > x) {
                x = values[i];
            }
        }
		return x;
	}

    /**
     * Accepts a list of integers as an argument and returns the average of all the
     * values found in the list.
     */	
	static int findAverage(int[] values) {
        int x = 0;
        for(int i = 0; i < values.length; i++)
             x = x + values[i];
        int avg = x / values.length;
		return avg;
	}

    /**
     * Accepts a list of integers and an integer value as arguments and returns 
     * the number of times the integer is found in the list.
     */	
	static int frequencyCount(int[] values, int val) {
        int x = 0;
        for(int i = 0; i < values.length; i++){
            if (val == values[i]){
                x = x + 1;
            }
        }


		return x;
	}

    /**
     * Accepts a String argument and returns the argument in reverse order.
     */	
	static String reverseString(String chars) {
        String n = "";
        for(int i = chars.length() -1; i > -1; i--) {
                  n = n + chars.charAt(i);         
            }

		return n;
	}
}
