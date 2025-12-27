

import java.util.*;

public class ArrayList_EvOdd{
	public static void main(String x[]){
	
	ArrayList al=new ArrayList();
	
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(75);
		al.add(10);
		
		System.out.println("ArrayList is:"+al);
		Iterator i=al.iterator();
		int Ev=0,Odd=0;
		while(i.hasNext()){
			Object obj =i.next();
			if((int)obj%2==0){
				Ev++;
			}else{
				Odd++;
			}
			
		}
		System.out.println("Even Number from Arraylist is :"+Ev);
		System.out.println("Odd Number from Arraylist is :"+Odd);
	}
}