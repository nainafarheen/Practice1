
public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		s.s1 = "hello3";
		System.out.println(s.s1);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.s1);
	}

}
