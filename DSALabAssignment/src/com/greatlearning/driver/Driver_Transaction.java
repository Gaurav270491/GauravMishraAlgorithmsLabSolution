package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.Notecount;

public class Driver_Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mergesort=new MergeSort();
		Notecount notecount= new Notecount();
		
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int array[]= new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			}
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		mergesort.sort(array,0,array.length-1);
		notecount.NoteCount(array,amount);
		
     sc.close();
	}

}
