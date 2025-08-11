package constructorinjava;
public class Ngpit {
	int roll;
	String name;
	Ngpit(){
		System.out.println("Default constructor");
	}
	Ngpit(int r,String n){
		roll=r;
		name=n;
	}
	Ngpit(String n,int r){
		roll=r;
		name=n;
	}
	void disp() {
		System.out.println("Name: "+name+"	Roll:"+roll);
	}
	public static void main(String[] args) {
		Ngp s1=new Ngp(13,"Eswar");
		Ngp s2=new Ngp();
		Ngp s3=new Ngp(22,"Mercy");
		Ngp s4=new Ngp("Chithrida",18);
		s4.disp();
		s1.disp();                                                      
}
}

