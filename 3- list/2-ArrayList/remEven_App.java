

import java.util.*;
public class remEven_App{
	public static void main(String x[]){
		int arr[]=new int[]{1,2,3,4,6,5};
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
		
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			
			if(i.next()%2!=0){
				System.out.println(i.next());
			}

		}
		
	}
}