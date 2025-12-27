
import java.util.*;
public class ArrayListInsertion{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		//nums1 = [1,2,2,1], nums2 = [2,2]
		int a[]=new int[]{1,2,2,1};
		int b[]=new int[]{2,2};
		/*
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		*/
		TreeSet T=new TreeSet();
		int i=0;
		while(i<a.length){
			T.add(a[i]);
			i++;
		}
		
		int j=0;
		while(j<b.length){
			T.add(a[j]);
			j++;
		}
		
		System.out.println(T);
		
		
		
	}
}