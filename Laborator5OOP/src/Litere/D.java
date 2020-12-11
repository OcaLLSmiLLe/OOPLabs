package Litere;

public class D extends C{
protected String d;
public X x = new X("Cu totul altceva");

public D(String string)
{
	super();
	this.d = string;
}
public D() {
	this.d = "d";
}
@Override
public String toString()
{
	
	
	return  super.toString() + "\nD{" +
            "d='" + d + '\'' +
            ", x=" + x +
            '}';
}
}
