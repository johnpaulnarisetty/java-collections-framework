
/*
Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/

import java.util.*;
public class Unique_MapAPP{
		public static void main(String x[]){
			
			int a[]=new int[]{1,2,2,3,4,5,5};
			
			HashMap map=new HashMap();
			
			for(int v:a){
				if(map.containsKey(v)){
					map.put(v, (int)map.get(v) + 1);
				}else{
					map.put(v,1);
				}
			}
			
			System.out.println(map);
		}
}