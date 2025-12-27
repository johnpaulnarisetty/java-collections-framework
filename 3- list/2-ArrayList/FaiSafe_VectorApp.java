
import java.util.*;
import java.util.concurrent.*;
public class FaiSafe_VectorApp{
	public static void main(String x[]){
		CopyOnWriteArrayList cp=new CopyOnWriteArrayList();
		cp.add(10);
		cp.add(20);
		cp.add(30);
		
		int index=0;
		System.out.println("Before Modification : "+cp);
		for(Object obj:cp){
			int val=(int)obj*10;
			cp.set(index,val);
			index++;
		}
		
		System.out.println("After Modification : "+cp);
	}
}