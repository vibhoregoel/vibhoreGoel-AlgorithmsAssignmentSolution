package com.assignment2;

import java.util.Scanner;

public class SearchSpecificPrice {
	public void searchingPrice(double price[]) {
		SortingPrices sp = new SortingPrices();
		Scanner sc1 = new Scanner(System.in);
		sp.ascendingSort(price, 0, price.length - 1);
		System.out.println("Enter the Stock price you want to search");
		double key = sc1.nextDouble();
		int low = 0;
		int high = price.length - 1;
		int mid = (low + high) / 2;

		while (low <= high) {
			if (key < price[mid])
				high = mid - 1;
			else if (key == price[mid]) {
				System.out.println("Stock of value " + key + " is present");
				break;
			} else
				low = mid + 1;

			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("Stock of value " + key + " is not present");

		}
	}
}
