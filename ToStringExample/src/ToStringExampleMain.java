
public class ToStringExampleMain 
{

	public static void main(String[] args)
	{

		TostringEg t1 = new TostringEg(30, 1, "Milind");
		TostringEg  t2 = new TostringEg(40, 2, "Mansi");
		 
		System.out.println(t1);
		System.out.println(t2);
		
		WithoutTostring w1 = new WithoutTostring(2, 3, "Sunil");
		WithoutTostring w2 = new WithoutTostring(5, 8, "Vinod");
		
		System.out.println(w1);
		System.out.println(w2);
	}

}
