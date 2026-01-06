
import java.util.*;
class Test<E>{
	Vector v;
	int count=0;
	Object obj[];
	
	public Test(){
		obj=new Object[5];
	}
	
	void add(E e){
		obj[count]=e;
		++count;
	}
	
	int size(){
		return count;
	}
	
	E get(int index){
		return (E)obj[index];
	}
	
}

public class MyGenericsClass{
	public static void main(String x[]){
		
		Test<String> t=new Test<String>();
		
		t.add("Good");
		t.add("MNO");
		t.add("PQR");
		t.add("ABC");
		t.add("STV");
		
		for(int i=0; i<t.size(); i++){
			String val=t.get(i);
			System.out.println(val);
		}
	}
}