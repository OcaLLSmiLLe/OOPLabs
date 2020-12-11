package Litere;

public class G extends F{
	protected String g;
	
	public G(String string ) {
		super();
		this.g = string;
	}
	public G() {
		this.g = "g";
	}
@Override
public String toString() {
	return super.toString() + "\nG{" + "g= '"+ g + '\'' + ", x=" + x + '}';
}
}
