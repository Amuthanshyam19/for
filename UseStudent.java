package for3;

public class UseStudent {
	public static void main(String[] args) {
		Student student=new Student();
		student.name="shyamala";
		student.std=5;
		student. marks=70;
		student.contactno=957846605;
		Student student1=new Student();
		student1.name="brintha";
		student1.std=6;
		student1. marks=90;
		student1.contactno=957839282;
		Student student2=new Student();
		student2.name="sasi";
		student2.std=5;
		student2. marks=70;
		student2.contactno=954637773;
		Student[] students= {student,student1,student2};
	
		for(int i=0;i<=students.length-1;i++) {
			System.out.println(students[i].name+(",")+students[i].std+(",")+students[i].marks+(",")+students[i].contactno);
		}
		int max=students[0].std;
		for(int j=0;j<=students.length-1;j++) {
			if(max<students[j].std) {
			}
			}
			System.out.println(max);
	
	
     int min=students[0].std;   
		for(int k=0;k<=students.length-1;k++) {
			if(min>students[k].std) {
			}
			}
		System.out.println(min);
	}
	}		
		
		
		
		
		
		
		
		
	


