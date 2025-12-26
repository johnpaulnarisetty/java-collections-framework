
import java.util.*;
public class max_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(70);
		v.add(40);
		v.add(50);
		
		Iterator i=v.iterator();
		int max=0;
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj>max){
				max=(int)obj;
			}
		}
		
		System.out.println("Max Element from Vector is: "+max);
	}
}