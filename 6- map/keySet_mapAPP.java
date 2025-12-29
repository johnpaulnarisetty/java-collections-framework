




import java.util.*;
public class keySet_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		
		Set key=map.keySet();
		
		
		
		
		Iterator i=key.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			Object value=map.get(obj);
			System.out.println(obj+" ----> "+value);
		}
		
	}	
}