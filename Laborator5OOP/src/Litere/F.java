package Litere;

public class F extends E {
	protected String f;
	public F(String string )
	{
		super();
		this.f = string;
	}
	public F() {
		this.f = "f";
	}
	@Override
	public String toString() {
		return  super.toString() + "\nE{" +
                "e='" + e + '\'' +
                ", x=" + x +
                '}';
	}

}
