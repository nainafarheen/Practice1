import java.util.Scanner;

public class NoOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println("Entered Number: "+num);
		int noOfDig=0, rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			noOfDig++;
		}
		System.out.println("No Of Digits: "+noOfDig);
	}

}
