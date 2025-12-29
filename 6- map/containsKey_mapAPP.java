


import java.util.*;
public class containsKey_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		boolean b=map.containsKey(3);
		if(b){
			System.out.println("Key Found");
		}else{
			System.out.println("Key not found");
		}
		
	}	
}