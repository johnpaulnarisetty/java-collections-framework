
import java.util.*;

public class Sum_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Iterator i=v.iterator();
		
		int sum=0;
		
		while(i.hasNext()){
			
			Object obj=i.next();
			sum+=(int)obj;
		}
		
		System.out.println("Sum is the :"+sum);
	}
}