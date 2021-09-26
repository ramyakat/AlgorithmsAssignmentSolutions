package com.ramya.part2;

import java.util.HashMap;
import java.util.Scanner;

import com.ramya.part2.options;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the no of companies");
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> stocks = new HashMap<Integer, Double>();
		HashMap<Integer, Boolean> priceComparision = new HashMap<Integer, Boolean>();
		boolean quit = false;
		int companies = sc.nextInt();
		for (int k = 1; k <= companies; k++) {
			System.out.println("Enter current stock price of the company " + k);
			sc = new Scanner(System.in);
			double stockPrice = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean isHigher = sc.nextBoolean();

			stocks.put(k, stockPrice);

			priceComparision.put(k, isHigher);
		}
		Object[] stockValues = stocks.values().toArray();
		Object[] prices = priceComparision.values().toArray();
		options op = new options();
		op.selectOptions(stockValues, prices, sc, quit);
	}
}