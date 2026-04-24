package MULTILEVELINHERITANCE;

class Student extends Department {
	String Sname="mani";
	int Sage=21;
	void student() {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		System.out.println("Student name:"+s.Sname+"\nStudent age :"+s.Sage);
		System.out.println("------------------------");
		System.out.println("University name:"+s.Uname);
		System.out.println("college name:"+s.Cname+"\nDepartment name:"+s.Dname);
		System.out.println("--------------------------------");
		s.conductexams();
		s.provideplacements();
		s.fest();
		s.student();
	}

}
