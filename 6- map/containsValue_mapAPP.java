


import java.util.*;
public class containsValue_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		boolean b=map.containsValue("SUV");
		if(b){
			System.out.println("Value Found");
		}else{
			System.out.println("Value not found");
		}
		
	}	
}