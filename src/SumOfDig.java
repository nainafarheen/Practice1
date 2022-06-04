import java.util.Scanner;

public class SumOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int s=0;
		while(n>0) {
			s=s+n%10;
			n=n/10;
		}
		System.out.println("Sum of digits: "+s);
	}

}
