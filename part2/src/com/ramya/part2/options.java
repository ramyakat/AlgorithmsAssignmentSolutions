package com.ramya.part2;

import java.util.*;

public class options {
	public void selectOptions(Object[] stocks, Object[] priceComparision, Scanner sc, boolean quit) {

		do {
			System.out.println("----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("----------------------------------------------");
			int choice = sc.nextInt();
			
			int length = stocks.length;
			double stockArray[] = new double[length];

			
			boolean priceCompare[] = new boolean[length];
			int count = 0;

			for (int i = 0; i < length; i++) {
				stockArray[i] = (double) stocks[i];
			}
			for (int i = 0; i < length; i++) {
				priceCompare[i] = (boolean) priceComparision[i];
			}

			switch (choice) {
			case 1:
				Sort.sort(stockArray);
				System.out.println("Stock prices in ascending are:");
				for (int i = stockArray.length - 1; i >= 0; i--) {
					System.out.println(+stockArray[i]);
				}
				break;
			case 2:
				Sort.sort(stockArray);
				System.out.println("Stock prices in descending are:");
				for (int i = 0; i < stockArray.length; i++) {
					System.out.println(+stockArray[i]);
				}
				break;
			case 3:
				for (int i = 0; i < length; i++) {
					priceCompare[i] = (boolean) priceCompare[i];
				}
				for (int i = 0; i < length; i++) {
					if (priceCompare[i]) {
						count++;
					}
				}
				System.out.println("Total no of companies whose stock price rose today" + count);
				break;
			case 4:
				for (int i = 0; i < length; i++) {
					priceCompare[i] = (boolean) priceCompare[i];
				}
				for (int i = 0; i < length; i++) {
					if (!priceCompare[i]) {
						count++;
					}
				}
				System.out.println("Total no of companies whose stock price declined today" + count);
				break;
			case 5:
				double keyValue = sc.nextDouble();
				for (int i = 0; i < stockArray.length; i++) {
					if (keyValue == stockArray[i]) {
						System.out.println("stock of value " + keyValue + " is present");
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println("stock of value " + keyValue + " is not present");
				}
				break;
			case 6:
				System.out.println("Exited Successfully");
				quit = true;
				break;
			}
		} while (!quit);
	}

}
