package constructorinjava;
public class Thisinconstructor {
	int roll;
	String name;
	Thisinconstructor(){
		System.out.println("Default constructor");
	}
	Thisinconstructor(int roll,String name){
		this();
		this.roll=roll;
		this.name=name;
	}
	void meth() {
		System.out.println(this);
		this.disp(this);
	}
	void disp(Thisinconstructor i) {
		System.out.println(i);
		System.out.println(roll+" : "+name);
	}
	public static void main(String[] args) {
		Thisinconstructor s1=new Thisinconstructor(13,"Eswar");
		System.out.println(s1);
		s1.meth();
	}
}
