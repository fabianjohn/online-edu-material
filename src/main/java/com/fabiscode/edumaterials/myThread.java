package com.fabiscode.edumaterials;

import java.util.Scanner;

public class myThread extends Thread {
	
	int i = 4;
	int x = 3;
	public void run() 
	{
		
		for(int i = 1; i<=x; i++) {
			
		System.out.println(i );
		}
		System.out.println("enter your No: ");
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextInt();
		}
		System.out.println("enter no: ");
			
			if(i==x) {
				System.out.println("Yes");
			}else {
				System.out.println("NO");
			}
			
		}
		
		
	}
	

