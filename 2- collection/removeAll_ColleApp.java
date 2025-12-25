
import java.util.*;

public class removeAll_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Collection c=new ArrayList();
		c.add(10);
		c.add(20);
		
		boolean b=al.removeAll(c);
		if(b){
			System.out.println("Elements removed from array");
		}else{
			System.out.println("Elements not removed");
		}
		
		System.out.print(" "+al);
	}
}