
import java.util.*;
class Employee implements Comparable{
		private int id;
		private String name;
		private int salary;
		
		
		public Employee(int id,String name,int salary){
			this.id=id;
			this.name=name;
			this.salary=salary;
		}	
		
		public void setId(int id){
			this.id=id;
		}
		public int getId(){
			return id;
		}
		public void setName(String name){
			this.name=name;
		}	
		public String getName(){
			return name;
		}
		public void setSalary(int salary){
			this.salary=salary;
		}
		public int getSalary(){
			return salary;
		}
		public int compareTo(Object obj){
			Employee e=(Employee)obj;
			if(this.id>e.id){
				return 1;
			}else if(this.id<e.id){
				return -1;
			}else{
				return 0;
			}
		}
		
}

public class CollectionsApplication{
	
	public static void main(String x[]){
		
		List ls=new ArrayList();
		
		ls.add(new Employee(1,"ABC",5800));
		ls.add(new Employee(5,"PQR",4100));
		ls.add(new Employee(3,"MNO",3200));
		ls.add(new Employee(4,"SUV",1500));
		ls.add(new Employee(2,"XYZ",4500));
		
		System.out.println("> Before the Sorting :");
		System.out.println();
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("--------------------------------");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}
		
		System.out.println();
		System.out.println();
		
		// by using the comparable we sort via the id 
		Collections.sort(ls);
		
		System.out.println("> After the Sorting by Id:");
		System.out.println();
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("--------------------------------");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}	
		
	}
}