package com.example.search;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
	//linear search
	public static Product linearSearch(Product[] products,String targetName) {
		for(Product p: products) {
			if (p.getProductName().equalsIgnoreCase(targetName)) {
				return p;
			}
		}
		return null;
	}
	
	//binary search
	public static Product binarySearch(Product[] products,String targetName) {
		int low=0;
		int high=products.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			int comparision=products[mid].getProductName().compareToIgnoreCase(targetName);
			if (comparision==0) {
				return products[mid];
			}
			else if(comparision<0) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Product[] products= {
				new Product(1,"laptop","electronics"),
				new Product(2,"mobile","electronics"),
				new Product(3,"chair","furniture"),
				new Product(4,"notebook","stationery"),
				new Product(5,"pen","stationery")
		};
		Arrays.sort(products, Comparator.comparing(Product::getProductName));
		
		String target="Pen";
		Product linearRes=linearSearch(products,target);
		Product binaryRes=binarySearch(products,target);
		
		System.out.println("Linear Search Result :");
		if (linearRes!=null) {
			System.out.println("Found: "+linearRes);
		}else {
			System.out.println("Product not found");
		}
		
		System.out.println("\n"+"Binary Search Result :");
		if (binaryRes!=null) {
			System.out.println("Found: "+binaryRes);
		}else {
			System.out.println("Product not found");
		}
	}
}
