
public class Singleton {
	private static Singleton s;
	public String s1 = "";
	private Singleton() {
		s1="Welcome";
	}
	public static Singleton getInstance() {
		if(s == null)
		{
			s = new Singleton();
		}
		return s;		
	}
}

