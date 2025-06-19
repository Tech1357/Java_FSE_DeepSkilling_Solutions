package com.example.singleton;

public class Main {

	public static void main(String[] args) {
		Logger log1=Logger.getInstance();
		log1.log("First Logger Instance is created");
		
		Logger log2=Logger.getInstance();
		log2.log("Second Logger Instance is created");
		
		if(log1==log2) {
			System.out.println("Both are same instances");
		}else {
			System.out.println("Both are different instances");
		}
	}

}
