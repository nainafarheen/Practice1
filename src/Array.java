
public class Array {
	public static void main(String[] args) {
		int myNum=5;
		System.out.println(myNum+" is the value stored in the myNum variable");
		int[] arr1= {1,2,3,4,5};
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		String[] name= {"naina","farheen","selnium","Java"};
		/*for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}*/
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}
