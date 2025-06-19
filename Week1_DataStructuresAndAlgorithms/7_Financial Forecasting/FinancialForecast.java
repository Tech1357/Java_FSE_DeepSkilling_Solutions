package com.example.forecasting;

import java.util.Scanner;

public class FinancialForecast {
	public static double futureValue(double currentVal,double growth,double years) {
		//base case
		if(years==0) {
			return currentVal;
		}
		//recursive case
		return ((1+growth) * futureValue(currentVal,growth,years-1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter current value");
		double currentvalue=sc.nextDouble();
		System.out.println("Enter the growth rate");
		double growth=sc.nextDouble();
		System.out.println("Enter how many years");
		int years=sc.nextInt();
		
		double result = futureValue(currentvalue,growth,years);
		System.out.printf("Future value after "+years+" years is : %.2f",result);
	}
}
