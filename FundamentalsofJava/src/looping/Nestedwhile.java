package looping;
public class Nestedwhile {
	public static void main(String[] args) {
		int i=1;
		while(i<=3) {
			int j=1;
			while(j<=3) {
				System.out.print(i+""+j+" ");
				j++;
			}
		i++;
		System.out.println();
		}

}
}
