

import java.util.*;
public class PlayerRecord_MapAPP{
	public static void main(String x[]){
		LinkedHashMap map=new LinkedHashMap();
		
		ArrayList al=new ArrayList();
		al.add("Dhoni");
		al.add("Rohit");
		al.add("Virat");
		
		ArrayList al1=new ArrayList();
		al.add("Smith");
		al.add("Maxwell");
		al.add("finch");
		
		map.put("INDIA",al);
		map.put("AUS",al1);
		
		Set<Map.Entry>set=map.entrySet();
		for(Map.Entry e:set){
			String Tname=e.getKey().toString();
			System.out.println(Tname);
			Object obj=e.getValue();
			ArrayList val=(ArrayList)obj;
			for(Object o:val){
				
				System.out.println(o);
			}
		}
		
	}
}