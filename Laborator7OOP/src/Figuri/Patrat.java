package Figuri;

public class Patrat extends Figura {
	private float lungime_muchie;

	public Patrat(float lungime_muchie) {
		this.lungime_muchie = lungime_muchie;
	}
	
	
	
	


	@Override
	public float getPerimetru() {
		// TODO Auto-generated method stub
		return this.lungime_muchie * this.lungime_muchie;
	}

	@Override
   public	float getAria() {
		// TODO Auto-generated method stub
		return this.lungime_muchie * 4;
	}

	
	
	
	
	
}
