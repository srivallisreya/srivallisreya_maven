package com.sreya.srivalli;
import java.util.*;

public class Sweets implements Candies {
	
	static ArrayList<String> s=new ArrayList<String>();
	
	String sweet_name;
	int lowrange;
	int highrange;
	int weight;
	int s_weight;
	int ts_count=0;
	int rs_count=0;
	Scanner scan=new Scanner(System.in);
	
	public void input() {
		System.out.println("\nEnter sweet name");
		sweet_name=scan.next();
		System.out.println();
		System.out.println("Enter weight");
		weight=scan.nextInt();
		System.out.println();
		s_weight+=weight;
		ts_count+=1;
		if(weight>=lowrange && weight<=highrange) {
			s.add(sweet_name);
			rs_count+=1;
		}

	}

	public void range(int low, int high) {
		lowrange=low;
		highrange=high;
		
	}

}
