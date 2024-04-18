package logicalprograms;

public class BinaryToDecimal {
int binarytodecimal(long bin)
{
	int dec=0,i=0;
	while(bin>0)
	{
		dec+=Math.pow(2, i++)* (bin%10);
		bin/=10;
	}
	return dec;
	
}int decimaltoOCtal(long bin)
{
	int dec=binarytodecimal(bin);
	String oct=Integer.toOctalString(dec);
	int octal=Integer.parseInt(oct);
	
	return octal;
	
}
public static void main(String[] args) {
	BinaryToDecimal b=new BinaryToDecimal();
	System.out.println(b.decimaltoOCtal(100000));
}
}
