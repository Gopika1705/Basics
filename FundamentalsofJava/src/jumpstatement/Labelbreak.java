package jumpstatement;
import java.util.Scanner;
public class Labelbreak {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			labelbreak:
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if(i==2 && j==3) {
						break labelbreak;
					}
					System.out.print(i+""+j+" ");
				}
				System.out.println();
			}
			sc.close();
				
}
}