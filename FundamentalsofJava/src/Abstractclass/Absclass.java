package Abstractclass;
abstract class Hotel{
	Hotel(){
		System.out.println("Hotel Constructor");
	}
	abstract void sambar();
	void dosa() {
		System.out.println("Dosa in front of visitors");
	}
}
abstract class Kitchen extends Hotel{
	Kitchen(){
		System.out.println("Kitchen Constructor");
	}
	abstract void sambarpodi();
	void sambar() {
		System.out.println("Cooking sambar using special sambar podi");
	}
}
class Home extends Kitchen{
	Home() {
		System.out.println("Home constructor");
	}
	void sambarpodi() {
		System.out.println("sambar podi made scretly in home");
	}
}
public class Absclass {
     public static void main(String[] args) {
		Hotel h=new Home();
		h.dosa();
		h.sambar();
	}
}
