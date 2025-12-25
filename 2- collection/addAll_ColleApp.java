
import java.util.*;

public class addAll_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Collection c=new ArrayList();
		c.add(60);
		c.add(70);
		c.add(80);
		c.add(90);
		c.add(100);
	
		boolean b = al.addAll(c);
		if(b){
			System.out.println("Element Added in ArrayList");
		}else{
			System.out.println("Element is not added in Arraylist");
		}
		
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.print(" "+obj);
		}
	}
}