package ogrenciNotSistemi;

public class Teacher {
	String name; 
	String mpno;
	String branch;
	
	public Teacher(String name, String mpno, String branch) {
		
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	void print() {
		System.out.println("��retmen ad�: "+this.name);
		System.out.println("��retmen telefon numaras�: "+this.mpno);
		System.out.println("��retmen bran��: "+this.branch);
	}
	
}
