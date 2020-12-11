package Litere;

public class A {
	protected String a;
	public X x = new X("something");
	public A(String string, X x)
	{
		this.a = string;
		this.x = x;
	}

	public A(String string)
	{
		this.a = string;
	}
	public A()
	{
		this.a = "a";
	}
	
	 @Override
	    public String toString() {
	        return "A{" +
	                "a='" + a + '\'' +
	                ", x=" + x +
	                '}';
}
}
