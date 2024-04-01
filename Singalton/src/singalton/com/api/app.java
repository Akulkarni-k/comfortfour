package singalton.com.api;

public class app {
	public static void main (String[] arg)
	{
		Singalton instance =Singalton.getintance();
		System.out.println(instance.hashCode());
	}

}
