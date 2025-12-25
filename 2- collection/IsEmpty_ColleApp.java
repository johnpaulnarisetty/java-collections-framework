
import java.util.*;

public class IsEmpty_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		
		boolean ans = al.isEmpty();
		if(ans){
			System.out.println("ArrayList is empty");
		}else{
			System.out.println("ArrayList is not empty");
		}
	}
}