package com.greatlearning.service;

public class Notecount {

	public void NoteCount(int[] array, int amount) {
		// TODO Auto-generated method stub
		int[] notecounter=new int[array.length];
		
		try {for(int i=0; i< array.length; i++) {
			
			if(amount>=array[i]) {
				notecounter[i]=amount/array[i];
				amount=amount-notecounter[i]*array[i];
				
			}
		}
			if (amount>0) {
				System.out.println("Exact amount can't be given with the highest denomination");
			}else
			{
			System.out.println("Your payment approach in order to give min no of notes will be");
			
			for(int i=0; i<array.length;i++) {
				if(notecounter[i] !=0) {
					
					System.out.println(array[i]+":"+notecounter[i]);
				}
			}
		}
		
		
		
	}catch(ArithmeticException a) {
		System.out.println(a+"notes of denomination 0 is invalid");
	}

}}
