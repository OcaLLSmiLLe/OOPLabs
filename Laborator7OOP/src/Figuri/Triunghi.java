package Figuri;
public class Triunghi extends Figura{
public float muchia1;
public float muchia2;
public float muchia3;
public Triunghi(float muchia1, float muchia2, float muchia3) {
	this.muchia1 = muchia1;
	this.muchia2 = muchia2;
	this.muchia3 = muchia3;
}
public float semiperimetru() {
	return (muchia1 + muchia2 + muchia3) /2;
}
	@Override
	public float getPerimetru() {
		// TODO Auto-generated method stub
		return this.muchia1 + this.muchia2 + this.muchia3;
	}

	@Override
	public float getAria() {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(semiperimetru() * (semiperimetru() - this.muchia1) *
				(semiperimetru() - this.muchia2) *(semiperimetru() - this.muchia3));
	}

	
	

}
