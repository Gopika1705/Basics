package constructorinjava;
public class Printstataement {
	int roll;
	String name;
	Printstataement(int r,String n){
		System.out.println("Default constructor");
	}
	void disp() {
		System.out.println("Name: "+name+"	Roll: "+roll);
	}
	public static void main(String[] args) {
		Printstataement s1=new Printstataement(13,"Eswar");
		Printstataement s2=new Printstataement(10,"Tharun");
		Printstataement s3=new Printstataement(22,"Mercy");
		Printstataement s4=new Printstataement(18,"Chithrida");
		s4.disp();
	}
}
