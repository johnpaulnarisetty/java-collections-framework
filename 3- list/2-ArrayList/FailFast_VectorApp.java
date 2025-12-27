
import java.util.*;
public class FailFast_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Before the Modification Vector is: "+v);
		
		Iterator i=v.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj==20){
				v.add(100);
			}
		}
		
		System.out.println("After modification Vector is :"+v);
	}
}