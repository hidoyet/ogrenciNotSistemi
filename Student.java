package ogrenciNotSistemi;

import java.util.Scanner;

public class Student {
	Course course1;
	Course course2;
	Course course3;
	String stuname;
	String stuNo;
	String classes;
	int avarage;
	boolean isPass;
	
	Scanner scanner=new Scanner(System.in); 
	
	public Student(Course course1, Course course2, Course course3, String stuname, String stuNo, String classes
			) {
		
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.stuname = stuname;
		this.stuNo = stuNo;
		this.classes = classes;
		this.avarage = 0;
		this.isPass = false;
	}
	void addBulkExamNote(int note1,int note2,int note3,int note4,int note5,int note6) {
		
		if(note1>=0&&note1<=100) {
			this.course1.verNote=note1;
		}
		
		if(note2>=0&&note2<=100) {
			this.course1.note=note2;
		}
		
		if(note3>=0&&note3<=100) {
			this.course2.verNote=note3;
		}
		
		if(note4>=0&&note4<=100) {
			this.course2.note=note4;
		}
		
		if(note5>=0&&note5<=100) {
			this.course3.verNote=note5;
		}
		
		if(note6>=0&&note6<=100) {
			this.course3.note=note6;
		}
		
	}
	void printNote() {
		System.out.println(this.stuname+" "+course1.couseName+" dersi notu: "+(this.course1.note*0.8+course1.verNote*0.2));
		System.out.println(this.course2.couseName+" dersi notu: "+(this.course2.note*0.8+course2.verNote*0.2));
		System.out.println(this.course3.couseName+" dersi notu: "+(this.course3.note*0.8+course3.verNote*0.2));
	}
	void calcAverage(int note1,int note2,int note3,int note4,int note5,int note6) {
	
		
	}
	void isPass() {
		double average=((this.course1.note*0.8+course1.verNote*0.2)+(this.course2.note*0.8+course2.verNote*0.2)+(this.course3.note*0.8+course3.verNote*0.2))/3.0;
		if(average>=55) {
		System.out.println("Baþarý ile dönem bitirildi.");	
		}else {
			System.out.println("Sýnýfta kaldýnýz,seneye görüþürüz.");
		}
			
	}
		
}
