package com.greatlearning.main;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of transaction array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the values of array");
		int array[]= new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetnum=sc.nextInt();
		
		
		while (targetnum-- !=0) {
			int flag=0;
		
		long sum=0;
		System.out.println("Enter the value of target");
		int targetvalue=sc.nextInt();
		
		for (int i=0;i<size;i++) {
			sum=sum+array[i];
		
			if (sum>=targetvalue) {
				System.out.println("Target achieved after" +(i+1)+" transactions ");
				flag=1;
				break;
			}
			
		} 
		
		
		if (flag==0) {
			
			System.out.println("Target is not achieved  ");
		}
		} 
		sc.close();
	}
	}
