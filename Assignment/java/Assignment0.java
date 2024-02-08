import static java.lang.System.out;
class Assignment0{
	static void first(){
		out.println("This is simple java program");
	}
	static void second(){
		int a=5,b=5;
		float a1=5.1f,b1=5.1f;
		double a2=5.1d,b2=5.11d;
		out.println("Addition of int is: "+(a+b));
		out.println("Addition of float is: "+(a1+b1));
		out.println("Addition of double is: "+(a2+b2));
		out.println("Subtraction of int is: "+(a-b));
		out.println("Subtraction of float is: "+(a1-b1));
		out.println("Subtraction of double is: "+(a2-b2));
		out.println("Multiplication of int is: "+(a*b));
		out.println("Multiplication of float is: "+(a1*b1));
		out.println("Multiplication of double is: "+(a2*b2));
		out.println("Division of int is: "+(a/b));
		out.println("Division of float is: "+(a1/b1));
		out.println("Division of double is: "+(a2/b2));
	}
	static void third(){
		char c='B';
		out.println("B incremented by 1 is: "+(++c));
		out.println("C decremented by 1 is: "+(--c));
	}
	static void fourth(){
		out.println("1 converted to byte data is: "+((byte)1));
		out.println("1.2d converted to int data is: "+((int)1.2d));
		out.println("1.2d converted to byte data is: "+((byte)1.2d));
	}
	static void fifth(){
		int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
		out.println(month);
	}
	static void sixth(){
		int arr[]={1,2,3,4,5};
		int sum=0;
		int count=0;
		for(int i:arr){
			sum+=i;
			count++;		
		}
		out.println("Average is: "+(sum/count));
	}
	static void seventh(){
		int var=5;
		var avg=6;
		var	avg1=6.0f;
		var avg2=true;
		out.println("variable var: "+(var));
		out.println("differenet avg variable "+avg+" "+avg1+" "+avg2);
	}
	static void eighth(){
		String st;
		st="Hello";
		out.println(st);
	}
	static void nineth(){
		out.println("3%2 is: "+(3%2));
		out.println("3.2f % 2.3f"+(3.2f % 2.3f));
	}
	static void tenth(){
		out.println("2 right shifted by 1 is: "+(2>>1));
		out.println("2 left shifted by 1 is: "+(2<<1));
	}
	static void eleventh(){
		out.println("10 & 8 is: "+(10 & 8));
	}
	static void twelvth(){
		out.println("Output of 2<3 with ternary: "+(2<3? "yes" : "no"));
	}
	public static void main(String args[]){
		first();
		second();
		third();
		fourth();
		fifth();
		sixth();
		seventh();
		eighth();
		nineth();
		tenth();
		eleventh();
		twelvth();
	}
}