

import java.util.*;

public class EnumerationhasMoreElement{
	public static void main(String x[]){
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(70);
		v.add(40);
		v.add(50);
		
		Enumeration e=v.elements();
		
		Iterator i=e.asIterator();
		
		while(i.hasMoreElements()){
			Object obj=i.nextElement();
			System.out.println(obj);
		}
	}
}