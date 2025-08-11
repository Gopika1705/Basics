package exception;
import java.io.*;
public class Throwsam {
	 void n() throws IOException{  
		    int x=12/1;  
		    throw new ArithmeticException();
		  }  
		  void p(){
			try {
		    n();
		    System.out.println("Method");
			}
			catch(Exception e) {
				System.out.println("Exception Handled");
			}
			finally {
				System.out.println("Finally block");
			}
		  }  
		  public static void main(String args[]){  
		   Throwsam obj=new Throwsam();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
}
