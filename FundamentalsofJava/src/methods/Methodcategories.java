package methods;
import java.util.Scanner;
public class Methodcategories {
	static Scanner sc=new Scanner(System.in);
	//without return type without parameter
	void aravindh(){
		System.out.println("Enter the two inputs:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("The sum: "+(n1+n2));
	}
	//without return type with parameter
	void gurushith(float n1,float n2 ) {
		float res=n1*n2;
		System.out.println("The Product: "+res);
	}
	//with return type with parameter
	int abdul(int n1,int n2,int n3) {
		int res=n1-n2-n3;
		return res;
	}
	//With return type without parameter
	int eswar() {
		int a=10;
		int b=20;
		return a+b;
	}
	public static void main(String[] args) {
		Methodcategories ob=new Methodcategories();
		ob.aravindh();
		ob.gurushith(2,5.5f);
		float f1=ob.abdul(90, 20, 30);
		System.out.println("The difference: "+f1);
		int u=ob.eswar();
		System.out.println(u);
	}
}
