package constructorinjava;
public class Ngp {
	int roll;
	String name;
	Ngp(){
		System.out.println("Default constructor");
	}
	Ngp(int r,String n){
		roll=r;
		name=n;
	}
	Ngp(String n,int r){
		roll=r;
		name=n;
	}
	void disp() {
		System.out.println("Name: "+name+"	Roll:"+roll);
	}
	public static void main(String[] args) {
		Ngp[]s=new Ngp[60];
		s[0]=new Ngp();
		s[1]=new Ngp(13,"Eswar");
		s[0].disp();
		s[1].disp();                                                         
}
}