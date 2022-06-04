import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2; i<=a; i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
	}

}
