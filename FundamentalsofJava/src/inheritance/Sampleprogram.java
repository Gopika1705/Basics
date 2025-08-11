package inheritance;
class EswarDad{
	long dadph=999999999;
	void dadPhone() {
		System.out.println("It's dad's phone");
	}
}
class Eswar extends EswarDad{
	long ph=987654321;                  
	void phone() {
		System.out.println("It's Eswar's Phone"); 
	}
}
class EswarSon extends Eswar{
	long son=988888881;
	void sonPhone() {
		System.out.println("It's Eswar's Son's phone");
	}
	
}
public class Sampleprogram {
	public static void main(String[] args) {
		Eswar es=new Eswar();
		es.dadPhone();
		es.phone();
		EswarDad ed=new EswarDad();
		ed.dadPhone();
		EswarSon ea=new EswarSon();
		ea.sonPhone();
		ea.phone();
	}
}
