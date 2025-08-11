package Interface;
interface Hotel{
	int idly=10;  //public static final
	//all methods inside interface are abstract by default
	public void sambar();
	//to make the method default use default keyword
	default void dosa() {
		System.out.println("Making dosa in front of others");
	}
	static void parcel() {
		System.out.println("Get the parcel here");
	}
}
class Kitchen implements Hotel{
	public void sambar() {
		System.out.println("Cooking sambar secretly in kitchen");
	}
}
public class Program1 {
   public static void main(String[] args) {
	Hotel h=new Kitchen();
	h.dosa();
	h.sambar();
	Hotel.parcel();
} 
}
