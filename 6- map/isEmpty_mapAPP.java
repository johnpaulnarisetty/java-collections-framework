

import java.util.*;
public class isEmpty_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		boolean b=map.isEmpty();
		if(b){
			System.out.println("map is true");
		}else{
			System.out.println("Map is not empty");
		}
		
	}	
}