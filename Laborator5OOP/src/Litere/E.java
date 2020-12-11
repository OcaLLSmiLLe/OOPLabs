package Litere;

public class E extends D{
	protected String e;
	public E(String string )
	{
		super();
		this.e = string;
		
	}
	public E() {
		this.e = "e";
	}
@Override
public String toString()
{
	return super.toString() + "\nE{" +
            "e='" + e + '\'' +
            ", x=" + x +
            '}';
}
}
