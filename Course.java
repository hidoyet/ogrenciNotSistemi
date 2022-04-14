package ogrenciNotSistemi;

public class Course {
	Teacher teacher;
	String couseName;
	String courseCode; 
	String coursePrefix;
	int note;
	int verNote;
	
	public Course(Teacher teacher, String name, String code, String prefix) {
		
		this.teacher = teacher;
		this.couseName = name;
		this.courseCode = code;
		this.coursePrefix = prefix;
		this.note=0;
		this.verNote=0;
	}
	public void addTeacher(Teacher teacher) {
		
		if(teacher.branch.equals(coursePrefix)) {
			this.teacher=teacher;
			
		}else {
			System.out.println("Öðretmen ile ders bilgileri eþleþmedi.");
		}
	}
	 void printTeacher(){
		 teacher.print();
	 }
	
}
