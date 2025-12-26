
import java.util.*;

public class remove_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Iterator i=v.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj==30){
				i.remove();
			}
		}
		
		System.out.println(v);
	}
}