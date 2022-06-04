
public class EandOArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		System.out.println("Even Numbers are:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Numbers are:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers are:");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("Odd Numbers are:");
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}

	}

}
