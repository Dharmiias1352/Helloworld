import java.math.BigDecimal;

public class Hello {
	public static void main(String[] args) {
		//S03L05
		/*int max=2147483647;
		int min =-2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;
		
*/
		
		int value1= 9/2;
		float value2 = 10f/6f;
		double value3 = 10d/6d;
		System.out.println("value 1= "+value1);
		System.out.println("value 2= "+value2);
		System.out.println("value 3= "+value3);
		//S03L06
		int marker =512;
		double percentage = marker*0.46f;
		System.out.println("percentage: " +percentage);
		//S03L07
		/*boolean var = false;
		System.out.println(var);*/
		char var1= '\u00A7';
		System.out.println(var1);
		//BIG DECIMAL CLASS INTRO-S06LL06
		double x =1;
		double y = 2.55;
		BigDecimal d1 = new BigDecimal("1.05");//use string then give roundoff
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(d1.add(d2));
		System.out.println(x+y);
		//Areinf baaiuxa S03L08
		
		String var = "Hellow world \u00BB";
		
		System.out.println(var);
		
		
		
		
		
	}
}
