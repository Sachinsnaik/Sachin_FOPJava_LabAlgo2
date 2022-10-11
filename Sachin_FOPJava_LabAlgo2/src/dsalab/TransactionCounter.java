package dsalab;

import java.util.Scanner;

public class TransactionCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Transaction Array:"); 
		int noOfTransactions = sc.nextInt();
		int arr[] = new int[noOfTransactions];
		System.out.println("Enter The Values Of Array:"); 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Total  Number Of Targets That Needs To Be Achieved:");
		int noOfTargets = sc.nextInt();

		while (noOfTargets-- != 0) {
			System.out.println("Enter The Value Of Target:");
			long targetValue = sc.nextInt();
			boolean isTargetAchieved = false;
			long sum = 0;

			for (int i = 0; i < arr.length; i++) {

				sum = sum + arr[i]; 
				if (sum >= targetValue) {
					System.out.println("Target Achieved After " + (i + 1) + " Transactions");
					System.out.println();
					isTargetAchieved = true;
					break;
				}
			}
			if (isTargetAchieved == false) {
				System.out.println("Given Target Is Not Achieved.");
			}

		}
	}

}