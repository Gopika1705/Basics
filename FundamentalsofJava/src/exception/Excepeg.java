package exception;
public class Excepeg {
	public static void main(String[] args) {
		try {
			int n=10;
			String st="Abdul";
			System.out.println("Before division");
			System.out.println(n/0);
			char ch=st.charAt(10);
			System.out.println("Line after division");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Its string error");
		}
		catch(ArithmeticException e) {
			System.out.println("Its arith excep");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Program after handling exception");
	}
}
