package strings;

public class Constructors {
public static void main(String[] args) {
	String s=new String("india");
	System.out.println(s+" "+s.length());
	
	//create string obj with character array
	char[] c= {'m','a','n','o'};
	System.out.println(new String(c));
}
}
