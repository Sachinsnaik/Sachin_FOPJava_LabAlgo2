package dsalabcurrencydenominations;

import java.util.Scanner;

public class NotesCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Currency Denominations:");
		int noOfDenominations = sc.nextInt(); 
		int[] arr = new int[noOfDenominations]; 
		System.out.println("Enter The Currency Denomination Values:");
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Amount You Want To Pay");
		int payment = sc.nextInt(); 
		sortArray(arr);
		countNotes(arr, payment); 

	}

	private static void countNotes(int[] arr, int payment) {
		int[] notesCounter = new int[arr.length];
		try {
			for (int i = 0; i < arr.length; i++) {
				
				if (payment >= arr[i]) {
					notesCounter[i] = payment / arr[i];
					payment = payment - notesCounter[i] * arr[i];
				}
			}
			if (payment > 0) {
				System.out.println("Your Payment Amount Cannot Be Achieved With The Highest Denomination");

			} else {
				System.out.println("Your Payment Approach In Order To Give Minimum Number Of Notes Will Be:");
				for (int i = 0; i < arr.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(arr[i] + ":" + notesCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("Denominations Cannot Be Zero");
		}

	}

	private static void sortArray(int[] arr) { 
		for (int i = 0; i < arr.length - 1; i++) { 
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j]; 
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}

}