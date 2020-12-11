package Litere;

public class B extends A{
	protected String b;
	
	
	public B(String string)
	{
		super();
		this.b = string;
	}
	public B() {
		this.b = "b";
	}
	@Override
	public String toString() {
		return super.toString() + "\nB{" +
                "b='" + b + '\'' +
                ", x=" + x +
                '}';
	}
	
	
	

	
}
	
