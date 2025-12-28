
import java.util.*;
class Employee{
	private int id;
	private String name;
	private int salary;
	
	Employee(int id,String name,int salary){
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
}

class SortId implements Comparator{
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		if(e1.getId()>e2.getId()){
			return 1;
		}else if(e1.getId()<e2.getId()){
			return -1;
		}else{
			return 0;
		}
	}
}
class SortName implements Comparator{
	
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		return e1.getName().compareTo(e2.getName());
	}
}
class SortSalary implements Comparator{
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		if(e1.getSalary()>e2.getSalary()){
			return 1;
		}else if(e1.getSalary()<e2.getSalary()){
			return -1;
		}else{
			return 0;
		}
	}
}

public class ComapratorApplication{
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
		
		System.out.println("> After the Sorting by ID :");

		Comparator i=new SortId();
		Collections.sort(ls,i);
		
		System.out.println();
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("--------------------------------");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}
		System.out.println();
		
		System.out.println("> After the Sorting by Name :");

		i=new SortName();
		Collections.sort(ls,i);
		
		System.out.println();
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("--------------------------------");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}
		
		System.out.println();
		
		System.out.println("> After the Sorting by Salary :");

		i=new SortSalary();
		Collections.sort(ls,i);
		
		System.out.println();
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("--------------------------------");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}
		
	}
}