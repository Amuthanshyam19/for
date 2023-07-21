package for3;

public class UseEmployee {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.salary=20000;
		employee.name="shyamala";
		employee.fathername="murugesan";
		employee.experiance=2;
		Employee employee1=new Employee();
		employee1.salary=30000;
		employee1.name="muthu";
		employee1.fathername="veeramani";
		employee1.experiance=5;
		Employee employee2=new Employee();
		employee2.salary=40000;
		employee2.name="arun";
		employee2.fathername="paramasivam";
		employee2.experiance=4;
		Employee[] employees={employee,employee1,employee2};
		for(int i=0;i<=employees.length-1;i++) {
			System.out.println(employees[i].name+" "+employees[i].fathername);
		}
		
		for(int j=0;j<employees.length;j++) {
			
			if(employees[j].salary>=20000) {
			
		System.out.println(employees[j].name+" "+employees[j].salary);
		
	
		
        for(int k=0;k<=employees.length-1;k++) {
        	if(employees[k].experiance>=3) {
        	
        System.out.println(employees[k].salary+10000+employees[k].name);
        		
        	
        }}
			}}
	}
}
		
	
        	
        
        







