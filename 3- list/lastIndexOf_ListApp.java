

import java.util.*;
public class lastIndexOf_ListApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(50);
		
		System.out.println(al.lastIndexOf(40));
		System.out.println(al.lastIndexOf(20));
		System.out.println(al.lastIndexOf(70));
	}
}


//List 
/*
1. get (int)
2. set (int,E)
3. Listiterator() 
4. listIterator(int)
5. indexOf(E)
6. lastIndex()
7. void add(int,E)
8. subList()
*/