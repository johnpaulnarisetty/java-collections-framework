
import java.util.*;

public class ArrayList_min{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(70);
		al.add(10);
		
		System.out.println("ArrayList is:"+al);
		Iterator i =al.iterator();
		int min=Integer.MAX_VALUE;
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj<min){
				min=(int)obj;
			}
		}
		
		System.out.println("Minimum Value from ArrayList is :"+min);
	}
}