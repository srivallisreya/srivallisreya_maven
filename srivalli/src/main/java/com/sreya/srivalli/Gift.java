package com.sreya.srivalli;
import java.util.*;

public class Gift{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int l,h,choice;
		boolean flag=true;
		
		System.out.println("     -----GiftBox-----");
		System.out.println();
		
		Sweets_display sweets=new Sweets_display();
		Chocolates_display choco=new Chocolates_display();
		System.out.println("Enter lowrange");
		l=scan.nextInt();
		System.out.println("Enter highrange");
		h=scan.nextInt();
		sweets.range(l,h);
		choco.range(l,h);
		
		while(flag) {
			System.out.println("1.SWEETS\n2.CHOCOLATES\n3.Display the candies in the given range\n");
			System.out.println("Enter the item you need to insert");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				sweets.input();
				break;
			case 2:
				choco.input();
				break;	
			case 3:
				System.out.println("Candies");
				System.out.print("Sweets in the range are----");
				sweets.display();
				System.out.println();
				System.out.print("Chocolates in the range are----");
				choco.display1();
				System.out.println("\nTotal number of candies in given range");
				System.out.println(sweets.rs_count+choco.rc_count);
				
				
			default:
				flag=false;
				break;
				
			}
		}
		System.out.println();
		System.out.println("\nTotal weight of the giftbox is:");
		System.out.println(choco.c_weight+sweets.s_weight);
		System.out.println("Total no.of candies in the gift box are:");
		System.out.println(sweets.ts_count+choco.tc_count);
		
		
		
		scan.close();
	}
}