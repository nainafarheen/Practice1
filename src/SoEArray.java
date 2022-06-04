
public class SoEArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Elements:"+sum);
		int s=0;
		for(int v:a) {
			s=s+v;
		}
		System.out.println("Sum of Elements:"+s);
	}

}
