

import java.util.*;

public class ArrayList_sum{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Array List :"+al);
		ListIterator i=al.listIterator();
		int sum=0;
		while(i.hasNext()){
			Object obj=i.next();
			sum+=(int)obj;
		}
		System.out.println("Sum of All Elements present in ArrayList: "+sum);
	}
}