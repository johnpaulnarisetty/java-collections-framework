
import java.util.*;

public class contains_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		boolean ans=al.contains(30);

		if(ans){
			System.out.println("Element present in ArrayList");
		}else{
			System.out.println("Element is Not present in ArrayList");
		}
		
	}
}