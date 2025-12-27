

import java.util.*;

public class ArrayList_max{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(70);
		al.add(10);
		
		System.out.println("Arraylist is:"+al);
		
		Iterator i=al.iterator();
		int max=0;
		while(i.hasNext()){
			Object obj =i.next();
			if((int)obj>max){
				max=(int)obj;
			}
		}
		
		System.out.println("Max Value from Array list is :"+max);
	}
}