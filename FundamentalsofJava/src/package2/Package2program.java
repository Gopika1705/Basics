package package2;

public class Package2program {
     protected void sum(int n1,int n2) {
    	 System.out.println(n1+n2);
     }
     public static void main(String[] args) {
		Package2program p2=new Package2program();
		p2.sum(10,20);
	}
}
