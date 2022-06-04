import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		//Logic 1
		if(a>b && a>c){
			System.out.println("Largest number is: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is: "+b);
		}
		else {
			System.out.println("Largest number is: "+c);
		}
		//Ternary Operator
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		System.out.println("Largest number logic2: "+largest);
	}
}
