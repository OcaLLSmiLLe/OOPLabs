package Figuri;
public class Dreptunghi extends Figura{

	public float lungime;
	public float latime;
	
	
	public Dreptunghi(float lungime, float latime)
	{
		this.lungime = lungime;
		this.latime = latime;
	}
	
	
	@Override
	public float getPerimetru() {
		// TODO Auto-generated method stub
		return (this.lungime * this.latime) * 2;
	}

	@Override
	public float getAria() {
		// TODO Auto-generated method stub
		return this.lungime *this.latime;
	}

	
	
	
	
	
}
