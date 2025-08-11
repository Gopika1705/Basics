package inheritance;
class OldNgp{
	int num=25;
	OldNgp(){
		super();
		System.out.println("Parent class constructor");
	}
	void rules() {
		System.out.println("Id mandatory and timing upto 4.00 PM");
	}
}
class NewNgp extends OldNgp{
	int num=super.num;
	NewNgp(){
		super();
		System.out.println("Child class constructor");
	}
	void rules() {
		super.rules();
		System.out.println("ID mandatory and timing upto 5.00 PM");
	}
}
public class Superkeyword {
	public static void main(String[] args) {
		NewNgp es=new NewNgp();
		es.rules();
		System.out.println(es.num);
	}
}
