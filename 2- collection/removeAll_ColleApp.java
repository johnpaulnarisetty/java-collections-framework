
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
		c.remove(10);
		c.remove(20);
		
		boolean b=al.remove(c);
		if(b){
			System.out.println("Elements removed from array");
		}else{
			System.out.println("Elements not removed");
		}
	}
}