
public class Swap {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before Swap "+a+","+b);
		//Logic 1 : with 3rd variable
		int t=a;
		a=b;
		b=t;
		System.out.println("Logic 1 After Swap "+a+","+b);
		//Logic 2 + & - 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Logic 2 After Swap "+a+","+b);
		//Logic 3 * & /
		// a and b values should nt be 0
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Logic 3 After Swap "+a+","+b);
		//Logic 4 bitwise xor ^
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Logic 4 After Swap "+a+","+b);
		//Logic 5 single statement
		b=a+b-(a=b);
		System.out.println("Logic 5 After Swap "+a+","+b);
	}
}
