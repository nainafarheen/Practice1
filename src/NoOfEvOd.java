import java.util.Scanner;

public class NoOfEvOd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n= sc.nextInt();
		System.out.println("Entered Number: "+n);
		int a=0, ec=0, oc=0;
		while(n!=0) {
			a=n%10;
			if(a%2==0)
				ec++;
			else
				oc++;
			n=n/10;
		}
		System.out.println(ec+","+oc);
	}

}
