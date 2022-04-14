package ogrenciNotSistemi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Tüm dersler için sözlü notunun ortalamaya etkisi %20,yazýlý sýnavýn etkisi %80 olacaktýr.");
		System.out.print("Fizik sözlü notunu giriniz: ");
		int fizSozluNotu=scanner.nextInt();
		System.out.print("Fizik yazýlý notunu giriniz: ");
		int fizYaziliNotu=scanner.nextInt();
		System.out.print("Tarih sözlü notunu giriniz: ");
		int tarihSozluNotu=scanner.nextInt();
		System.out.print("Tarih yazýlý notunu giriniz: ");
		int tarihYaziliNotu=scanner.nextInt();
		System.out.print("Matematik sözlü notunu giriniz: ");
		int matSozluNotu=scanner.nextInt();
		System.out.print("Matematik yazýlý notunu giriniz: ");
		int matYaziliNotu=scanner.nextInt();
		scanner.close();
		Teacher t1=new Teacher("mahmut hoca", "665", "TRH");
		Teacher t2=new Teacher("einstein", "1234","FZK");
		Teacher t3=new Teacher("Algebra", "559595", "MAT");
		
		Course tarih=new Course(t1, "Tarih", "101","TRH");
		tarih.addTeacher(t1);
		Course fizik=new Course(t2, "Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		Course matematik=new Course(t3, "Matematik", "103", "MAT");
		matematik.addTeacher(t3);
		
		Student s1=new Student(tarih, fizik, matematik, "Ýnek Þaban", "123", "12");
		s1.addBulkExamNote(tarihSozluNotu,tarihYaziliNotu,fizSozluNotu,fizYaziliNotu,matSozluNotu,matYaziliNotu);
		s1.printNote();
		s1.isPass();
	}

}
