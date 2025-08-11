package inheritance;
class Oldngp{
	void rules() {
		System.out.println("Id mandatory and timing upto 4.00");
	}
}
class Newngp extends Oldngp{
	void rules() {
		System.out.println("5.00");
	}
}
public class Runeg {
	public static void main(String[] args) {
		Newngp es=new Newngp();
		es.rules();
		Oldngp on=new Newngp();
		
	}

}
