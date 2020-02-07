package com.sreya.srivalli;
import java.util.*;

public class Chocolates implements Candies {
	
	static ArrayList<String> c=new ArrayList<String>();
	
	String choco_name;
	int lowrange1;
	int highrange1;
	int weight1;
	int c_weight;
	int tc_count=0;
	int rc_count=0;
	Scanner scan=new Scanner(System.in);
	
	public void input() {
		System.out.println("\nEnter chocolate name");
		choco_name=scan.next();
		System.out.println();
		System.out.println("Enter weight");
		weight1=scan.nextInt();
		System.out.println();
		c_weight+=weight1;
		tc_count+=1;
		if(weight1>=lowrange1 && weight1<=highrange1) {
			c.add(choco_name);
			rc_count+=1;
		}
	}
	
	public void range(int low,int high) {
		lowrange1=low;
		highrange1=high;
	}
	

}
