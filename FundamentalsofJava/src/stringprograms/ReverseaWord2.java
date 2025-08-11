package stringprograms;
public class ReverseaWord2 {
     static String rev(String st) {
    	String stArr[]=st.split(" ");	
    	StringBuilder sb=new StringBuilder();
    	sb.append(stArr[stArr.length-1]);
    	stArr[stArr.length-1]=sb.reverse().toString();
    		return String.join(" ", stArr);
     }
     public static void main(String[] args) {
    	 String st="Eswar is a good cricketer";
    	 System.out.println(rev(st));
     }
}
