import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5,6};
		/*boolean status=Arrays.equals(a,b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}*/
		boolean sta=true;
		int len1=a.length;
		int len2=b.length;
		System.out.println(len1+","+ len2);
		if(len1==len2) {
			System.out.println("Array length are not equal");
			for(int i=0; i<len1; i++) {
				if(a[i]!=b[i]) {
					sta=false;
				}
			}			
		}
		else {
			sta=false;
		}
		if(sta=true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
