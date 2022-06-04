import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		System.out.println("Entered string :"+str);
		String rev="";
		/*int l=str.length();
		for (int i=l-1; i>=0; i--) {
		rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string :"+rev);
		if(str.equals(rev))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");*/
		char a[]=str.toCharArray();
		int l=a.length;
		for(int i=l-1; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse string :"+rev);
			
	}
}
