package Litere;

public class H extends G{
	protected String h;
	public X x = new X("Asta este radical altceva");
	public H(String string) {
		super();
		this.h = string;
	}

	public H() {
		this.h = "h";
	}
	@Override
	public String toString() {
		return super.toString() + "\nH{ " + "h= '" + '\'' + "x= " + x + '}';
	}
}
