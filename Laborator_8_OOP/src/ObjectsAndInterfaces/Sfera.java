package ObjectsAndInterfaces;

public class Sfera implements GeometricBody{
	private float raza;
	public Sfera(float raza) {
		this.raza = raza;
	}
	
	
	
	
	

	@Override
	public float getVolume() {
		// TODO Auto-generated method stub
		return (float) (4/3 * Math.PI * this.raza * this.raza * this.raza);
	}

	@Override
	public float getSuprafata() {
		// TODO Auto-generated method stub
		return (float) (4 * Math.PI * this.raza * this.raza);
	}

}
