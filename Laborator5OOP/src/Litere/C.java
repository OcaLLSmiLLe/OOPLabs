package Litere;

public class C extends B{
protected String c;
public C(String string ){
	super();
	this.c = string;
	
}
public C(){
	this.c = "c";
}
@Override
public String toString() {
	return super.toString() + "\nC{" +
            "c='" + c + '\'' +
            ", x=" + x +
            '}';
}
}
