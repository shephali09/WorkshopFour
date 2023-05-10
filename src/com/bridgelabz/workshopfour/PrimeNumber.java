package com.bridgelabz.workshopfour;

/*WAP to find a prime number from the range of 1-100 and 
print it, store all non prime numbers in temp array and 
print it, also do the sum of prime number and print it*/

public class PrimeNumber {

	public static void main(String[] args) {

		PrimeNumber primeNumber = new PrimeNumber();
		int rangeStart = 1;
		int rangeEnd = 100;
		int number;
		int tempArray[] = new int[100];
		int sumOfPrimeNumbers = 0;
		int tempIndex = 0;

		// Sum of prime numbers and put non prime numbers in temp array
		for (number = rangeStart; number <= rangeEnd; number++) {
			if (isPrimeNumber(number)) {
				sumOfPrimeNumbers = sumOfPrimeNumbers + number;
			} else {
				tempArray[tempIndex] = number;
				tempIndex++;
			}
		}

		// print the prime numbers
		System.out.println("Prime numbers from 1-100: ");
		for (number = rangeStart; number <= rangeEnd; number++) {
			if (isPrimeNumber(number)) {
				System.out.print(number + " ");

			}

		}

		// print the non-prime numbers
		System.out.println("\nNon-Prime numbers: ");
		for (int i = 0; i < tempIndex; i++) {
			System.out.print(tempArray[i] + " ");
		}

		// print the sum of prime numbers
		System.out.println("\nSum of prime numbers: " + sumOfPrimeNumbers);

	}

	// Function to find out prime numbers
	public static boolean isPrimeNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
