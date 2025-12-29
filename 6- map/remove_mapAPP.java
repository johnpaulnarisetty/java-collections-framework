
import java.util.*;
public class remove_mapAPP{
	public static void main(String x[]){
		HashMap map=new HashMap();
		
		map.put(1,10);
		map.put(2,20);
		map.put(3,10);
		map.put(4,50);
		map.put(5,40);
		
		Object obj =map.remove(3);
		if(obj!=null){
			System.out.println("Value Removed "+obj);
		}else{
			System.out.println("Value not found !");
		}
	}
}