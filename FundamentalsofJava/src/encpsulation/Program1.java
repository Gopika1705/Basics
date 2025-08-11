package encpsulation;
class Bean{
	private int num1; //encapsulated variable
	//accessing protected variable
	private int num2;
	public int getnum1() {
		return num1;
	}
	public void setnum1(int num1) {
		this.num1=num1;
	}
}
public class Program1 {
     public static void main(String[] args) {
		Bean bn=new Bean();
		bn.setnum1(25);
		System.out.println(bn.getnum1());
	}
}
